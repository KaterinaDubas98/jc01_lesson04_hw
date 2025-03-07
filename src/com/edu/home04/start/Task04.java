package com.edu.home04.start;

public class Task04 {

	public static void main(String[] args) {
		
		double R; //радиус круга
		double a; //центральнй угол сектора
		double S;
		double L;
		
		R = 4;
		a = 90;
		
		S = Math.PI * Math.pow(R, 2) * a / 360;
		L = Math.PI * R * a / 180;
		
		System.out.println("Площадь сектора = " + S);
		System.out.println("Длина дуги сектора = " + L);
		

	}

}
