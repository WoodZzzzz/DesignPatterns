package delegate;

//委派模式
public class ExecutorA implements IExecutor {

	public void doing() {
		System.out.println("员工A开始执行");
	}
}
