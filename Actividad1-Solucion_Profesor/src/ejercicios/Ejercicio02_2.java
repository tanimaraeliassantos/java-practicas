package ejercicios;

public class Ejercicio02_2 {
	public static void main(String[] args) {
		long producto = 1, suma = 0;
		
		int impar = 1, contador = 1;
		
		while (contador <= 10) {
			System.out.println(impar);
			producto *= impar;
			suma += impar;
			
			impar += 2;
			contador ++;
		}
		
		System.out.println("ESTADISTICAS");
		System.out.println("El producto es : " + producto);
		System.out.println("La suma es : " + suma);

	}
	
}
