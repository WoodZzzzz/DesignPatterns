package delegate;

public class Dispatcher implements IExecutor {

	IExecutor executor;
	
	Dispatcher(IExecutor executor) {
		this.executor = executor;
	}
	
	//委托人不做具体事情，
	public void doing() {
		this.executor.doing();
	}
}
