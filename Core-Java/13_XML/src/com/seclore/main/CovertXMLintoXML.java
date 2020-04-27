package com.seclore.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.seclore.pojo.Employee;

public class CovertXMLintoXML {
	public static void main(String[] args) {
		try {

			File file = new File("c:/Files/jaxbEmployee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(file);
			System.out.println(employee);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
