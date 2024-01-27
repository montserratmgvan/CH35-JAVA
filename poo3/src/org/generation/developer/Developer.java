package org.generation.developer;

import org.generation.employee.Employee;

public class Developer extends Employee{
	
	
	public String lenguajeProgramación;

	public Developer(String nombreCompleto, int id, double salario, String puesto, String lenguajeProgramación) {
		super(nombreCompleto, id, salario, puesto);
		this.lenguajeProgramación = lenguajeProgramación;
	}

	
	//getter y setters
	
	public String getLenguajeProgramación() {
		return lenguajeProgramación;
	}

	public void setLenguajeProgramación(String lenguajeProgramación) {
		this.lenguajeProgramación = lenguajeProgramación;
	}
	
	//método de programación
	
	public void codear() {
		System.out.println("El programador " +this.getNombreCompleto() + " utiliza " + this.lenguajeProgramación);
		}

// toString, este lo podemos modificar, su orden sin problema.
	
	@Override
	public String toString() {
		return "Developer [Id=" + getId() + ", NombreCompleto=" + getNombreCompleto() + ", Puesto=" + getPuesto() + ", Salario="	+ getSalario() + ", lenguajeProgramacion=" + lenguajeProgramación + "]";
	}
	
	
	

}//class
