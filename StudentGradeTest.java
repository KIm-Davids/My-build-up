import java.util.*;
import java.util.Collections;
	public class StudentGradeTest {	
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int counter = 0;
		int index  =1;
		int noOfStudents;
		int score;
		int row;
		String string = "=";
		System.out.println("How many students do you have ? ");
		int students = input.nextInt();
	
		
		System.out.println("How many subjects do they offer ?");
		int subjects = input.nextInt();
	
		int[][] subjAndStudents = new int[students][subjects];
		

		
		
		for(counter = 0; counter < subjAndStudents.length;counter++) {

			System.out.println("Entering score for students " + (counter + 1));

			for(index = 0; index < subjects;index++){
				System.out.println("Enter score for subject " + (index + 1));
				subjAndStudents[counter][index] = input.nextInt();
				
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");	
				System.out.println("Saved successfully\n");
		
							
			

			}
			
		}
			

		System.out.println("==================================================================" + string.repeat(subjects));
		System.out.print("STUDENTS");
	
		for(int column = 0; column < index; column++) {
			System.out.print("\tSUB" + (column + 1));
		}
		System.out.print("\tTOTAL");
		System.out.print("\tAVERAGE");
		System.out.println("\t POS");
		System.out.println("=================================================================="+ string.repeat(subjects));


	//	ArrayList<Integer> position = new ArrayList<Integer>();
		int[] total = new int[subjAndStudents.length];
		double[] average = new double[subjAndStudents.length];
		int[] position = new int[subjAndStudents.length];
		


		int indexes = 0;
		
		int column;
	


		for(row = 0; row < subjAndStudents.length; row++) {
			System.out.print("\nSTUDENT " + (row+ 1));	
	


			for(column = 0; column < subjects; column++) {

				System.out.print("\t " + subjAndStudents[row][column] + "");

				total[row] += subjAndStudents[row][column];
				average[row] = total[row] / subjects;	
		
				int result = getPosition(total);
				System.out.print(result);
		}
				
			
			System.out.print("\t " + total[row]);
			System.out.print("\t " + average[row]);
			
		}

		Arrays.sort(total);

		System.out.println();
		System.out.println();
		
	//	System.out.print("The total is " + total);
			
		for(position = 0; position < total.length; position++) {
			System.out.print("The total is " + total[indexes]);
			for(indexes = position;  indexes > 0; indexes--){
			System.out.println("\t" + (indexes + 1));
		}
	
		}
		

			
	}

	public static int[] getPosition(int[] array){
		int[] positionArray = new int[array.length];
		for(int count = 0; count <array.length; count++){
					int position = 1;
			for(int counter = 0; counter <array.length; counter++){
				if(array[count] == array[counter]){
					break;
				}
				position++;
			}
			positionArray[count] = position;
		}
		return positionArray;

	}


}

		


		