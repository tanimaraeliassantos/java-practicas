package testing;

import javabean.Cuenta;

public class TestCuenta2 {
	
	private static Cuenta cuenta1 = new Cuenta(1000, "AHORRO", "Eva Goma", 1500);
	private static Cuenta cuenta2 = new Cuenta(2000, "NOMINA", "Carlos Lopez", 1000);

	public static void main(String[] args) {
		abono();
		extractoCorrecto();
		extractoFallido();
		transferenciaCorrecta();
		transferenciaFallida();

	}
	
	public static void abono() {
		cuenta1.abono(1000);  //saldo = 2500
		System.out.println(cuenta1);
	}
	
	public static void extractoCorrecto() {
		System.out.println("\nEXTRACTO DE 300\n");
		System.out.println(cuenta1.extraer(300));  //true
		System.out.println("mi saldo ahora es 2200 : " + cuenta1.getSaldo());
	}
	
	public static void extractoFallido() {
		System.out.println("\nEXTRACTO DE 5000. NO LO HACE\n");
		System.out.println(cuenta1.extraer(5000));  //true
		System.out.println("mi saldo ahora es 2200 : " + cuenta1.getSaldo());
	}

	public static void transferenciaCorrecta() {
		System.out.println("\nTRANSFERENCIA CORRECTA DE 1000\n");
		System.out.println(cuenta1.transferir(cuenta2, 1000));//true
		System.out.println(cuenta1); //1200
		System.out.println(cuenta2); //2000
	}
	
public static void transferenciaFallida() {
		System.out.println("\nTRANSFERENCIA INCORRECTA DE 5000\n");
		System.out.println(cuenta1.transferir(cuenta2, 5000));//false
		System.out.println(cuenta1); //1200
		System.out.println(cuenta2); //2000
	}
}
