package practice;

public class nested_123_loop {

	public static void main(String[] args) {
		// Nested for loop -print 123 , 123, 123
		
		int i=1;
		for(i=1;i<=3;i++) {
			for (int j=1;j<=3;j++) {
				System.out.print(j + "");
				
			}
			System.out.println();
		}
	}

}
