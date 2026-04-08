package practice;

import java.util.Scanner;

public class hw_22jan_divide_number {
  
    
	public static void main(String[] args) {
		// Write a Java program to divide two numbers and print them on the screen.
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=S1.nextInt();
		System.out.println("Enter number b:");
		int b=S1.nextInt();
		double result= (double)a/b;
		System.out.println("Result of division:" + result);
		S1.close();
		
		
	}

}
