package decorator;

/**
 * 
 * @����: װ����ģʽ�� ��ִ�з���ǰ��̬����һЩ��������
 * @��Ȩ: Copyright (c) 2018  
 * @����: zwj
 * @��������: 2018��2��1�� ����4:49:24
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Decorator(c);
		p.method();
	}
}
