import java.util.Scanner;
	public class TaskFive {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num2 = 0;
		int i = 0;
		int sum= 0;
		int num1 = 0;
		int num3 = 0;
		int sum2 = 0;
		int num4 = 0;
		int sum1 = 0;


		for(i = 1; i <= 20; i+=2) {

		System.out.print("Enter a number: ");
		num1 = input.nextInt();

		if(num1 % 2 == 0) {
		sum1 += num1;
	}
		sum += num1;
		
		}

		num3 = sum / 2;
		num2 = sum / 10;
		sum1 = sum1 / 10;
		
		System.out.println("The sum is" + sum);
		System.out.println("The average is = " + num2);
		System.out.println("The sum of only the even index = " + num3);
		System.out.print("The even numbers = " + sum1);
	}
}