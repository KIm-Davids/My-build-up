import java.util.Scanner;
	public class TaskTwo {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num2 = 0;
		int i = 1;
		int sum= 0;
		int num1 = 0;
		for(i = 1; i <= 10; i++) {

		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		sum += num1;
		}
		num2 = sum / 10;
		
		System.out.println(sum);
		System.out.print(num2);
		
	}
}