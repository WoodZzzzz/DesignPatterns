package factorymethod.test;

import factorymethod.Provider;
import factorymethod.Sender;
import factorymethod.factory.SendFactory;
import factorymethod.factory.impl.SendMailFactory;
import factorymethod.impl.MailSender;

public class FatoryTest {
	
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("mail");
		sender.send();
		//静态工厂方法模式
		Sender sender2 = SendFactory.produceMail();
		sender2.send();
		//抽象工厂方法模式
		Provider provider = new SendMailFactory();
		Sender sender3 = provider.produce();
		sender3.send();
	}
}
