import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class SevenSegmentDisplay {
	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	String[][] column = {{" ___ ","___ ","___"}, {"_","_","_"},{"_","_","_"}};
	String[][] row = {{"|","|","|"},{"|","|","|"}};
	//String[][] backSlash = {{"\",\"
	
	System.out.print("What number would you like to print ?");
	int numberToPrint = input.nextInt();
	
	int counter;
	int j;
	int minusNumber = 1;
	
	
	//Number 3
	
	
	
	if(numberToPrint == 11110011) {
	for(counter = 0; counter < 3 - 1; counter++) {
	System.out.println(column[0][0] + column[0][1]);
	//System.out.println();
	
	for(j = 0; j < 2; j++) {
	System.out.println();
	System.out.print("\t" + row[0][1]);
	System.out.println();
	}
}
	System.out.println(column[0][0] + column[0][1]);
}
	
	if(numberToPrint == 11110010) {
			System.out.print("Pls try again");
		}
	
	if(numberToPrint == 01100001) {
	for(counter = 0; counter < 3 ; counter++) {
	System.out.println("\n" + row[0] + row[1]);
	//System.out.println();
	
}
	}
	
	
	}
	
	
	}