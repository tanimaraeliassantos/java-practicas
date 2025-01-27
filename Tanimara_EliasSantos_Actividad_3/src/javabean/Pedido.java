package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Pedido {
	
	private int idPedido;
	private LocalDate createdAt;
	private String estado;
	private Cliente cliente;
	
	public Pedido(int idPedido, LocalDate createdAt, String estado, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.createdAt = createdAt;
		this.estado = estado;
		this.cliente = cliente;
	}

	public Pedido() {
		super();
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pedido))
			return false;
		Pedido other = (Pedido) obj;
		return idPedido == other.idPedido;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", createdAt=" + createdAt + ", estado=" + estado + ", cliente="
				+ cliente + "]";
	}
	
	
	

}
