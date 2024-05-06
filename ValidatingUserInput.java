import java.util.Scanner;
public class ValidatingUserInput {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pass = 0;
		int fail = 0;
		int number = 0;
			
	
		while (number<1) {
		System.out.print("Enter result (1 =pass,  2 = fail): ");
		int studentResult = input.nextInt();
		if(studentResult==1){
		pass = pass + 1;
		number++;
		}if(studentResult==2){
		fail = fail + 1;
		number++;
		}
		}
		System.out.println("Passed: "+ pass);
		System.out.println("Failed: "+ fail);
		if(pass>8) System.out.print("Bonus to instructor ! \n");	
		
	}
}
		
		