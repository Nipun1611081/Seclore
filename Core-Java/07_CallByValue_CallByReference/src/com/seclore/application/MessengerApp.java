package com.seclore.application;

import com.seclore.examples.Message;

public class MessengerApp {

	//call by ref
	public void printMessage(Message message) {
		System.out.println("Message received");
		System.out.println(message);
		System.out.println("Changing message by appending - received ");
		message.setUserMessage(message.getUserMessage().concat("- received. "));
	}
}
