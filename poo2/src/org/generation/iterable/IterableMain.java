package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableMain {
	
	public static void main (String[]args) {
		// Podemos iterar sobre una colección de 3 maneras:
		//1. Iteración mediante un ciclo for-each
	System.out.println("******PRIMER MÉTODO*******");
	List <String> nombres = new ArrayList <String>();
	
	
	nombres.addAll(Arrays.asList("Braulio", "Feranda", "Rodrigo", "Ruben", "Marco", "Rey"));
	
	
	for( String nombre: nombres) {
		System.out.println(nombre);
	  }
	
	//2. Iterar mediante Iterator.
	System.out.println("******ITERATOR*******");
	
	List<String> apellidos = new ArrayList<String>();
	
	apellidos.addAll(Arrays.asList("Alemán", "García", "Martínez", "Cardoso", "Razo", "Ceja"));
	
	// Utilizar un nuevo iterador y le vamos a pasar el método iterator() a nuestro ArrayList
	
	Iterator<String> iterador = apellidos.iterator();
	
	// utilizando while, devuelve verdadero si la iteración tiene más elementos, sino, s etermina el ciclo.
	
	
	while(iterador.hasNext()) {
		String elemento = iterador.next();
		System.out.println(elemento);
	}
	
	
	//3. Mediante forEach que toma una expresion Java Lambda como parámetro.
	
	System.out.println("******EXPRESIÓN LAMBDA*******");
	
	List<String> animales = new ArrayList<String>();
	
	animales.addAll(Arrays.asList("perro","gato","ballena","axolote","colobrí", "vaca", "caballo"));
	
	animales.forEach((animal) ->{
	System.out.println(animal);	
	});
	
	
	
	
	}

}
