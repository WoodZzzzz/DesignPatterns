package factorymethod.factory.impl;

import factorymethod.Provider;
import factorymethod.Sender;
import factorymethod.impl.MailSender;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}
}
