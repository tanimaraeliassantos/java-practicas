package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Factura {
	
	private String codigoFactura;
	private String descripcion;
	private LocalDate fechaFactura;
	private Pedido pedido;
	
	public Factura(String codigoFactura, String descripcion, LocalDate fechaFactura, Pedido pedido2) {
		super();
		this.codigoFactura = codigoFactura;
		this.descripcion = descripcion;
		this.fechaFactura = fechaFactura;
		this.pedido = pedido2;
	}

	public Factura() {
		super();
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoFactura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Factura))
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(codigoFactura, other.codigoFactura);
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", descripcion=" + descripcion + ", fechaFactura="
				+ fechaFactura + ", pedido=" + pedido + "]";
	}
	
	
	

}
