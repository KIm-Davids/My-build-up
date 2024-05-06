import java.util.Scanner;
	public class PrimeNumbers {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number to check if it is a prime number ");
		int num1 = input.nextInt();
		
		isPrimeNumber primenum = new isPrimeNumber();
		boolean result = primenum.prime(num1);

		System.out.print(result);
		}
}