public class Triangle {
    
	public static void main(String[] args) {
	    
		for (int row = 0; row <= 7; row++) {
		    
			for (int space = 1; space <= 7 - row; space++)
				System.out.print(" ");

			for (int tLeft = 1; tLeft <= row; tLeft++)
				System.out.print("T");

			for (int tRight = row - 1; tRight >= 1; tRight--)
				System.out.print("T");

			System.out.print("\n");
		}
	}
}