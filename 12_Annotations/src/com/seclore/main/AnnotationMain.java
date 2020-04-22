package com.seclore.main;

import java.lang.reflect.Method;

import com.seclore.annotations.MyAnnotation;
import com.seclore.pojo.MyClass;

public class AnnotationMain {
	public static void main(String[] args) {

		try {

			MyClass myClass = new MyClass();
			Method method = myClass.getClass().getMethod("print");

			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			System.out.println("Value of annotation :: " + myAnnotation.value());

		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e.getMessage());
		}
	}
}
