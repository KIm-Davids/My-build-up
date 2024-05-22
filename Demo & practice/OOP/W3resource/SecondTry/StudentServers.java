import java.util.*;
public class StudentServers{
	
	private List <StudentDataBase> studentDataBase  = new ArrayList <>();
	
	public void addNames(StudentDataBase names){
		studentDataBase.add(names);
	}
	
	public void addGrades(StudentDataBase grades){
		studentDataBase.add(grades);
	}
	
	public void addCourses(StudentDataBase courses){
		studentDataBase.add(courses);
	}
	
	public void removeNames(StudentDataBase names){
		studentDataBase.remove(names);
	}
	
	public void removeGrades(StudentDataBase grades){
		studentDataBase.remove(grades);
	}
	
	public void removeCourses(StudentDataBase courses){
		studentDataBase.remove(courses);
	}
	
	public String toString(){
		return String.valueOf(studentDataBase);
	}
}	