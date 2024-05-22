import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class SalaryCalculatorApp{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee name");
		String name = input.nextLine();
		
		System.out.println("Enter employee salary");
		int salary =  input.nextInt();
		
		System.out.println("Enter the day");
		int day = input.nextInt();
		
		System.out.println("Enter the month");
		int month = input.nextInt();
		
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		System.out.println("How many days of service ?");
		int daysOfService = input.nextInt();
		
		LocalDate date = LocalDate.of(year,month,day);
		LocalDate plusUserInputDay = date.plusYears(daysOfService);
		
		SalaryCalculator salaryCalculator = new SalaryCalculator(name, salary, date, plusUserInputDay, daysOfService); 
	//	System.out.print("Date Of Employment: " + date);
		System.out.println(salaryCalculator);
	}
}