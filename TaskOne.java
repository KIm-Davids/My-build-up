import java.util.Scanner;
	public class TaskOne {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sum= 0;
		int num1 = 0;
		for(int i = 1; i <= 10; i++) {

		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		sum += num1;
		}
		
		System.out.print(sum);
	}
}