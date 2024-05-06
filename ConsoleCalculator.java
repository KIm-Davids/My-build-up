import java.util.Scanner;
	public class ConsoleCalculator {
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);

	
		System.out.println("Enter a number");
		int d = input.nextInt();

	 	double q = 2 *( 50 * d) / 30;
	
		int result = (int)Math.sqrt(q);
				
		System.out.print(result);
	}
}