package adapter.demo2;

import adapter.Targetable;

/**
 * 
 * @����: �����������ģʽ
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��1�� ����4:43:44
 */
public class WrapperTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable t = new Wrapper(source);
		t.method1();
		t.method2();
	}
}
