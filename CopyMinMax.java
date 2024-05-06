import java.util.Scanner;
	public class CopyMinMax {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter how many times you want to play ?");
	int num2 = input.nextInt();

	System.out.println("Enter a number");
	int num1 = input.nextInt();

	int largest = 0;
	int smallest = 2000000;
	int count = 1;

	for(count = 1; count != num2 ; count++) {
	
	System.out.println("Enter a number");
	num1 = input.nextInt();
	
	if(num1 < smallest){
	smallest = num1;
	}

	if(num1 > largest) {
	largest = num1;
		}
	}
	System.out.println("The largest number is = " + largest);
	System.out.println("The smallest number is = " + smallest);
	}
}
	