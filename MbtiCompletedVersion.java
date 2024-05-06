import java.util.Scanner;

public class MbtiCompletedVersion {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int selectionA1 = 0;
	int selectionB1 = 0;
	int selectionA2 = 0;
	int selectionB2 = 0;
	int selectionA3 = 0;
	int selectionB3 = 0;
	int selectionA4 = 0;
	int selectionB4 = 0;	

	System.out.println("What is your name");
	String name = scanner.nextLine();

	//Extroverted Vs Introverted questions

	//question 1

	int counter = 0;
	String question1;
	do
	{
	System.out.println("""
	Here we give you 5 questions to test if your Extrovert vs Introvert
				""");

	System.out.println("""
	A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one
			""");
	question1 = scanner.next();

	if (question1.charAt(0) == 'A' | question1.charAt(0) == 'a') {
		selectionA1++;
		break;
	}
	
	if (question1.charAt(0) == 'B' | question1.charAt(0) == 'b') {
		selectionB1++;
		break;
	}
		
	if(question1.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question1 = scanner.next();
			System.out.println();
			
	}

	}while(question1.charAt(0) == 'A' | question1.charAt(0) == 'a' && question1.length() < 2) ;
		
	

	//question 5

	String question2;
	

	do
	{
		System.out.println("""
		A. More outgoing, think out loud         B. More reserved, think to yourself
				""");
	 	question2 = scanner.next();
		if (question2.charAt(0) == 'A' | question2.charAt(0) == 'a') {
			selectionA1++;
			break;
	}
	
		if (question2.charAt(0) == 'B' | question2.charAt(0) == 'b') {
			selectionB1++;
			break;
	}
		
		if(question2.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question2 = scanner.next();
			System.out.println();
			
	}
	}while(question2.charAt(0) == 'A' | question2.charAt(0) == 'a' && question2.length() < 2) ;
	

	//question 9

	String question3;

	do
	{

	System.out.println("""
	A. Seek many tasks, Public activities, Interation with Others         B. Seek private, Solitary activities with quiet to concentrate
				""");
	 	question3 = scanner.next();
		if (question3.charAt(0) == 'A' | question3.charAt(0) == 'a') {
			selectionA1++;
			break;
	}
	
		if (question3.charAt(0) == 'B' | question3.charAt(0) == 'b') {
			selectionB1++;
			break;
	}
		
		if(question3.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question3 = scanner.next();
			System.out.println();
			
	}
	}while(question3.charAt(0) == 'A' | question3.charAt(0) == 'a' && question3.length() < 2) ;
	


	//question 13

	String question4;

	do
	{

	System.out.println("""
	A. External, Communicate, Express yourself         B. Internal, Reticient, keep to yourself
			""");
	question4 = scanner.next();

	if (question4.charAt(0) == 'A' | question4.charAt(0) == 'a') {
			selectionA1++;
			break;
	}
	
		if (question4.charAt(0) == 'B' | question4.charAt(0) == 'b') {
			selectionB1++;
			break;
	}
		
		if(question4.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question4 = scanner.next();
			System.out.println();
			
	}
	}while(question4.charAt(0) == 'A' | question4.charAt(0) == 'a' && question4.length() < 2) ;




	//question 17

	String question5;

	do
	{

	System.out.println("""
	A. active, initiate        B.  reflective, deliberate
			""");
	question5 = scanner.next();

	if (question5.charAt(0) == 'A' | question5.charAt(0) == 'a') {
			selectionA1++;
			break;
	}
	
		if (question5.charAt(0) == 'B' | question5.charAt(0) == 'b') {
			selectionB1++;
			break;
	}
		
		if(question5.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question5 = scanner.next();
			System.out.println();
			
	}
	}while(question5.charAt(0) == 'A' | question5.charAt(0) == 'a' && question5.length() < 2) ;



	//Sensing Vs Intuitive

	//question 2
		
	String question6;

	do
	{

	System.out.println("""
	A. Interpet literally         B. Look for meaning and possibility
			""");
	question6 = scanner.next();

	if (question6.charAt(0) == 'A' | question6.charAt(0) == 'a') {
			selectionA2++;
			break;
	}
	
		if (question6.charAt(0) == 'B' | question6.charAt(0) == 'b') {
			selectionB2++;
			break;
	}
		
		if(question6.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question6 = scanner.next();
			System.out.println();
			
	}
	}while(question6.charAt(0) == 'A' | question6.charAt(0) == 'a' && question6.length() < 2) ;


	
	String question7;

	//question 6


	do
	{
	System.out.print("""
		
		A. practical, realistic, experiential	B. imaginative, innovative, theoretica


				""");


	question7 = scanner.next();

	if (question7.charAt(0) == 'A' | question7.charAt(0) == 'a') {
			selectionA2++;
			break;
	}
	
		if (question7.charAt(0) == 'B' | question7.charAt(0) == 'b') {
			selectionB2++;
			break;
	}
		
		if(question7.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question7 = scanner.next();
			System.out.println();
			
	}
	}while(question7.charAt(0) == 'A' | question7.charAt(0) == 'a' && question7.length() < 2) ;



		
	String question8;

	//question 10

	do
	{
	System.out.print("""
		
		A.  standard,  usual, conventional	B.  different, novel, unique


				""");
	question8 = scanner.next();


	if (question8.charAt(0) == 'A' | question8.charAt(0) == 'a') {
			selectionA2++;
			break;
	}
	
		if (question8.charAt(0) == 'B' | question8.charAt(0) == 'b') {
			selectionB2++;
			break;
	}
		
		if(question8.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question8 = scanner.next();
			System.out.println();
			
	}
	}while(question8.charAt(0) == 'A' | question8.charAt(0) == 'a' && question8.length() < 2) ;



	String question9;

	//question 14

	do
	{
	
	System.out.print("""
		
		 A. focus on here-and-now,  look to the future	         B.  global perspective, big picture



				""");
		

	question9 = scanner.next();


	if (question9.charAt(0) == 'A' | question9.charAt(0) == 'a') {
			selectionA2++;
			break;
	}
	
		if (question9.charAt(0) == 'B' | question9.charAt(0) == 'b') {
			selectionB2++;
			break;
	}
		
		if(question9.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question9 = scanner.next();
			System.out.println();
			
	}
	}while(question9.charAt(0) == 'A' | question9.charAt(0) == 'a' && question9.length() < 2) ;



	String question10;

	//question 18

	do
	{
	
	System.out.print("""
		
		 A. facts, things, what is 	 B.  ideas, dreams, what could be , philosophical



				""");
		

	question10 = scanner.next();


	if (question10.charAt(0) == 'A' | question10.charAt(0) == 'a') {
			selectionA2++;
			break;
	}
	
		if (question10.charAt(0) == 'B' | question10.charAt(0) == 'b') {
			selectionB2++;
			break;
	}
		
		if(question10.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			question10 = scanner.next();
			System.out.println();
			
	}
	}while(question10.charAt(0) == 'A' | question10.charAt(0) == 'a' && question10.length() < 2) ;



	
	//Thinking Vs Feeling

	String Question10;

	//question 3

	do
	{
	
	System.out.print("""
		
		A. Logical, Thinking, Questioning         B. Empatethic, Feeling, Accomodating


				""");
		

	Question10 = scanner.next();


	if (Question10.charAt(0) == 'A' | Question10.charAt(0) == 'a') {
			selectionA3++;
			break;
	}
	
		if (Question10.charAt(0) == 'B' | Question10.charAt(0) == 'b') {
			selectionB3++;
			break;
	}
		
		if(Question10.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question10 = scanner.next();
			System.out.println();
			
	}
	}while(Question10.charAt(0) == 'A' | Question10.charAt(0) == 'a' && Question10.length() < 2) ;




	String Question11;

	//question 7

	do
	{
	
	System.out.print("""
		
	A. Candid, Straight Forward, Frank         B. Tactful, Kind, Encouraging

				""");
		

	Question11 = scanner.next();


	if (Question11.charAt(0) == 'A' | Question11.charAt(0) == 'a') {
			selectionA3++;
			break;
	}
	
		if (Question11.charAt(0) == 'B' | Question11.charAt(0) == 'b') {
			selectionB3++;
			break;
	}
		
		if(Question11.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question11 = scanner.next();
			System.out.println();
			
	}
	}while(Question11.charAt(0) == 'A' | Question11.charAt(0) == 'a' && Question11.length() < 2) ;



	String Question12;

	//question 11

	do
	{
	
	System.out.print("""
		
	A. Firm, Tend to critisize, Hold the line         B. Gentle, tend to appreciate, conciliate
				""");
		

	Question12 = scanner.next();


	if (Question12.charAt(0) == 'A' | Question12.charAt(0) == 'a') {
			selectionA3++;
			break;
	}
	
		if (Question12.charAt(0) == 'B' | Question12.charAt(0) == 'b') {
			selectionB3++;
			break;
	}
		
		if(Question12.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question12 = scanner.next();
			System.out.println();
			
	}
	}while(Question12.charAt(0) == 'A' | Question12.charAt(0) == 'a' && Question12.length() < 2) ;




	String Question13;

	//question 15

	do
	{
	
	System.out.print("""
		
	A. Tough minded, just         B. Tender Hearted, Merciful
				""");
		

	Question13 = scanner.next();


	if (Question13.charAt(0) == 'A' | Question13.charAt(0) == 'a') {
			selectionA3++;
			break;
	}
	
		if (Question13.charAt(0) == 'B' | Question13.charAt(0) == 'b') {
			selectionB3++;
			break;
	}
		
		if(Question13.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question13 = scanner.next();
			System.out.println();
			
	}
	}while(Question13.charAt(0) == 'A' | Question13.charAt(0) == 'a' && Question13.length() < 2) ;


	String Question14;

	//question 19

	do
	{
	
	System.out.print("""
		
	A. Matter of fact, Issue-Oriented         B. Sensitive, People Oriented, Passionate
				""");
		

	Question14 = scanner.next();


	if (Question14.charAt(0) == 'A' | Question14.charAt(0) == 'a') {
			selectionA3++;
			break;
	}
	
		if (Question14.charAt(0) == 'B' | Question14.charAt(0) == 'b') {
			selectionB3++;
			break;
	}
		
		if(Question14.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question14 = scanner.next();
			System.out.println();
			
	}
	}while(Question14.charAt(0) == 'A' | Question14.charAt(0) == 'a' && Question14.length() < 2) ;



	//Judging Vs Perceptive

	String Question15;

	//question 4

	do
	{
	
	System.out.print("""
		
	A. Organized, Orderly         B. Flexible, Adaptable
				""");
		

	Question15 = scanner.next();


	if (Question15.charAt(0) == 'A' | Question15.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question15.charAt(0) == 'B' | Question15.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question15.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question15 = scanner.next();
			System.out.println();
			
	}
	}while(Question15.charAt(0) == 'A' | Question15.charAt(0) == 'a' && Question15.length() < 2) ;



	String Question16;

	//question 8

	do
	{
	
	System.out.print("""
		
	A. Plan, Schedule         B. Unplanned, Spontaneous
				""");
		

	Question16 = scanner.next();


	if (Question16.charAt(0) == 'A' | Question16.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question16.charAt(0) == 'B' | Question16.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question16.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question16 = scanner.next();
			System.out.println();
			
	}
	}while(Question16.charAt(0) == 'A' | Question16.charAt(0) == 'a' && Question16.length() < 2) ;


	String Question17;

	//question 12

	do
	{
	
	System.out.print("""
		
	A. regulated, structured       B. easy-going, live and let live
				""");
		

	Question17 = scanner.next();


	if (Question17.charAt(0) == 'A' | Question17.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question17.charAt(0) == 'B' | Question17.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question17.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question17 = scanner.next();
			System.out.println();
			
	}
	}while(Question17.charAt(0) == 'A' | Question17.charAt(0) == 'a' && Question17.length() < 2) ;


	String Question18;

	//question 16

	do
	{
	
	System.out.print("""
		
	A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go
					""");
		

	Question18 = scanner.next();


	if (Question18.charAt(0) == 'A' | Question18.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question18.charAt(0) == 'B' | Question18.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question18.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question18 = scanner.next();
			System.out.println();
			
	}
	}while(Question18.charAt(0) == 'A' | Question18.charAt(0) == 'a' && Question18.length() < 2) ;



	String Question19;

	//question 20

	do
	{
	
	System.out.print("""
		
	A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go
					""");
		

	Question19 = scanner.next();


	if (Question19.charAt(0) == 'A' | Question19.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question19.charAt(0) == 'B' | Question19.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question19.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question19 = scanner.next();
			System.out.println();
			
	}
	}while(Question19.charAt(0) == 'A' | Question19.charAt(0) == 'a' && Question19.length() < 2) ;





	String Question20;

	//question 21

	do
	{
	
	System.out.print("""
		
	
	A. Do it the usual way	B. Do it your own way 

					""");
		

	Question20 = scanner.next();


	if (Question20.charAt(0) == 'A' | Question20.charAt(0) == 'a') {
			selectionA4++;
			break;
	}
	
		if (Question20.charAt(0) == 'B' | Question20.charAt(0) == 'b') {
			selectionB4++;
			break;
	}
		
		if(Question20.length() > 1) {
			System.out.println();
			System.out.print("Wrong input, pls ensure you input only 'A' or 'B'");
			System.out.println();
			System.out.println("PRESS 'A' TO CONTINUE");
			Question20 = scanner.next();
			System.out.println();
			
	}
	}while(Question20.charAt(0) == 'A' | Question20.charAt(0) == 'a' && Question20.length() < 2) ;






		String loading;

		System.out.println("CLICK TO SEE YOUR RESULT");
			loading = scanner.next();

		System.out.println();
		System.out.println("For the first segment of Extrovert 'E' VS Introvert 'I'\n ");
		System.out.println("Number of A selected: " + selectionA1);
		System.out.println("Number of B selected: " + selectionB1);
		System.out.println();

		if (selectionA1 > selectionB1) {
			System.out.println("It seems like you're an extrovert");
			System.out.println("E");
		
 		}
			System.out.println();

		 if (selectionA1 < selectionB1) {
			System.out.println("It seems like you're an introvert");
 			System.out.println("I");
			

		}
			System.out.println();

		System.out.println("Please press 'A' to continue");
			loading = scanner.next();

		System.out.println("For the Second segment of Sensitive 'S' VS Intuitive 'N'\n ");
		System.out.println("Number of A selected: " + selectionA2);
		System.out.println("Number of B selected: " + selectionB2);

			System.out.println();

		if (selectionA2 > selectionB2) {
			System.out.println("It seems like you're an Sensitive");
 			System.out.println("S");

 		}
			System.out.println();


 		if (selectionA2 < selectionB2) {
			System.out.println("It seems like you're Intuitive ");
 			System.out.println("N");
 		}

			System.out.println();

			System.out.println("Please press 'A' to continue");
			loading = scanner.next();
			

		System.out.println("For the Third segment of Thinking 'S' VS Feeling 'N'\n ");
		System.out.println("Number of A selected: " + selectionA3);
		System.out.println("Number of B selected: " + selectionB3);
			System.out.println();

		if (selectionA3 > selectionB3) {
			System.out.println("It seems like you're a Thinker ");
			System.out.println("T");
		}
			System.out.println();


 		if (selectionA3 < selectionB3) {
			System.out.println("It seems like you're more of the emotional type ");
 			System.out.println("F");
 		}
			System.out.println();


		System.out.println("Please press 'A' to continue");
			loading = scanner.next();

		System.out.println("For the Last segment of Judging 'S' VS Perceptive 'N'\n ");
		System.out.println("Number of A selected: " + selectionA4);
		System.out.println("Number of B selected: " + selectionB4);

			System.out.println();

	 	if (selectionA4 > selectionB4) {
			System.out.println("It seems like you're more of the judging type ");
 			System.out.println("J");
 		}
				System.out.println();

		if (selectionA4 < selectionB4){
			System.out.println("It seems like you're more of the perceptive type ");
 			System.out.println("P");
 		}

	
















// }
// }














}
}