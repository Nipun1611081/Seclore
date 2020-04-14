package com.seclore.pojo;

public class Message {
	public void sendMessage(String to, String message) {
		System.out.println("Sending simple message to :: " + to);
		System.out.println("Message :: " + message);
	}
}
