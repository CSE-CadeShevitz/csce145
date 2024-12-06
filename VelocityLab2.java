import java.util.Scanner;

public class VelocityLab2 {
 public static final double acceleration = 9.8;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
		
		double initialVelocity = key.nextDouble();
		
				
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		
		double timeTaken = key.nextDouble();
		
		double finalVelocity = initialVelocity + timeTaken * acceleration;
		
		double distanceTravelled = initialVelocity * timeTaken + 0.5 * acceleration * Math.pow(timeTaken, 2);
			
			System.out.println("Final Velocity of the ball = " + finalVelocity + " m/s");
			
			System.out.println("Distance Travelled by the ball (S) = " + distanceTravelled + " meters");
	
	}

}
