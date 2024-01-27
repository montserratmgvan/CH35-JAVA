package org.generation.encapsulation;
/*
 * La estructura básica para crear objetos, es la siguiente:
 * 1. Atributos o propiedades
 * 2. Método constructor (1 - n métodos)
 * 3. Métodos del objeto (comportamiento)
 * 4. Métodos Getters y Setters
 * 5. Método toString
 * */

public class Employee {

	// 1. Encapsular atributos y propiedades utilizando un modificador private (privado)
	
	private String nombre;
	private String apellido;
	private int id;
	private double salario;
	private String puesto;
	
	// 2. Encapsular el Método constructor de tipo público
	
	public Employee(String nombre, String apellido, int id, double salario, String puesto){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	
	
	// Encapsular Métodos de comportamiento
	
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
	public void calcularSalario() {
		System.out.println("El salario del empleado " + this.nombre + " " + this.apellido + " es de $" + this.salario + " pesos");
	}
	
	public void capacitarse () {
		System.out.println("El trabajador del puesto " +this.puesto + " se capacita");
	}
	
	public void infoGeneral() {
		System.out.println("Id " +this.id + " Nombre " +this.nombre + "Apellido" + this.apellido);
	}
	
	
	// 4. Getters y Setters. Son métodos que nos permiten obtener o enviar información que esta protegida por modificadores de acceso y de esta manera interactuar con nuestros objetos. Los getters nos permiten obtener la infomación y los setters nos permiten enviarla.
      
	/*Estructira de Getter
       * public tipoDato getNombreVariable (){
       * return nombreVariable;
       * }
       * 
       * por ejemplo:
       * 
       * public String getNombre () {
       * return nombre;
       * }
       * */
	
	/*Estructira de Setter
     * public tipoDato setNombreVariable (variable){
     	this.variable = variable;
	 * 		}
	 * 		p.e.
	 * 		public void setNombre (String nombre) {
	 * 		this.nombre = nombre;	
	 * 		}
	 * 
	 * Podemos inicializar Getters y Setter dando click derecho > Source > Generate Getters y Setters > Select All > Generate
	 */
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}



	

	//5. Método toString. Es un "override" que se refiere a la capacidad de proporcionar información espepecífica de una clase en forma de cadena de caracteres. Nos permite imprimir nuestros objetos en formato String.
	//Podemos inicializar toString dando click derecho > Source > Generate toString > Fields > Generate
	
	@Override /*La anotación @Override simplemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método, y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.*/
	
	//https://es.stackoverflow.com/questions/156432/para-que-sirve-la-l%C3%ADnea-override-en-java
	
	public String toString() {
		return "Employee ["
				+ "nombre=" + nombre + 
				", apellido=" + apellido + 
				", id=" + id + 
				", salario=" + salario+ 
				", puesto=" + puesto +
				"]";
	}
	
	
	
	


}
