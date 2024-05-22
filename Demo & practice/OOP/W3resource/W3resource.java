import java.util.Scanner;
public class W3resource {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		LearningInProgress areaOfARectangle = new LearningInProgress();
	
		System.out.print("Enter length");
		double length = input.nextDouble();

		System.out.print("Enter breath");
		double breath = input.nextDouble();
	
		areaOfARectangle.setRectangle(length, breath);
		
		System.out.printf("The area and perimeter of a rectangle of length %.1f and breath of %.1f",areaOfARectangle.getarea(), areaOfARectangle.getperimeter()); 

	}
}					