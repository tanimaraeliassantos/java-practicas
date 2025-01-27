package ejercicios;

import java.util.Scanner;

public class Ejercicio01_2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double nota = 0;
		nota = leer.nextDouble();
		
		if (nota < 0 || nota > 10)
			System.out.println("nota incorrecta");
		else
			if(nota <= 3)
				System.out.println("Muy deficiente");
			else if (nota < 5)
				System.out.println("Insuficiente");
			else if (nota < 5.5)
				System.out.println("Suficiente");
			else if (nota < 6.5)
				System.out.println("Bien");
			else if (nota < 8.5)
				System.out.println("Notable");
			else if (nota <= 10)
				System.out.println("Sobresaliente");
	}

}
