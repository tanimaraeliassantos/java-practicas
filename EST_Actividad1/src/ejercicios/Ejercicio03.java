package ejercicios;

/*
 * Escribir todos los números del 100 al 0 de 7 en 7.
 * Al final mostrar las estadísticas de
 * cuantos números se han escrito,
 * cuanto suman los números escritos,
 * cuantos de estos números son pares.
 */

public class Ejercicio03 {
	public static void main(String[] args) {

		// Inicializando variables con tipo de dato entero.
		int contador = 0, suma = 0, contadorPares = 0;

		// Iniciar bucle contando desde 100 al 0, restando 7 a cada iteración.
		for (int i = 100; i >= 0; i -= 7) {

			// Imprimir números procesados
			System.out.println(i);
			// Calcular cuantos números fueron procesados
			contador++;
			// Sumar valores de los números procesados
			suma += i;

			// Iniciar bucle para identificar cuáles de los números procesados son pares
			if (i % 2 == 0) {
				// Calcular cuantos de los números procesados son pares
				contadorPares++;
			}

		}

		System.out.println("ESTADÍSTICAS");
		System.out.println("Los números procesados son: " + contador);
		System.out.println("Los números procesados sumados dan: " + suma);
		System.out.println("Del total, los números pares son: " + contadorPares);

		System.out.println("FIN DEL PROGRAMA");
	}

}
