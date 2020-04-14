package com.seclore.application;

import com.seclore.pojo.Message;

public class MessengerApp {
	private Message message;

	public MessengerApp(Message message) {
		this.message = message;
	}

	public void send(String to, String message) {
		this.message.sendMessage(to, message);
	}
}
