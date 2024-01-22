package org.generation.exercises;
import java.util.ArrayList;
import java.util.Scanner;
public class EquipoEjercicio {


	

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


	/*
	 * Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
	 * Agreguar la opción que permite que el usuario elimine un estudiante 
	 * después de haberlo agregado y muestre la lista actualizada después de la 
	 * eliminación (.remove();).
	 */
		
		public static void main (String[]args) {
		
			//Inicializar un ArrayList para guardar a los estudiantes
			ArrayList<String> estudiantes = new ArrayList <String>();
			
			//Scanner para el usuario
			Scanner scanner = new Scanner(System.in);
			
			//Loop para permitir agregar usuarios
			String nombreEstudiante; //Inicializando de manera global
			do {
				System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' para finalizar");
				nombreEstudiante = scanner.nextLine(); //Invocando de manera local
				estudiantes.add(nombreEstudiante);
				
			} while(!nombreEstudiante.equals("Salir") && !nombreEstudiante.equals("salir")); //Siempre que NO se escriba "Salir", el loop se sigue ejecutando
			
			
			//Mostrar lista de estudiantes (for-each)
			System.out.println("** Lista de estudiantes:");
			for (String estudiante : estudiantes) {
				//Si no quiero que se muestre la palabra "Salir" voy agregar una condicional sobre la variable que guarda a los elementos que iteran sobre el ArrayList
				if(!estudiante.equals("Salir") && !estudiante.equals("salir")) {
					System.out.println(estudiante);
				}
					
			}
			
			scanner.close ();
		
		
		
			
			
			//5.Eliminar estudiantes
			String estudianteEliminado;
			System.out.println("Ingresa el nombre del estudiante que quieres eliminar. Escribe 'Salir' o 'salir' para finalizar.");
			do {
				estudianteEliminado = scanner.nextLine();
				estudiantes.remove(estudianteEliminado); 
			} while(!nombreEstudiante.equals("Salir")  && !nombreEstudiante.equals("salir")); //En cuanto se escribe 'Salir' se para el Loop
			
			//6.Mostrar lista de estudiantes ACTUALIZADA 
			System.out.println("* Lista de estudiantes actualizada *");
			for (String estudiante : estudiantes) {
				if(!estudiante.equals("Salir"))
				System.out.println(estudiante);
			}
		}

	}