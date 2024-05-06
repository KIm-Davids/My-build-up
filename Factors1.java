import java.util.Scanner;
	public class Factors1 {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number");
		int num1 = input.nextInt();

		int counter = 1;
		int factor = 0;

		for(counter = 1; counter <= num1; counter++) {
		if(num1 % counter == 0) {
			factor++;
			}
			}
			counter++;
		System.out.print(factor);
		}
}