package practice;

public class hw_asterick_4X2_void {

	void print()
	{
		char a='*';
		for(int i=1; i<=4; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(a);		
			}
			System.out.println();
		}	
	}
	
	String print1()
	{
		StringBuilder sb = new StringBuilder();
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
		return sb.toString();
		
		}
	
	
	public static void main(String[] args) {
		// nested for loop output (**** ,***,**,*)
		hw_asterick_4X2_void abc = new hw_asterick_4X2_void();
		abc.print();
		abc.print1();
		
		System.out.println(Math.pow(2,3));
	}

}
