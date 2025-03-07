package com.edu.home04.start;

public class Task03 {

	public static void main(String[] args) {
		
		double x1, y1;
		double x2, y2;
		double x3, y3;
		
		x1 = 1;
		y1 = 1;
		x2 = 4;
		y2 = 2;
		x3 = 3;
		y3 = 6;
		
		double ab;
		double bc;
		double ca;
		
		double gip;
				
		ab = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		bc = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		ca = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		gip = Math.max(Math.max(ab, bc), ca);
		
		if (gip == ab) {
			System.out.println("Гипотенуза = " + gip);
			System.out.println("Катет 1 = " + bc);
			System.out.println("Катет 2 = " + ca);
		}
		if (gip == bc) {
			System.out.println("Гипотенуза = " + gip);
			System.out.println("Катет 1 = " + ab);
			System.out.println("Катет 2 = " + ca);
		}
		if (gip == ca) {
			System.out.println("Гипотенуза = " + gip);
			System.out.println("Катет 1 = " + ab);
			System.out.println("Катет 2 = " + bc);
		}

	}

}
