import java.util.Scanner;

	public class SquareMeterToPing {

		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a nunber in square meters: ");
		double number1 = input.nextDouble();

		double square = 0.3025;
		
		double finalAnswer = number1 * square;

		System.out.printf("%.1f square meter is %.3f pings", number1, finalAnswer);
	}
}