package practice;

import java.util.Scanner;

public class hw_22jan_divide2_no {
	

	public static void main(String[] args) {
		// Write a Java program to divide two numbers and print them on the screen
		
		Scanner S1=new Scanner(System.in);
		
		System.out.println("Enter value a=");
		int a= S1.nextInt();
		
		System.out.println("Enter value b=");
		int b= S1.nextInt();
		System.out.println("Division result= " +a/b);
		S1.close();

	}

}
