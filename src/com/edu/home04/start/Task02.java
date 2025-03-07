package com.edu.home04.start;

public class Task02 {

	public static void main(String[] args) {
		
		double x1, y1;
		double x2, y2;
		double a, b;
		double length;
		
		x1 = 4;
		x2 = 7;
		y1 = 6;
		y2 = 10;
		
		a = x2 - x1;
		b = y2 - y1;
		length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Расстояние межу центрами окружностей = " + length);
		
	}

}
