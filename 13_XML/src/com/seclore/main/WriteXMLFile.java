package com.seclore.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder;
			documentBuilder = builderFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();
			Element rootElement = document.createElement("employeeDetails");
			document.appendChild(rootElement);

			Element employee = document.createElement("employee");
			rootElement.appendChild(employee);

			Attr attr = document.createAttribute("id");
			attr.setValue("101");
			employee.setAttributeNode(attr);

			// <employeeDetails>
			// <employee id="101">
			// </employee>
			// </employeeDetails>

			Element name = document.createElement("name");
			name.appendChild(document.createTextNode("Vivek"));
			employee.appendChild(name);

			// <employeeDetails>
			// <employee id="101">
			// <name>Vivek</name>
			// </employee>
			// </employeeDetails>

			Element salary = document.createElement("salary");
			salary.appendChild(document.createTextNode("1000"));
			employee.appendChild(salary);

			// <employeeDetails>
			// <employee id="101">
			// <name>Vivek</name>
			// <salary>1000</salary>
			// </employee>
			// </employeeDetails>

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File("c:/Files/XMLEmployee.xml"));

			transformer.transform(source, result);

			System.out.println("Please check your XMLEmployee.xml file");

		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
