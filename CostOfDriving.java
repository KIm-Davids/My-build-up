import java.util.Scanner;

	public class CostOfDriving {

		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the distance");
		double number1 = input.nextDouble();

		System.out.println("Enter the miles");
		double number2 = input.nextDouble();

		System.out.println("Enter the price per gallon");
		double number3 = input.nextDouble();
	
		double miles = number1 / number2;
		double price = miles * number3;

		System.out.printf("The cost of driving is $%.2f", price);
	}
}
	
	
	
	