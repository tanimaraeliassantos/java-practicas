package algoritmos;

public class Ejercicio02 {
	public static void main(String[] args) {
		/* Lee 2 numeros enteros de los lados de un rectangulo y calcula
		 * a. El perimetro
		 * b. El area
		 * c. La hipotenusa
		 */
		
		int lado1=4, lado2=3, perimetro=0, area=0;
		double hipotenusa=0;
		
		perimetro = lado1*2 + lado2 * 2;
		
		area = lado1 * lado2;
		
		System.out.println("El perimetro del rectangulo es : " + perimetro);
		System.out.println("El area del rectangulo es : " + area);
		
	}

}
