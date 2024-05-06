import java.util.Scanner;
	public class BarChartCopy {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	System.out.println("Enter a number between 1 - 30");	
	int letter = input.nextInt();
	
	if(letter >= 30) {
	System.out.print("Error");
	}
	
	if(letter <= 0) {
	System.out.print("Try again");
	}
	
	int num2 = 1-30;

	int count = 0;
	

	for(count = 0; count <= letter; count++) {
		System.out.print("*");
	



		}


		
	}
}
	