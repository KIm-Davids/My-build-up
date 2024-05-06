import java.util.ArrayList;
import java.util.Scanner;
	public class ArrayPracticeJennyPro {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		ArrayList<String> listedNames = new ArrayList<String>();
		ArrayList<Integer> listedAge = new ArrayList<Integer>();	
		ArrayList<Integer> listedGrade = new ArrayList<Integer>();
	
		int counter = 0;
		
		String name = null;
		int age = 0;
		int finalAge = 0;
		
		for(counter = 0; counter < 5; counter++) {

		System.out.println("Enter name: ");
		name = input.next();



		System.out.println("Enter Grade: ");

		age = input.nextInt();
		finalAge += age;	
	
		listedNames.add(name);
		listedAge.add(age);
		listedGrade.add(finalAge);
		
		
		}

		for(counter = 0; counter < listedNames.size(); counter++){

		System.out.println("The names are: " + listedNames.get(counter));
		System.out.println("The Grades are: " + listedAge.get(counter));
		System.out.println("The final Grades are: " + listedGrade.get(counter));
		}

		
		
		}
}