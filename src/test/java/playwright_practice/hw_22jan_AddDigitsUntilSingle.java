package practice;

import java.util.Scanner;

public class hw_22jan_AddDigitsUntilSingle {
   
    
	public static void main(String[] args) {
		// Write a Java program to add all the digits of a given positive integer 
		//until the result has a single digit.
	
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter value a:" );
		int a=S1.nextInt();
		
		if(a>0) {
			System.out.println("a is positive number");
			
			while(a>=10) {
				int sum =0;
				while (a != 0) {
				sum =sum +(a%10);
				a=a/10;
			}
			    a=sum;
			    //System.out.println("Final addition-single digit is: " + a);
		}	
			System.out.println("Final addition-single digit is: " + a);
			}else {
			System.out.println("a is negative number");
		}
		S1.close();
	}

}
