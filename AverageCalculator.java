
import java.util.Scanner;
public class AverageCalculator{
	public static void printAverage(int a, int b) {

int avg = (a+b) / 2;

System.out.println("The average is: " + avg);
	}


public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a score ");
int num1 = input.nextInt();

System.out.print("Enter a score - b ");
int num2 = input.nextInt();

printAverage(num1,num2);


	int score1 = 15;
	int score2 = 25;
printAverage(score1,score2);

	int score3 = 30;
	int score4 = 50;
printAverage(score3,score4);

	int score5 = 70;
	int score6 = 90;
printAverage(score5,score6);

}


}