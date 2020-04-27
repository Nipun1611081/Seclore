package com.seclore.examples;

public class Message {
	private String userMessage;

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(String userMessage) {
		this.userMessage = userMessage;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	@Override
	public String toString() {
		return "Message [userMessage=" + userMessage + "]";
	}

}
