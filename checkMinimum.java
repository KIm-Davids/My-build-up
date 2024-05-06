import java.util.Scanner;
public class checkMinimum {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number = 0;

	for(int counter = 0; counter < 3; counter++){
	System.out.print("Enter a number");
	number = input.nextInt();
	}

	int minimum = number;

	if(number < minimum) {
		minimum = number;
	 }

	if(number < minimum) {
		minimum = minimum;
	}

	System.out.print(minimum);
	}
}
	

	
	