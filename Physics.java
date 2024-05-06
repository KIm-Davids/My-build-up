import java.util.Scanner;
	public class Physics {
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter meter/second");
		double number1 = input.nextDouble();

		System.out.println("Enter the acceleration");
		double number2 = input.nextDouble();

		double speed = number1 * number1;
		double acceleration = number2 * 2;
		
		double lenght = speed / acceleration;
	
		System.out.printf("Enter speed and acceleration: %.3f", lenght);
	}
}