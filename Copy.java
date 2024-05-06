import java.util.Scanner;
	public class Copy {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO NUMBERS GAME!!!!\nENTER -1 TO STOP\nENTER A NUMBER TO CONTINUE");
	int num2 = input.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;
	int count = 0;

	while(num2 != -1) {

	System.out.println("Enter a number");
	num2 = input.nextInt();

	if(num2 < 0) {
		negative++;
	}

	if(num2 >= 0) {	
		positive++;
	}
	
	if(num2 == 0) {
		zero++;
	}

	count++;
	}
	
	System.out.println("The total negative =  " + negative);
	System.out.println("The total positive =  " + positive);
	System.out.println("The total zero =  " + zero);
	}
}