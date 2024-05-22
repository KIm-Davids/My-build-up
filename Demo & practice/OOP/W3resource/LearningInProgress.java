public class LearningInProgress {
	private double area;
	private double perimeter;

	public void setRectangle(double length, double breath){
		this.area = (length * breath);
		this.perimeter = (2 * (length + breath));
	}

	public double getarea(){
		return area;
	}

	public double getperimeter(){
		return perimeter;
	}
	public void Bark(){
		System.out.print("BARK !!!");	
	}
}