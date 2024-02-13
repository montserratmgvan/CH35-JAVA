package org.generation.persona;

public class Persona {

	//Crear objeto Persona con los atribujos: nombre, apellido, email y edad.
	
	
	public String nombre;
	public String apellido;
	public String email;
	public String edad;
	
	
	//crear constructor
	public Persona(String nombre, String apellido, String email, String edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
	}

//crear to string
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad + "]";
	}

	
	// getters
	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}


	public String getEdad() {
		return edad;
	}
	
	

	
	
	
	
	
	
	
	
	
}
