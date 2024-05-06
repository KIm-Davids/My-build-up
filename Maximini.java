import java.util.Scanner;
	public class Maximini {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to input ?");
		int num1 = input.nextInt();

		ArrayKata maxim = new ArrayKata();

		int result = maxim.maximumIn(num);

		String[] result = new String[5];

		System.out.print(Array.toString(result));
		}
	}