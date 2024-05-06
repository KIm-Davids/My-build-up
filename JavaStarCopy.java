import java.util.Scanner; 
	public class JavaStarCopy {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number");
		int number = input.nextInt();

		int row = 1;
		int column = 1 + 1; 
	
		for(row = 1; row <= number; row++) {
			System.out.println(" ");
			for(column = 1; column <= row; column++) {
				System.out.print(" *");
		}
		}
	}
}



