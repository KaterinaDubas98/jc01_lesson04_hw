package com.edu.home04.start;

public class Task08 {

	public static void main(String[] args) {
		double a;//сторона шестигранника
		double h;//высота призмы
		double per;//периметр шестигранника
		double area;//площадь шестигранника
		double v;//объём призмы
		
		a = 5;
		h = 10;
		
		per = a * 6;
		area = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
		v = area * h;
		
		System.out.println("Периметр шестигранника = " + per);
		System.out.println("площадь шестигранника = " + area);
		System.out.println("Объём призмы = " + v);
		

	}

}
