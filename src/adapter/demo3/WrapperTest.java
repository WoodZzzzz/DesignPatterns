package adapter.demo3;

import adapter.Targetable;

/**
 * 
 * @����: �ӿڵ�������ģʽ
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��1�� ����4:44:04
 */
public class WrapperTest {

	public static void main(String[] args) {
		Targetable t1 = new TargetSub1();
		Targetable t2 = new TargetSub2();
		t1.method1();
		t2.method2();
	}
}
