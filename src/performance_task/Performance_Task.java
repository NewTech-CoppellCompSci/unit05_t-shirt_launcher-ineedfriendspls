package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		double x = 5;
		double y = 5;
		boolean bool = true;
		int time = 0;
		System.out.println("Enter launch velocity (m/s) >>> ");
		double vel = inKey.nextDouble();
		System.out.println("Enter launch angle (degress) >>> ");
		double deg = inKey.nextDouble();
		while(y>0||x==0){
			System.out.println("Time: " + time + "s");
			x = Math.cos(Math.toRadians(deg))*vel*time;
			y = Math.sin(Math.toRadians(deg))*time*vel-0.5*9.8*(time*time);
			if (y  < 0) {
				y = 0;
			}
			System.out.println("x-pos: " + x);
			System.out.println("y-pos: " + y);
		
			time+=1;
			
			
		}
		
		
		
		
		
	}
//	public static double[] imgay(double xPos, double yPos, int time) {
//		
//		double[] finalArray = {};
//		return finalArray;
//	}
}
