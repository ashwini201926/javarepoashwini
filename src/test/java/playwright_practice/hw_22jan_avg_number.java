package practice;

import java.util.Scanner;

public class hw_22jan_avg_number {
   	
    public static void main(String[] args) {
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		   Scanner s1=new Scanner(System.in);
		   System.out.println("Enter value a= ");
		   int a= s1.nextInt();
		   System.out.println("Enter value b= ");
		   int b= s1.nextInt();
		   System.out.println("Enter value c= ");
		   int c= s1.nextInt();
		   
		   double avg= ((a+b+c)/3);
		   System.out.println("Avg of 3 numbers= " +avg);
		   s1.close();


	}

}
