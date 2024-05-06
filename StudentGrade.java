import java.util.ArrayList;
import java.util.Scanner;
	public class StudentGrade {	
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> score = new ArrayList<Integer>();
	
		

		System.out.println("How many students do you have ? ");
		int students = input.nextInt();
	
		
		System.out.println("How many subjects do they offer ?");
		int subjects = input.nextInt();
	

		for(int counter = 1 ; counter  <= subjects; counter++) {

			System.out.println("Entering score for studets " + counter);
			System.out.println("Enter score for subject " + counter);
			subjects = input.nextInt();
			score.add(subjects);
		}


		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");	
		System.out.println("Saved successfully");



		System.out.print(score);
		
	}
}

		


		