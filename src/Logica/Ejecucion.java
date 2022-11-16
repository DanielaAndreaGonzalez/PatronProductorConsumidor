/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Ejecucion {
	
	
	
	public static void main( String args[] ) throws InterruptedException {
		Tuberia t = new Tuberia();
		Productor p = new Productor( t );
		Productor p2 = new Productor(t);

		Consumidor c = new Consumidor( t );
		
		p.start();
		c.start();
		p.join();
		
		p2.start();
		p2.join();
		
		
		
		
		
	
	
	}

}
