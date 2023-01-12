package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner Inkey = new Scanner(System.in);
		
		System.out.print("Enter a positve integer: ");
		int input1 = Inkey.nextInt();

		System.out.print("Enter another positve integer: ");
		int input2 = Inkey.nextInt();
		
		
		System.out.println(input1 + "^" + input2 + " = " + Math.pow(input1, input2));
		System.out.println();
		
	}
	
	
	
	public static void problem2() {
		Scanner Inkey = new Scanner(System.in);
		
		System.out.print("Enter a positve number: ");
		int input1 = Inkey.nextInt();
		
		System.out.println("The square root of " + input1 + " is " + Math.sqrt(input1));
			
	}
	
	
	
	public static void problem3() {
		Scanner Inkey = new Scanner(System.in);
		
		System.out.print("Length of side A: ");
		int input1 = Inkey.nextInt();

		System.out.print("Length of side B: ");
		int input2 = Inkey.nextInt();
		
		System.out.println("Hypotenuse = " + Math.hypot(input1, input2));
		
	}
	
	
	
	public static void problem4() {
		Scanner Inkey = new Scanner(System.in);
		int num = 0;
		int MIN = 0;
		int MAX = 0;
		do {
			System.out.print("Enter an integer: ");
			num = Inkey.nextInt();
			MIN = Math.min(MIN, num);
			MAX = Math.max(MAX, num);
		}while(num != 0);
		System.out.println("Max = " + MAX);
		System.out.println("Min = " + MIN);
		
			
	
		
	}
	
	
	
}
