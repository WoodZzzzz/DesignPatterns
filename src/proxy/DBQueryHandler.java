package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @����: ʹ��JDK�Դ���Handler ʵ�ֶ�̬����
 * @��Ȩ: Copyright (c) 2018
 * @����: zwj
 * @��������: 2018��2��2�� ����10:55:18
 */
public class DBQueryHandler implements InvocationHandler {

	IDBQuery query = null;

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (query == null) {
			query = new DBQuery();
		}
		return query.request();
	}

	public static IDBQuery createProxy() {
		IDBQuery proxy = (IDBQuery) Proxy.newProxyInstance(
				ClassLoader.getSystemClassLoader(),
				new Class[] { IDBQuery.class }, new DBQueryHandler());
		return proxy;
	}

}
