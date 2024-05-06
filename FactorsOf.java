public class FactorsOf {
	public static int factor(int a) {

	int factor = 1;

	for(factor = 1; factor <= a; factor++){
		if(a % factor == 0){
		return a;
		}
		}
	}
}