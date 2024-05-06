import java.util.Scanner;
	public class GasMileWork {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double milesDriven = 0;
		double gallonsUsed = 0;
		double milesPerGallon = 0;
		double totalMilesPerGallon = milesPerGallon;

		System.out.print("Enter miles driven 0r -1 to quit: ");
		milesDriven = input.nextDouble();

	while (milesDriven != -1) {

		System.out.print("Enter gallons used  0r -1 to quit: ");
		gallonsUsed = input.nextDouble();

		milesPerGallon = milesDriven / gallonsUsed;
		totalMilesPerGallon = milesPerGallon;
		
		
		System.out.printf("The miles per gallon = %.2f",milesPerGallon);

		System.out.print("\nEnter miles driven 0r -1 to quit: ");
		milesDriven = input.nextDouble();

		}
		System.out.printf("The total miles per gallon = %.2f", totalMilesPerGallon);
	}
}