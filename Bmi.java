import java.util.Scanner;
	public class Bmi {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your weight: ");
		int weight = input.nextInt();

		System.out.println("Enter your height: ");
		int height = input.nextInt();
		
		int number1 = weight / kilo;
		int kilo = height * height;

		System.out.printf("BMI is %d%n", number1);
	}
}