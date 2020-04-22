package com.seclore.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.seclore.pojo.Employee;
import com.seclore.pojo.Project;

public class CovertObjectIntoXML {
	public static void main(String[] args) {
		Project project1 = new Project(101, "Google UPI", new Date());
		Project project2 = new Project(102, "PayTM UPI", new Date());

		List<Project> projectList = new ArrayList<Project>();
		projectList.add(project1);
		projectList.add(project2);

		Employee employee = new Employee(101, "Vivek Gohil", projectList);

		try {
			File file = new File("c:/Files/jaxbEmployee.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(employee, file);
			System.out.println("Check your file !!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
