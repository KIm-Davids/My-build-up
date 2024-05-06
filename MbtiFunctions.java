import java.util.ArrayList;
import java.util.Scanner;
	public class MbtiFunctionsPlus {
		static Scanner input = new Scanner(System.in);

		static char[] array = new char[20];
		


		//ArrayList<String> addQuestion = new ArrayList<String>();


		//NAME

		public static void userInput() {
		System.out.print("""
		What is your name ?
				""");

		String userName = input.nextLine();
		}



		//QUESTION 1

		public static void question1(){

		System.out.print("""
		
		A. tough-minded, just
		B. tender-hearted, merciful


		""");
	
		int counter = 0;
		for(counter = 0; counter < 20; counter++) {
		char question = input.next().charAt(0);
		array[counter] = question;
		

		if(question == 'A' & question == 'B') {
		System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question1();

		}


	
		switch(question) {
		case 'A': question2();
			  break;
		case 'B': question2();
			  break;   
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question1();
}
}



		//QUESTION 2

		public static void question2(){


		System.out.print("""
		
		A. candid, straight foward, frank
		B. tactful, kind, encouraging

				""");


		char second_Question = input.next().charAt(0);


	//	for(int counter = 0; counter < 20; counter++) {
	//	second_Question = input.next().charAt(0);
		//array[counter] = second_Question;

	//	if(second_Question == 'A' & second_Question == 'B') {
	//	System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
	//		  question2();

	//	}
		




		switch(second_Question) {
		case 'A': question3();
			  break;
		case 'B': question3();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question2();
		

}
}
}


		public static void question3(){


		System.out.print("""
		
		A. focus on here-and-now
		B. look to the future, global perspective, big picture


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question4();
			  break;
		case 'B': question4();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question3();

}
}


		
		public static void question4(){


		System.out.print("""
		
		A. expend energy, enjoy gorups
		B. conserve energy, enjoy one-on-one


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question5();
			  break;
		case 'B': question5();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question4();


}
}		
		
		public static void question5(){


		System.out.print("""
		
		A. interpret literally
		B. looking for meaning and possibilities


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question6();
			  break;
		case 'B': question6();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question5();



}
}		

		public static void question6(){


		System.out.print("""
		
		A. practical, realistic, experiential
		B. imaginative, innovative, theoretica


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question7();
			  break;
		case 'B': question7();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question6();



}
}



		public static void question7(){


		System.out.print("""
		
		A. plan, schedule
		B. unplanned, spontaneous


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question8();
			  break;
		case 'B': question8();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question7();




}
}




		
		public static void question8(){


		System.out.print("""
		
		A. seek many tasks, public activities, interaction with others
		B. seek private, solitary activities with quiet to concentrate


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question9();
			  break;
		case 'B': question9();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question8();








}
}




				
		public static void question9(){


		System.out.print("""
		
		A. standard, usual, conventional
		B. different , novel, unique


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question10();
			  break;
		case 'B': question10();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question9();






}
}




		public static void question10(){


		System.out.print("""
		
		A. firm, tend to criticize, hold the line
		B. gentle, tend to appreciate, conciliate


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question11();
			  break;
		case 'B': question11();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question10();






}
}




		public static void question11(){


		System.out.print("""
		
		A. regulated, structured
		B. easy - going, live and let live


				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question12();
			  break;
		case 'B': question12();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question11();




}
}




		public static void question12(){


		System.out.print("""
		
		A. external, communicative, express yourself
		B. internal, reticent, keep to yourself



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question13();
			  break;
		case 'B': question13();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question12();








}
}



		public static void question13(){


		System.out.print("""
		
		A. preparation, plan ahead
		B. go with the flow, adapt as you go



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question14();
			  break;
		case 'B': question14();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question13();








}
}




		public static void question14(){


		System.out.print("""
		
		A. active, initiate
		B. reflective, deliberate



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question15();
			  break;
		case 'B': question15();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question14();



}
}


		public static void question15(){


		System.out.print("""
		
		A. facts, things, what is
		B. ideas, dreams, what could be, philosophical



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question16();
			  break;
		case 'B': question16();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question15();




}
}


		

		public static void question16(){


		System.out.print("""
		
		A. matter of fact, issue-oriented
		B. sensitive, people- oriented, compassionate



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': question17();
			  break;
		case 'B': question17();
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question16();


}
}


		public static void question17(){


		System.out.print("""
		
		A. control, govern
		B. latitude, freedom



				""");


		char question = input.next().charAt(0);

		switch(question) {
		case 'A': System.out.print("\nA");
			  break;
		case 'B': System.out.print("\nB");
			  break;
		default: System.out.print("\nExpected A or B as response\n\nI know this is an error, Please retry again\n");
			  question17();




		
		//for(int counter = 0; counter < question; counter++) {	
		//System.out.print(array[counter]);
		//} 







}
}



	//	if(question == 'A'){
	//	System.out.print("You choose A\nA. tough-minded, just");
	//	}

		












		public static void main(String[] args) {
		userInput();
		question1();
				
		}
   }

