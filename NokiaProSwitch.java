import java.util.Scanner;
	public class NokiaProSwitch {


	public static void main(String[] args) {  
	
	Scanner input = new Scanner(System.in);
		
	String prompt = """
	Menu
	Press any number
	""";

	System.out.println(prompt);
	int userInput = input.nextInt();

	
	String prompt4 = """

	1. Write messages
	2. Inbox
	3. Outbox
	4. picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice nailbox number
	10. Service command editor
	0. Back 
	""";

	
	String prompt5 = """
	
	1. Set 1
	2. Common
	0. Back
	""";

	String prompt6 = """

	1. Message centre number
	2. Message sent as 
	3. Message validity
	0. Back
	""";

	

	String prompt7 = """

	1. Delivery reports
	2. Reply via same centre
	3. Character support
	0. Back 
	""";

	
	String prompt8 = """

	1. Missed calls
	2. Recieved calls
	3. Dialled calls
	4. Erase recent call lists
	5. Show call duration
	6. Show call cost
	7. Call cost settings
	8. Prepaid credit
	0. Back 
	""";

	String prompt9 = """

	!. Last call duration
	2. All calls' duration
	3. Recieved calls' duration
	4. Dialed calls' durarion
	5. Clear timers
	0. Back 
	""";
	
	String prompt10 = """
	1. Last call cost
	2. All calls' cost
	3. Clear counters
	0. Back 
	""";

	
	String prompt11 = """

	1. Call cost limit
	2. Show costs in
	0. Back 
	""";	

	String prompt12 = """

	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver
	0. Back
	""";

	String prompt13 = """

	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	0. Back
	""";

	
	String prompt14 = """

	1. Automatic deal
	2. Speed dailling	
	3. Call waiting options
	4. own number sending
	5. Phone line in use
	6. Automatic answer
	0. Back
		""";	    

	String prompt15 = """

	1. Language
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions
	0. Back
		"""; 

	
	String prompt16 = """
	1. PIN code request
	2. Call barring service
	3. Fixed diallng
	4. Closed user group
	5. Phone security
	6. Change access codes
	0. Back
	""";

	String prompt17 = """
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
	0. Back 
	""";

	String prompt18 = """
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


	String prompt3 = """
	 1. Type of view
	 2. Memory status
	 0. Back 
	 """; 

	String prompt1 = """
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

	System.out.println(prompt1);
	Scanner input1 = new Scanner(System.in);
	int userInput1 = input.nextInt();

String prompt2 = """

	1. Search
	2. Service Nos.
	3. Add name 
	4. Erase
	5. Assign tone
	6. Options
	7. Send b'card
	8. Speed dial
	9. Voice tags
	0. Back
	""";

while(true) {

switch(userInput1){ 

case 1 : {

		  System.out.println("Phone book \n"+ prompt2);
		  int userInput2 = input.nextInt();
		  switch(userInput2){
			case 1 : System.out.println("Search");
			break;
			case 2 : System.out.println(" Service Nos.");
			break;
			case 3 : System.out.println("Add name");
			break;
			case 4 : System.out.println("Erase");
			break;
			case 5 : System.out.println("Assign tone");
			break;
			case 0 : System.out.println(prompt18);
			break;
			default : System.out.println("Error");
		   
	 case 6 : {
		    System.out.println("Options\n" + prompt3);
		    int userInput3 = input.nextInt();
		    switch(userInput3){
			  case 1 : System.out.println("Type of view");
			  break;
			  case 2 : System.out.println("Memory status");
			  break;
			  case 0 : System.out.println(prompt2);
			  break;
			  default : System.out.println("Error");
			 
			
		      }
		   }
		}
	     }
			   case 7 : System.out.println("Send b'card");
			   break;
			   case 8 : System.out.println("Speed dials");	
			   break;
		       	   case 9 : System.out.println("Voice tags");
			   break;
			   default : System.out.print(prompt18);
	
			}
		}
			  
	}
}	  