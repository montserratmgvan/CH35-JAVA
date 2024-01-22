package org.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {


	public static void main(String [] args) {

	// El método .sort() permite ordenaar los elementos de una ArrayList
		
		ArrayList <Integer> points = new ArrayList <Integer>();
		
		ArrayList <String> names = new ArrayList<String>();
		
		points.add(5);
		points.add(7);
		points.add(6);
		points.add(10);
		points.add(9);
		points.add(8);
		points.add(7);
	
		System.out.println(points); //no se encuentra ordenado de menor a mayor, solamente como los agregué en el ArrayList.
		
		//ordenar de menor a mayor utilizando sort
		
		Collections.sort(points);
		System.out.println(points); //ordenados de menor a mayor.
		
		names.add("Daniel");
		names.add("Rocio");
		names.add("Monse");
		names.add("David");
		names.add("ana Karen");
		names.add("rene");
		
		
		System.out.println(names);
		
		//ordenamiento de menor a mayor utilizando sort
		
        Collections.sort(names);
		System.out.println(names); //Toma en cuenta el ordenamiento con base en l tabla ASCII.
			
	}
}
