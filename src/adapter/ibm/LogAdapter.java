package adapter.ibm;

import java.util.List;

/**
 * 
 * @����: ������ģʽ 
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��4�� ����12:58:23
 */
public class LogAdapter implements LogDbOpeApi {

	private LogFileOperateApi adaptee;
	
	public LogAdapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}
	
	/**
	 * ����LogFileOperateApi
	 */
	public void addLog(LogBean bean) {
		List<LogBean> list = adaptee.readLogFile();
		list.add(bean);
		adaptee.writeLogFile(list);
	}

}
