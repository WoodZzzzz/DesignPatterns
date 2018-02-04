package adapter.ibm;

import java.util.List;

/**
 * 
 * @描述: 适配器模式 
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月4日 下午12:58:23
 */
public class LogAdapter implements LogDbOpeApi {

	private LogFileOperateApi adaptee;
	
	public LogAdapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}
	
	/**
	 * 适配LogFileOperateApi
	 */
	public void addLog(LogBean bean) {
		List<LogBean> list = adaptee.readLogFile();
		list.add(bean);
		adaptee.writeLogFile(list);
	}

}
