//Cade Shevitz
package lab5;
import java.util.Scanner;
public class lab5code {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
	System.out.println("How much money would you like to spend at the vending machine?");
	//allows user to input their money value
	int money = key.nextInt();
	int coupon = 0;
	int chocolateBars = 0;
//every time money is greater than 0 I want this loop to run
while(money > 0)
{

	if(money > 0 || coupon >= 6)
	{
	//if money is greater then 0 I want to add a chocolate bar
	chocolateBars = chocolateBars + 1;
	//you must subtract money after each purchase the loop isn't infinite
	money = money - 1;
	coupon = coupon + 1;
	}
	if(coupon >= 6)
	{
		//if coupon >= 6 you can redeem it for one chocolate bar
	chocolateBars = chocolateBars + 1;
	//subtract 5 coupons because you used 6 but gain 1 for the purchase
	coupon = coupon - 5;
	}
}
//prints to console amount of chocolate a user has and coupons a user has
System.out.println("You have " + chocolateBars + " chocolate bars, and " + coupon + " leftover coupons.");
	}
}
