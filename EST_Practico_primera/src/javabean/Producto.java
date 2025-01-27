package javabean;

public class Producto {
	
	//Atributos de instancia o de objeto
	private long codigoBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;

	//Constructor con todo
	public Producto(long codigoBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}
	

	//Constructor con nada
	public Producto() {
		super();
	}

	//Métodos getter and setter
	public long getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Converter valores atributos de la clase en toString
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	//Metodos proprios
	public double precioConIva(int iva) {
		return precioUnitario + iva;
		}
	
	public void aumentarStock(int cantidad) {
		cantidadStock += cantidad;
	}
	
	public boolean disminuirStock(int cantidad) {
		if (cantidadStock - cantidad >= 0) {
			cantidadStock -= cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	public double precioAplicado() {
		double precioFinal = precioUnitario;
		switch (talla) {
		case "XS":
			precioFinal *=1;
			break;
		case "S":
		case "M":
			precioFinal *=1.03;
			break;
		case "L":
		case "XL":
			precioFinal *= 1.03;
			break;
		case "XXL":
		case "XXXL":
			precioFinal *= 1.04;
			break;
		}
		return precioFinal;
	}
	
}
