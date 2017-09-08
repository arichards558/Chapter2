package exercises;
import java.util.Scanner;

public class QuartstoGallons {

	public static void main(String[] args) {
		final int quartsInGallons = 4;
		
		int quartsNeeded;
		int gallonsNeeded;
		int extraQuarts;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed>>>");
		quartsNeeded = input.nextInt();
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons; 
		
		System.out.println("You have " + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
		

	}

}
