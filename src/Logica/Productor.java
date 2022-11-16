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

		// Mete 10 letras en la tuber�a
		for( int i=0; i < 15; i++ )
		{
			c = alfabeto.charAt( (int)(Math.random()*26 ) );
			if(arreglo[i] != c)
			{
				arreglo[i] = c;
				tuberia.lanzar(arreglo[i]);
				// Imprime un registro con lo a�adido
				System.out.println( "Lanzado productor 1 "+c+" a la tuberia." );
				// Espera un poco antes de a�adir m�s letras
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
