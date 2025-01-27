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
		Scanner leer = new Scanner(System.in);
		int contadorPares = 0, contadorImpares = 0, sumaPares = 0, sumaImpares = 0;
		int numeroLeido = 0;
		System.out.println("dame un numero, 0 para terminar");
		numeroLeido = leer.nextInt();
		
		while(numeroLeido != 0) {
			if (numeroLeido % 2 == 0) {
				contadorPares++;
				sumaPares += numeroLeido;
			} else
			{
				contadorImpares++;
				sumaImpares += numeroLeido;
			}
			
			System.out.println("dame otro numero, 0 para terminar");
			numeroLeido = leer.nextInt();
		}
		
		System.out.println("ESTADÍSTICAS");
		System.out.println("numeros pares : " + contadorPares);
		System.out.println("numeros impares : " + contadorImpares);
		
		System.out.println("Suma pares : " + sumaPares);
		System.out.println("Suma impares : " + sumaImpares);

		leer.close();

		System.out.println("FIN DEL PROGRAMA.");
	}

}
