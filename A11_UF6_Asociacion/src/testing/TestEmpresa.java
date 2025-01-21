package testing;

import java.time.LocalDate;

import javabean.Country;
import javabean.Department;
import javabean.Employee;
import javabean.Job;
import javabean.Location;
import javabean.Region;

public class TestEmpresa {

	public static void main(String[] args) {
		Region region1 = new Region(1, "Europa");
		Country esp = new Country("SP", "España", region1);
		
		//Country arg = new Country("AR", "Argentina", new Region(2, "América del Sur"));
		
		Location loc1500 = new Location(1500, "Pez 3", "28007", "Madrid", "28", esp);
		
		Job job1 = new Job("IT PROG", "Analista Programador", 19_000, 35_000);
		
		Department dep30 = new Department(30, "Ventas", null, loc1500);
		
		Employee emp114 = new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "123123123", LocalDate.of(1996, 7, 7), 35_000, 0.2, job1, null, dep30);
		
		Employee emp115 = new Employee(115, "Ana", "Raphaelly", "ana@fp.com", "123123124", LocalDate.of(1985, 5, 5), 30_000, 0.1, job1, emp114, dep30);
		
		Employee emp116 = new Employee(116, "Eva", "Baida", "eva@fp.com", "123123125", LocalDate.of(1976, 2, 2), 25_000, 0.3, job1, emp114, dep30);
		
		dep30.setManager(emp114);
		
		System.out.println("DESDE EMP116 : mi apellido, mi trabajo, mi departamento");
		
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getJob().getJobTitle());
		System.out.println(emp116.getDepartment().getDepartmentName().toUpperCase());
		
		System.out.println("Desde EMP116 : mni apellido, el apellido de mi myBoss, el apellido de mi manager de mi departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getMyBoss().getLastName());
		System.out.println(emp116.getDepartment().getManager().getLastName());
		
		System.out.println("DESDE EMP116 : mi nombre de region");
		System.out.println(emp116.getDepartment().getLocation().getCountry().getRegion().getRegionName());
		
		System.out.println("DESDE EMP116 : la region de my boss");
		System.out.println(emp116.getMyBoss().getDepartment().getLocation().getCountry().getRegion().getRegionName());
		
		System.out.println("A partir del empleado 114 sacar el apellido de su jefe");
		if(emp114.getMyBoss() != null)
			System.out.println(emp114.getMyBoss().getLastName());
		else
			System.out.println("Este empleado no tiene jefe");
		
		System.out.println(job1);
		System.out.println(loc1500);
		System.out.println(emp116);
	}

}
