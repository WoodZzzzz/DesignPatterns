package adapter.demo2;

import adapter.Targetable;

/**
 * 
 * @描述: 对象的适配器模式
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月1日 下午4:43:44
 */
public class WrapperTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable t = new Wrapper(source);
		t.method1();
		t.method2();
	}
}
