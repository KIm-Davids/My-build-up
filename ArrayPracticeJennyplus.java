import java.util.ArrayList;
import java.util.Scanner;
	public class ArrayPracticeJennyPlus {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		ArrayList<String> listedNames = new ArrayList<String>();				
		int counter = 0;
		
		
		String names = null;

		
		for(counter = 0; counter <= 5; counter++) {

		System.out.println("Enter the names");
		names = input.nextLine();


		listedNames.add(names);
		
		
		}


		for(counter = 0; counter < listedNames.size(); counter++){

		System.out.println(listedNames.get(counter));
		
		}
		
		}
}