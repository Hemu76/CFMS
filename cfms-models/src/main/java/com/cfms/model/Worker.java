package com.cfms.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker {

	private long id;
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String email;
	private long branchId;
	private LocalDate joiningDate;
	private LocalDate lastSalariedDate;
	private BigDecimal lastSalary;

	public Worker() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDate getLastSalariedDate() {
		return lastSalariedDate;
	}

	public void setLastSalariedDate(LocalDate lastSalariedDate) {
		this.lastSalariedDate = lastSalariedDate;
	}

	public BigDecimal getLastSalary() {
		return lastSalary;
	}

	public void setLastSalary(BigDecimal lastSalary) {
		this.lastSalary = lastSalary;
	}

}
