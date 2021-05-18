package model;

public class tags {
	public int IdServer;
	public String start_workday;
	public String stop_workday;
	public String os_name;
	public String support_group_so;
	public String os_version;    
	public String support_group;
	public int getIdServer() {
		return IdServer;
	}
	public void setIdServer(int idServer) {
		IdServer = idServer;
	}
	public String getStart_workday() {
		return start_workday;
	}
	public void setStart_workday(String start_workday) {
		this.start_workday = start_workday;
	}
	public String getStop_workday() {
		return stop_workday;
	}
	public void setStop_workday(String stop_workday) {
		this.stop_workday = stop_workday;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getSupport_group_so() {
		return support_group_so;
	}
	public void setSupport_group_so(String support_group_so) {
		this.support_group_so = support_group_so;
	}
	public String getOs_version() {
		return os_version;
	}
	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}
	public String getSupport_group() {
		return support_group;
	}
	public void setSupport_group(String support_group) {
		this.support_group = support_group;
	}
	
}
