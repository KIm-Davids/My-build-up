public class Chinedu {
	public static void main(String[] args) {


	int[] array = {2,1,2,3,4};
	int i = 0;
	int j = 0;
	int number1 = 0;
	//int number1 = 0;
	int maxFrequency = 0;

	
	for(j = 0; j < array.length; j++) {

	//index 4

	if(array[0] == array[4]){
	number1 = array[0];
	}
	if(array[1] == array[4]){
	number1 = array[1];
	}

	if(array[2] == array[4]){
	number1 = array[2];
	}
	
	if(array[3] == array[4]){
	number1 = array[3];
	}

	// index 3

	if(array[0] == array[3]){
	number1 = array[0];
	}

	if(array[1] == array[3]){
	number1 = array[1];
	}
	
	if(array[2] == array[3]){
	number1 = array[2];
	}
	
	if(array[4] == array[3]){
	number1 = array[4];
	}	


	//index 2

	if(array[0] == array[2]){
	number1 = array[0];
	}

	if(array[1] == array[2]){
	number1 = array[1];
	}
	
	
	if(array[3] == array[2]){
	number1 = array[3];
	}

	if(array[4] == array[2]){
	number1 = array[4];
	}

	//index 1
	
	if(array[0] == array[1]){
	number1 = array[0];
	}

	if(array[2] == array[1]){
	number1 = array[2];
	}
	
	if(array[3] == array[1]){
	number1 = array[3];
	}

	if(array[4] == array[1]){
	number1 = array[4];
	}


	//index 0

	
	if(array[1] == array[0]){
	number1 = array[1];
	}

	if(array[2] == array[0]){
	number1 = array[2];
	}
	
	
	if(array[3] == array[0]){
	number1 = array[3];
	}

	if(array[4] == array[0]){
	number1 = array[4];
	}







		//number1 = array[2];
		//number1 = array[3];

	


}

	System.out.println(number1);
	//System.out.println(number1);
}
}
	