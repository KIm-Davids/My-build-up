import java.util.Scanner;
	public class DividinDigits {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number");
		float num1 = input.nextFloat();

		System.out.print("Enter second number");
		float num2 = input.nextFloat();

		kata divide = new kata();
		
		float result = divide.div(num1, num2);
		
		if(num2 == 0) {
		System.out.print("0");
		} else {

		System.out.printf("The result is %.2f ",result);
		}
		}
}