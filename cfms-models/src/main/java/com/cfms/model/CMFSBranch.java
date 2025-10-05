package com.cfms.model;

public class CMFSBranch {

	private long id;
	private String code;
	private String name;
	private String address;
	private long agentId;
	private long cashewNuts;
	private long cashewKernals;
	private long nutShells;
	private long totWorkers;

	public CMFSBranch() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAgentId() {
		return agentId;
	}

	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	public long getCashewNuts() {
		return cashewNuts;
	}

	public void setCashewNuts(long cashewNuts) {
		this.cashewNuts = cashewNuts;
	}

	public long getCashewKernals() {
		return cashewKernals;
	}

	public void setCashewKernals(long cashewKernals) {
		this.cashewKernals = cashewKernals;
	}

	public long getNutShells() {
		return nutShells;
	}

	public void setNutShells(long nutShells) {
		this.nutShells = nutShells;
	}

	public long getTotWorkers() {
		return totWorkers;
	}

	public void setTotWorkers(long totWorkers) {
		this.totWorkers = totWorkers;
	}

}
