package ejercicios;

import java.util.Scanner;

/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
 * Bien, Notable y sobresaliente. Si la nota introducida no está en el rango
 * mostrar el mensaje “Nota errónea”.
 */

public class Ejercicio01 {

	public static void main(String[] args) {

		// Crear objecto utilizando la clase Scanner
		Scanner leer = new Scanner(System.in);

		// Utilizar tipo de dato double para permitir la entrada de números con
		// decimales
		double nota = 0;

		System.out.println("Este programa funciona como un evaluador de notas.\n"
				+ "Tú introduces una calificación del 0 al 10 y el programa te dará una valoración:\n"
				+ "Insuficiente, Suficiente, Bien, Notable o Sobresaliente.\n");

		// Pedir al usuario que introduzca la nota en la consola
		System.out.println("Por favor, introducir una nota de 0 a 10, -1 para terminar:");

		// Leer dato introducido por usuario
		nota = leer.nextDouble();

		// Asegurarse de que la nota está entre 0 y 10.
		if (nota < 0 || nota > 10)
			System.out.println("Nota errónea");

		// Si la nota no está entre 0 y 10, aplicar la escala de evaluación
		else if (nota >= 9.0)
			System.out.println("La nota " + nota + " es SOBRESALIENTE.");

		else if (nota >= 8.0)
			System.out.println("La nota " + nota + " es NOTABLE.");

		else if (nota >= 6.5)
			System.out.println("La nota " + nota + " es BIEN.");

		else if (nota >= 5.0)
			System.out.println("La nota " + nota + " es SUFICIENTE.");

		else if (nota < 5.0)
			System.out.println("La nota " + nota + " es INSUFICIENTE.");

		// Terminar lectura de datos de entrada
		leer.close();

		System.out.println("FIN DEL PROGRAMA.");

	}
}
