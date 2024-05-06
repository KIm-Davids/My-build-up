import java.util.Scanner;
	public class MaxMin {
		public static void main(String[] args) {

	
		Scanner input = new Scanner(System.in);


	System.out.print("How many numbers would you like to input? ");
	int num1 = input.nextInt();


	int minMax = 0;
	int smallest = 2000000;
	int largest = 0;

	for(int i = 1; i < num1; i++) {
		
	System.out.print("Number " + i + ": ");
	int num2 = input.nextInt();

	int num3 = num2;

	if(num2 > largest) {
	largest = num2;
	}

	if(num3 < smallest) {
	smallest = num3;
	}
	
	}

System.out.print(" ");

	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is: " + largest);
}
}