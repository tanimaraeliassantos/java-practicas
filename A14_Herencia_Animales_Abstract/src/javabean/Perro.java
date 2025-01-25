package javabean;

public class Perro extends Animal{
	private String raza;

	@Override
	public void saludar() {
		System.out.println("Hola soy Perro de raza: " + raza);
	}

	@Override
	public void sonido() {
		System.out.println("Soy perro y digo UAU");
	}

	public Perro(int matricula, String nombreCientifico, int numeroPatas, String raza) {
		super(matricula, nombreCientifico, numeroPatas);
		this.raza = raza;
	}
	
	public Perro() {
		super();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + ", raza=" + raza + "]";
	}
	
	

}
