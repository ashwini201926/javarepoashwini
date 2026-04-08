package practice;



public class hw_22jan_divisible_by_number {
   	
    public static void main(String[] args) {
// Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
    	
    	
    	  System.out.print("Numbers divisible by 3: ");  
    	    	for(int a=1; a<=100; a++) {
    		    if (a%3==0) {
    			System.out.print(+a+ " ");			
    	
    		    }
    	    	}
    	System.out.print("\nNumbers divisible by 5: ");
    	for(int a=1; a<=100; a++) {
    		if (a%5==0) {
    			System.out.print(+a+ " ");
    	}

    	}
    	System.out.print("\nNumbers divisible by 3 and 5: ");
    	for(int a=1; a<=100; a++) {
    		if (a%3==0 && a%5==0) {
    			System.out.print(+a+ " ");
    	
	
    }}
    }}
