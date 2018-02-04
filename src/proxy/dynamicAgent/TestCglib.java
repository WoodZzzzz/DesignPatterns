package proxy.dynamicAgent;

public class TestCglib {

	public static void main(String[] args) {
		BookProxyLib cglib = new BookProxyLib();
		BookProxyImpl bookCglib = (BookProxyImpl) cglib.getInstance(new BookProxyImpl());
		bookCglib.addBook();
	}
}
