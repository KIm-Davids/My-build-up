import java.util.Scanner;

	public class BmiTest {

		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter weight: ");
		double weight = input.nextDouble();

		System.out.println("Enter height: ");
		int height = input.nextInt();

		double convertingKiloToPounds = 0.453;
		double convertingHeightToInch = 0.0254;

		double weightInKilo = weight * convertingKiloToPounds;
		double heightInInch = height * convertingHeightToInch;
	
		double Bmi = weightInKilo / ( heightInInch * heightInInch );
		System.out.printf("Bmi is %.2f", Bmi);
	}
}
	