package com.seclore.pojo;

public class VoiceMessage extends Message {
	public void sendMessage(String to, String message) {
		System.out.println("Sending Voice message to :: " + to);
		System.out.println("Message :: " + message);
	}
}
