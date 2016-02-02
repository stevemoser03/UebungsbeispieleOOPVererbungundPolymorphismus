package org.campus02.Mitarbeiter;

import java.util.HashMap;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("Moser", "Steve", "HR", 5_000.0);
		PercentCommissionEmployee emp2 = new PercentCommissionEmployee("Geiger", "Dom", "IS", 2_000.0, 30.0);
		FixCommissionEmployee emp3 = new FixCommissionEmployee("Erlacher", "Dave", "IS", 5_000.0, 200.0);
		
		Employee emp4 = (PercentCommissionEmployee) emp2;
		
		EmployeeManager empmanage = new EmployeeManager();
		
		empmanage.addEmployee(emp1);
		empmanage.addEmployee(emp2);
		empmanage.addEmployee(emp3);
		
		double totalsal = empmanage.calcTotalSalary();
		System.out.println(totalsal);
		
		HashMap<String, Double> SalaryByDep = empmanage.getSalaryByDepartment();
		System.out.println(SalaryByDep);
	}

}
