import java.util.Scanner;
	public class IdentifyNumber {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("How many digits would you like to count ? ");

	int positive = 0;
	int negative = 0;
	int zero = 0; 
	int count = 0;

	System.out.println("enter -1 to stop\nEnter any number: ");
	int num2 = input.nextInt();
	
	
	while(num2 != -1) {

	
	System.out.print("Enter any number: ");
	num2 = input.nextInt();

	if(num2 <= -1) {
		negative++;
		}

	if(num2 >= 1) {
		positive++;	
}

	if(num2 == 0) {
		zero++;
}
	count++;
		
	}
	System.out.println("The total negatives is = " + negative);
	System.out.println("The total positive is = " + positive);
	System.out.println("The total zero is = " + zero);

	}
}