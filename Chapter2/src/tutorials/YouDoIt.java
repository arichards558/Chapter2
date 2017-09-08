package tutorials;
import java.util.Scanner; 

public class YouDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.println("Please enter a byte integer >> ");
		aByte = input.nextByte();
		System.out.println("Please enter a short integer >> ");
		aShort = input.nextShort();
		System.out.println("Please enter a long integer >> ");
		aLong = input.nextLong();
		
		System.out.print("Please enter your name >> ");
		input.nextLine();
		name = input.nextLine();
		System.out.println("Thank you, " + name);
		
		
		
				

	}

}
