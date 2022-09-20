package com.te.learnjava8.basic;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int result = a++ + ++b;
		// here at a++ using the data 1st and than updating with 1
		// here at ++b we are updating the variable with 1 and then we are using
		System.out.println("result " + result);

		int c = 10;
		int d = 20;
		int result2 = c-- + --d;
		// here at c-- using the data 1st and than updating with 1
		// here at --d  we are updating the variable with 1 and then we are using
		System.out.println("result " + result2);
	}

}// checking status
