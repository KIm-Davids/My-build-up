import java.util.Scanner;
	public class GasMileage {
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
	
		double meterpergallon = 0;
		double meterDriven = 0; 
		double gallonUsed  = 0;
		double totalMeterPerGallon = 0;

		
		System.out.print("Enter meter driven: ");
		 meterDriven = input.nextDouble();

		while (meterDriven != -1) { 
			System.out.print("Enter gallon used: ");
			gallonUsed = input.nextDouble();

			meterpergallon = meterDriven / gallonUsed;
			
			System.out.printf("The miles per gallon = %.2f",meterpergallon);

			

			System.out.println("\nEnter meter driven: ");
			 meterDriven = input.nextDouble();
			

				
				
		}
			System.out.printf("The miles driven by the driver = %.2f", totalMeterPerGallon);

   	 }
}
