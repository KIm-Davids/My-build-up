import java.util.Scanner;
	public class CalculatingEnergy {

		public static void main(String[] ags){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the water in kilogram: ");
		double waterInKilogram = input.nextDouble();

		System.out.println("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energyQ = waterInKilogram * (finalTemperature - initialTemperature) * 4184;
		System.out.printf("The energy needed is %.2f", energyQ);
	}
}

		
		
	