package practice;

public class nestedloop_2_ABC {

	public static void main(String[] args) {
		// Nested for loop to output-ABC , ABC , ABC
		
		char num='A';
		for(num='A'; num<='C'; num++)
		{
			for(char num2='A'; num2<='C';num2++) {
				System.out.print(num2);
				
			}
			System.out.println();
		}

	}

}
