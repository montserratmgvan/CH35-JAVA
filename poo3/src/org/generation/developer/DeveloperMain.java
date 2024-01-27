package org.generation.developer;

public class DeveloperMain {

	public static void main(String[] args) {
		Developer Baruch = new Developer("Baruch Moreno" , 418005, 18632, "Programador", "Java");
		
		
		System.out.println(Baruch);
		Baruch.calcularSalario(); // método que hereda de la superclase
		Baruch.codear();
	}

}
