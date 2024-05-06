import java.util.Scanner;
	public class FindTheAverage {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number");
		float firstNumber = input.nextFloat();

		System.out.print("Enter second number");
		float secondNumber = input.nextFloat();

		System.out.print("Enter third number");
		float thirdNumber = input.nextFloat();
	
		AverageOf average = new AverageOf();
		float result = average.average(firstNumber, secondNumber, thirdNumber);
		
		System.out.print(result);
		}
}