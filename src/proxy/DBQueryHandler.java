package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @描述: 使用JDK自带的Handler 实现动态代理
 * @版权: Copyright (c) 2018
 * @作者: zwj
 * @创建日期: 2018年2月2日 上午10:55:18
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
