package exercises;
import java.util.Scanner; 

public class NauticalMiles {

	public static void main(String[] args) {
		final double kilometersinNauticalMiles = 1.852;
		final double milesInNauticalMiles = 1.15; 
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter nautical miles needed");
		double nauticalMiles = inputDevice.nextDouble();
		inputDevice.close();
		
		double kilometers = nauticalMiles * kilometersinNauticalMiles;
		double miles = nauticalMiles * milesInNauticalMiles;
		System.out.println("In " + nauticalMiles + "there is " + kilometers + " kilometers and " + miles + "miles." );
		
				
		
		
	}

}
