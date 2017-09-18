package exercises;
import java.util.Scanner;
public class InchesToFeet {

	public static void main(String[] args) {
		final int inchesInFeet = 12;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("How many inches");
		int amountOfInches = inputDevice.nextInt();
		inputDevice.close();
		
		int numberOfFeet = amountOfInches/inchesInFeet;
		int inchesRemaining = amountOfInches%inchesInFeet;
		System.out.println("In" + amountOfInches + "inches there are " + numberOfFeet + " feet and " + inchesRemaining + "inches remaining.");

	}

}
