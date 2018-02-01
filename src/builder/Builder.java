package builder;

import java.util.ArrayList;
import java.util.List;

import factorymethod.Sender;
import factorymethod.impl.MailSender;
import factorymethod.impl.MessageSender;


/**
 * 
 * @����: ������ģʽ, ���츴�϶���
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��1�� ����1:41:11
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceMessageSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MessageSender());
		}
	}
}
