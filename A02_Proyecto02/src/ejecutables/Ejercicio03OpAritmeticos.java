package ejecutables;

public class Ejercicio03OpAritmeticos {

	public static void main(String[] args) {
		int a=4, b=5, resultado=0;
		
		//a++;
		//b--;
		//a--;
		//b++;
		//resultado = a++;
		//System.out.println("resultado : " + resultado);
		//System.out.println("la variable a : " + a);
		
		//resultado = ++b;
		//System.out.println("resultado : " + resultado);
		//System.out.println("la variable b : " + b);
		
		//resultado = ++b + ++a;
		//System.out.println("resultado : " + resultado);
		//System.out.println("la variable a : " + a);
		//System.out.println("la variable b : " + b);
		
		resultado = ++b + a++;
		System.out.println("resultado : " + resultado);
		System.out.println("la variable a : " + a);
		System.out.println("la variable b : " + b);
		
	}

}
