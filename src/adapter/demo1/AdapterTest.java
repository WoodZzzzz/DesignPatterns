package adapter.demo1;

import adapter.Targetable;

/**
 * 
 * @����: ������ģʽ�����������ģʽ 
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��1�� ����4:43:19
 */
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
