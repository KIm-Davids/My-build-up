public class StudentDataBase{
	private String names;
	private int grades;
	private String courses;


	public StudentDataBase(String names, int grades, String courses){
		this.names = names;
		this.grades += grades;
		this.courses = courses;
	}
	
	public String getNames(){
		return names;
	}
	
	public int getGrades(){
		return grades;
	}
	
	public String getCourses(){
		return courses;
	}
	
	public String toString(){
		return String.format("Student Name Checker%n%n Student Name: %s%n Student Grade: %d%n Student course: %s%n", getNames(),getGrades(),getCourses());
	}
}
