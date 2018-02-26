package adapter.ibm;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

	private String logFilename = "file.log";
	
	public LogFileOperate(String logFilename) {
		this.logFilename = logFilename;
	}
	
	public List<LogBean> readLogFile() {
		List<LogBean> list = null;
		return list;
	}

	public void writeLogFile(List<LogBean> list) {
		File file = new File(logFilename);
		ObjectOutputStream oop = null;
	}
}
