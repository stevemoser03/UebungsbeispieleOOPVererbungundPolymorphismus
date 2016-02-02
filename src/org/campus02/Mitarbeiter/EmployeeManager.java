package org.campus02.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

	protected ArrayList<Employee> emplist = new ArrayList<>();

	public EmployeeManager() {
		super();
	}
	
	public void addEmployee(Employee e){
		emplist.add(e);
	}
	
	public double calcTotalSalary(){
		double TotalSalary = 0;
		for (Employee e : emplist) {
			TotalSalary += e.getFullSalaray();
		}
		return TotalSalary;
	}
	
	public HashMap<String, Double>getSalaryByDepartment(){
		HashMap<String, Double> map = new HashMap<>();
		for (Employee e : emplist) {
			Double value = map.get(e.department);
			if(value != null)
				map.put(e.department, value+e.getFullSalaray());
			else
				map.put(e.department, e.getFullSalaray());
		}
		return map;
	}
}
