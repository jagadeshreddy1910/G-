import java.util.Random;
import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        // Variable to store the user's guess
        int userGuess = 0;
        
        // Counter to track the number of attempts
        int attempts = 0;

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user guesses the number
        while (userGuess != numberToGuess) {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Provide feedback on whether the guess was too high, too low, or correct
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        }

        // Show the number of attempts it took to guess correctly
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");
        
        // Close the scanner
        scanner.close();
}
}
