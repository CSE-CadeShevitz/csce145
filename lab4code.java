//Cade Shevitz CSCE145-001
import java.util.Scanner;
public class lab4code {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many books did you purchase at BN booksellers this month?");
		int books = key.nextInt();
		int points = 0;
	//Checking to make sure the books entered by the user is not negative
	if(books < 0)
	{
		System.out.println("That is an invalid number of books, exiting code!");
		System.exit(0);
	}
	else
	{
		switch(books)
		{
		case 0:
			points = 0;
			break;
		case 1:
			points = 5;
			break;
		case 2:
			points = 15;
			break;
		case 3:
			points = 30;
			break;
		default:
			points = 60;
			break;
		}	
	}
System.out.println("Congrats you have earned " + points + " points! \n" +
	"You may redeem these points on your next book store purchase.");
	
	
	}
}