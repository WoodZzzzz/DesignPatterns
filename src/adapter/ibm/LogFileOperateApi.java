package adapter.ibm;

import java.util.List;

public interface LogFileOperateApi {

	public List<LogBean> readLogFile();
	
	public void writeLogFile(List<LogBean> list);
}
