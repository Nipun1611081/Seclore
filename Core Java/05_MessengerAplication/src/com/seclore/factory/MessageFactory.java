package com.seclore.factory;

import com.seclore.pojo.Courier;
import com.seclore.pojo.EmailMessage;
import com.seclore.pojo.Message;
import com.seclore.pojo.SMSMessage;
import com.seclore.pojo.VoiceMessage;

public class MessageFactory {
	public Message createMessage(int choice) {
		switch (choice) {
		case 1:
			return new SMSMessage();
		case 2:
			return new EmailMessage();
		case 3:
			return new Courier();
		case 4:
			return new VoiceMessage();
		default:
			return null;
		}
	}
}
