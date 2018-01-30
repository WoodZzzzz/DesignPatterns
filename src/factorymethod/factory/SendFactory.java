package factorymethod.factory;

import factorymethod.Sender;
import factorymethod.impl.MailSender;
import factorymethod.impl.MessageSender;

public class SendFactory {

	/**
	 * Method 1 ��ͨ��������ģʽ
	 */
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("message".equals(type)) {
			return new MessageSender();
		} else {
			System.out.println("��������ȷ������");
			return null;
		}
	}
	
	/**
	 * Method 2
	 */
	/*public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceMessage() {
		return new MessageSender();
	}*/
	
	/**
	 * Method 3 ��̬��������ģʽ
	 */
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceMessage() {
		return new MessageSender();
	}
}
