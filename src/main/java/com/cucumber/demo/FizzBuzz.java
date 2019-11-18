package com.cucumber.demo;

public class FizzBuzz {

	public String play(int number) {
		if(number == 0) throw new IllegalArgumentException("Number should be greater than 0");
		if(isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "FizzBuzz";
		if(isMultipleOf(number, 3)) return "Fizz";
		if(isMultipleOf(number, 5)) return "Buzz";
		return String.valueOf(number);
	}
	
	public boolean isMultipleOf (int number, int value) {
		return (number%value==0);
	}
}
