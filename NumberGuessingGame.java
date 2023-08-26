package task1;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        
        int lowBound = 1;
        int uppBound = 100;
        int maxAttempts = 5; // You can adjust this as needed
        int score = 0;
        
        boolean playAgain = true;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (playAgain) {
            int targetNumber = random.nextInt(uppBound - lowBound + 1) + lowBound;
            System.out.println("We've selected a number between " + lowBound + " and " + uppBound + ". Try to guess it!");
            
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts < maxAttempts) {
                System.out.print("What is your guess: ");
                int userGuess = scn.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is less");
                } else {
                    System.out.println("Your guess is more");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you were not able to guess the number. The correct number was: " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = scn.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        }
        
        System.out.println("Thankyou for playing! Your final score: " + score);
        scn.close();
    }
}

