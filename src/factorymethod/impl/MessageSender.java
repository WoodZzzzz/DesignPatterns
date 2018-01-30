package factorymethod.impl;

import factorymethod.Sender;

public class MessageSender implements Sender {

	public void send() {
		System.out.println("this is message sender");
	}
}
