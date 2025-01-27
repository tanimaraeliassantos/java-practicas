package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class TestBancario {
	
	public static void main(String[] args) {
		//creacion de variables de tipo Pais, que instancian(new) objetos de Pais
		Pais pais1 = new Pais(1, "España");
		Pais pais2 = new Pais(2, "Portugal");
		
		System.out.println("DATOS DE PAIS 1");
		System.out.println(pais1.getNombre());
		
		System.out.println("DATOS DE PAIS 2");
		System.out.println(pais2.getNombre());
		
		//creacion de variables de tipo Banco, uno de cada Pais
		Banco banco1 = new Banco(101, "Santander", pais1);
		Banco banco2 = new Banco(102, "BPI", pais2);

		System.out.println("DATOS DE BANCO 1");
		System.out.println(banco1.getNombreBanco());
		
		System.out.println("DATOS DE BANCO 2");
		System.out.println(banco2.getNombreBanco());
		
		//creacion de variables de tipo TarjetaBancaria, una de cada banco
		TarjetaBancaria tarjeta1 = new TarjetaBancaria(22224444, 2024, 12, 4443, banco1, "Ana Perez");
		TarjetaBancaria tarjeta2 = new TarjetaBancaria(22224455, 2023, 03, 8876, banco2, "Juan Luz");
		
		System.out.println("DATOS DE TARJETA 1");
		System.out.println(tarjeta1.getNumero() + ", " + tarjeta1.getBanco().getNombreBanco() );
		
		System.out.println("DATOS DE BANCO 2");
		System.out.println(tarjeta2.getNumero() + ", " + tarjeta2.getBanco().getNombreBanco() );
		
		//creacion de variable de tipo DireccionCliente
		DireccionCliente direccion1 = new DireccionCliente("Calle Mayor, 5", "Madrid", "Madrid", pais1);
		
		System.out.println("DATOS DE DIRECCION 1");
		System.out.println("direccion creada : " + direccion1.getCalle() + ", " + direccion1.getLocalidad());
		
		//creacion de variable de tipo Cliente, con su tarjeta y su dirección
		Cliente cliente1 = new Cliente("1001", "Ana Perez", "ana@email.com", LocalDate.of(2024,  12, 10), direccion1, tarjeta1);
		
		System.out.println("DATOS DE CLIENTE 1");
		System.out.println("datos de cliente1 : " + cliente1.getNombre() + ", " + cliente1.getEmail());
		
		//creacion de variable de tipo Factura, con su pedido
		Factura factura1 = new Factura("200222", "Ropa para el perro", LocalDate.of(2025, 01, 12), new Pedido(122, LocalDate.of(2025, 01, 05), "completado", cliente1));
	
}
}
