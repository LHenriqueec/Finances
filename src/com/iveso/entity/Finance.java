package com.iveso.entity;

import java.time.LocalDate;

public class Finance {

	private int id;
	private String description;
	private LocalDate date;
	private String requester;
	private double value;
	private FinanceType type;
	private GroupType group;
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getRequester() {
		return requester;
	}

	public double getValue() {
		return value;
	}

	public FinanceType getType() {
		return type;
	}

	public GroupType getGroup() {
		return group;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setType(FinanceType type) {
		this.type = type;
	}

	public void setGroup(GroupType group) {
		this.group = group;
	}
	
	
}
