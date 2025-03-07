package com.edu.home04.start;

public class Task06 {

	public static void main(String[] args) {
		
		int a = 7845;
		int sec = a;
		int res = 0;

		while (a > 0) {
			res += a % 10;
			a /= 10;
			
		}

		System.out.println("Сумма цифр четырехзначного числа " + sec + " = " + res);

	}

}
