package decorator;

/**
 * 
 * @描述: 装饰者模式， 在执行方法前动态增加一些其他功能
 * @版权: Copyright (c) 2018  
 * @作者: zwj
 * @创建日期: 2018年2月1日 下午4:49:24
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Decorator(c);
		p.method();
	}
}
