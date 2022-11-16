/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *Tomando como base el código fuente del ejemplo productor / consumidor: Abecedario

1. Permitir que el productor pueda lanzar hasta 15 letras del abecedario a la tubería. 
Dichas letras no se pueden repetir.

2.El consumidor puede recoger 2 letras a la vez y detenerlo por 3 segundos. 
Luego continúa consumiendo si en el buffer de la tubería existen letras.

3.Crear otro hilo productor que lance letras al buffer de la tubería. 
Los dos productores no pueden enviar la misma letra. 
Se debe sincronizar de tal forma que los productores no dupliquen las letras que van a lanzar.

 */
public class Consumidor extends Thread {
	
	private Tuberia tuberia;
	
	public Consumidor( Tuberia t )
	{
		// Mantiene una copia propia del objeto compartido
		tuberia = t;
	}
	
	public void run() {
		char c;
		char c2;

		// Consume 10 letras de la tubería
		for( int i=0; i < 15; i++ )
		{
			c = tuberia.recoger();
			c2 = tuberia.recoger();
			// Imprime las letras retiradas
			System.out.println( "Recogido el caracter "+c );
			System.out.println( "Recogido el caracter "+c2 );
			// Espera un poco antes de coger más letras
			try 
			{
				//sleep( (int)(Math.random() * 2000 ) );
				sleep(3000);
			}
			catch( InterruptedException e )
			{
				System.out.println("Interrumpido");
			}
		}
	}
	
	
	
	

}
