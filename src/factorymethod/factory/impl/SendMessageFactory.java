package factorymethod.factory.impl;

import factorymethod.Provider;
import factorymethod.Sender;
import factorymethod.impl.MessageSender;

public class SendMessageFactory implements Provider {

	public Sender produce() {
		return new MessageSender();
	}
	
}
