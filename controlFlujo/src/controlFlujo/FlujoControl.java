
package controlFlujo;
import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) { // Debe coincidir la clase con el nombre del documento / proyecto
	
		
	// recuerda que para que algo se ejecute siempre debe ir en el método pirncipal.
		
		
	//Primero defino una variable del tipo String donde se almacena un dato
		
		//String viaje = "16-01-2024"; // dejo el null y después agrego  fecha
		
		// variable declarada e inicializada, en null a propósito, para tener un "espacio" de memoria ya asignado, y solo reemplazarlo por un nuevo dato.
		
	// Para validar si podemos viajar en cieta fecha
		
		/*if (viaje != null) { //variable vacia
			System.out.println("Ya no tenemos fechas disponibles, una disculpa. ");
		} else {
			System.out.println("Puede reservar su viaje. ");
    	}
		*/
		////////////////////////////////////////////////
		
		//Validacion de contraseña
				//Scanner scanner = new Scanner(System.in);

		        // Solicitar la primera contraseña
		        //System.out.print("Ingrese la contraseña: ");
		        //String contraseña1 = scanner.nextLine();

		        // Solicitar la segunda contraseña
		       // System.out.print("Ingrese la contraseña nuevamente: ");
		        //String contraseña2 = scanner.nextLine();

		        // Verificar si las contraseñas coinciden
		        //if (contraseña1.equals(contraseña2)) {
		            //System.out.println("Las contraseñas coinciden. Acceso permitido.");
		       // } else {
		       //     System.out.println("Las contraseñas no coinciden. Acceso denegado.");
		        //}

		        // Cerrar el scanner
		        //scanner.close();
		  
	  //////////////////////////////////////////////////////7
		        
		        
		  // switch para seleccionar comida de la dulceria del cine
		        // selección de opciones, variable que almacena dicha opción
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Ingrese una opción: ");
		        
		        int menu = scanner.nextInt();
		        
		        //crear un menu
		        
		        System.out.println("Bienvenido a la dulceria, que desea ordenar ");
		        System.out.println("1. Palomitas");
		        System.out.println("2. Refresco");
		        System.out.println("3. Nachos");
		        System.out.println("4. HotDog");
		        System.out.println("5. Pagar");
		        System.out.println("No contamos con esto en nuestro menú, por favor seleccione algo de nuestro menú");
		        
		        switch (menu) {
		        case 1:
		        	System.out.println("Usted ha agragado Palomitas a su combo.");
		        	//aquí agregamos una opción y mensaje.
		        	break;
		        case 2: 
		        	System.out.println("Usted ha agragado Refresco a su combo.");
		        	break;
		        	
		        case 3: 
		        	System.out.println("Usted ha agragado Nachos a su combo.");
		        	break;
		        
		        case 4: 
		        	System.out.println("Usted ha agragado HotDog a su combo.");
		        	break;
		        
		        case 5: 
		        	System.out.println("Usted a seleccionado pargar su combo.");
		        	break;
		        	default:
		        	System.out.println("Por el momento no contamos con esa opción en nuestro menú, lo invitamos a seleccionar una opción válida");
		        	break;
		        
		        }//switch
		        scanner.close();
				  
////////////////////////////////////////////////////////
		        
		        Scanner scanner1 = new Scanner(System.in);
		        System.out.print("Bienvenido a la dulceria, que desea ordenar?\n"
						+ "1. Palomitas\n"
						+ "2. Refresco\n"
						+ "3. Nachos\n"
						+ "4. HotDog\n"
						+ "5. Pagar\n"
						+ "\n");		
			
			  		Scanner scanner11 = new Scanner(System.in);
					System.out.println("Ingresa una opcion: ");
			        int menu1 = scanner11.nextInt(); ;
			        
			        System.out.print("Bienvenido a la dulceria, que desea ordenar?\n"
							+ "1. Palomitas\n"
							+ "2. Refresco\n"
							+ "3. Nachos\n"
							+ "4. HotDog\n"
							+ "5. Pagar\n"
							+ "\n");
			        
			        switch (menu1) {
			        case 1: 
			        	System.out.println("Usted ha agregado palomitas a su combo.");
			        	break;
			        case 2: 
			        	System.out.println("Usted ha agrado refresco a su combo");
			        	break;
			        case 3: 
			        	System.out.println("Usted ha agregado nachos a su combo.");
			        	break;
			        case 4: 
			        	System.out.println("Usted ha agregado hotdog a su combo");
			        	break;
			        case 5:
			        	System.out.println("Ustead ha seleccionado pagar su combo.");
			        	break;
			        default:
			        	System.out.println("Do babe");
			        	break;
			        }
		        
		        
		        
		        
			        scanner11.close();

		        
		        
		       
		        
		        
////////////////////////////////////7
		        
		        
		        
		       
		        
		   
		 
		 
		
	}//main
	
	

}//clase
