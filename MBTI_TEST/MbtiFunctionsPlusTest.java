import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
	public class MbtiFunctionsPlusTest {
		static Scanner input = new Scanner(System.in);

		static char[] array = new char[2];
		static char[] e_vs_i = new char[6];
		

		int extrovert_Vs_Introvert_A = 0;
		int extrovert_Vs_Introvert_B = 0;
		int sensing_Vs_Intuitive_A = 0;
		int sensing_Vs_Intuitive_B = 0;
		int thinking_Vs_Feeling_A = 0;
		int thinking_Vs_Feeling_B = 0;
		int judging_Vs_Perceptive_A = 0;
		int judging_Vs_Perceptive_B = 0;

	


		//NAME

		public static void userName() {
		System.out.print("""
		What is your name ?
				""");

		String userName = input.nextLine();
		}

		

		//QUESTION 1
		
	public static char[] question1() {

			
	
			System.out.print("""
			A. tough-minded, just
			B. tender-hearted, merciful
			""");
	
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
			String question = input.nextLine();
			e_vs_i[counter] = (question.charAt(0));

			if(question.length() > 1) {
				System.out.println();
				System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
				System.out.println();
				question1();
			}
		
		


			if(question == "A" & question == "B") {
				System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
				question1();
				break;
			}
			else {
				switch(question) {
					case "A": question2();
					case "B": question2();
			  		break;   
					default:{ System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  		question1();}
				}
			}
		}
				return e_vs_i;
			
				
	}	
		


		//QUESTION 2

		public static char[] question2() {


		System.out.print("""
		
		A. candid, straight foward, frank
		B. tactful, kind, encouraging

				""");


		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String second_Question = input.nextLine();
		array[counter] = second_Question.charAt(0);
		



		if(second_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question2();
		}
		


		if(second_Question == "A" & second_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question2();
		break;
		}
		else {
	

		switch(second_Question) {
		case "A": question3();
			  break;
		case "B": question3();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question2();
		

}
}
}
		return array;
}

		//QUESTION 3

		public static void question3(){


		System.out.print("""
		
		A. focus on here-and-now
		B. look to the future, global perspective, big picture


				""");

		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String third_Question = input.nextLine();
		array[counter] = third_Question.charAt(0);
		



		if(third_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question3();
		}
		


		if(third_Question == "A" & third_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question1();
		break;
		}
		else {



		switch(third_Question) {
		case "A": question4();
			  break;
		case "B": question4();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question3();

}
}
}	
}

		

		//QUESTION 4



		public static void question4(){


		System.out.print("""
		
		A. expend energy, enjoy groups
		B. conserve energy, enjoy one-on-one


				""");


		
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String fourth_Question = input.nextLine();
		array[counter] = fourth_Question.charAt(0);
		



		if(fourth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question4();
		}
		


		if(fourth_Question == "A" & fourth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question4();
		break;
		}
		else {


		switch(fourth_Question) {
		case "A": question5();
			  break;
		case "B": question5();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question4();


}
}	
}		
}
		

		public static void question5(){


		System.out.print("""
		
		A. interpret literally
		B. looking for meaning and possibilities


				""");

			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String fifth_Question = input.nextLine();
		e_vs_i [counter] = fifth_Question.charAt(0);
		



		if(fifth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question5();
		}
		


		if(fifth_Question == "A" & fifth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question5();
		break;
		}
		else {







		switch(fifth_Question) {
		case "A": question6();
			  break;
		case "B": question6();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question5();



}
}		
}
}


		public static void question6(){


		System.out.print("""
		
		A. practical, realistic, experiential
		B. imaginative, innovative, theoretica


				""");


		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String sixth_Question = input.nextLine();
		array[counter] = sixth_Question.charAt(0);
		



		if(sixth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question6();
		}
		


		if(sixth_Question == "A" & sixth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question6();
		break;
		}
		else {

		switch(sixth_Question) {
		case "A": question7();
			  break;
		case "B": question7();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question6();



}
}
}
}

		
		public static void question7(){


		System.out.print("""
		
		A. plan, schedule
		B. unplanned, spontaneous


				""");


		
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String seventh_Question = input.nextLine();
		array[counter] = seventh_Question.charAt(0);
		



		if(seventh_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question7();
		}
		


		if(seventh_Question == "A" & seventh_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question7();
		break;
		}
		else {


		switch(seventh_Question) {
		case "A": question8();
			  break;
		case "B": question8();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question7();
			   break;



}
}
}
}
		

		public static void question8(){


		System.out.print("""
		
		A. seek many tasks, public activities, interaction with others
		B. seek private, solitary activities with quiet to concentrate


				""");


			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String eight_Question = input.nextLine();
		array[counter] = eight_Question.charAt(0);
		



		if(eight_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question8();
		}
		


		if(eight_Question == "A" & eight_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question8();
		break;
		}
		else {
	



		switch(eight_Question) {
		case "A": question9();
			  break;
		case "B": question9();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question8();
			  break;





}
}
}
}

	
				
		public static void question9(){


		System.out.print("""
		
		A. standard, usual, conventional
		B. different , novel, unique


				""");

		
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String ninth_Question = input.nextLine();
		array[counter] = ninth_Question.charAt(0);
		



		if(ninth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question9();
		}
		


		if(ninth_Question== "A" & ninth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question9();
		break;
		}
		else {






		switch(ninth_Question) {
		case "A": question10();
			  break;
		case "B": question10();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question9();
			  break;






}
}
}
}





		public static void question10(){


		System.out.print("""
		
		A. firm, tend to criticize, hold the line
		B. gentle, tend to appreciate, conciliate


				""");


		
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String tenth_question = input.nextLine();
		array[counter] = tenth_question.charAt(0);
		



		if(tenth_question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question10();
		}
		


		if(tenth_question == "A" & tenth_question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question10();
		break;
		}
		else {





		switch(tenth_question) {
		case "A": question11();
			  break;
		case "B": question11();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question10();






}
}
}
}


		
		public static void question11(){


		System.out.print("""
		
		A. regulated, structured
		B. easy - going, live and let live


				""");


			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String eleventh_Question = input.nextLine();
		array[counter] = eleventh_Question.charAt(0);
		



		if(eleventh_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question11();
		}
		


		if(eleventh_Question == "A" & eleventh_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question11();
		break;
		}
		else {



		

		switch(eleventh_Question) {
		case "A": question12();
			  break;
		case "B": question12();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question11();




}
}
}
}

	

		public static void question12(){


		System.out.print("""
		
		A. external, communicative, express yourself
		B. internal, reticent, keep to yourself



				""");


			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String  twelveth_Question = input.nextLine();
		array[counter] = twelveth_Question.charAt(0);
		



		if(twelveth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question12();
		}
		


		if(twelveth_Question == "A" & twelveth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question12();
		break;
		}
		else {




		



		switch(twelveth_Question) {
		case "A": question13();
			  break;
		case "B": question13();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question12();








}
}
}
}


		
		public static void question13(){


		System.out.print("""
		
		A. preparation, plan ahead
		B. go with the flow, adapt as you go



				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String thirteenth_Question = input.nextLine();
		array[counter] = thirteenth_Question.charAt(0);
		



		if(thirteenth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question13();
		}
		


		if(thirteenth_Question == "A" & thirteenth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question13();
		break;
		}
		else {



		



		switch(thirteenth_Question) {
		case "A": question14();
			  break;
		case "B": question14();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question13();








}
}
}
}



		public static void question14(){


		System.out.print("""
		
		 A. Active, initiate
		 B. Reflective, deliberate



				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String fourtheenth_Question = input.nextLine();
		array[counter] = fourtheenth_Question.charAt(0);
		



		if(fourtheenth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question14();
		}
		


		if(fourtheenth_Question == "A" & fourtheenth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question14();
		break;
		}
		else {



		



		switch(fourtheenth_Question) {
		case "A": question15();
			  break;
		case "B": question15();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question14();








}
}
}
}




		
		public static void question15(){


		System.out.print("""

		A. Facts, things, what is ideas
		B. Dreams, what could be philosophical


				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String fifteenth_Question = input.nextLine();
		array[counter] = fifteenth_Question.charAt(0);
		



		if(fifteenth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question15();
		}
		


		if(fifteenth_Question == "A" & fifteenth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question15();
		break;
		}
		else {



		



		switch(fifteenth_Question) {
		case "A": question16();
			  break;
		case "B": question16();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question15();





}
}
}
}




		
		public static void question16(){


		System.out.print("""

		A. Do it the usual way
		B. Do it your own way 

				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String sixth_Question = input.nextLine();
		array[counter] = sixth_Question.charAt(0);
		



		if(sixth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question16();
		}
		


		if(sixth_Question == "A" & sixth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question16();
		break;
		}
		else {



		



		switch(sixth_Question) {
		case "A": question17();
			  break;
		case "B": question17();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question16();


}
}
}
}

		
	
				
		public static void question17(){


		System.out.print("""

		A. Logical judgments
		B. Value judgments 

				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String seventh_Question = input.nextLine();
		array[counter] = seventh_Question.charAt(0);
		



		if(seventh_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question17();
		}
		


		if(seventh_Question == "A" & seventh_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question17();
		break;
		}
		else {



		



		switch(seventh_Question) {
		case "A": question18();
			  break;
		case "B": question18();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question17();



}
}
}
}		



			
				
		public static void question18(){


		System.out.print("""

		A. Serious and determined
		B. Easy-going 

				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String eighteenth_Question = input.nextLine();
		array[counter] = eighteenth_Question.charAt(0);
		



		if(eighteenth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question18();
		}
		


		if(eighteenth_Question == "A" & eighteenth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question18();
		break;
		}
		else {



		



		switch(eighteenth_Question) {
		case "A": question19();
			  break;
		case "B": question19();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question18();



}
}
}
}		




					
		public static void question19(){


		System.out.print("""

		A. Laws than circumstances
		B. Circumstances than laws 


				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String nineteenth_Question = input.nextLine();
		array[counter] = nineteenth_Question.charAt(0);
		



		if(nineteenth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question19();
		}
		


		if(nineteenth_Question == "A" & nineteenth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question19();
		break;
		}
		else {



		



		switch(nineteenth_Question) {
		case "A": question20();
			  break;
		case "B": question20();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question19();



}
}
}
}		


	

						
		public static void question20(){


		System.out.print("""

		A. Convincing
		B. Touching 

				""");
		
			
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		String twentieth_Question = input.nextLine();
		array[counter] = twentieth_Question.charAt(0);
		



		if(twentieth_Question.length() > 1) {
		System.out.println();
		System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
		System.out.println();
		question20();
		}
		


		if(twentieth_Question == "A" & twentieth_Question == "B") {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
		question20();
		break;
		}
		//System.out.print(Arrays.toString(array));
}
}


	//	public static void displayArray(){
	//		System.out.println(Arrays.toString(array));
	//	}

		public static void main(String[] args) {
		userName();
		question1();
	//	displayArray();

		System.out.print(Arrays.toString(e_vs_i));
		System.out.print(Arrays.toString(array));
		}
   }

