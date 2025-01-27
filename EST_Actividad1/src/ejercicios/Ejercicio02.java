package ejercicios;
/*
 * Diseñar un programa que muestre el producto y la suma de los 10 primeros números impares.
 * Primeros 10 números impares: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19.
 */

public class Ejercicio02 {
	public static void main(String[] args) {

		/*
		 * Inicializar variable con tipo de dato entero formato longo. Se inicializa en
		 * 1 para que el producto de la primera iteración no sea 0.
		 */
		long productoImpares = 1;
		{
			/*
			 * Iniciar bucle contando i desde 1, sabiendo que i es menor que 20, añadiendo 2
			 * a cada iteración.
			 */
			for (int i = 1; i < 20; i += 2) {

				// Imprimir listado de 10 primeros números impares identificados en el bucle
				System.out.println("los 10 primeros números impares son" + i);
				
				// Calcular producto de los 10 primeros números impares entre si
				productoImpares = productoImpares * i;
			}

			System.out.println("El resultado de la suma de los 10 primero número impares es: " + productoImpares);

			System.out.println("FIN DEL PROGRAMA");
		}
	}

}
