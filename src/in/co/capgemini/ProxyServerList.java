package in.co.capgemini;

public class ProxyServerList {
	private int srno;
	private String ip;
	
	
	
	public ProxyServerList(int srno, String ip) {
		super();
		this.srno = srno;
		this.ip = ip;
	}
	
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "ProxyServerList [srno=" + srno + ", ip=" + ip + ", getSrno()=" + getSrno() + ", getIp()=" + getIp()
				+ "]";
	}
	
	
}
