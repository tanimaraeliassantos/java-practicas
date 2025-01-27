package testing;

import javabean.Producto;

public class TestProducto {
	public static void main(String[] args) {
		//Crea producto vacío
		Producto producto1;
		producto1 = new Producto();
		
		//Con los setters define valores de atributos
		producto1.setCodigoBarras(1234567890);
		producto1.setDescripcion("Vestido");
		producto1.setPrecioUnitario(20.99);
		producto1.setCantidadStock(25);
		producto1.setTalla("L");
		producto1.setColor("Amarillo");
		
		//Imprime producto1
		System.out.println(producto1);
	
		//Crea producto usando el constructor con todo
		Producto producto2 = new Producto(1234567891, "Falda", 10.99, 30, "XL", "Verde");
		
		//Imprime producto2
		System.out.println(producto2);
		
		//Testear metodo precioConIVa para producto1
		double precioConIva = producto1.precioConIva(21);
		System.out.println("Precio con IVA para el producto " + producto1.getDescripcion() + " es " + Math.round(precioConIva));
		
		//Testear metodo aumentarStock
		System.out.println("El stock antiguo del producto " + producto2.getDescripcion() + " es de : " + producto2.getCantidadStock());
		producto2.aumentarStock(15);
		System.out.println("El stock actual del producto " + producto2.getDescripcion() + " es de : " + producto2.getCantidadStock());
		
		//Testear metodo disminuirStock
		System.out.println("El stock antiguo del producto " + producto1.getDescripcion() + " es de : " + producto1.getCantidadStock());
		boolean testDisminuir = producto1.disminuirStock(10);
		System.out.println("Se pudo disminuir el stock del producto " + producto1.getDescripcion() + " : "+ testDisminuir);
		System.out.println("El stock actual del producto " + producto1.getDescripcion() + " es de : " + producto1.getCantidadStock());

	}

}
