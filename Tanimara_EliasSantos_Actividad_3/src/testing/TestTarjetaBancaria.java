package testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabean.Banco;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Pais;
import javabean.TarjetaBancaria;

public class TestTarjetaBancaria {
	
	public static void main(String[] args) {
		Pais pais1 = new Pais(1, "España");
		
		Banco banco1 = new Banco(101, "Santander", pais1);
		
		DireccionCliente direccion1 = new DireccionCliente("Calle Mayor, 5", "Madrid", "Madrid", pais1);
		
		Cliente2 cliente1 = new Cliente2("1001", "Ana Perez", "ana@email.com", LocalDate.of(2024,  12, 10), direccion1);

		TarjetaBancaria tarjeta1 = new TarjetaBancaria(22224444, 2024, 12, 4443, banco1, "Ana Perez");
		TarjetaBancaria tarjeta3 = new TarjetaBancaria(22226666, 2022, 3, 2133, banco1, "Ana Perez");
		TarjetaBancaria tarjeta4 = new TarjetaBancaria(22228888, 2021, 8, 9988, banco1, "Ana Perez");
		
		ArrayList<TarjetaBancaria> lista = new ArrayList<TarjetaBancaria>();
		lista.add(tarjeta1);
		lista.add(tarjeta3);
		lista.add(tarjeta4);
		
		cliente1.setTarjetas(lista);

		System.out.println("LISTA DE LAS TARJETAS DEL CLIENTE");
		System.out.println("Aqui sigue la lista con todos los datos de las tarjetas del cliente: "
							+ tarjeta1 
							+ ", " + tarjeta3 
							+ ", " + tarjeta4
							+ ".");
		
		System.out.println("LISTA DE LOS PAISES DE LAS TARJETAS DEL CLIENTE");
		System.out.println("Aqui sigue la lista de los paises de las tarjetas: "
							+ tarjeta1.getBanco().getPaisOpera().getNombre()
							+ ", " + tarjeta3.getBanco().getPaisOpera().getNombre()
							+ ", " + tarjeta4.getBanco().getPaisOpera().getNombre()
							+ ".");
		
	}

}
