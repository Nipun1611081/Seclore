package com.seclore.dao;

import java.util.HashSet;
import java.util.Set;

import com.seclore.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	public void addEmployee(Employee employee) {
		employeeSet.add(employee);
	}

	public boolean updateEmployee(Employee employee) {

		if (employeeSet.remove(employee)) {
			System.out.println("calling add");
			employeeSet.add(employee);
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int employeeId) {
		return employeeSet.remove(new Employee(employeeId, "", 0));
	}

	public Employee getEmployee(int employeeId) {
		if (employeeSet.contains(new Employee(employeeId, "", 0))) {
			for (Employee employee : employeeSet) {
				if (employee.getEmployeeId() == employeeId)
					return employee;
			}
		}
		return null;
	}

	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}

}
