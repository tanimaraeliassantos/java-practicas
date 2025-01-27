package algoritmos;

public class Ejercicio03 {
public static void main(String[] args) {
	int edad = 18;
	if(edad >= 18)
		System.out.println("mayor de edad");
	
	//rama if y rama else con una sentencia
	if(edad >= 18)
		System.out.println("mayor de edad");
	else
		System.out.println("menor de edad");
	
	//rama if y rama else mas de una sentencia
	if(edad >=18) {
		System.out.println("mayor de edad");
		System.out.println("eres senior");
	}
	else {
		System.out.println("menor de edad");
		System.out.println("eres chiquitin");
	}
	
	//rama if y rama else mas de una sentencia con otros valores
	if(edad >=18) {
		System.out.println("mayor de edad");
		System.out.println("eres senior");
		edad++;
	}
	else {
		System.out.println("menor de edad");
		System.out.println("eres chiquitin");
		edad *=7;
	}
	
		System.out.println("FIN DE PROGRAMA");
}
}
