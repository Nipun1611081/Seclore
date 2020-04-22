package com.seclore.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {
	public static void main(String[] args) {
		try {
			
			//DOM-
			File file = new File("C:/Files/employee.xml");

			// DocumentBuilderFactory builderFactory =
			// DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(file);

			// step 1 :: normalize file
			document.getDocumentElement().normalize();

			// step 2 :: Load the root element from file
			System.out.println("Root Element :: " + document.getDocumentElement().getNodeName());
			System.out.println("---------------------------------");
			NodeList list = document.getElementsByTagName("employee");

			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				System.out.println("Current Element :: " + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println("EmployeeId :: " + element.getAttribute("id"));
					System.out.println("Name :: " + element.getElementsByTagName("name").item(0)
							.getTextContent());
					System.out.println("Salary :: " + element.getElementsByTagName("salary").item(0)
							.getTextContent());
				}
				System.out.println("---------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
