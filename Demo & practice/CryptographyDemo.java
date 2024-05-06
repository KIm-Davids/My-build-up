import java.util.Random;
import java.util.Scanner;
	public class CryptographyDemo {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer");
	int num = input.nextInt();
		
			
	System.out.println("Key Input");
	System.out.println(value1);

	System.out.println();

	int number1 = value1 / 1000 % 100;
	int number2 = value1 / 100 % 10;
	int number3 = (value1 / 10) % 10;
	int number4 = value1 % 10;

	int sum = number1 + 7;
	int sum1 = number2 + 7;
	int sum2 = number3 + 7;
	int sum3 = number3 + 7;
	
	int sumTotal = sum * sum1 * sum2 * sum3;
	
	System.out.print(sumTotal);
	}
}
