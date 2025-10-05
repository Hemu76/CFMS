package com.cfms.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CashewNutsRequest {

	private long id;
	private long totUnits;
	private BigDecimal amount;
	private LocalDate requestDate;
	private String fromPlace;
	private long toBranchId;

	public CashewNutsRequest() {
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

	public LocalDate getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public long getToBranchId() {
		return toBranchId;
	}

	public void setToBranchId(long toBranchId) {
		this.toBranchId = toBranchId;
	}

}
