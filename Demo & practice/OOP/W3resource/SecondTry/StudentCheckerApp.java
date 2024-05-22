import java.util.Scanner;
public class StudentCheckerApp{
	private static StudentServers studentServers = new StudentServers();
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		int grades = 0;
		System.out.print("How many students ?");
		int howManyStudents = input.nextInt();
				
		for(int counter = 0; counter < howManyStudents; counter++){
		System.out.print("Enter a student name");
		String studentNames = input.next();

		System.out.print("Enter the student grade");
		int studentGrade = input.nextInt();
		
		System.out.print("Enter a course");
		String studentCourse = input.next();
			
		if(studentNames == studentNames){
			grades = grades + studentGrade;			
		}	
			
		StudentDataBase studentDataBase = new StudentDataBase(studentNames, grades, studentCourse);
		studentServers.addNames(studentDataBase);
		}
		System.out.print(studentServers);
		}
}