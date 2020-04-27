package com.seclore.main;

import java.util.Scanner;

import com.seclore.dao.EmployeeDAO;
import com.seclore.pojo.Employee;

public class EmployeeDAOMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		Employee employee = null;
		int employeeId, crudChoice;
		String name, continueChoice;
		double salary;
		do {
			System.out.println("Menu");
			System.out.println("1..Add New Employee");
			System.out.println("2..Update Employee Name and Salary");
			System.out.println("3..Delete Employee");
			System.out.println("4..Retrive Employee Details");
			System.out.println("Enter Choice");
			crudChoice = scanner.nextInt();
			switch (crudChoice) {
			case 1:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Name");
				name = scanner.nextLine();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();

				employee = new Employee(employeeId, name, salary);
				dao.addEmployee(employee);
				System.out.println("----------------------------------------------");
				for (Employee e : dao.getAllEmployees()) {
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("Enter employeeId");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Name");
				name = scanner.nextLine();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name, salary);
				if (dao.updateEmployee(employee))
					System.out.println("Employee updated successfully");
				else
					System.out.println("Invalid EmployeeId");
				System.out.println("----------------------------------------------");
				for (Employee e : dao.getAllEmployees()) {
					System.out.println(e);
				}
			case 3:
				employeeId = scanner.nextInt();
				scanner.nextLine();
				if (dao.deleteEmployee(employeeId))
					System.out.println("Employee Deleted successfully");
				else
					System.out.println("No Employee found");
				break;
			case 4:
				employeeId = scanner.nextInt();
				scanner.nextLine();
				employee = dao.getEmployee(employeeId);
				if (employee != null)
					System.out.println(employee);
				else
					System.out.println("No employee found");
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}
}
