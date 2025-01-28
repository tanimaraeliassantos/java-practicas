package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class TestFactura {
	public static void main(String[] args) {
		
		Pais pais1 = new Pais(1, "España");
		
		Banco banco1 = new Banco(101, "Santander", pais1);
		
		TarjetaBancaria tarjeta1 = new TarjetaBancaria(22224444, 2024, 12, 4443, banco1, "Ana Perez");
		
		DireccionCliente direccion1 = new DireccionCliente("Calle Mayor, 5", "Madrid", "Madrid", pais1);
		
		Cliente cliente1 = new Cliente("1001", "Ana Perez", "ana@email.com", LocalDate.of(2024,  12, 10), direccion1, tarjeta1);
		
		Factura factura1 = new Factura("200222", "Ropa para el perro", LocalDate.of(2025, 01, 12), new Pedido(122, LocalDate.of(2025, 01, 05), "completado", cliente1));
		
		
	//INFORMACIONES SOBRE LA FACTURA
	System.out.println("DESCRIPCION DE LA FACTURA");
	System.out.println("El cliente ha comprado " + factura1.getDescripcion().toLowerCase() + ".");
	
	System.out.println("FECHA Y ESTADO DE LA FACTURA");
	System.out.println("La factura tiene fecha de " + factura1.getFechaFactura() + " ,y el estado de la factura es " + factura1.getPedido().getEstado() + ".");
	
	System.out.println("NOMBRE DEL CLIENTE DE LA FACTURA");
	System.out.println("El nombre del cliente que realizo la compra es " + factura1.getPedido().getCliente().getNombre() + ".");
	
	System.out.println("DIRECCION DEL CLIENTE DE LA FACTURA");
	System.out.println("La direccion del cliente que realizo la compra es " + factura1.getPedido().getCliente().getDireccion().getCalle() + ", " + factura1.getPedido().getCliente().getDireccion().getLocalidad() + ".");
	
	System.out.println("NOMBRE DEL TITULAR DE LA TARJETA DEL CLIENTE DEL PEDIDO DE LA FACTURA");
	System.out.println("El nombre del titular de la tarjeta del cliente del pedido de la factura es " + factura1.getPedido().getCliente().getTarjeta().getTitularTarjeta() + ".");
	
	System.out.println("NOMBRE DEL BANCO DE LA TARJETA DEL CLIENTE DEL PEDIDO DE LA FACTURA");
	System.out.println("El nombre del banco de la tarjeta del cliente del pedido de la factura es " + factura1.getPedido().getCliente().getTarjeta().getBanco().getNombreBanco() + ".");
	
	System.out.println("EL PAIS DEL BANCO DE LA TARJETA DEL CLIENTE DEL PEDIDO DE LA FACTURA");
	System.out.println("El pais del banco de la tarjeta del cliente del pedido de la factura es " + factura1.getPedido().getCliente().getTarjeta().getBanco().getPaisOpera().getNombre() + ".");
	
	System.out.println("EL PAIS DE LA DIRECCION DEL CLIENTE DEL PEDIDO DE LA FACTURA");
	System.out.println("El pais de la direccion del cliente del pedido de la factura es " + factura1.getPedido().getCliente().getDireccion().getPais().getNombre() + ".");

	}
	
}
