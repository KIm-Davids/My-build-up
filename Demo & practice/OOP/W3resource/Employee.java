import java.util.ArrayList;
import java.util.Scanner;
public class Employee{
	private static EmployeeCollection employees = new EmployeeCollection();
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		String name  = "";
		String jobTitle = "";
		String salary = "";
		String promptUser = "";

		while(!promptUser.equals("no")){
		
		System.out.println("Enter employee name");
		name = input.next();

		System.out.println("Enter job title");
		jobTitle = input.next();

		System.out.println("Enter salary");
		salary = input.next();

		System.out.print("Would you like to continue ?");
		promptUser = input.next();
				
		EmployeeDatabase employeesList = new EmployeeDatabase(name, jobTitle, salary);
		employees.addNames(employeesList);		

		}

		for(int counter = 0; counter < 1; counter++){
		System.out.println(employees);
		}
	}	
}