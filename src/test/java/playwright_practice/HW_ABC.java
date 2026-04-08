package practice;

public class HW_ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int print=1;
		for(int num=1; num<=3; num++)
		{
			for(int num2=1; num2<=num;) {
				System.out.print(print);
				//System.out.print(num2);
				print++;
			}
			System.out.println();			
		}
	}

}
