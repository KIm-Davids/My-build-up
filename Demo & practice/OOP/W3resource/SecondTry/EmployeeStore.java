import java.util.*;
public class EmployeeStore{
	private List < EmployeeDataCollection > employeeCollector = new ArrayList<>();
	
	public void addNames(EmployeeDataCollection names){
		employeeCollector.add(names);
	}
	
	public void addJobTitle(EmployeeDataCollection jobTitle){
		employeeCollector.add(jobTitle);		
	}
	
	public void addSalary(EmployeeDataCollection salary){
		employeeCollector.add(salary);		
	}
	
	public void removeNames(EmployeeDataCollection names){
		employeeCollector.remove(names);
	}
	
	public void  removeJobTitle(EmployeeDataCollection jobTitle){
		employeeCollector.remove(jobTitle);		
	}
	
	public void  removeSalary(EmployeeDataCollection salary){
		employeeCollector.remove(salary);		
	}
	
	public String toString(){
		return String.valueOf(employeeCollector);
	}
}