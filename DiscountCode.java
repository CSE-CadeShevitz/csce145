import java.util.Scanner;

class DiscountCode {

	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	
		System.out.println("Enter the total number of packages ordered: ");
	
			int numOrder = key.nextInt();
			double discount = 1;
			

		if (numOrder <= 0)
		{
			System.out.println("That is an invalid number of packages!");
			System.exit(0);
		}
		else if (numOrder < 10) 
		{                                                                                                                                                                                                         
			System.out.println("Amount of discount: 0%");
			System.out.println("Total bill amount before discount: " + "$" + numOrder * 99);
			System.out.println("Total bill amount after discount: " + "$" + numOrder * 99 * discount);
				}
		else if (numOrder >= 10 && numOrder <= 19)
		{
		discount = 0.8;
		System.out.println("Amount of discount: 20%");
		System.out.println("Total bill amount before discount: " + "$" + numOrder * 99);
		System.out.println("Total bill amount after discount: " + "$" + numOrder * 99 * discount);
		}
		else if (numOrder >= 20 && numOrder <= 49)
		{
			discount = 0.7;
			System.out.println("Amount of discount: 30%");
			System.out.println("Total bill amount before discount: " + "$" + numOrder * 99);
			System.out.println("Total bill amount after discount: " + "$" + numOrder * 99 * discount);
		}
		else if (numOrder >= 50 && numOrder <= 99)
		{
			discount = 0.6;
			System.out.println("Amount of discount: 40%");
			System.out.println("Total bill amount before discount: " + "$" + numOrder * 99);
			System.out.println("Total bill amount after discount: " + "$" + numOrder * 99 * discount);
		}
		else if (numOrder >= 100)
		{
			discount = 0.5;
			System.out.println("Amount of discount: 50%");
			System.out.println("Total bill amount before discount: " + "$" + numOrder * 99);
			System.out.println("Total bill amount after discount: " + "$" + numOrder * 99 * discount);
		}
		
	}
}
