package hilos;

public class Prueba1 extends Thread {

	private String numeroDepedido;
	
	
	public  Prueba1(String numeroDepedido ) {
		this.numeroDepedido = numeroDepedido;
	}
	

	@Override 
	
	public void run () { //agregamos este método
	System.out.println("Pedido procesado" + numeroDepedido);
	
	
	
}

}


/*Diferencias entre "extends" e "implements" hilos

La principal diferencia es que cuando una clase extiende la clase Thread, no puede extender ninguna otra clase, pero al implementar la interfaz Runnable, también es posible extender desde otra clase, como: clase MiClase extiende OtraClase implementa Runnable.*/