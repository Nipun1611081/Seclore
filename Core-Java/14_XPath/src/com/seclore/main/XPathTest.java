package com.seclore.main;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathTest {
	public static void main(String[] args) {

		// step 1 Load xml file in memory
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse("c:/Files/inventory.xml");

			System.out.println("File is loaded in Document Object");

			// step 2 Create XPath instance
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xPath = xPathFactory.newXPath();
			System.out.println("xPath instance is created !!");

			// step 3 pass and execute query
			System.out.println("1. Get book titles written after 2001");
			XPathExpression expression = xPath.compile("//book[@year>2001]/title/text()");
			Object result = expression.evaluate(document, XPathConstants.NODESET);

			NodeList nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("2. Get book titles written before 2001");
			expression = xPath.compile("//book[@year<2001]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("3. Get book titles cheaper than 500");
			expression = xPath.compile("//book[price<500]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("4. Get book titles costlier than 500");
			expression = xPath.compile("//book[price>500]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("5. Get book titles added in first node");
			expression = xPath.compile("//book[1]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}

			System.out.println("------------------------------------------------");
			System.out.println("6. Get book titles added in Last node");
			expression = xPath.compile("//book[last()]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("7. All authors and title");
			expression = xPath.compile("//book[author]/title/text() | //book[author]/author/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("8. Count all books titles");
			expression = xPath.compile("count(//book/title)");
			result = expression.evaluate(document, XPathConstants.NUMBER);
			Double count = (Double) result;
			System.out.println("Count :: " + count);
			System.out.println("------------------------------------------------");
			System.out.println("9. Get book titles with writer name start with <somename>");
			// expression = xPath.compile("//book[starts-with(author,'Yashavant')]");
			expression = xPath.compile("//book[starts-with(author,'Yashavant')]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				// System.out.println(nodeList.item(i).getChildNodes().item(1).getTextContent());
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("10. Get book titles with writer name containing <somename>");
			expression = xPath.compile("//book[contains(author,'Yashavant')]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				// System.out.println(nodeList.item(i).getChildNodes().item(1).getTextContent());
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("------------------------------------------------");
			System.out.println("11. Get book titles written by Yashavant Kanetkar");
			expression = xPath.compile("//book[author='Yashavant Kanetkar']/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);

			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				// System.out.println(nodeList.item(i).getChildNodes().item(1).getTextContent());
				System.out.println(nodeList.item(i).getNodeValue());
			}

		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
