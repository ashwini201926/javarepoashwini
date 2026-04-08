package practice;

public class HW_Asterisk_decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4; // Number of rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < rows - i; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
	}

}
