import java.util.Scanner;
	public class TryFactorials {
		public static int factorsOf(int number) {
	int result = 0;

	int counter = 1;
	for(counter = 1; counter <= number; counter++) {

	if(number % counter == 0) {
	result = counter;
		}
	}
	return counter;
}



	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number");
	int number = input.nextInt();

	int result = factorsOf(number);
	System.out.print(result);
	
}
}