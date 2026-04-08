package practice;

public class hw_asterick_4X1 {

	public static void main(String[] args) {
		// nested for loop output (**** ,***,**,*)
		char a='*';
		for(int i=1; i<=4; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(a);		
			}
			System.out.println();
		}
		
	}

}
