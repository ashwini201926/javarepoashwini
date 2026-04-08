package practice;

public class hw_asterisk_back_1x4 {

	public static void main(String[] args) {
		// nested for loop asterisk back 
//   *
//  **
// ***
//****
		char a='*';
		for(int i=1; i<=4; i++) {
			
			for(int j=i;j<=3;j++) {
				System.out.print(" ");
			}
				for(int k=1; k<=i;k++) {
					System.out.print(a);
				}
				System.out.println();
			}
			
		}

	}


