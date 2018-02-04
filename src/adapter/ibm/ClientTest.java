package adapter.ibm;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		LogBean bean = new LogBean();
		bean.setLogId("1");
		bean.setOpeUserId("Michael");
		List<LogBean> list = new ArrayList<LogBean>();
		list.add(bean);
		LogFileOperateApi logfile = new LogFileOperate("");
		LogDbOpeApi log = new LogAdapter(logfile);
		log.addLog(bean);
	}
}
