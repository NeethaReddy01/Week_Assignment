package com.insight.mockito;

public interface CalculatorService {
	public double add(double input1, double input2);
	public double subtract(double input1, double input2);
	public double multiply(double input1, double input2);
	public double divide(double input1, double input2)throws
	ArithmeticException;

}
