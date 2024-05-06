import java.util.Scanner;
	public class SeperatingDigits {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a five digit integer");
	int num1 = input.nextInt();

	
	
	int num2 = num1 / 10000 % 1000 % 100;
	int num3 = num1 / 1000 % 10;
	int num4 = num1 / 100 % 10;
	int num5 = num1 / 10 % 10;
	int num6 = num1 % 10;

	System.out.print("  " + num2);
	System.out.print("  " + num3);
	System.out.print("  " + num4);
	System.out.print("  " + num5);
	System.out.print("  " + num6);
	}
}