package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

//		problem1();
//		problem2();
//		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int max = inKey.nextInt();
		System.out.print("Enter a positive integer: ");
		int min = inKey.nextInt();

		if(min>max) {
			int input3 = max;
			max = min;
			min = input3;
		}
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * ((max+1)-min)) + min + " ");
		}
		System.out.println();
		
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: \n");
		double radius = inKey.nextDouble();
		System.out.print("Enter the height of the cylinder: \n");
		double height = inKey.nextDouble();
		
		System.out.println(Math.PI * Math.pow(radius, 2) * height);
		
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		System.out.println("Distance between points = " + Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))));
		
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a-value: \n");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: \n");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: \n");
		double c = inKey.nextDouble();
		double x1;
		double x2;
		x1 = ( (-b)+Math.sqrt(Math.pow(b, 2) - (4 * a * c) ) )/(2*a);
		x2 = ( (-b)-Math.sqrt(Math.pow(b, 2) - (4 * a * c) ) )/(2*a);
		System.out.println(x1);
		System.out.println(x2);
		
	}



}
