package practice;

public class hw_asterisk_1_3 {

	public static void main(String[] args) {
		// nested for loop asterisk (*,**,***) 
		
		char a='*';
		for(int i=1;i<=3;i++) {
			for (int j=1;j<=i;j++){
				System.out.print(a);
				
			}
			System.out.println();
		}
		
		
	}

}
