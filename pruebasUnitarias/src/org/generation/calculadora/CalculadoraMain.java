package org.generation.calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {
		
		
		//Instanciaar
		
		Calculadora calculadora = new Calculadora ();
		//Método sumar
		
		System.out.println("El resultado de sumar dos números es :" +calculadora.sumar(15, 20));
		
		
		//Método restar
		
		System.out.println("El resultado de restar dos números es :" +calculadora.restar(15, 20));
		
		//Método multiplicar
		
		System.out.println("El resultado de multiplicar dos números es :" +calculadora.multiplicar(15, 20));
		
		//Método dividir
		
		System.out.println("El resultado de restar dos números es :" +calculadora.dividir(50, 9));
					
					
		
		
		
	}

}
