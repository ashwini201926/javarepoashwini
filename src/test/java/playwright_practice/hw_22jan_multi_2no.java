package practice;

import java.util.Scanner;

public class hw_22jan_multi_2no {
	

	public static void main(String[] args) {
		// Write a Java program that takes two numbers as input and displays the product of two numbers.
		
		Scanner S1=new Scanner(System.in);
		
		System.out.println("Enter value a=");
		int a= S1.nextInt();
		
		System.out.println("Enter value b=");
		int b= S1.nextInt();
		
		int multi= a*b;
		System.out.println("Multiplication result= " +multi);
		S1.close();

	}

}
