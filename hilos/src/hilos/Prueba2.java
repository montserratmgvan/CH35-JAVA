package hilos;

public class Prueba2 implements Runnable{ // se agrega Runnable despues del implements para que sepa qeu se tiene que implementar el método run

	
	
	private String numeroDepedido;
	
	
	public Prueba2(String numeroDepedido) {
		this.numeroDepedido =numeroDepedido;
	}
	
	
	
	public void run () {
		System.out.println("Pedido procesado" + numeroDepedido);
	}
	
	}



