import java.util.Scanner;
	public class IsSquareNumber {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number");
		int num1 = input.nextInt();

		isSquare sqr = new isSquare();
		boolean result = sqr.sqrt(num1);

		System.out.print(result);	
		}
}