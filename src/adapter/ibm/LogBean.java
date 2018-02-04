package adapter.ibm;

public class LogBean {

	private String logId;
	private String opeUserId;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOpeUserId() {
		return opeUserId;
	}

	public void setOpeUserId(String opeUserId) {
		this.opeUserId = opeUserId;
	}

	public String toString() {
		return "logId=" + logId + "opeUserId=" + opeUserId;
	}
}
