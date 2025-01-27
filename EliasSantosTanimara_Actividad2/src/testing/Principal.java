package testing;

import javabean.Fiesta;

public class Principal {

	public static void main(String[] args) {

		/* 
		 * Esta es una aplicacion para ayudar a organizar fiestas.
		 * Debes introducir tipo de fiesta, direccion, fecha, hora, 
		 * cantidad de invitados, cantidad de comida y bebida y 
		 * la aplicacion te da un presupuesto total para la fiesta.
		 * 
		 * ************************************************************************
		 * PRIMERO OBJETO FIESTA
		 * ************************************************************************
		 * Los papas de Anna van a organizar su fiesta de cumpleanos.
		 * Ella va a cumplir 5 anos y quiere invitar a todos los amigos de su clase.
		 * Hay 20 ninos en clase, por lo tanto planifican su presupuesto
		 * basados en esa cantidad de invitados. 
		 */

		Fiesta fiestaInfantil = new Fiesta(
				"infantil", "Calle Mayor, 10", 40, 40, 20, "2024-11-20", "11:30:00");

		//Se envian las invitaciones.

		System.out.println("En la invitacion para la fiesta de cumpleanos de Anna pone: " 
				+ fiestaInfantil.getDireccion()
				+ " , dia " + fiestaInfantil.getFecha() + " ,a las " + fiestaInfantil.getHora());

		//Se calcula el presupuesto total con la cantidad prevista de invitados.

		System.out.println("El presupuesto con que deben contar los padres de Anna "
				+ "para la fiesta es de " + fiestaInfantil.precioFiesta() + " euros.");

		/*
		 * El martes 19, algunos de los papas de los invitados les escriben a los papas
		 * de Anna: sus ninos están enfermos y no podran ir a la fiesta de Anna.
		 * 5 de sus amiguitos no van a la fiesta.
		 */

		fiestaInfantil.cancelarInvitación(5);
		System.out.println("Se han cancelado asistencias. Ahora que el número de invitados es " 
		+ fiestaInfantil.getInvitados() + " ,el presupuesto con el que deben contar los padres"
		+ " de Anna para su fiesta es de "
				+ fiestaInfantil.precioFiesta() + " euros.");

		//Y los detalles de organizacion de la fiesta ahora son:
		
		System.out.println(fiestaInfantil.toString());

		//Los padres de Anna salen a comprar las comidas y bebidas para la fiesta. Necesitan:
		
		System.out.println("Para la fiesta se necesitan " + fiestaInfantil.getBocadillos() 
				+ " bocadillos y " + fiestaInfantil.getBebidas() + " bebidas.");

		/*
		 * La fiesta ha sido un éxito. Anna esta feliz por haber podido compartir la celebracion
		 * con sus amigos.
		 * 
		 * Una de las familias que atendio al cumpleanos pregunto como los papas
		 * de Anna hicieron para organizar la fiesta. Les comentaron de la aplicacion
		 * para calcular presupuesto y les pasaron el enlace. Ellos empezaron a
		 * probarla enseguida.
		 */

		fiestaInfantil = new Fiesta();
		System.out.println(fiestaInfantil);

		/*
		 * 
		 * ***********************************************************************
		 * SEGUNDO OBJETO FIESTA
		 * ***********************************************************************
		 * 
		 * Los papas de Anna ahora tienen que preparar el cumpleanos del abuelo.
		 * Es el patriarca de la familia y cumple 90 anos, y a la familia le encanta comer y beber.
		 * Todavia no tienen claro cuantos son, ni cuanta comida y bebida comprar.
		 */

		Fiesta fiestaAbuelo = new Fiesta();
		System.out.println(fiestaAbuelo);

		/*
		 * Los papas de Anna se han enfermedado. El virus de la escuela llego a su casa.
		 * No van a poder organizar la fiesta del abuelo. Pero indican a la prima Maria como usar 
		 * la aplicacion y ella asume la responsabilidad de organizar la fiesta del abuelo.
		 * 
		 * Maria decide invitar a la familia, y vecinos y amigos cercanos.
		 * No quiere quedarse corta con las cantidades de comida y bebida.
		 */

		fiestaAbuelo = new Fiesta(
				"cumpleanos", "Calle de la Vida, 35", 200, 180, 80, "2024-12-15", "18:00:00");

		//Se envian las invitaciones.

		System.out.println("En la invitacion para la fiesta de cumpleanos de Pepe pone: " 
				+ fiestaAbuelo.getDireccion()
				+ " , dia " + fiestaAbuelo.getFecha() + " ,a las " + fiestaAbuelo.getHora());

		//Se calcula el presupuesto total con la cantidad prevista de invitados.

		System.out.println("El presupuesto con que deben contar los familiares del abuelo "
				+ "para la fiesta es de " + fiestaAbuelo.precioFiesta() + " euros.");

		/*
		 * Los invitados fueron confirmando su asistencia, pero 6 primos que viven lejos
		 * no podran venir. Habrá que sacarlos del presupuesto.
		 */

		fiestaAbuelo.cancelarInvitación(6);

		System.out.println("Se han cancelado asistencias. Ahora que la cantidad de invitados es de " 
		+ fiestaAbuelo.getInvitados() + " , el presupuesto con que deben contar los familiares del abuelo "
				+ "para la fiesta es de " + fiestaAbuelo.precioFiesta() + " euros.");

		//Y los detalles de organizacion de la fiesta ahora son:
		
		System.out.println(fiestaAbuelo.toString());

		//Maria sale= a comprar las comidas y bebidas para la fiesta. Necesita:
		
		System.out.println("Para la fiesta se necesitan " + fiestaAbuelo.getBocadillos() 
				+ " bocadillos y " + fiestaAbuelo.getBebidas() + " bebidas.");


		/*
		 * 
		 * ***********************************************************************
		 * TERCERO OBJETO FIESTA
		 * ***********************************************************************
		 * 
		 * Los amigos de Maria ahora quieren preparar una fiesta de disfraces.
		 * Para encerrar el ano, quiere juntar los amigos para divertirse.
		 * Maria les paso el enlace de la aplicacion para organizacion de fiestas.
		 * Todavia no tienen claro cuantos son, ni cuanta comida y bebida comprar.
		 */
		
		Fiesta fiestaDisfraces = new Fiesta();
		System.out.println(fiestaDisfraces);
		
		/*
		 * Van a llamar todos los amigos del curso de FP.
		 * Van a tener mas bebida que comida en la fiesta.
		 */

		fiestaDisfraces = new Fiesta(
				"disfraces", "Calle de la Fiesta, 64", 100, 300, 100, "2024-12-29", "21:00:00");

		//Se envian las invitaciones.

		System.out.println("En la invitacion para la fiesta de disfraces pone: " 
				+ fiestaDisfraces.getDireccion()
				+ " , dia " + fiestaDisfraces.getFecha() + " ,a las " + fiestaDisfraces.getHora());

		//Se calcula el presupuesto total con la cantidad prevista de invitados.

		System.out.println("El presupuesto con que deben contar los amigos para compartir gastos "
				+ "es de " + fiestaDisfraces.precioFiesta() + " euros.");

		/*
		 * Los invitados fueron confirmando su asistencia, pero 15 de ellos
		 * no podran venir. Habrá que sacarlos del presupuesto.
		 */

		fiestaDisfraces.cancelarInvitación(15);

		System.out.println("Se han cancelado asistencias. Ahora que la cantidad de invitados es de "
				+ fiestaDisfraces.getInvitados() + " , el presupuesto con que deben contar es de " 
				+ fiestaDisfraces.precioFiesta() + " euros.");

		//Y los detalles de organizacion de la fiesta ahora son:
		
		System.out.println(fiestaDisfraces.toString());

		//Los amigos salen a comprar las comidas y bebidas para la fiesta. Necesitan:
		
		System.out.println("Para la fiesta se necesitan " + fiestaDisfraces.getBocadillos() 
				+ " bocadillos y " + fiestaDisfraces.getBebidas() + " bebidas.");

		
		/*
		 * 
		 * ***********************************************************************
		 * CUARTO OBJETO FIESTA
		 * ***********************************************************************
		 * 
		 * Maria tiene que preparar una fiesta de navidad para su trabajo.
		 * Va a usar la aplicacion para organizacion de fiestas.
		 * Todavia no tienen claro si la empresa invitará clientes y parceros para la fiesta.
		 * Ya sabe que tendrá que limitar el presupuesto para la comida y bebida.
		 */
		
		Fiesta fiestaNavidad = new Fiesta();
		System.out.println(fiestaNavidad);
		
		/*
		 * Van a llamar todos clientes y parceros.
		 * Van a ofrecer mas bebida que comida.
		 */

		fiestaNavidad = new Fiesta(
				"navidad", "Calle de Labranza, 101", 200, 400, 200, "2024-12-22", "17:00:00");

		//Se envian las invitaciones.

		System.out.println("En la invitacion para la fiesta de navidad pone: " 
				+ fiestaNavidad.getDireccion()
				+ " , dia " + fiestaNavidad.getFecha() + " ,a las " + fiestaNavidad.getHora());

		//Se calcula el presupuesto total con la cantidad prevista de invitados.

		System.out.println("El presupuesto con que debe contar Maria para la fiesta de la oficina"
				+ "es de " + fiestaNavidad.precioFiesta() + " euros.");

		/*
		 * Los invitados fueron confirmando su asistencia, pero 50 de ellos
		 * no podran venir. Habrá que sacarlos del presupuesto.
		 */

		fiestaNavidad.cancelarInvitación(50);

		System.out.println("Se han cancelado asistencias. Ahora que la cantidad de invitados es de "
				+ fiestaNavidad.getInvitados() + " , el presupuesto con que deben contar es de " 
				+ fiestaNavidad.precioFiesta() + " euros.");

		//Y los detalles de organizacion de la fiesta ahora son:
		
		System.out.println(fiestaNavidad.toString());

		//Maria encarga la entrega de la comida y las bebidas para la fiesta. Necesita:
		
		System.out.println("Para la fiesta se necesitan " + fiestaNavidad.getBocadillos() 
				+ " bocadillos y " + fiestaNavidad.getBebidas() + " bebidas.");
	}

}
