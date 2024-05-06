import java.util.Scanner;
	public class Nokia {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	String prompt = """
	Menu
	Press any number
	""";

	System.out.println(prompt);
	int userInput = input.nextInt();

String prompt3 = """
	<- Back
	
	Menu
	Select Number:


	1. Phone book
	2. Message
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. Sim services

	""";

	System.out.println(prompt3);
	Scanner input2 = new Scanner(System.in);
	int userInput2 = input.nextInt();

	switch(userInput2) {
	case 1 -> System.out.println("Phone book");
	case 2 -> System.out.println("Message");
	case 3 -> System.out.println("Chat");
	case 4 -> System.out.println("Call register");
	case 5 -> System.out.println("Tones");
	case 6 -> System.out.println("Settings");
	case 7 -> System.out.println("Call divert");
	case 8 -> System.out.println("Games");
	case 9 -> System.out.println("Calculator");
	case 10 -> System.out.println("Reminders");
	case 11 -> System.out.println("Clock");
	case 12 -> System.out.println("Profiles");
	case 13 -> System.out.println("Sim services");

}
{
	String prompt4 = """
	1. Search
	2. Service Nos.
	3. Add name 
	4. Erase
	5. Assign tone
	6. Options
	7. Speed dials
	8. Voice tags
	""";
	
	System.out.println(prompt4);
	Scanner input3 = new Scanner(System.in);
	int userInput3 = input.nextInt();
}

	
switch(userInput3) {

	case 1 -> System.out.println("Search");
	case 2 -> System.out.println(" Service Nos.");
	case 3 -> System.out.println("Add name");
	case 4 -> System.out.println("Erase");
	case 5 -> System.out.println("Assign tone");
	case 6 -> System.out.println("Options");
	case 7 -> System.out.println("Speed dials");
	case 8 -> System.out.println("Voice tags");
		}
	    }

	}
}





