import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


	public class StudentGradePro {	
		private static Scanner input = new Scanner(System.in);




		public static void main(String[] args) {
	
		ArrayList<Integer> score = new ArrayList<Integer>();		
		int card[][] = collectInput();
		for (int counter= 0; counter < card.length; counter++)
			for (int count= 0; count < card[counter].length; count++) 
				System.out.printf("%nStudent %s score  for subject %s:  %s",counter+ 1, count+1,count+500);
	}




















	
	public static int[][] collectInput(){
		System.out.println("Enter The number of your students: " );
		int students = input.nextInt();
		System.out.println("Enter The number of subjects offered: " );
		int subjects = input.nextInt();
		return new int[students][subjects];
	}
}

		


		