package org.generation.employee;

public class EmployeeMain {
	
	public static void main (String[] args) {
		
		
		Employee Rocio = new Employee ("Rocio Hernández", 42013, 12000 ,"Desarrollador Fronend");
		
		Employee Rene = new Employee ("Rene Gómez", 97565, 15499 ,"Desarrollador Backend");
		
		Employee Diego = new Employee ("Diego González", 0054, 25120.52 ,"Desarrollador Móvil");
		
		
		
		
		Rocio.trabajar();
		Rene.capacitarse();
		Diego.calcularSalario();
		Rene.infoGeneral();
		
		
		
		
		
		
		
	}//main
	

}//class
