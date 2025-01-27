package testing;

import javabean.Empleado;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado emp1;
		
		emp1 = new Empleado();
		
		/*
		 * esto no funciona porque tengo que coger los valores de los
		 * atributos a través de los setters
		 */
		
//		emp1.nombre = "tomas";
//		emp1.apellidos = "ESCUDERO";
//		emp1.salario = 100_000;
//		emp1.genero = 'J';
//		emp1.idEmpleado = 45;
		
		System.out.println(emp1.getNombre());
		System.out.println(emp1.getApellidos());
		System.out.println(emp1.getGenero());
		
		System.out.println("Empleado[ idEmpleado : "
		+ emp1.getIdEmpleado() + "nombre : " + emp1.getNombre() + " ...]");
		
		System.out.println(emp1.toString());
		
//		System.out.println(emp2);
//		System.out.println(emp3);
	
}
}
