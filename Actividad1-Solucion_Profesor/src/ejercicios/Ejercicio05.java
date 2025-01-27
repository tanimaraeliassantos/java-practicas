package ejercicios;

import java.util.Scanner;

/*
 * Pedimos por pantalla un nombre y una contraseña:
    - Si el nombre coincide con “sara”, preguntamos por la contraseña
     	y si coincide con “sarita”, escribimos el mensaje
		“usuario y contraseña correctas, bienvenido a la aplicación”
    - Si el nombre NO es “sara” Escribimos usuario incorrecto”
    - Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		String nombre = "sara", password = "sarita";
		Scanner leer = new Scanner(System.in);
		System.out.println("dame el usuario");
		nombre=leer.next();
		System.out.println("dame la contrasena");
		password=leer.next();
		if (nombre.equals("sara"))
			if (password.equals("sarita"))
				System.out.println("usuario y contraseña correctas");
			else
				System.out.println("contraseña incorrecta");
		else
			System.out.println("usuario incorrecto");

	}

}
