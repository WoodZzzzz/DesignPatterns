package delegate;

public class DispatcherTest {

	public static void main(String[] args) {
		IExecutor executor = new ExecutorA();
		Dispatcher dispatcher = new Dispatcher(executor);
		dispatcher.doing();
	}
}
