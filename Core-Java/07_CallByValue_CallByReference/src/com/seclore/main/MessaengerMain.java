package com.seclore.main;

import com.seclore.application.MessengerApp;
import com.seclore.examples.Message;

public class MessaengerMain {
	public static void main(String[] args) {
		String textMessage = "Hello World";
		Message message = new Message(textMessage);

		MessengerApp messengerApp = new MessengerApp();
		messengerApp.printMessage(message);

		System.out.println("--------------------------");

		System.out.println("Value of message");
		System.out.println(message);
	}
}
