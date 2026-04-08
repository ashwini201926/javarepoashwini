package practice;

import java.util.Scanner;

public class hw_22jan_area_circle {
    static double PI=3.14;	
    
	public static void main(String[] args) {
		// Write a Java program to print the area and Perimeter of a circle.
		//area =pi*r*r
		//Perimeter =2*pi*r
		
		
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter value radius r=");
		double  r= S1.nextDouble();
		double area= PI*r*r;
		double peri= 2*PI*r;
		System.out.println("Area of circle= " +area);
		System.out.println("Perimeter of circle =" +peri);
		S1.close();

	}

}
