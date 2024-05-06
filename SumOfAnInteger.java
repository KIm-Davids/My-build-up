import java.util.Scanner;
	public class SumOfAnInteger {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	
	int num2 = num1 / 1000 % 100;	
	int num3 = num1 / 100 % 10;
	int num4 = num1 / 10 % 10;
	int num5 = num1 % 10;
	
	int sum = num2 + num3 + num4 + num5;

	System.out.print("The sum of the digit is " + sum);
	}
}