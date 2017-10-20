import java.util.Scanner;
import java.util.Random;

public class MathMethods {
	static Scanner reader = new Scanner(System.in);

	public static double hyp() {
		System.out.print("Enter side 1: ");
		int side1 = reader.nextInt();
		System.out.print("Enter side 2: ");
		int side2 = reader.nextInt();
		return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
	}
	
	public static double side() {
		System.out.print("Enter side: ");
		int side = reader.nextInt();
		System.out.print("Enter hypotenuse: ");
		int hyp = reader.nextInt();
		return Math.sqrt(Math.pow(hyp,2) - Math.pow(side,2));
	}
	
	public static double[] quadratic() {
		System.out.print("Based on formula ax^2 + bx + c, enter a: ");
		int a = reader.nextInt();
		System.out.print("Enter b: ");
		int b = reader.nextInt();
		System.out.print("Enter c: ");
		int c = reader.nextInt();
		double[] x = new double[2];
		x[0] = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		x[1] = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		return x;
	}
	
	public static double factorial(int n) {
		for (int i = n; i > 1; i--)
			n *= i - 1;
		return n;
	}
	
	public static double average() {
		System.out.print("How many numbers in the set? ");
		int n = reader.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter number: ");
			sum += reader.nextInt();
		}
		return sum/n;
	}
	
	public static int di() {
		Random rand = new Random();
		int number = rand.nextInt(6) + 1;
		return number;
	}
	
	public static char grade(double percent) {
		if (percent < 62)
			return 'F';
		else if (percent >= 62 && percent < 70)
			return 'D';
		else if (percent >= 70 && percent < 80)
			return 'C';
		else if (percent >= 80 && percent < 90)
			return 'B';
		else
			return 'A';
	}

}
