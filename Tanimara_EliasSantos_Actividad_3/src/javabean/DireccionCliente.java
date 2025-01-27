package javabean;

public class DireccionCliente extends Cliente {
	
	private String calle;
	private String localidad;
	private String provincia;
	private Pais pais;
	
	public DireccionCliente() {
		super();
	}

	public DireccionCliente(String calle, String localidad, String provincia, Pais pais) {
		super();
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "DireccionCliente [calle=" + calle + ", localidad=" + localidad + ", provincia=" + provincia + ", pais="
				+ pais + "]";
	}
	
	
	

}
