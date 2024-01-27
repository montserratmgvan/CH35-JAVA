package org.generation.banco;
 
// en esta clase se definen los métodos que arrojan excepciones, siempre que en la clase Cajero se dispare diche excepción.

/*
 * Requerimientos
 * 1. Trabajar bajo el paradigma de POD
 * 2. Indicar que neustra calse es uns Exception
 * 3. Crear variables y métodos para instanciar objetos
 * 4. Encapsular (modificadores, getters y setters)
 * */

public class FondosInsuficientesException extends Exception{ // le digo que mi clase esta heredando una excepción
  private static final long serialVersionUID=1L; // no es necesario, pero e sbuena práctica asignarlo.
	
  // Atributos
	
	private double monto;

	//Constructor
	
public FondosInsuficientesException(double monto) {
	this.monto = monto;
}


	
	//Getter y Setter

public double getMonto() {
	return monto;
}

public void setMonto(double monto) {
	this.monto = monto;
}



}
