import java.util.Scanner;
	public class MinMax {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer");
	int num1 = input.nextInt();
	
	System.out.print("Enter second integer");
	int num2 = input.nextInt();

	System.out.print("Enter third integer");
	int num3 = input.nextInt();

	int minimum = num1;

	if(num2 < minimum) {
	minimum = num2;
	}
	if(num3 < minimum) {
	minimum = num3;

	System.out.print("The minimum number is " + minimum);
	}

    }
}