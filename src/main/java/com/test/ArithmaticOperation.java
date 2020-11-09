package com.test;

public class ArithmaticOperation {

	private int numerator;
	private int denominator;

	public ArithmaticOperation() {
		super();
	}

	public ArithmaticOperation(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Result calculate(ArithmaticOperation arithmaticOperationInput) throws InvalidInputException {

		// check for 0 denominator
		numerator = arithmaticOperationInput.getNumerator();
		denominator = arithmaticOperationInput.getDenominator();
		if (denominator == 0 || numerator == 0)
			throw new InvalidInputException("input parameter should not be 0");

		// check for negative numerator
		if (numerator < 0) {
			// convert it to positive value
			numerator = numerator * -1;
		}
		// check for negative denominator
		if (denominator < 0) {
			// convert it to positive value
			denominator = denominator * -1;
			System.out.println("denominator:" + denominator);
		}
		// initialize quotient
		
		int quotient = 0;
		// loop till the divisor does not become smaller than dividend
		while (numerator >= denominator) {
			numerator = numerator - denominator;
			quotient++;
		}

		// print results
		System.out.println("Quotient is " + quotient);
		// result of last subtraction
		System.out.println("Remainder is " + numerator);
		
		return new Result(quotient,numerator);

	}
}
