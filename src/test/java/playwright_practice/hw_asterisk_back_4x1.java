package practice;

public class hw_asterisk_back_4x1 {

	public static void main(String[] args) {
		// nested for loop asterisk back 
	// ****
	//  ***
	//   **
	//    *
		char a='*';
		for (int i=1; i<=4; i++) {
			
			for (int j=i; j<=4; j++) {
				System.out.print(a);				
			}
			System.out.println();
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
		}
		
		
	}

}
