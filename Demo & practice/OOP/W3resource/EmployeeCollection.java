import java.util.*;
public class EmployeeCollection {

	private List < EmployeeDatabase > collectionList = new ArrayList <>();

	public void addNames(EmployeeDatabase names){
		this.collectionList.add(names);
	}

	public void addTitle(EmployeeDatabase title){
		this.collectionList.add(title);
	}

	public void addSalary(EmployeeDatabase salary){
		this.collectionList.add(salary);
	}

	public void removeNames(EmployeeDatabase names){
		this.collectionList.remove(names);
	}

	public void removeTitle(EmployeeDatabase title){
		this.collectionList.remove(title);
	}

	public void removeSalary(EmployeeDatabase salary){
		this.collectionList.remove(salary);
	}

	public String toString(){
		return String.valueOf(collectionList);
	}
}