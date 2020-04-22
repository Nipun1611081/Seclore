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

		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newDefaultInstance();
			builderFactory.setNamespaceAware(true);
			DocumentBuilder builder;
			builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse("c:/Files/inventory.xml");
			System.out.println("File is loaded");

			// Create XPath
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xPath = xPathFactory.newXPath();
			System.out.println("XPath is created for the document");

			// 1) Get book titles written after 2001
			XPathExpression expression = xPath.compile("//book[@year>2001]/title/text()");
			Object result = expression.evaluate(document, XPathConstants.NODESET);
			NodeList nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("-------------------------------");

			// 2) Get book titles written before 2001
			expression = xPath.compile("//book[@year<2001]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}

			System.out.println("-------------------------------");

			// 3)Get book titles cheaper than 8 dollars"
			expression = xPath.compile("//book[price<8]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}

			System.out.println("-------------------------------");

			// 4)Get book titles costlier than 8 dollars"
			expression = xPath.compile("//book[price>8]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}

			System.out.println("-------------------------------");

			// 5)Get book titles added in first node"
			expression = xPath.compile("//book[1]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("-------------------------------");

			// 6)Get book titles added in last node"
			expression = xPath.compile("//book[last()]/title/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}
			System.out.println("-------------------------------");
			System.out.println("All authors and title");
			// 7)Get all writers"
			expression = xPath.compile("//book/author/text()");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getNodeValue());
			}

			System.out.println("-------------------------------");
			System.out.println("Count all books titles");
			// 8)Count all books titles
			expression = xPath.compile("count(//book/title)");
			result = expression.evaluate(document, XPathConstants.NUMBER);
			Double count = (Double) result;
			System.out.println("Count :: " + count);

			System.out.println("-------------------------------");
			// 9) Get book titles with writer name start with Neal
			expression = xPath.compile("//book[starts-with(author,'Neal')]");
			result = expression.evaluate(document, XPathConstants.NODESET);
			nodeList = (NodeList) result;
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getChildNodes().item(1) // node <title> is on first index
						.getTextContent());
			}

		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			System.out.println("Exception :: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
