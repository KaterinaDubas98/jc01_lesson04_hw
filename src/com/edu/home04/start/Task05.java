package com.edu.home04.start;

public class Task05 {

	public static void main(String[] args) {
		
		double e = 1;
		
		System.out.println("Первые четыре степени числа е:");
		
		for(int i = 1; i<=4; i++) {
			e = Math.pow(Math.E, i);
			System.out.println(e);
		}

	}

}
