package algoritmos;

public class Ejercicio03ArraysVacios {

	public static void main(String[] args) {
		/* En Java cuando se inicializa un array vacio, se crean
		 * valores de acuerdo con lo siguiente:
		 * enteros -> 0
		 * double(reales) -> 0.0
		 * char -> 0
		 * boolean -> false
		 * clase -> full
		*/
		
		int [] enteros = new int[4];
		double [] reales = new double[4];
		char [] letras = new char[4];
		boolean []logicos = new boolean[4];
		String [] palabras = new String[4];
		
		System.out.println("ENTEROS");
		for (int ele: enteros) {
			System.out.println(ele);
		}
		
		System.out.println("REALES");
		for (double ele: reales) {
			System.out.println(ele);
		}
		
		System.out.println("letras");
		for (char ele: letras) {
			System.out.println(ele);
		}
		
		System.out.println("BOOLEANOS");
		for (boolean ele: logicos) {
			System.out.println(ele);
		}
		
		System.out.println("STRING");
		for (String ele: palabras) {
			System.out.println(ele);
		}
	}

}
