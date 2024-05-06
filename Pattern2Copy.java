public class Pattern2Copy {
	public static void main(String[] args) {

	int i = 0;
	int j = 0;

	for(i = 6; i >= 1; i--) {
		for(j = 1; j <= i; j++) {
		System.out.print(j);
		}
		System.out.println("  ");
		}
	}
}