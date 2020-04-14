package com.seclore.pojo;

public class EmailMessage extends Message {
	public void sendMessage(String to, String message) {
		System.out.println("Sending Email message to :: " + to);
		System.out.println("Message :: " + message);
	}
}
