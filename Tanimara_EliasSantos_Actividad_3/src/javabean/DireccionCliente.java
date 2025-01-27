package javabean;

public class DireccionCliente extends Cliente {
	
	private DireccionCliente direccion;
	private String localidad;
	private String provincia;
	private Pais pais;
	
	public DireccionCliente() {
		super();
	}

	public DireccionCliente(DireccionCliente direccion, String localidad, String provincia, Pais pais) {
		super();
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public DireccionCliente getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionCliente direccion) {
		this.direccion = direccion;
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
	
	
	

}
