package adapter.demo1;

import adapter.Targetable;

/**
 * 
 * @描述: 适配器模式，类的适配器模式 
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月1日 下午4:43:19
 */
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
