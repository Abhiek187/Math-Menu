import java.util.Scanner;

public class Menu {

	public static void main(String [] args) {
		int choice;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("1. Pythagorean thm (hyp only)");
		System.out.println("2. Pythagorean thm (finding a side)");
		System.out.println("3. quadratic formula");
		System.out.println("4. factorial");
		System.out.println("5. combinations");
		System.out.println("6. permutations");
		System.out.println("7. average");
		System.out.println("8. roll a di");
		System.out.println("9. end");
		System.out.println("10. grades");
		System.out.print("Please choose an option from above: ");
		choice = reader.nextInt();
		
		while (choice != 9) {
			if (choice < 1 || choice > 10) {
				System.out.println("Sorry, try again.");
			}
			
			else if (choice == 1) {
				double hyp = MathMethods.hyp();
				System.out.println("The hypotenuse is " + hyp);
			}
			
			else if (choice == 2) {
				double side = MathMethods.side();
				System.out.println("The remaining side is: " + side);
			}
			
			else if (choice == 3) {
				double[] x = MathMethods.quadratic();
				System.out.println("x = " + x[0] + " or " + x[1]);
			}
			
			else if (choice == 4) {
				System.out.print("Enter a number: ");
				int n = reader.nextInt();
				double fact = MathMethods.factorial(n);
				System.out.println(n + "! = " + fact);
			}
			
			else if (choice == 5) {
				System.out.print("Based on formula nCr, enter n: ");
				int n = reader.nextInt();
				System.out.print("Enter r: ");
				int r = reader.nextInt();
				double nfact = MathMethods.factorial(n);
				double subfact = MathMethods.factorial(n - r);
				double rfact = MathMethods.factorial(r);
				double combination = nfact/subfact/rfact;
				System.out.println(n + "C" + r + " = " + combination);
			}
			
			else if (choice == 6) {
				System.out.print("Based on formula nPr, enter n: ");
				int n = reader.nextInt();
				System.out.print("Enter r: ");
				int r = reader.nextInt();
				double nfact = MathMethods.factorial(n);
				double subfact = MathMethods.factorial(n - r);
				double permutation = nfact/subfact;
				System.out.println(n + "P" + r + " = " + permutation);
			}
			
			else if (choice == 7) {
				double avg = MathMethods.average();
				System.out.println("The average is " + avg);
			}
			
			else if (choice == 8) {
				System.out.print("How many times will you roll the die? ");
				int rolls = reader.nextInt();
				for (int i = 0; i < rolls; i++) {
					int number = MathMethods.di();
					System.out.println("You rolled a " + number);
				}
			}
			
			else if (choice == 10) {
				System.out.print("Enter your numeric grade: ");
				double percent = reader.nextDouble();
				char grade = MathMethods.grade(percent);
				System.out.println("You got a(n) " + grade);
			}
			
			System.out.print("Please choose another number from the list above: ");
			choice = reader.nextInt();
		}
		
		System.out.println("You've chosen to end.");
		reader.close();

	}

}
