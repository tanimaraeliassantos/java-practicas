package javabean;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private double salary;
	private double comissionPct;
	private Job job;
	private Employee myBoss;
	private Department department;
	
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, double salary, double comissionPct, Job job, Employee myBoss, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.comissionPct = comissionPct;
		this.job = job;
		this.myBoss = myBoss;
		this.department = department;
	}

	public Employee(int i, String string, String string2, String string3, String string4, LocalDate localDate, double d1, double d2, Job job1, Object object, Department dep30) {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getComissionPct() {
		return comissionPct;
	}

	public void setComissionPct(double comissionPct) {
		this.comissionPct = comissionPct;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Employee getMyBoss() {
		return myBoss;
	}

	public void setMyBoss(Employee myBoss) {
		this.myBoss = myBoss;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", salary=" + salary
				+ ", comissionPct=" + comissionPct + ", job=" + job + ", myBoss = " + myBoss;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId;
	}


	
}
