package proxy;

/**
 * 
 * @描述: 代理模式.节省系统开销
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月2日 上午10:47:05
 */
public class DBQueryProxy implements IDBQuery {
	
	private DBQuery d = null;
	
	public String request() {
		if (d == null) {
			d = new DBQuery();
		}
		return d.request();
	}
	
	public static void main(String[] args) {
		IDBQuery i = new DBQueryProxy();
		i.request();
	}
}
