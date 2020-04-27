package com.seclore.main;

import java.util.Arrays;

import com.seclore.comparator.EmployeeNameComparator;
import com.seclore.comparator.EmployeeSalaryComparator;
import com.seclore.pojo.Employee;

public class EmployeeCollectionSorting {
	public static Employee[] employees = new Employee[4];

	public static void main(String[] args) {

		employees[0] = new Employee(102, "A", 1000);
		employees[1] = new Employee(103, "D", 1050);
		employees[2] = new Employee(104, "B", 1500);
		employees[3] = new Employee(101, "C", 150);

		// Arrays.sort(employees);
		// Arrays.sort(employees, new EmployeeNameComparator());
		Arrays.sort(employees, new EmployeeSalaryComparator());

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
