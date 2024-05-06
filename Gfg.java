import java.util.Scanner;	

	public class SumOfTheDigit{
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.print("Enter a number between 0 and 1000: ");
			int number1 = input.nextInt();

			while(number1 >0)
			{
			int number2 = number1 % 10;
			int sum = sum + number2;
			int number = number /10
			}
			System.out.println("The sum of the digits is:",+sum);
	}
}

		
	