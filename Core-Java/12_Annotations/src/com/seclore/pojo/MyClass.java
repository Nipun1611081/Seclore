package com.seclore.pojo;

import com.seclore.annotations.MyAnnotation;

public class MyClass {
	int employeeId;

	@MyAnnotation(value = 10)
	public void print() {
		System.out.println("In print method of MyClass");
	}
}
