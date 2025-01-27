package testing;

import javabean.Empleado;

public class TestEmpleadoVersionDefinitiva {

	public static void main(String[] args) {
		Empleado emp1, emp2, emp3;
		
		emp1 = new Empleado();
		emp1.setApellidos("Lopez");
		emp1.setComplementos(2000);
		emp1.setGenero('M');
		emp1.setIdEmpleado(218);
		emp1.setNombre("Eva");
		emp1.setSalario(23000);
		
		emp2 = new Empleado();
		emp2.setApellidos("Gomes");
		emp2.setComplementos(5000);
		emp2.setGenero('M');
		emp2.setIdEmpleado(219);
		emp2.setNombre("Maria");
		emp2.setSalario(25000);
		
		System.out.println("literal genero : " + emp1.literalGenero());
		System.out.println("salario bruto anual : " + emp1.salarioBrutoAnual());
		System.out.println("tipo salario : " + emp1.tipoSalario());
		
		emp2 = new Empleado(120, "Andres", "Lopez", 45000, 5000, 'H');

		System.out.println("literal genero : " + emp2.literalGenero());
		System.out.println("salario bruto anual : " + emp2.salarioBrutoAnual());
		System.out.println("tipo salario : " + emp2.tipoSalario());
		
		//Sacar información completa de cada empleado 
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp2.nombreCompleto());
		
		//Probando con valores nulos para metodos de objeto/metodos de instancia
//		emp3 = null;
//		
//		System.out.println(emp3);
//		System.out.println(emp3.getApellidos());
		
		System.out.println(Empleado.SALARIO_MINIMO);
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("Mi salario en 14 es : " + Empleado.tuSalarioMensual(30000, 14));
		System.out.println("Mi salario en 12 es : " + Empleado.tuSalarioMensual(30000, 12));
		System.out.println("Mi salario en 16 es : " + Empleado.tuSalarioMensual(30000, 16));
		
//		System.out.println("Mi salario en 14 es : " + emp2.tuSalarioMensual(emp2.salarioBrutoAnual(), 14);
		
		String numero = String.valueOf(12);
		System.out.println(numero);

	}

}
