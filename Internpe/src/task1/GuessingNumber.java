package task1;
//Java program for the above approach
import java.util.Scanner;

public class GuessingNumber {

	// Function that implements the
	// number guessing game
	public static void
	guessingNumberGame()
	{
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		//The approach is to generate a random number using Math.random() method in Java.
		int number = 1 + (int)(100
							* Math.random());

		// Given K trials
		int K = 5;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 5 trials.");

		// Iterate over K Trials
		//Now using a loop, take K input from the user and for each input print whether the number is smaller or larger than the actual number.
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			//If within K trials the user guessed the number correctly, print that the user won.
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			//Else print that he was not able to guess and then print the actual number.
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted"
				+ " K trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	// Driver Code
	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}

