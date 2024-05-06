import java.util.Scanner;
	public class evenNumbersMain {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter a number");
		int num1 = input.nextInt();

		
		evenNumbersMethod1 even = new evenNumbersMethod1();
		boolean result = even.bool(num1);
		
		System.out.print(result);

		}
}