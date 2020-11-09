package com.test;

public class Result {

	private int quotient;
	private int reminder;

	public Result() {
		super();
	}

	public Result(int quotient, int reminder) {
		super();
		this.quotient = quotient;
		this.reminder = reminder;
	}

	public int getQuotient() {
		return quotient;
	}

	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}

	public int getReminder() {
		return reminder;
	}

	public void setReminder(int reminder) {
		this.reminder = reminder;
	}

}