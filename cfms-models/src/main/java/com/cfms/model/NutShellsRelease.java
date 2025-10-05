package com.cfms.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NutShellsRelease {

	private long id;
	private long totUnits;
	private BigDecimal amount;
	private LocalDate releaseDate;
	private String toPlace;
	private long fromBranchId;

	public NutShellsRelease() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTotUnits() {
		return totUnits;
	}

	public void setTotUnits(long totUnits) {
		this.totUnits = totUnits;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public long getFromBranchId() {
		return fromBranchId;
	}

	public void setFromBranchId(long fromBranchId) {
		this.fromBranchId = fromBranchId;
	}

}
