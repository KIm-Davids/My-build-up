import java.util.Scanner;
	public class NewPalindrome {
		public static void main(String[] args) {



		Scanner input = new Scanner(System.in);
		int firstDigit = 0;
		int secondDigit = 0;
		int thirdDigit = 0;
		int fourthDigit = 0;
		int fifthDigit = 0;

		System.out.print("Enter a 5 digit number");
		int number = input.nextInt();

		
		firstDigit = number / 10000 % 1000 % 100;
		secondDigit = number / 1000 % 100 % 10;
		thirdDigit = number / 100 % 10;
		fourthDigit = number / 10 % 10;
		fifthDigit = number % 10;

		System.out.println(secondDigit);


		if(firstDigit == fifthDigit && secondDigit == fourthDigit){ 
		System.out.print("IT IS A PALINDROME !!!");
		}
		if(firstDigit != fifthDigit || secondDigit != fourthDigit){ 
		System.out.println("IT IS NOT A PALINDROME !!!");
		}
		}
}	