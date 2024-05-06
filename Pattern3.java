public class Pattern3 {
	public static void main(String[] args) {	

	int i = 0;
	int j = 0;
	int k = 2 * 6 + 2;
		
	for(i = 6; i >= 1; i--) {
		for(j = 1; j <= k; j++) {
			System.out.print(" ");
			}
			k = k - 2;
		
		for(j = 1; j <= i; j++) {
			System.out.print(j);
			}
			System.out.println();
			}
	}
	
	
}