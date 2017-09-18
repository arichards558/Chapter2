package exercises;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		final double dozenEggPrice = 3.25;
		final double singleEggPrice = 0.45;
		final int eggsInDozen = 12;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("How many eggs?");
		int eggs = inputDevice.nextInt();
		inputDevice.close();
		
		double costOfDozens = amountOfDozens * dozenEggPrice;
		double costOfExtraEggs = remainingEggs * singleEggPrice;
		double totalPrice = costOfDozens + costofExtraEggs;
		
		System.out.println("You purchased " + eggs + "eggs, which that there are " + numberOfDozens + "dozen and " + extraEggs + "eggs at the total cost of " + totalPrice + ".");
				

	}

}
