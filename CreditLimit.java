import java.util.Scanner;
	public class CreditLimit {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			

		System.out.println("Account Number - 1019448371");

		System.out.println();

		System.out.print("Credit Limit - 500,000");
		
		System.out.println();

		System.out.print("\nEnter beginning balance: ");
		int beginBalance = input.nextInt();

		System.out.print("Enter total charges: ");
		int totalCharges = input.nextInt();

		System.out.print("Enter total credits: ");
		int totalCredits = input.nextInt();

		int newBalance = beginBalance + (totalCharges - totalCredits);

	if (newBalance < totalCredits) {
		System.out.print("Credit limit Exceeded");
		} else {
		System.out.printf("New Balance - %d", newBalance);
		}
	}
}