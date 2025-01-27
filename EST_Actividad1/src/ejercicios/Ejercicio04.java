package ejercicios;

import java.util.Scanner;

/*
 * Leer números hasta que se introduzca un cero. 
 * Para cada uno indicar si es par o impar. 
 * Al final mostrar las estadísticas de 
 * cuantos son pares e impares, y
 * cuanto suman los pares y cuanto los impares.
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear objecto utilizando la clase Scanner
		Scanner leer = new Scanner(System.in);

		// Utilizar tipo de dato integer para permitir la entrada de números enteros
		int numero = 0, pares = 0, impares = 0;

		System.out.println("Este programa lee números y los identifica como pares o impares.\n"
				+ "El programa termina cuando introduces un 0.\n"
				+ "Tú introduces un número y el programa te dirá si es par o impar.\n"
				+ "También enseñará la siguientes estadísticas:\n" + "- cuántos números son pares, impares.\n"
				+ "- cuánto suman los pares y cuánto suman los impares.");

		// Pedir al usuario que introduzca un número en la consola
		System.out.println("Por favor, introducir un número, 0 para terminar:");

		// Leer dato introducido por usuario
		numero = leer.nextInt();

		// Empezar bucle asegurandose de que el número no es 0
		while (true) {

			// Si el número es igual a 0, el programa termina.
			if (numero == 0) {
				System.out.println("0 termina el programa");
				break;
			}
			/*
			 * Si el número es par, sumarlo a la variable contador de pares y imprimir en
			 * consola.
			 */
			if (numero % 2 == 0) {
				pares++;
				System.out.println("El número " + numero + "es par.");

				/*
				 * Si el número es impar, sumarlo a la variable contador de impares y imprimir
				 * en consola.
				 */
			} else if (numero % 2 != 0) {
				impares++;
				System.out.println("El número " + numero + "es impar.");
			}

			// volver a leer los numeros que el usuario va a dar
			System.out.println("dame otra vez un número, 0 para terminar");
			numero = leer.nextInt();
		}

		System.out.println("ESTADÍSTICAS");
		System.out.println("Son pares " + pares + " números.");
		System.out.println("Son impares " + impares + " números.");

		leer.close();

		System.out.println("FIN DEL PROGRAMA.");
	}

}
