package operadoresLogicos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		
		
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		 || operador or devuelve true si almenos una de las dos condiciones se cumple
		 ! operador not si la expresion booleana es flase devuelve true y viceversa */
	
	
	//&& and 
		
        int anios = 5;
		
		boolean esInfante = true; 
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es pequeño " + costoInfante);
		
	
		
		String cliente = "cliente123";
		String credenciales = "moonbyul25";
		
		boolean credencialCorrecta = cliente.equals("cliente123") && credenciales.equals("moonbyul25");
		
		System.out.println("Las credenciales si son válidas " + credencialCorrecta);
		
		
		// || or
		
		double costoPasaje = 380.50;
		int edad = 58;
		boolean credenInapam = false;
		
		boolean descuentoAdultoMayor = edad >=60 || credenInapam;
		
		System.out.println(" ¿Tiene descuento? " + costoPasaje);
		
		//! not
		boolean asientoDisponible = true;
		boolean libres = true;
		boolean asientosConDesceunto = !libres;
		
		System.out.println("Tenemos asientos con descuento " +asientosConDesceunto);
		
		//ejercicio
		
		int costoBoleto=350;
		int capacidadTotal= 62; //asientos
		int asignadosAncianos=4; //destinados a adultxs mayores
		int asignadosEstudiantes=6; //a estudiantes
		//descuento a inapam es de 35%
			//a estudiantes 30%
			 //* 
		
		
		
		double maxCompra = ((asignadosAncianos*(costoBoleto*0.65))+(asignadosEstudiantes*(costoBoleto*0.65)+((capacidadTotal-asignadosAncianos)-asignadosEstudiantes)*costoBoleto));
			System.out.println("La venta total de un autobus con 4 Ancianos y 6 estudiantes es: $"+ maxCompra);
		
		/*double asientoAdultoMayor=4;
		double asientoEstudiante=6;
		double capacidadAutobus=62;
		
		
		double asientoVerificarAdultoMayor = 1; 
        double asientoVerificarEstudiante = 2; 

        boolean dispAsientoAdultoMayor = asientoVerificarAdultoMayor < asientoAdultoMayor;

         System.out.println("¿Hay asientos disponibles para adultos mayores? " + dispAsientoAdultoMayor);
        
         boolean dispAsientoEstudiante = asientoVerificarEstudiante < asientoEstudiante;
  
         System.out.println("¿Hay asientos disponibles para estudiantes? " + dispAsientoEstudiante);
       
       */
       
	
		
		
	}

}
