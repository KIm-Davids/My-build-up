public class Rectangle {
	private String area;
	private String perimeter;

	public void setRectangle(String length, String breath){
		this.area = length * breath;
		this.perimeter = 2 * (length + breath);
	}

	public String getarea(){
		return name;
	}

	public String getperimeter(){
		return breed;
	}
	public void Bark(){
		System.out.print("BARK !!!");	
	}
}