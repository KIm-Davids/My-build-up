import java.util.Scanner;
	public class PracticalWorkII {
		public static void main(String[] args) {
		
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter another integer: ");
		int number2 = input.nextInt();
		
		System.out.println("Enter third integer: ");
		int number3 = input.nextInt();

		
		int sum = number1 + number2 + number3;
		int average = sum / 3;
		int product = number1 * number2 * number3;
		temp=number1<number2?number1:number2;
		smallest=number3<temp?number3:temp;
		System.out.println("The smallest number is:" + smallest);
	}
}