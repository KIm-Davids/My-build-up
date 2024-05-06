import java.util.Scanner;	
	public class DoWhile {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME\nPress any number to continue\nEnter -1 to end");
	int num1 = input.nextInt();

	int count = 0;

	do 
	{
	
	System.out.println("Enter a number");
	num1 = input.nextInt();

	System.out.println("Enter another number");
	int num2 = input.nextInt();

	int sum = num1 + num2;
	
	System.out.println("The addition of " + num1 + " and " + num2 + " is " + sum);
	
	count++;
}	
	while(num1 != -1);

	
	
	}
}
	