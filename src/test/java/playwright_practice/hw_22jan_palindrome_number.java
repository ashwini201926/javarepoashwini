package practice;

import java.util.Scanner;

public class hw_22jan_palindrome_number {
  
    
	public static void main(String[] args) {
		// Write a Java program to check if a positive number is a palindrome or not.
		//Take positive number ,reverse it if both are same then number is palindrome. eg 121
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=S1.nextInt(), a1=a;
		
		int rev=0 , rem;
	while(a!=0) {
		rem =a%10;
		rev =rev *10+rem;
		a=a/10;
		
		
	}
	System.out.println("Reverse number:" +rev);
		if(a1==rev) {
			System.out.println( "Given number is palidrome number.");	
			
		}else {
			System.out.println( "Given number is NOT palidrome number.");
		}
		
		
		S1.close();
	
	}

}
