package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/* ciclo do while, evalua la expresión en la aprte inferior del ciclo. 
		 * Por tanto, las declaraciones dentro del bloque "do" siempre se ejecuta al menos una vez.
		 */
		
		
	// Cuenta del 1 al 20
		
		int cuenta = 10;
		do {
			System.out.println("Cuenta es igual a: " +cuenta + " Total");
			cuenta++;
			
		} while (cuenta <0); // Output 1 ya se ejecuto al menos 1 vez
		
		/////////////////////////////////////////////////////////////
		/*
		 * Crear un programa para un cajero bancario
		 * - El programa me mostrará 4 opciones:
		 * 1. Consultar saldo
		 * 2. Ingresar dinero
		 * 3. Retirar dinero
		 * 4. Salir
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * - Mostrar al usuario la opción que eligió y permitir que elija otra opción
		 * - El usuario puede salir del programa escribiendo 4 (salir)
		 */
		
		
		System.out.println("Bienvenido al cajero City Generation, elija alguna de nuestras opciones disponibles");
		
		System.out.println("Consultar saldo");
		System.out.println("Ingrasar dinero");
		System.out.println("Retirar dinero");
		System.out.println("Salir, por favor tome su dinero y/o recibo");
		
		Scanner scr = new Scanner (System.in);
		int opcion;
		
		do {
			opcion = scr.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("Consultar saldo");
			break;
			case 2: System.out.println("Ingresar dinero");
			break;
			case 3: System.out.println("Retirar dinero");
			break;
			case 4: System.out.println("Salir, por favor tome su dinero y/o recibo");
			break;
			default: 
				System.out.println("Lo siento, no tenemos esa opción, favor de elegir una opcion válida");
			break;
			}
		} while (opcion != 4);
		
		
		scr.close();
		
	}

}
