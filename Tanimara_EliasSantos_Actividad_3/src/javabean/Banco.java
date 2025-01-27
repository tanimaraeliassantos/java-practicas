package javabean;

import java.util.Objects;

public class Banco {
	private int codigoBanco;
	private String nombreBanco;
	private Pais paisOpera;
	
	public Banco() {
		super();
	}
	
	public Banco(int codigoBanco, String nombreBanco, Pais paisOpera) {
		super();
		this.codigoBanco = codigoBanco;
		this.nombreBanco = nombreBanco;
		this.paisOpera = paisOpera;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public Pais getPaisOpera() {
		return paisOpera;
	}

	public void setPaisOpera(Pais paisOpera) {
		this.paisOpera = paisOpera;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoBanco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Banco))
			return false;
		Banco other = (Banco) obj;
		return codigoBanco == other.codigoBanco;
	}

	@Override
	public String toString() {
		return "Banco [codigoBanco=" + codigoBanco + ", nombreBanco=" + nombreBanco + ", paisOpera=" + paisOpera + "]";
	}

	
	
	

}
