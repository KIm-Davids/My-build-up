import java.util.Scanner;
	public class GetNumbers {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of times to calculate");
		int num1 = input.nextInt();

		int i = 0;

		for(i = 0; i <= num1; i++) {
			System.out.print("Enter positive number")
			int positive = input.nextInt();
			
			System.out.print("Enter a negative number");
			int negative = input.nextInt();
	

			System.out.print("Enter zeros");
			int zero = input.nextInt();

			}

		if(positive >= -1) {	
			positiveNumber = positive;
			System.out.print(i)
			}
	
		if(negative <= 0) {
			negativeNumber = negative;
			System.out.print(i)
			}

		if(zero == 0) {
			zeros = zero;
			System.out.print(i)
			}

		}


}











