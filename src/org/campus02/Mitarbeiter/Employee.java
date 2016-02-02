package org.campus02.Mitarbeiter;

public class Employee {

	protected String lastname;
	protected String firstname;
	protected String department;
	protected double baseSalary;
	
	public Employee(String lastname, String firstname, String department, double baseSalary) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.department = department;
		this.baseSalary = baseSalary;
	}
	
	public double getFullSalaray(){
		return getBaseSalary();
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getFullSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
