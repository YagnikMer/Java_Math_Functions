package com.math;

public class MathFunctionExamples {

	public static void main(String[] args) {

		double num = 25.4634;
		double num1 = -48.2467;

		int num2 = -5;
		int num3 = 16;

		System.out.println("floor : " + Math.floor(num));
		System.out.println("floor : " + Math.floor(num1));

		System.out.println("ceil : " + Math.ceil(num));
		System.out.println("ceil : " + Math.ceil(num1));

		System.out.println("hypot : " + Math.hypot(num2, num3));

		System.out.println("IEEEremainder : " + Math.IEEEremainder(num2, num3));

		System.out.println("log : " + Math.log(num));

		System.out.println("abs : " + Math.abs(num));

		System.out.println("Math.PI : " + Math.PI);

		System.out.println("round : " + Math.round(num));

		System.out.println("sqrt : " + Math.sqrt(num3));

		System.out.println("pow(11,3) : " + Math.pow(11, 3));
		System.out.println("pow(11,2) : " + Math.pow(11, 2));

		System.out.println("floorMod(11, 3) : " + Math.floorMod(11, 3));
		System.out.println("floorMod(11, 4) : " + Math.floorMod(11, 4));

		System.out.println("max(11, 3) : " + Math.max(11, 3));

		System.out.println("min(11, 3) : " + Math.min(11, 3));
	}
}