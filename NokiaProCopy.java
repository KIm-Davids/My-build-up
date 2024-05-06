import java.util.Scanner;
	public class NokiaPro {


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

case 1 -> {

		  System.out.println("Phone book \n"+ prompt2);
		  int userInput2 = input.nextInt();
		  switch(userInput2){
			case 1 -> System.out.println("Search");
			case 2 -> System.out.println(" Service Nos.");
			case 3 -> System.out.println("Add name");
			case 4 -> System.out.println("Erase");
			case 5 -> System.out.println("Assign tone");
			case 0 -> System.out.println(prompt1);
			default -> System.out.println("Error");
		   
	 case 6 -> {
		    System.out.println("Options\n" + prompt3);
		    int userInput3 = input.nextInt();
		    switch(userInput3){
			  case 1 -> System.out.println("Type of view");
			  case 2 -> System.out.println("Memory status");
			  case 00 -> System.out.println(prompt2);
			  default -> System.out.println("Error");
			 
			
		      }
		   }
		}
	     }
			   case 7 -> System.out.println("Send b'card");
			   case 8 -> System.out.println("Speed dials");	
		       	   case 9 -> System.out.println("Voice tags");
			   case 000 -> System.out.println(prompt2);
			   default -> System.out.print("Error Retry input\n");
		  
case 2 -> {
			    System.out.println("Message\n" + prompt4);
			    int userInput5 = input.nextInt();
			    switch(userInput5){
			    case 1 -> System.out.println("Write messages");
			    case 2 -> System.out.println("Inbox");
			    case 3 -> System.out.println("Outbox");
			    case 4 -> System.out.println("Picture messages");
			    case 5 -> System.out.println("Templates");
			    case 6 -> System.out.println("Smileys");
			    case 0 -> System.out.print(prompt1);
				

	   
	   case 7 -> {
		      System.out.println("Message settings" + prompt5);
		      int userInput6 = input.nextInt();
				     
           		   switch(userInput6){
			     case 1 -> { 
			     System.out.println("Set 1\n" + prompt6);
			     int userInput7 = input.nextInt(); 
	      			 switch(userInput7){
			    	 case 1 -> System.out.println("Message centre number");
			    	 case 2 -> System.out.println("Messages sent as");
			    	 case 3 -> System.out.println("Message validity");
				 case 0 -> System.out.print(prompt5);
}
}
}
		    
			    switch(userInput6) {
	 	             case 2 -> {
			     System.out.println("Common\n" + prompt7);
		             int userInput9 = input.nextInt();
			     switch(userInput9) {
			    	 case 1 -> System.out.println("Delivery reports");
	                    	 case 2 -> System.out.println("Reply via same centre");
		          	 case 3 -> System.out.println("Character support");
				 case 0 -> System.out.print(prompt5);




						
				 	   } 
					  }
				 case 0 -> System.out.print(prompt4);
				  	}	          
		        	      }
				    }
				  }
				
			     
			  
			    

	case 20 -> System.out.println("Chat");


case 4 -> 	{ 
		  System.out.println("Call register\n" + prompt8);
		  int userInput10 = input.nextInt();
		  switch(userInput10) { 
			case 1 -> System.out.print("Missed calls");
			case 2 -> System.out.print("Recived calls");
		 	case 3 -> System.out.print("Dialled calls");
		 	case 4 -> System.out.print("Erase recent call list");
			case 0 -> System.out.print(prompt1);


			case 5 -> {
				  System.out.print("Show call duration\n" + prompt9);
				  
				  int userInput11 = input.nextInt();
				  switch(userInput11) { 
			          	case 1 -> System.out.print("Last call duration");
					case 2 -> System.out.print("All calls' duration");
					case 3 -> System.out.print("Recieved calls' duration");
					case 4 -> System.out.print("Dialled calls' duration");
					case 5 -> System.out.print("Clear timers");
					case 0 -> System.out.print(prompt8);
					
						}
					     }
					
				     
	

		 	case 6 ->  { 
				   System.out.print("Show all cost\n" + prompt10);
				   int userInput12 = input.nextInt();
				   switch(userInput12) {
					case 1 -> System.out.print("Last call cost");
					case 2 -> System.out.print("All calls' cost");
					case 3 -> System.out.print("Clear counters");
					case 0 -> System.out.print(prompt8);
							}
						     }
						  

			case 7 -> {
				   System.out.print("Call cost settings\n" + prompt11);
				   int userInput13 = input.nextInt();
				   switch(userInput13) {
					case 1 -> System.out.print("Call cost limit");
					case 2 -> System.out.print("Show costs in");
					case 0 -> System.out.print(prompt8);

							}
						      }
						    }
						  }	
					

			case 80 -> System.out.print("Prepaid credit");
		  				







case 5 -> {
	           System.out.println("Tones\n" + prompt12);
		   int userInput14 = input.nextInt();
		   switch(userInput14) {
			     case 1 -> System.out.print("Ringing tone");
			     case 2 -> System.out.print("Ringing volume");
			     case 3 -> System.out.print("Composer");
			     case 4 -> System.out.print("Incoming call alert");
			     case 5 -> System.out.print("Message alert tone");
			     case 6 -> System.out.print("Keypad tone");
			     case 7 -> System.out.print("Warning and game tones");
			     case 8 -> System.out.print("Vibrating alert");
			     case 9 -> System.out.print("Screen saver");
			     case 0 -> System.out.print(prompt1);
					     	}
					      }
					  


case 6 ->   { 	
		    System.out.print("Settings\n" + prompt13);
		    int userInput15 = input.nextInt();
		    switch(userInput15) {
			          case 1 -> {
					   System.out.print("Call settings\n" + prompt14);
				  	   int userInput16 = input.nextInt();	

			 	  switch(userInput16) {
					case 1 -> System.out.print("Automatic deal");
					case 2 -> System.out.print("Speed dialling");
					case 3 -> System.out.print("Call waiting options");
					case 4 -> System.out.print("Own number sending");
					case 5 -> System.out.print("Phone line in use");
					case 6 -> System.out.print("Automatic answer");
					case 0 -> System.out.print(prompt13);
					}
				      }
				    
				
				
				  case 2 -> {
					     System.out.print("Phone settins\n" + prompt15);
					     int userInput17 = input.nextInt();

					     switch(userInput17) {
					  		case 1 -> System.out.print("Language");	
							case 2 -> System.out.print("Cell info display");
							case 3 -> System.out.print("Welcome note");
							case 4 -> System.out.print("Network selection");				
							case 5 -> System.out.print("Lights");				
							case 6 -> System.out.print("Confirm SIM service actions");					
							case 0 -> System.out.print(prompt13);
							}
			      			      }
			   			    
						  
				  					
				   case 3 -> {
					       System.out.print("Security settings\n" + prompt16);
					       int userInput18 = input.nextInt();
					       
					       switch(userInput18) { 
							  case 1 -> System.out.print("PIN code request");
							  case 2 -> System.out.print("Call barring service");
							  case 3 -> System.out.print("Fixed dialling");
							  case 4 -> System.out.print("Closed user group");
							  case 5 -> System.out.print("Phone security");
							  case 6 -> System.out.print("Change access code");
							  case 0 -> System.out.print(prompt13);


									}
								      }
								    
								  					
				    case 4 -> System.out.print("Restore factory settings");
								
							      



case 7 -> System.out.println("Call divert");
case 8 -> System.out.println("Games");
case 9 -> System.out.println("Calculator");
case 10 -> System.out.println("Reminders");
case 0 -> System.out.print(prompt1);
}
}

case 11 -> {
		System.out.println("Clock\n" + prompt17);
		int userInput19 = input.nextInt();
		switch(userInput19) {
			   case 1 -> System.out.print("Alarm clock");
			   case 2 -> System.out.print("Clock settings");
			   case 3 -> System.out.print("Date setting");
			   case 4 -> System.out.print("Stopwatch");
			   case 5 -> System.out.print("Countdown timer");
			   case 6 -> System.out.print("Auto update of date and time");
			   case 0-> System.out.print(prompt1);
					}
				     }

	





	case 12 -> System.out.println("Profiles");	
	case 13 -> System.out.println("Sim services");
	case 14 -> System.out.println("Back");	
	}
    }	
  }
}

