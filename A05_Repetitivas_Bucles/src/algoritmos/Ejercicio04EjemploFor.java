package algoritmos;

public class Ejercicio04EjemploFor {

	public static void main(String[] args) {
		/* Procesar numeros del 100 a 1. Escribir cada numero leido.
		 * Al final del proceso decir cuantos numeros
		 * he leido, cuantos son multiplos de 2 y
		 * cuantos son multiplos de 3.
		 */
		
		//Inicializar variables
		int cont=0, contMul2=0, contMul3=0;
		
		for(int i=100; i>=1; i--) {
			System.out.println(i);
			if (i%2 == 0)
				contMul2++;
			if(i%3 ==0)
				contMul3++;
			
			cont++;
		}
		
		System.out.println("ESTADISTICAS");
		System.out.println("numeros procesados : " + cont);
		System.out.println("numeros multiplos de dos : " + contMul2);
		System.out.println("numero multiplos de tres : " + contMul3);
	}

}
