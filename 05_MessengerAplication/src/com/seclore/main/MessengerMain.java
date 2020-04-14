package com.seclore.main;

import java.util.Scanner;

import com.seclore.application.MessengerApp;
import com.seclore.factory.MessageFactory;
import com.seclore.pojo.Message;

public class MessengerMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Message messageObject = null;
		MessengerApp messengerApp = null;
		MessageFactory factory = new MessageFactory();

		int messageChoice;
		String to, message;

		System.out.println("Menu");
		System.out.println("Select the message type");
		System.out.println("1.. SMS Message \n2.. Email Message \n3.. Courier Message \n4.. Voice Message");
		messageChoice = scanner.nextInt();

		System.out.println("Enter receiver details:: ");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Message to be sent :: ");
		message = scanner.nextLine();

		messageObject = factory.createMessage(messageChoice);
		messengerApp = new MessengerApp(messageObject);

		messengerApp.send(to, message);
		scanner.close();

	}

}
