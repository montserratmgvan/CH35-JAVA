package loops;

public class CotinueLoop {

	public static void main(String[] args) {
		
		/* Instrucciones de salto:
		 * continue -- interrumpe la iteración del bucle, si se procede una condición específica y contin{ua con la siguiente.
		 * 
		 * 
		 * */
		
		// Con continue, ejecutamos la sentencia condicinal, pero cunmpliendo la condici{on del cucle for.
		
		for (int cliente = 1; cliente <= 20; cliente ++) {
			if(cliente == 5) {
				System.out.println("Cliente número " +cliente + " ¡¡Ganaste!! ");
				
				continue;
				
			} System.out.println("Eres el cliente número " +cliente);
			
		}
		
	
		
		
		
		
		

	}

}
