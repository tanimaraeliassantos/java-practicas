package ejercicios;
/*
 * Pedimos por pantalla un nombre y una contraseña:
    - si el nombre coincide con “sara”, preguntamos por la contraseña
     	y si coincide con “sarita”, escribimos el mensaje
		“usuario y contraseña correctas, bienvenido a la aplicación”
    - Si el nombre NO es “sara” Escribimos usuario incorrecto”
    - Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”
 */

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		// Crear objecto utilizando la clase Scanner
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Este programa es un prototipo de una página de login.");
		
		System.out.println("Por favor, introduzca su nombre de usuario.");
		
		//Leer entrada de texto para nombre
		String name = leer.nextLine();
		
		//Si nombre es igual a sara, pedir contraseña
		if (name.equals("sara")) {
			System.out.println("Por favor, introduzca su contraseña.");
			
			//Leer entrada de texto para contraseña
			String password = leer.nextLine();
			
			//Si contraseña es igual a sarita imprimir en consola texto
			if(password.equals("sarita")) {
				System.out.println("Usuario y contraseña correctas, bienvenido a la aplicación");
			}
			
			//Si contraseña es incorrecta imprimir en consola texto
			else
				System.out.println("Contraseña incorrecta.");
		}
		
		//Si usuario es incorrecto imprimir en consola texto
		else
			System.out.println("Usuario incorrecto.");
	
		//Cerrar lectura de entrada de texto
		leer.close();
		
		System.out.println("FIN DEL PROGRAMA.");
	}

}
