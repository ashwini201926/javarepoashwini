package practice;

public class hw_asterisk_pyramid {

	public static void main(String[] args) {
		// TODO print pyramid in asterisk pattern
		 //char a='*';
		 
		 for (int i=1; i<=4; i++) {
			 for (int j=i; j<=3; j++) {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=i; k++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
