import java.util.Scanner;
	public class CreateAccount {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Type in your full name");
		char c = input.next().charAt(0);

		System.out.println("Input Account Number");
		char accountNumber = input.next().charAt(0);
		
		int counter = 1;
		int tenNumbers = 10;

	while (accountNumber!=tenNumbers)
		{
		System.out.print("Account number Incorrect");
		if (accountNumber==tenNumbers)
			{
			System.out.print("Account number correct");
			}
		counter = counter + 1;	
		}
		
    }
}