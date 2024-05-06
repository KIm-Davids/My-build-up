import java.util.Scanner;
	public class Palindromes {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a five digit: ");
		int fiveDigit = input.nextInt();

		int number1 = fiveDigit / 1000;
		int number2 = (fiveDigit / 100) % 100;
		int number3 = (fiveDigit / 10) % 10;
		int number4 = fiveDigit % 10;

		int sum = number1 + number2 + number3 + number4;
	while(true) {
		System.out.println("Enter a new value: ");
			int fiveDigit1 = input.nextInt();

		if (fiveDigit!=sum) {
			System.out.println("Error message");
			}
 
		if (fiveDigit==sum) {
			System.out.println("Palindrome");
		}
		break; }
	}
}	
	
	

	    