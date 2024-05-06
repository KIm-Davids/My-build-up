import java.util.Scanner;
	public class ReadingNumbers {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();

		int counter = 10;	

	while(true) {
		System.out.print("Enter another. number: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter another number: ");
		int number3 = input.nextInt();

		int sum = number2 + number3;

	if (sum == number1)
		break;
	if (sum <= counter)
		break;
		counter++;
		    }
	}
}
	
	
	