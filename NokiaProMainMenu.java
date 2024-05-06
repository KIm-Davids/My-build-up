import java.util.Scanner;
public class NokiaProMainMenu {
static Scanner input = new Scanner(System.in);


	public static void mainMenu(){
	System.out.print("""
	
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
		           """);

	int menu = input.nextInt();

	switch(menu){
	case 1: phoneBook();
	case 2: message();
	case 3: chat();
	case 4: callRegister();
	case 5: Tones();
	case 6: Settings();
	case 7: callDivert();
	case 8: games();
	case 9: calculator();
	case 10: reminders();
	case 11: clock();
	case 12: profiles();
	case 13: simServices();
	default: System.out.print("\nError\nPlease try again\n");
		mainMenu();


	}
}

	public static void phoneBook(){



	System.out.print("""

	1. Search
	2. Service Nos.
	3. Add name 
	4. Erase
	5. Edit
	6. Assign tone
	7. Send b'card
	8. Options
	9. Speed dials
	10. voice tags
	0. Back to main menu
			""");

	int phoneBok = input.nextInt();


	switch(phoneBok){
	case 1: phoneBook();
	case 2: phoneBook();
	case 3: phoneBook();
	case 4: phoneBook();
	case 5: phoneBook();
	case 6: phoneBook();
	case 7: phoneBook();
	case 8: options();
	case 9: phoneBook();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
		phoneBook();
	

	}


}


	public static void options() {

	System.out.print("""
	 1. Type of view
	 2. Memory status
	 0. Back 
	 		"""); 

	int options = input.nextInt();


	switch(options){

	case 1: options();
	case 2: options();
	case 0: phoneBook();
	default: System.out.print("\nError\nPlease try again\n");
		options();
	}

}

public static void message(){

	System.out.print("""
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
	0. Back to main menu
			""");


	int messages = input.nextInt();


	switch(messages){
	case 1: message();
	case 2: message();
	case 3: message();
	case 4: message();
	case 5: message();
	case 6: message();
	case 7: messageSettings();
	case 8: message();
	case 9: message();
	case 10: message();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
	message();
	
	


	}
}





public static void messageSettings() {

	System.out.print("""

	1. Set
	2. Common
	0. Back
		""");

	int messageSettings = input.nextInt();
	
	switch(messageSettings) {
	case 1: set();
	case 2: common();
	case 0: message();
	default: System.out.print("\nError\nPlease try again\n");
	messageSettings();
}

}



public static void set() {

	System.out.print("""

	1. Message centre number
	2. Message sent as 
	3. Message validity
	0. Back 
			""");
	int set = input.nextInt();
		
	switch(set) {
	case 1: set();
	case 2: set();
	case 3: set();
	case 0: messageSettings();
	default: System.out.print("\nError\nPlease try again\n");
	set();
	}
}

	
public static void common() {

	System.out.print(""" 

	1. Delivery reports
	2. Reply via same centre
	3. Character support
	0. Back
			""");

	int common = input.nextInt();

	switch(common) {
	case 1: common();
	case 2: common();
	case 3: common();
	case 0: messageSettings();
	default: System.out.print("\nError\nPlease try again\n");
	common();

}

}


	


public static void chat(){
mainMenu();

}

public static void callRegister(){

System.out.print("""

	1. Missed calls
	2. Recieved calls
	3. Dialled calls
	4. Erase recent call lists
	5. Show call duration
	6. Show call cost
	7. Call cost settings
	8. Prepaid credit
	0. Back to menu
			""");

	int callRegister = input.nextInt();

	switch(callRegister) {
	case 1: callRegister();
	case 2: callRegister();
	case 3: callRegister();
	case 4: callRegister();
	case 5: showCallDuration();
	case 6: showCallCost(); 
	case 7: callCostSettings();
	case 8: callRegister();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
	callRegister();
			}

}

public static void showCallDuration(){
	System.out.print("""
	1. Last call duration
	2. All calls' duration
	3. Recieved calls' duration
	4. Dialled calls' duration
	5. Clear timers
	0. Back
		""");


	int showCallDuration = input.nextInt();
	
	switch(showCallDuration) {
	case 1: showCallDuration();
	case 2: showCallDuration();
	case 3: showCallDuration();
	case 4: showCallDuration();
	case 5: showCallDuration();
	case 0: callRegister();
	default: System.out.print("\nError\nPlease try again\n");
	showCallDuration();
		}



}

public static void showCallCost() {

	System.out.print("""
	1. Last call cost
	2. All calls' cost
	3. Clear counters
	0. Back
		""");

	int showCallCost = input.nextInt();

	switch(showCallCost) {
	case 1: showCallCost();	
	case 2: showCallCost();
	case 3: showCallCost();
	case 0: callRegister();
	default: System.out.print("\nError\nPlease try again\n");
	showCallCost();
		}
}

public static void callCostSettings() {
	
	System.out.print("""

	1. Call cost limit
	2. Show costs in
	0. Back
		""");

	int callCostSettings = input.nextInt();

	switch(callCostSettings) {
	case 1: callCostSettings();
	case 2: callCostSettings();
	case 0: callRegister();
	default: System.out.print("\nError\nPlease try again\n");
	callCostSettings();
	}


}

public static void Tones() {

	System.out.print("""

	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver
	0. Back to main menu
			""");

	int Tones = input.nextInt();
	
	switch(Tones) {
	case 1: Tones();
	case 2: Tones();
	case 3: Tones();
	case 4: Tones();
	case 5: Tones();
	case 6: Tones();
	case 7: Tones();
	case 8: Tones();
	case 9: Tones();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
	Tones();
	}

}

public static void Settings() {

	System.out.print("""
	
	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	0. Back to menu
		""");

	int Settings = input.nextInt();

	switch(Settings) {

	case 1: callSettings();
	case 2:	phoneSettings();
	case 3:	securitySettings();
	case 4: Settings();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
	Settings();
	}

}

public static void callSettings() {

	System.out.print("""
	
	1. Automatic redial
	2. Speed dialling
	3. Call waiting options
	4. Own number sending
	5. Phone line in use 
	6. Automatic answer
	0. Back
		""");

	int callSettings = input.nextInt();

	switch(callSettings) {
	case 1: callSettings();
	case 2: callSettings();
	case 3: callSettings();
	case 4: callSettings();
	case 5: callSettings();
	case 6: callSettings();
	case 0: Settings();
	default: System.out.print("\nError\nPlease try again\n");
	callSettings();
	}


}

public static void phoneSettings() {

	System.out.print("""
	
	1. Language 
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions
	0. Back	
		""");

	int phoneSettings = input.nextInt();

	switch(phoneSettings) {
	case 1: phoneSettings();
	case 2: phoneSettings();
	case 3: phoneSettings();
	case 4: phoneSettings();
	case 5: phoneSettings();
	case 6: phoneSettings();
	case 0: Settings();
	default: System.out.print("\nError\nPlease try again\n");
	phoneSettings();
	
}
}

public static void securitySettings() {
	
	System.out.print("""

	1. PIN code request
	2. Call barring service
	3. Fixed dialling
	4. Closed user group	
	5. Phone security
	6. Change access codes
	0. Back
		""");

	int securtiySettings = input.nextInt();	

	switch(securtiySettings) {

	case 1: securitySettings();
	case 2: securitySettings();
	case 3: securitySettings();
	case 4: securitySettings();
	case 5: securitySettings();
	case 6: securitySettings();
	case 0: Settings();
	default: System.out.print("\nError\nPlease try again\n");
	securitySettings();
		}


}

public static void callDivert() {
mainMenu();

}

public static void games() {
mainMenu();
}

public static void calculator() {
mainMenu();
}

public static void reminders() {
mainMenu();
}

public static void clock() {

	System.out.print("""

	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
	0. Back to menu
		""");

	int clock = input.nextInt();

	switch(clock) {
	case 1: clock();
	case 2: clock();
	case 3: clock();
	case 4: clock();
	case 5: clock();
	case 6: clock();
	case 0: mainMenu();
	default: System.out.print("\nError\nPlease try again\n");
	clock();
	}

}

public static void profiles() {
mainMenu();
}

public static void simServices() {
mainMenu();
}




public static void main(String[] args){
mainMenu();
phoneBook();;

}
}


