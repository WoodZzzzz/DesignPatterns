package delegate;

public class Dispatcher implements IExecutor {

	IExecutor executor;
	
	Dispatcher(IExecutor executor) {
		this.executor = executor;
	}
	
	//ί���˲����������飬
	public void doing() {
		this.executor.doing();
	}
}
