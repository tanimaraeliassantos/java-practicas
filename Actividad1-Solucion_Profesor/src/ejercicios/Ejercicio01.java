package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int nota = 0;
		nota = leer.nextInt();
		
		switch(nota) {
		case 1: case 2: case3: 
			System.out.println("Muy deficiente");
			break;
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7: case 8:
			System.out.println("Notable");
			break;
		case 9: case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota incorrecta");
			break;
		}
	}

}
