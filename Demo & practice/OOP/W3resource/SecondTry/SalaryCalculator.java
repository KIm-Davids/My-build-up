import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class SalaryCalculator{
	
	private String name;
	private int salary;
	private LocalDate hireDate;
	private LocalDate beginningYear;
	private int salaryAccrued;
	
	public SalaryCalculator(String name, int employeeSalary, LocalDate year, LocalDate yearsOfService, int daysOfService){
		this.name = name;
		this.salary = salary + employeeSalary;
		this.beginningYear = year;
		this.hireDate = yearsOfService;	
		this.salaryAccrued = daysOfService * employeeSalary;
	}
	
	public String getName(){
		return name;		
	}
	
	public int getSalary(){
		return salary;
	}
	
	public LocalDate getHireDate(){
		return hireDate;
	}
	
	public LocalDate getYear(){
		return beginningYear;		
	}
	public String toString(){
		return String.format("Name: " + name + "%nBeginning date " +  beginningYear + " %nYears Of Service: " + hireDate + "%nSalary Amount: " + salaryAccrued);
	}
}