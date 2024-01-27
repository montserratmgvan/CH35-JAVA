package org.generation.banco;

/*
 * En esta clase se difinen los métodos para disparar las excepciones, es decir, el try-catch. Sin embargo, aqui no se ejecuta el try-catch
 * Se definen los métodos como depositar dinero, retirar dinero.
 * Requerimientos :
 *   1. Trabajar bajo POD
 *   2. Encapsular (modificadores, getters y setters)
 *   3. Crear variables y métodos para instanciar obejtos. 
 * 
 */

public class CuentaBancaria {
// Atributos 
private double saldo;
private int idCuenta;

// Constructor que recibe solo el atributo idCuenta

public CuentaBancaria(int idCuenta) { // se quita el super (); porque no esta heredando elementos de la clase anterior.
	this.idCuenta = idCuenta;
}

//Método que no permita depositar dinero

public void depositar (double monto) {
	
	saldo += monto; // esto es lo mismo que saldo = saldo + monto
}

// Método para retirar dinero 
/*Verificar si el monto a retirar es menor o igual al saldo actual.
 *  - true: se puede retirar el monto solicitado 
 *  - false: no se puede retirar y calculamos cuánto dinero falta para completar la operación
 * */

public void retirar (double monto) throws FondosInsuficientesException { // aqui se heredo 
	if (monto <= saldo) {
		saldo -= monto; // esto es lo mismo que saldo es igual a saldo menos monto.
		System.out.println("");
	}else {
		double faltante = monto - saldo;
		// Crear la instancia de la clase FondosInsuficientesException con las palabras reservadas throw new e . Y le pasamos el parámetro correspondiente a la variable que dispara la excepción
		throw new FondosInsuficientesException(faltante); // esto nos va a marcar un errror, porque lo queremos instanciar de manera local y no lo encuentra, para ello necesitamos "heredarlo" como parte del encabezado del método con la palabra reservada "trows" y el nombre de la excepción.
	}
  }

//Getters y setters

 public double getSaldo() {
	return saldo;
 }

 public void setSaldo(double saldo) {
	this.saldo = saldo;
 }

 public int getIdCuenta() {
	return idCuenta;
 }

 public void setIdCuenta(int idCuenta) {
	this.idCuenta = idCuenta;
 }



}
