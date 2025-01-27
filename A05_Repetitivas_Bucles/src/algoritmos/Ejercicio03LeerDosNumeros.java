package algoritmos;

import java.util.Scanner;

public class Ejercicio03LeerDosNumeros {

	public static void main(String[] args) {
		/* Leer consecutivamente dos números cada vez, hasta que los dos
		 * números leídos e informar cada vez si son iguales, mayor o menor
		 * (el primero respecto al segundo). Al final del proceso informar
		 * cuantas veces los números eran iguales, cuantas veces el primero
		 * era mayor del segundo y cuantas veces el primero era menor
		 * del segundo número leído.
		*/
		
		//inicializando variables
		Scanner leer = new Scanner(System.in);
		int num1=0, num2=0, contIguales=0, contMenores=0, contMayores=0;
		
		//leyendo los numeros que el usuario va a dar
		System.out.println("dame dos numeros enteros, -1 en ambos para terminar");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		//comparacion de los numeros
		while (num1 != -1 || num2 != -1) {
			if(num1 < num2)
				contMenores++;
			else
				if(num1>num2)
					contMayores++;
				else
					contIguales++;
		
			//volver a leer los numeros que el usuario va a dar
			System.out.println("dame otra vez dos numeros enteros, -1 en ambos para terminar");
			num1 = leer.nextInt();
			num2 = leer.nextInt();
		}
		
		System.out.println("ESTADISTICAS");
		System.out.println("mayores : " + contMayores);
		System.out.println("menores : " + contMenores);
		System.out.println("iguales : " + contIguales);
		leer.close();

	}

}
