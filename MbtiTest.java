import java.util.Scanner;
	public class MbtiTest { 
		public static void main(String[] args) {



		Scanner input = new Scanner(System.in);

		String[] answerSelect = new String[20];
		
		int counter = 0;
		int collectedUserInput = 0;
		int userOptionA = 0;
		int userOptionB = 0;
		
		
		int i = 0;

		System.out.print("What is your name? ");
		String userName = input.next();
		
		System.out.println();

		System.out.println("Please choose from the list of option carefully !");

		String prompt = """

		A. tough-minded, just\t\t\tB. tender-hearted, merciful
		
		""";


		System.out.println();
		
		System.out.print(prompt);
		
		char userInput = input.next().charAt(0);


		String prompt1 = """

		A. candid, straight foward, frank\t\t\tB. tactful, kind, encouraging
		
		""";

		System.out.println();
		
		System.out.print(prompt1);
		char userInput1 = input.next().charAt(0);


		String prompt2 = """

		A. focus on here-and-now\t\t\tB. look to the future, global perspective, big picture
			""";

		System.out.println();
		
		System.out.print(prompt2);
		char userInput2 = input.next().charAt(0);
		int x = userInput;
 		
		int y = x - 96;
       		

		
 		if(userInput == 'a') {
 		addPlusOne++;	
		}
 		
		if(userInput == 'b') {
 		addPlusTwo++;	
		}
 		
		
		System.out.println("The number of user option A = ");
		System.out.println("The number of user option B = ");








// 		if(userInput == 'a') {
// 		collectedUserInput = userInput - '0';
		
// 		}
// 		userOptionA = collectedUserInput - 9;

// 		if(userInput == 'b') {
// 		//collectedUserInput = Character.getNumericValue(userInput);
// 		}
//         System.out.print(collectedUserInput)
// 		//userOptionB = collectedUserInput - 10;
		



// 	


}
}



		//answerSelect[counter] = userOption; 

		

		
				

