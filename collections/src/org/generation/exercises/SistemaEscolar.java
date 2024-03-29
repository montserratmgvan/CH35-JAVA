package org.generation.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/*Programa que permite que un usuario agrege nombre completo de estudiantes matriculados en una universidad. Posteriormente muestra la lista de los estudiantes agregados.*/
/*
 * -- Requerimientos:
 * > Utilizar ArrayList para guardar a los estudiantes(ArrayList <String>)
 * > Scanner para interactuar con el  usuario y permitir que se agreguen estudiantes.
 * > Loop (ciclo) para pemitir que se agreguen varios estudiantes(do-while o while)
 * > Opción para salid del loop 'salir'(if-else, try-catch, diferente de  (≠ o !=), switch)
 * > Mostrar lista de estudiantes (con un forEach)
 * > 
 * */
public class SistemaEscolar {
	
	public static void main (String[]args) {
	
	// Inicializar un ArrayList para guardar a nuestros estudiantes
		
	ArrayList<String> estudiantes = new ArrayList<String>();		
		
	//Escaner para el usuario
	
	Scanner scanner = new Scanner (System.in);
		
	//Loop para permitir agregar usuarios
	
	String nombreEstudiante; // Inicializado de manera global
	
	do {
		System.out.println("Ingresa el nombre del estudiante, Escribe 'Salir' para finalizar.");
		nombreEstudiante = scanner.nextLine(); // Invocado de manera local.
		estudiantes.add(nombreEstudiante);
	} while(!nombreEstudiante.equals("Salir")); //Siempre que NO se escriba "Salir", el loop se sigue ejecutando.
	
	//Mostrar lista de estudiantes
	
	System.out.println("*****Lista de estudiantes*****");
	
	
	for (String estudiante : estudiantes) {
		// si no quiero que se muestre la palabra "Salir" voy agregar una condicional sobre la variable que guarda a los elementos que iteran sobre el ArrayList
		if(!estudiante.equals("Salir")) {
		System.out.println(estudiante);
	}
}
		/*Otra forma es 
		 * System.out.println("Ingresa el nombre del estudiante. Escirbe 'Salir' para finalizar");
			nombreEstudiante = scanner.nextLine(); // Invocado de manera local dentro del do
			if(!nombreEstudiante.equals("Salir")) {
			estudiantes.add(nombreEstudiante);  
			es decir agregamos antes el add.
			*/
		
		
	
	scanner.close();
	
	/*
	 * Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
	 * Agregar la opción que permite que el usuario elimine un estudiante después de haberlo agregado y muestre la lista actualizada después de la eliminación (.remove();)
	 */
	
	
		
		
	}

}
