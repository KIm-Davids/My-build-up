import java.util.Scanner;
	public class InvestmentReturn {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount deposited at the end of the year");
	int amountDeposited = input.nextInt();

	int num2 = int(Math.pow(0.07, 10));
	
	System.out.print(num2);
	}
}