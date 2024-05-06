public class FactorsOfNum1 {
	public static int factor(int num1) {

	int factor = 0;
	for(int counter = 1; counter <= num1; counter++){
		if(num1 % counter == 0){
			factor++;		
		}
		}
		
	return factor;	
	}
}