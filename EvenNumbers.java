import java.util.Scanner;
	public class EvenNumbers{
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to check");
		boolean num1 = input.nextBoolean();

		IsEven even = new isEven();
		boolean result = isEven.even(num1);

		System.out.print(num1);
		}
}


		
		 