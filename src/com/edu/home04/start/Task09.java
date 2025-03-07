package com.edu.home04.start;

public class Task09 {

	public static void main(String[] args) {
		double a;//сторона квадрата
		double d;
		double S;
		double r;
		double R;
		
		a = 5;
		
		d = Math.sqrt(2) * a;
		S = a * a;
		r = a / 2;
		R = d / 2;
		
		System.out.println("Диагональ квадрата = " + d);
		System.out.println("Площадь квадрата = " + S);
		System.out.println("Радиус вписанной окружности = " + r);
		System.out.println("Радиус описанной окружности = " + R);

	}

}
