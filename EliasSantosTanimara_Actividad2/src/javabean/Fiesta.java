package javabean;

public class Fiesta {
	
	//Atributos constantes
	
	public static final int PRECIO_INVITADO;
	public static final int PRECIO_BOCADILLO;
	public static final int PRECIO_BEBIDA;
	
	static {
		PRECIO_INVITADO = 5;
		PRECIO_BOCADILLO = 3;
		PRECIO_BEBIDA = 2;
	}
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	
	//Constructor con todo
	
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	//Constructor con nada
	
	public Fiesta() {
		super();
	}

	//Getters y Setters
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	//Converter valores atributos de la clase en toString
	
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	//METODOS PROPIOS
	
	public void invitar() {
		invitados ++;
	}
	
	public void cancelarInvitación() {
		invitados --;
	}
	
	// Sobrecargamos métodos propios invitar() o cancelarInvitación() con cantidad de invitados
	
	public void invitar(int cantidad) {
		invitados += cantidad;
	}
	
	public void cancelarInvitación(int cantidad) {
		invitados -= cantidad;
	}
	
	/*Calcular precio de la fiesta sumando los valores de las bebidas, bocadillos y gastos por invitado,
	* multiplicados por la cantidad de invitados de la fiesta
	*/
	
	public int precioFiesta( ) {
		return (invitados * PRECIO_INVITADO) + (invitados * PRECIO_BEBIDA) + (invitados * PRECIO_BOCADILLO);
	}

}
