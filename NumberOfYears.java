import java.util.Scanner;

	public class NumberOfYears {

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		int number1 = input.nextInt();
	
		int minuteInAYear = 60 * 24 * 365;
		int year = number1 / minuteInAYear;
		int days = (number1 / 60 / 24) % 365;
				


		System.out.printf("%d minutes is approximately %d years and %d days", number1, year, days);
	}
}