import java.util.Scanner;
public class EmployeeChecker{
	private static EmployeeStore employeeStore = new EmployeeStore();
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter employee name");
			String employeeName = input.nextLine();
			
			System.out.println("Enter employee title");
			String employeeTitle = input.nextLine();
			
			System.out.print("Enter employee salary");
			String employeeSalary = input.next();
			
			EmployeeDataCollection collections = new EmployeeDataCollection(employeeName, employeeTitle, employeeSalary); 
			employeeStore.addNames(collections);
			
			System.out.print(employeeStore);

		}
}