package proxy;

/**
 * 
 * @����: ����ģʽ.��ʡϵͳ����
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��2�� ����10:47:05
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
