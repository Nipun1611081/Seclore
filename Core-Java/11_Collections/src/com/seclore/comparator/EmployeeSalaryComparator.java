package com.seclore.comparator;

import java.util.Comparator;

import com.seclore.pojo.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {

		Double tempSalary1 = employee1.getSalary();
		Double tempSalary2 = employee2.getSalary();

		return tempSalary1.compareTo(tempSalary2);
	}

}
