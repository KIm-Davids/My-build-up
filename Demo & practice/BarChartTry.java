import java.util.Scanner;
	public class BarChartTry {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number from 1 - 30");
	int num = input.nextInt();

	if(num > 30) {
	System.out.print("Error");
	}

	if(num < 0) {
	System.out.print("Try Again");
	}

	int count = 0;

	for(count = 1; count <= num; count++) {
	System.out.print("*");
	}
    }
}