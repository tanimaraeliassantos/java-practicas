package ejercicios;
/*
 * Escribir todos los números del 100 al 0 de 7 en 7.
 * Al final mostrar las estadísticas de
 * cuantos números se han escrito,
 * cuanto suman los números escritos,
 * cuantos de estos números son pares.
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		int contadorNumeros = 0, sumaEscritos = 0, sumaPares = 0;
		
		for (int i=100; i >=0; i -= 7) {
			System.out.println(i);
			contadorNumeros++;
			sumaEscritos += i;
			if(i % 2 == 0)
				sumaPares++;
		}
		System.out.println("ESTADÍSTICAS");
		System.out.println("Los números procesados son: " + contadorNumeros);
		System.out.println("Los números procesados sumados dan: " + sumaEscritos);
		System.out.println("Del total, los números pares son: " + sumaPares);

		System.out.println("FIN DEL PROGRAMA");

	}

}
