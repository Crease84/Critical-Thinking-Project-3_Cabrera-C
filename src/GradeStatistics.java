/*
* Christopher Cabrera
* October 5th, 2025
* CSU Global CSC320-1 Programming I
* Grade statistics using a For Loop
* Prints the average, maximum, and minimum grades from 10 user-inputted floating point numbers
*/
import java.util.Scanner;

public class GradeStatistics {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		final int NUM_GRADES = 10;
		
		double userInput;
		double gradeAvg;
		double gradeMax = 0.0;
		double gradeMin = 0.0;
		double gradeTotal = 0.0;
		
		for (int i = 1; i <= NUM_GRADES; i++) {
			System.out.println("Enter grade #" + i + ":");
			userInput = scnr.nextDouble();
			gradeTotal = gradeTotal + userInput;
			
			if (i == 1) {
				gradeMax = userInput;
				gradeMin = userInput;
			}
			else if (userInput > gradeMax) {
				gradeMax = userInput;
			}
			else if (userInput < gradeMin) {
				gradeMin = userInput;
			}
				
			}
			
		gradeAvg = gradeTotal/NUM_GRADES;
		
		System.out.printf("Grade Average: %.2f%n", gradeAvg);
		System.out.printf("Highest Grade: %.2f%n", gradeMax);
		System.out.printf("Lowest Grade: %.2f%n", gradeMin);
		

	}

}