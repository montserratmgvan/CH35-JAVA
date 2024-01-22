package org.generation.collections;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {

	public static void main (String[] args ) {
		
		
		//******************** Arrays ********//
		
		
		String[] names = {"Sofía", "Roberto", "Lorena", "Melissa","Xavier", "Montserrat", "Abigail", "Robertito"};
		//Imprimiendo arrays
		System.out.println(Arrays.toString(names));
		
		//Esta es la estructura para imprimir el array System.out.println(Arrays.toString(names));
		
		int[] edades = {51,52,33,25,23,23,25,5};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array 
		
		String name1 = names[5];
		System.out.println("El primer array de la lista es: " + name1);
		
		
		int edad1 = edades[4];
		System.out.println("La edad de " + name1 + " es de " +edad1 + " años"); // La edad de Sofía es de 51 años
		
		// Obtener la longitud  del Array
		
		int longitudNames = names.length;
		System.out.println("El array names tiene " +longitudNames + " elementos");
		
		 //Obtener el último elemento 
		
		String ultimoElemento = names[longitudNames -1]; // La longitud ya vive en la variable "longitudNames"
		
		System.out.println("El último elemento del array names es " +ultimoElemento);
		
		/* Otra forma de llamar array
		 String ultimoElemento = names[names.length -1]; la longitud no vive en una variable
		 System.out.println("El último elemento del array names es " +ultimoElemento);
		 */
		

		// Mostrar cada elemento utilizando forEach
		
		for (String name : names){
			System.out.println(name);
		}
		
		
		//**** ArrayList********//
		
		//ArrayList es un array que piuede cambiar de tamaño.Es la clase de Java que representa la estructura de datos de Arrays. Permite elemenros duplicados y recibe varios métodos para su manipulación
		
		
		ArrayList<String> films = new ArrayList<String>();
		
		ArrayList<Integer> characters = new ArrayList <>(); // wrapper class
		
	// Agregar elementos
		
		films.add("Ralph el demoledor");
		films.add("Mulan");
		films.add("Se7en");
		films.add("Sherk");
		films.add("Turbo");
		films.add("Herbie a toda marcha");
		films.add("Inception");
		
		System.out.println(films);
		
		//Obtener un elemento: get(index);
		
		String film1 = films.get(0);
		System.out.println("La primer película es " +film1);
		
		
		// Modificar un elemento: name.set(index, newValue)
		
		String film3 = films.set(3, "Memento");
		String film3Get = films.get(3);
		System.out.println(film3Get);
		
		// Mandar a llamar método para conocer el tamaño del ArrayList: name.size();
		
		int sizeFilms = films.size();
	
		System.out.println("E tamaño del ArratList films es de " +sizeFilms + " elementos");
		
		
		// Agregar elelemnto yd espues eliminarlo
         films.add("The fountain");
		System.out.println(films);
		
		films.remove(7);
		System.out.println(films);
		
		
		//Monstrando los elementos en lista
		System.out.println("*****Films en lista*****");
		for (String film : films) {
			System.out.println(film);
		}
		
		
		/*matricula.add(255253);
		characters.add("A");
		System.out.println(matricula);
		System.out.println(characters);*/
		
		
	}
} 
