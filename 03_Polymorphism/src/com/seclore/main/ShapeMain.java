package com.seclore.main;

import java.util.Scanner;

import com.seclore.factory.ShapeFatory;
import com.seclore.pojo.Shape;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		System.out.println("Menu");
		System.out.println("1.. Circle");
		System.out.println("2.. Line");
		System.out.println("3.. Star");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		ShapeFatory fatory = new ShapeFatory();
		Shape shape = fatory.drawShape(choice);
		if (shape != null)
			shape.draw();
		else
			System.out.println("Invalid choice");
	}
}
