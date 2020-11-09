package com.test;

public class StringReverseOperation {

	private String str;

	public StringReverseOperation() {
		super();
	}

	public StringReverseOperation(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void reverseString(String s) throws InvalidInputException {

		if (s == null)
			throw new InvalidInputException("Input string should not be null");


		final StringBuilder builder = new StringBuilder(s); 
		int length = builder.length();
		for (int i = 0; i < length / 2; i++) { 
			final char currentChar = builder.charAt(i);
			final int rightEnd = length - i - 1; 
			builder.setCharAt(i, builder.charAt(rightEnd));
			builder.setCharAt(rightEnd, currentChar); 
			}
		System.out.println("reversed string:"+ builder.toString());
		}

}
