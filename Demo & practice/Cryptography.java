import java.util.Scanner;
	public class Cryptography {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Key Input");
	int num1 = input.nextInt();
	
	System.out.println();

	double number1 = num1 / 1000 % 100;
	double number2 = num1 / 100 % 10;
	double number3 = (num1 / 10) % 10;
	double number4 = num1 % 10;

	double sum = number1 + 7;
	double sum1 = number2 + 7;
	double sum2 = number3 + 7;
	double sum3 = number3 + 7;
	
	double sumTotal = sum + sum1 + sum2 + sum3;
	double newValue = sumTotal / 10;
	double newCode = newValue * 888;
	
	int value2 = (int)Math.round(newCode);

	double newNumber1 = value2 / 1000 % 100;
	double newNumber2 = value2 / 100 % 10;
	double newNumber3 = (value2 / 10) % 10;
	double newNumber4 = value2 % 10;

	int code1 = (int)Math.round(newNumber1);
	int code2 = (int)Math.round(newNumber2);
	int code3 = (int)Math.round(newNumber3);
	int code4 = (int)Math.round(newNumber4);

	System.out.println("Processing Code:");
	System.out.println(newCode);

	System.out.println();


	System.out.println("Encrypted Key");
	System.out.printf("%d%d%d%d", code3, code4, code1, code2);
	}
}
