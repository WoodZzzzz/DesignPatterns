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
		//��̬��������ģʽ
		Sender sender2 = SendFactory.produceMail();
		sender2.send();
		//���󹤳�����ģʽ
		Provider provider = new SendMailFactory();
		Sender sender3 = provider.produce();
		sender3.send();
	}
}
