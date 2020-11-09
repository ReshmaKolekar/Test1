package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
/***********************Question 1: calculate Quotient and reminder without devide and mod**********/
		ArithmaticOperation arithmaticOperationInput;

		Map<Integer, Integer> map = new HashMap<>();
		map.put(100, 25);
		map.put(101, 25);
		map.put(100, -25);
		map.put(-100, 25);
		//map.put(100, 0);

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			arithmaticOperationInput = new ArithmaticOperation(entry.getKey(), entry.getValue());
			try {
				arithmaticOperationInput.calculate(arithmaticOperationInput);
			} catch (InvalidInputException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
/*******************************************************Question 4:String Reverse Program*******************/

		StringReverseOperation stringReverse=new StringReverseOperation("Reshmaw");
		
		try {
			stringReverse.reverseString(stringReverse.getStr());
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
/**************************Question 2:clculate angle between minute and hour***************/
	
	AngleCalculation angle=new AngleCalculation();
	
	angle.calculateAngle(12,15);
	}
	
}
