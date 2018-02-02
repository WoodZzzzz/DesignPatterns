package adapter.demo3;

import adapter.Targetable;

/**
 * 
 * @描述: 接口的适配器模式
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月1日 下午4:44:04
 */
public class WrapperTest {

	public static void main(String[] args) {
		Targetable t1 = new TargetSub1();
		Targetable t2 = new TargetSub2();
		t1.method1();
		t2.method2();
	}
}
