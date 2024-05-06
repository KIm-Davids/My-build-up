import java.util.Scanner;	

	public class CompoundValue {
		public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a monthly savings amount: ");

		double number1 = scanner.nextDouble();

		double number2 = number1 * (1 + 0.003125);
		
		double number3 = (100 + number2) * (1 + 0.003125);
		
		double number4 = (100 + number3) * (1 + 0.003125);

		double number5 = (100 + number4) * (1 + 0.003125);

		double number6 = (100 + number5) * (1 + 0.003125);

		double number7 = (100 + number6) * (1 + 0.003125);

		System.out.printf("After the first month the value is %.4f%n", number2);

		System.out.printf("After the second month the value is %.4f%n", number3);
		
		System.out.printf("After the third month the value is %.4f%n", number4);
		
		System.out.printf("After the fourth month the value is %.4f%n", number5);
		
		System.out.printf("After the fifth month the value is %.4f%n", number6);

		System.out.printf("After the sixth month the value is %.4f%n", number7);
	}
}
