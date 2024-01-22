package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollections {

	public static void main (String []args) {
     
		//HashSet es una clase de Collections donde cada elemento es únic, es decir, no se repiten los elementos.
		
	
	HashSet<String> animals = new HashSet<String>();
	
	animals.add("búho");
	animals.add("perro");
	animals.add("ballena");
	animals.add("colibrí");
	animals.add("mapache");
	animals.add("gato");
	animals.add("capibara");
	animals.add("ortitorrinco");
	animals.add("cebra");
	animals.add("mapache");
	
	
	// imprimir el HashSet
	
	System.out.println(animals);
	
	// Conocer si un elemento s eencuentra dentro del Set: contains();
	
	System.out.println(animals.contains("ballena"));
	
	
	//Eliminar un elemento: remove();
	
	animals.remove("cebra");// elimino
	System.out.println(animals); // imprimo el set sin el elemento eliminado
	
	// agregando elelemntos en una sola linea
	
	animals.addAll(Arrays.asList("venado", "loro", "oso"));
	System.out.println(animals);
	
	/*La clase HashSet no va a garantizar que lso elemetos  se meustren segun el orden establecido, ya que busca eficientar la búsqueda y recuperación de los elementos
	 * utiliza tabals hash para almacenar los elementos y mostrarlos al usuario.
	 * */
	
	
	
	//limpiar el HashSet . clear ();
	
	animals.clear();
	System.out.println(animals);
	
	
	
	
	
	
	}
}