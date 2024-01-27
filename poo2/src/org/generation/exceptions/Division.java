package org.generation.exceptions;

public class Division {
// método para dividir
	
	public static int dividir (int num1, int num2) {
		return num1/ num2;
	}
	
	public static void main (String[] args) {
		/*
		 * La clase Exception nos pemite manejar cualquier caso excepcional con nuestro código, es el equivalente a los errores.
		 * Utiliza una estructura de control try-catch que permite manejar las excepciones.
		 * - try: envuleve el código que peude generar una excpecion y lo evalúa.
		 * - catch: contiene el código que se ejecuta cuando se lanzan la excepción.
		 * Sintaxis
		 * try {
		 *  código portegido dentro de catch
		 * }catch(ExceptionName e){
		 *bloque de excepción
		 * }
		 * - finally: siempre se ejecuta, y se utiliza para mostrar un mensaje en caso de ser invocado. Podemos prescindir de finally
		  */
		
		
		//Excepción que se arroja si un núemro se divide entre cero
		
		try {
			int resultado = dividir(10, 0);
			System.out.println("El resultado de la división es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("\u001B[31mError: no puedes dividir entre 0\u001B[31m"); //Código de escape de colores ANSI
		} finally {
			System.out.println("\u001B[32mPrograma finalizado\u001B[0m");
		}
}
}


// recurso sobre excepciones en JAVA: https://www.geeksforgeeks.org/exceptions-in-java/
