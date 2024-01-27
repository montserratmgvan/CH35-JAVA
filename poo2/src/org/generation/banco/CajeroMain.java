package org.generation.banco;

/*
 * En cajero se instancia el objeto de tipo CuentaBancaria y se invocan los métodos definidos.
 * Aqui si se pueden establecer los try-catch de la exception que se definió en el método retirar.
 * Los resultados se muestran en consola.
 * */


public class CajeroMain {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaDaniel = new CuentaBancaria(6989); // Cuenta bacaria con su idCuenta
	
	// simulamos que tenemos un Scanner y el cliente introduce dinero 
		System.out.println("Depositando $500");
		cuentaDaniel.depositar(500);
		
		//Revisar si se actualiza el saldo (debe haber 500 pesitos)
		
	cuentaDaniel.getSaldo();
		System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());
	
		// Retirando dinero
		
		try {
			// simulamos nuevamente un Scanner para retirar dinero
			
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());// Output $200
			
			System.out.println("Retirando $200");
			cuentaDaniel.retirar(200);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());// Output $0
			
			System.out.println("Retirando $300");
			cuentaDaniel.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaDaniel.getSaldo());// Output exception
			
		} catch (FondosInsuficientesException e){
			System.out.println("\u001B[31mLo siento, te faltan $\u001B[31m" + e.getMonto());
			e.printStackTrace (); //método de excepciones que interrumpe el seguimiento del flujo de la excepción
		}
		
	} // main
}// class
