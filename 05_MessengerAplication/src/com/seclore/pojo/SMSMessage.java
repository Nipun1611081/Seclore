package com.seclore.pojo;

public class SMSMessage extends Message {
	public void sendMessage(String to, String message) {
		System.out.println("Sending SMS message to :: " + to);
		System.out.println("Message :: " + message);
	}
}
