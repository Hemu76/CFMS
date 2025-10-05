package com.cfms.model;

import java.time.LocalDate;

public class KernelsNutShells {

	private long id;
	private long kernalUnits;
	private long nutShellUnits;
	private LocalDate updateDate;
	private long branchId;

	public KernelsNutShells() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getKernalUnits() {
		return kernalUnits;
	}

	public void setKernalUnits(long kernalUnits) {
		this.kernalUnits = kernalUnits;
	}

	public long getNutShellUnits() {
		return nutShellUnits;
	}

	public void setNutShellUnits(long nutShellUnits) {
		this.nutShellUnits = nutShellUnits;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

}
