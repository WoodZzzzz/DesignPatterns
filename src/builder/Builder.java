package builder;

import java.util.ArrayList;
import java.util.List;

import factorymethod.Sender;
import factorymethod.impl.MailSender;
import factorymethod.impl.MessageSender;


/**
 * 
 * @描述: 建造者模式, 建造复合对象
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月1日 下午1:41:11
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
