package in.co.capgemini;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {
	private String name;
	private Address address;
	private double marketvalue;
	private String establishedDate;
	private int employeeCount;
	private Set<String> globalPresence = new HashSet<>();
	private List<String> boardMembers = new ArrayList<>(); 
	private  Map<String, String> projectManager = new HashMap<>();
	private Properties proxyServerList = new Properties();
	
/*	public Organization(String name, Address address, double marketvalue, LocalDate establishedDate, int employeeCount,
			Set<String> globalPresence, List<String> boardMembers, Map<String, String> projectManager) {
		super();
		this.name = name;
		this.address = address;
		this.marketvalue = marketvalue;
		this.establishedDate = establishedDate;
		this.employeeCount = employeeCount;
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManager = projectManager;
	}
*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getMarketvalue() {
		return marketvalue;
	}

	public void setMarketvalue(double marketvalue) {
		this.marketvalue = marketvalue;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Set<String> getGlobalPresence() {
		return globalPresence;
	}

	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}

	public List<String> getBoardMembers() {
		return boardMembers;
	}

	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}

	public Map<String, String> getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Map<String, String> projectManager) {
		this.projectManager = projectManager;
	}

	public Properties getProxyServerList() {
		return proxyServerList;
	}

	public void setProxyServerList(Properties proxyServerList) {
		this.proxyServerList = proxyServerList;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + employeeCount;
		result = prime * result + ((establishedDate == null) ? 0 : establishedDate.hashCode());
		result = prime * result + ((globalPresence == null) ? 0 : globalPresence.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marketvalue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		result = prime * result + ((proxyServerList == null) ? 0 : proxyServerList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (employeeCount != other.employeeCount)
			return false;
		if (establishedDate == null) {
			if (other.establishedDate != null)
				return false;
		} else if (!establishedDate.equals(other.establishedDate))
			return false;
		if (globalPresence == null) {
			if (other.globalPresence != null)
				return false;
		} else if (!globalPresence.equals(other.globalPresence))
			return false;
		if (Double.doubleToLongBits(marketvalue) != Double.doubleToLongBits(other.marketvalue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		if (proxyServerList == null) {
			if (other.proxyServerList != null)
				return false;
		} else if (!proxyServerList.equals(other.proxyServerList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketvalue=" + marketvalue
				+ ", establishedDate=" + establishedDate + ", employeeCount=" + employeeCount + ", globalPresence="
				+ globalPresence + ", boardMembers=" + boardMembers + ", projectManager=" + projectManager
				+ ", proxyServerList=" + proxyServerList + "]";
	}

	
	
}
