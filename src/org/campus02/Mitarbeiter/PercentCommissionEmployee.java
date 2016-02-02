package org.campus02.Mitarbeiter;

public class PercentCommissionEmployee extends Employee{

	public double percentCommission;

	public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary,
			double percentCommission) {
		super(lastname, firstname, department, baseSalary);
		this.percentCommission = percentCommission;
	}

	public double getPercentCommission() {
		return percentCommission;
	}

	public void setPercentCommission(double percentCommission) {
		this.percentCommission = percentCommission;
	}
	
	public double getFullSalary(){
		return baseSalary+((baseSalary*percentCommission)/100);
	}
	
}
