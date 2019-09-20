import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int userChoice;
		double height;
		double weight;
		double bmi;
		
		System.out.println("1. Weight in Pounds and Height in Inches");
		System.out.println("2. Weight in Kilograms and height in Meters\n");
		System.out.print("Please enter which set of units you want to use: ");
		userChoice = scnr.nextInt();
		
		if(userChoice == 1) {
			System.out.print("\nPlease enter the weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.print("\nPlease enter the height in inches: ");
			height = scnr.nextDouble();
			bmi = ((703 * weight) / Math.pow(height, 2.0));
			System.out.printf("\nYour BMI is: %.2f",bmi);
		}
		
		if(userChoice == 2) {
			System.out.print("\nPlease enter the weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.print("\nPlease enter the height in meters: ");
			height = scnr.nextDouble();
			bmi = ((weight) / Math.pow(height, 2.0));
			System.out.printf("\n Your BMI is: %.2f",bmi);
		}
		
		if (userChoice != 1 && userChoice!= 2) {
			System.out.println("Please enter 1 or 2");
		}
		
		System.out.println("\n\nBMI Chart");
		System.out.println("------------------------");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal Weight = 18.5 - 24.9");
		System.out.println("Overweight = 25.0 - 29.9");
		System.out.println("Obese = > 30.0");

	}

}
