package org.generation.letras;

import java.util.Scanner;

/*
	 * Crear un programa que le solciite un mensaje al usuario y cuente cuantas vocales, consonantes, números y símbolos posee dicho mensaje.
	 *   Letras: métodos para interactuar con el ususario 
	 *   Letras Main: vamos a instanciar los obejtos
	 *   Contador: métodos para contar vocales, consonantes, números y símbolos.
	 *   
	 *   
	 * */
	
public class Letras {
	
	// para que nuestro usuario interactue, definimos un Scanner
	
	Scanner scanner = new Scanner(System.in);
	
	// Metemos el Scanner dentro de un método
	
	public String leerEntrada() {
		return scanner.nextLine();
	}
	
	// Método para proporcionar contexto al usuario.

	public void mostrarMensaje(String mensaje) {
	System.out.println(mensaje);	
	}
	
	
	
}
