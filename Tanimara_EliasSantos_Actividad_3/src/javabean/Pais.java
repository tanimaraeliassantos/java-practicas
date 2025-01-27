package javabean;

import java.util.Objects;

public class Pais {
	private int codigoPais;
	private String nombre;
	
	public Pais(int codigo, String nombre) {
		super();
		this.codigoPais = codigo;
		this.nombre = nombre;
	}

	public Pais() {
		super();
	}

	public int getCodigo() {
		return codigoPais;
	}

	public void setCodigo(int codigo) {
		this.codigoPais = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pais))
			return false;
		Pais other = (Pais) obj;
		return codigoPais == other.codigoPais;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigoPais + ", nombre=" + nombre + "]";
	}
	
	
	

}
