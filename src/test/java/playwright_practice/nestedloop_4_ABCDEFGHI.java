package practice;

public class nestedloop_4_ABCDEFGHI {

	public static void main(String[] args) {
		// Nested for loop to output -ABC ,DEF, GHI IN ROW
		char print='A';
		for(char num='A'; num<='C'; num++)
		{
			for(char num2='A'; num2<='C';num2++) {
				System.out.print(print+ "");
				print++;
				
			}
			System.out.println();
		}

	}

}
