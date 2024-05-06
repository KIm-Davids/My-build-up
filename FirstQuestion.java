import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter an integer: ");
	int number1=input.nextInt();

	System.out.println("Enter an integer: ");
	int number2=input.nextInt();
	
	int square1 = number1 * number1;

	int square2 = number2 * number2;
	
	int sum = square1 + square2;

	int diff = square1 - square2;

	System.out.printf(" First square is  %d\n", square1);

	System.out.printf("Second square is %d\n", square2);

	System.out.printf("sum of the square is %d\n", sum);

	System.out.printf("The difference is %d", diff);
	
	}
}