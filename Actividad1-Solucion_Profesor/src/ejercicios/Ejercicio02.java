package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		long producto = 1, suma = 0;
		
		for (int i = 1; i < 20; i += 2) {
			
			producto *= i;
			suma += i;
		}
		
		System.out.println("ESTADISTICAS");
		System.out.println("El producto es : " + producto);
		System.out.println("La suma es : " + suma);

	}

}
