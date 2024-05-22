public class EmployeeDataCollection {
	private String name;
	private String jobTitle;
	private String salary;
	
	public EmployeeDataCollection(String name, String jobTitle, String salary){
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
		return String.format("Employee Details %n%n Employee name %s%n Employee Job Title: %s%n  Employee salary %s%n",getName(), getJobTitle(),getSalary());
	}
}