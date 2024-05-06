import java.util.Scanner;
	public class QuadraticEquation {
		public static void main(String[] args) {

	
		Scanner input = new Scanner(System.in);
	
	System.out.print("Solve your quadratic equations");

	System.out.print("");

	System.out.println("\nEnter a");
	double a = input.nextDouble();

	System.out.println("Enter b");
	double b = input.nextDouble();

	System.out.println("Enter c");
	double c = input.nextDouble();

	double b1 = b * b;
	double a1 = 4 * a * c;
	double d = -b;
	double a2 = 2 * a;
	double abc = b1 - a1;
	double abc1 = (double)Math.sqrt(abc);
	double ans = (d - abc1) / a2;
	double ans1 = (d + abc1) / a2;


	System.out.printf("x = %.2f, x = %.2f", ans1, ans);
    }
}

	
