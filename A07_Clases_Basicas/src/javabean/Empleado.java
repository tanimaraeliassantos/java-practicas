package javabean;

public class Empleado {
	
	/*
	 * ATRIBUTOS DE CLASE
	*
	*public para que vea todo el mundo. static para que solo haya una variable y nada más.
	*final para que se identifique como constante, no se toca más, el valor que se define
	*ahora es para siempre. Las constantes en Java se escriben en mayúsculas siempre.
	*/
	// Manera menos elegante de definir atributos de clase estáticos:
//	public static final double SALARIO_MINIMO = 10_000;
//	public static final double SALARIO_MAXIMO = 1_000_000;
	
	//Manera MÁS elegante:
	public static final double SALARIO_MINIMO;
	public static final double SALARIO_MAXIMO;
	
	static {
		SALARIO_MINIMO = 1_000_000;
		SALARIO_MAXIMO = 1_000;
	}
	
	//atributos de instancia o de objeto
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementos;
	private char genero;
	
	public Empleado(int idEmpleado, String nombre, String apellidos, double salario, double complementos, char genero) {
		//el super aquí se usa para llamar al constructor del object, es una referencia al object
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.complementos = complementos;
		this.genero = genero;
	}
	
	public Empleado() {
		/**si llamo un constructor nulo como el en el que está este comentario, entonces los atributos
		va a ser nulos o 0)
		- entero: 0
		- reales: 0,0
		- boolean: false
		- char: \00
		- clases y arrays: null
		**/
	}
	
	//métodos getter and setter
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getComplementos() {
		return complementos;
	}
	
	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	

@Override
public String toString() {
	return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + 
			", apellidos=" + apellidos + ", salario=" + salario + 
			", complementos=" + complementos + ", genero=" + genero + "]";
}


//Metodos proprios
public String nombreCompleto() {
	return nombre + " " + apellidos;
}

public String literalGenero() {
	if (genero == 'H')
		return "Hombre";
	else
		return "Mujer";
}

public double salarioMensual() {
	return salario / 14;
}

public double salarioMensual(int meses) {
	return salario / meses;
}

public double salarioBrutoAnual() {
	return salario + complementos;
}

public String tipoSalario() {
	if(salarioBrutoAnual() <20000)
		return "Salario Bajo";
	
	if (salarioBrutoAnual() >=20000 && salarioBrutoAnual() <=40000)
		return "Salario Medio";
	
	else
		return "Salario Alto";
}

public static double tuSalarioMensual(double salario, int meses) {
	return salario / meses;
}

}
