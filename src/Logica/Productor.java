/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Productor extends Thread{
	
	
	private Tuberia tuberia;
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Productor( Tuberia t ) 
	{
		// Mantiene una copia propia del objeto compartido
		tuberia = t;
	}

	public void run() {
		char c;
		
		char arreglo[] = new char[15];

		// Mete 10 letras en la tubería
		for( int i=0; i < 15; i++ )
		{
			c = alfabeto.charAt( (int)(Math.random()*26 ) );
			if(arreglo[i] != c)
			{
				arreglo[i] = c;
				tuberia.lanzar(arreglo[i]);
				// Imprime un registro con lo añadido
				System.out.println( "Lanzado productor 1 "+c+" a la tuberia." );
				// Espera un poco antes de añadir más letras
				try
				{
					sleep( (int)(Math.random() * 100 ) );
				} 
				catch( InterruptedException e ) 
				{
					System.out.println(e);;
				}
			}	
		}
	}
}
