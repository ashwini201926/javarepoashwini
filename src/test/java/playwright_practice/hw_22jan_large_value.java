package practice;

import java.util.Scanner;

public class hw_22jan_large_value {
       
	public static void main(String[] args) {
		// Write a Java program that accepts two integer values from the user and returns 
		//the largest value. However if the two values are the same, return 0 and find the 
		//smallest value if the two values have the same remainder when divided by 6.
		
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a= S1.nextInt();
		System.out.println("Enter number b: ");
		int b=S1.nextInt();
		
		if (a==b) {
			System.out.println("0");
		}
			else if(a%6==b%6) {
				       if (a<b) {
					   System.out.println(a);
				       }else { 
					   System.out.println(b);
				      }
			}else {
				if(a>b) {
					System.out.println(a);
				}else {
					System.out.println(b);
							      
			}			
			}
		S1.close();
            
	}

}
