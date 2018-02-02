package proxy;

public class DBQuery implements IDBQuery {
	
	public DBQuery() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String request() {
		return "request string";
	}
}
