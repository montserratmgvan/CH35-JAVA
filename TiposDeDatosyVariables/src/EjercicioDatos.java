

public class EjercicioDatos {

	public static void main(String[] args) {
		
		
		System.out.println("Hola soy Monse :) ");
		
		/*Comentarios multilínea*/
		// Comentarios de una sola línea 
		
		//tipos de datos enteros
		
		byte edad = 15; // sirve para representar un número entero 8bites (-128 al 127)
		
		System.out.println("Edad del participante " +edad);
		
		short usuariosNuevos =200; //Sirve para representar un número entero 16 bites (-23768 al 32767)
		
		System.out.println("Usuarios nuevos " +usuariosNuevos);
		
		int usuariosTotales = 8752;// sirve para representar un numero entero 32 bits (-2147483648 al 2147483647)
         
		System.out.println("Usiarios totales " +usuariosTotales);
		
		long usuariosPremium= 9512; // sirve para represnetar un nuemro entero con valores mucho mayores
		
		System.out.println("Usuarios premium " +usuariosPremium);
		
// Tipos de datos con números decimales
		
		float altura = 1.61f; //Sirve para representar un valor numerico con numeros decimales, cuyo valor es de 23 bits, puede tener 8 caracteres despues del punto decimal y que tiene que llevar una f al final
		
		
		System.out.println("Altura del ususrio "+altura);
		
		double peso = 68.20;//Sirve para representar valores numericos con decimales, cuyo valor es de 64 bits y puede tener hasta quince caracteres despues del punto decimal
        
		
		
		char seccion = 'f'; // sirve para representar valores con un solo caracter
		
		System.out.println ("Sección " +seccion);
		
		boolean clienteFrecuente = true; // sirve para obtener true o false utilizando condicionales
		System.out.println ("Es un cliente frecuente " + clienteFrecuente);
		
		
		// conversion de tipos
		
		// casteo a entero
		
		int pesoCambio = (int) peso;
		
		// cateo entero
		
		long pesoCambio1 = (long) peso;
		
		System.out.println("double " +peso);
		System.out.println("int " +pesoCambio);
		System.out.println("long " + pesoCambio1);
		
		//cambio de tipo string a un entero
		
		String costoBoleto = "500";//Es una clase para tener cadenas de texto
		String zonaBoleto = "52";
		System.out.println("Usuarix "+costoBoleto);
		System.out.println("Zona a la que pertenece "+zonaBoleto);
		
		int nombreCambio = Integer.parseInt (costoBoleto);		
		double zonaCambio = Double.parseDouble(zonaBoleto);
	
		
		
		System.out.println("Zona del usuario según su boleto" + (nombreCambio * zonaCambio));
		
	
		/*Operadores aritmeticos
		 * + suma
		 * - resta
		 * * multiplicación
		 * / división
		 * % residuo
		 * 
		 * */
		
		/*Operadores de comparación
		 * ==  compara si un operador es igual a otro
		 * !=  comopara si es diferente
		 * >  mayor que
		 * <  menor que 
		 * >=  mayor o igual que
		 * < = menor o igual que
		 * */
		
		double precioEntrada = 75.50;
		double precioPalomas= 89.70;
		double precioBebida = 35.50;
		int capacidadTotal = 500;
		
		
		int personasDentro = 342;
		
		if (personasDentro > capacidadTotal); {
			
			System.out.println("Aforo lleno");
			
		}
		
		double totalEntrada = personasDentro * precioEntrada;
		
		double totalPalomitas = personasDentro * precioPalomas;
		
		double totalBebidas = personasDentro * precioBebida;
		
		System.out.println("Total de personas " +personasDentro);
		System.out.println("Total de entradas " + totalEntrada);
		System.out.println("Total de palomitas " + totalPalomitas);
		System.out.println("Total de bebidas " + totalBebidas);
		
		
		//
		
	

  }
}
	
	