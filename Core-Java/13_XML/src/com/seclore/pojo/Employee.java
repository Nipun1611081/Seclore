package com.seclore.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int employeeId;
	private String name;
	private List<Project> projectList = new ArrayList<Project>();

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, List<Project> projectList) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.projectList = projectList;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", projectList=" + projectList + "]";
	}

}
