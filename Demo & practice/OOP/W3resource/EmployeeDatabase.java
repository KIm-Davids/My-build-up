public class EmployeeDatabase {

	private String name;
	private String jobTitle;
	private String salary;

	public EmployeeDatabase(String name, String jobTitle, String salary){
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName(){
		return name;
	}

	public String getJobTitle(){
		return jobTitle;
	}

	public String getSalary(){
		return salary;
	}
	
	public String toString(){
		return String.format("Employee Name: %s%n Employee Job Title: %s%n Employee Salary: %s%n", getName(), getJobTitle(), getSalary());
	}
}