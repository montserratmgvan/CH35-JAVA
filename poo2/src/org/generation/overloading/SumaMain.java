package org.generation.overloading;

import java.math.BigDecimal;

public class SumaMain {

  public static void main (String[] args){
		// Invocamos el método de tipo static mediante su clase y no mediante la instancia de un objeto. 
	 int suma1 = Suma.sumar(8, 5);	
	 double suma2 = Suma.sumar(4.3, 6.26);
	 
	 System.out.println("La suma enteros me da " + suma1);
	 System.out.println("La suma decimales me da " + suma2);
	
	 
	 //BigDecimal
	 // para imprimir BigDecimal debemos guardar los valores de los parámetros en objetos de tipo BigDecimal y asignarlos como argumentos de String de cada nueva instancia.
	 BigDecimal num1 = new BigDecimal("4.3");// primer objeto instanciado
	 
	 BigDecimal num2 = new BigDecimal("6.26");// segundo objeto instanciado
	 
	 // mando a llamar los objetos instanciados de BigDecimal como los prámetros del método  
	 
	 BigDecimal suma3= Suma.sumar(num1, num2);
	 
	 // imprimo en consola con el system.out.println
	 System.out.println("El resultado exacto de la suma de decimales es " + suma3);
	 
	}

}


