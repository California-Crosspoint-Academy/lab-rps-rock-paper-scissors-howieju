// Mr. Howie Ju -- RPS v3

import java.util.Scanner;   // Import Scanner class so we can read text input from the keyboard
import java.util.Random;    // Import Random class so we can generate random numbers

public class rps3 {   // Declare a public class named RockPaperScissors
    public static void main(String[] args) {   // Main method: execution of the program starts here
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object for reading user input
        Random random = new Random();               // Create a Random object for random number generation
        String[] options = {"rock", "paper", "scissors"}; // An array holding the three valid moves

        int wins = 0, losses = 0, ties = 0;   // Track game scores

        // Print welcome messages and instructions
        System.out.println("Welcome to Rock–Paper–Scissors!");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println("Shortcuts: 'r' = rock, 'p' = paper, 's' = scissors.");
        System.out.println("Type 'end' to quit the game.\n");

        // Infinite loop so the game repeats until the user types "end"
        while (true) {
            System.out.print("Your choice: ");           
            String userChoice = scanner.nextLine().trim().toLowerCase(); // Read input, trim spaces, make lowercase

            // If user types "end", break out of the loop and finish the game
            if (userChoice.equals("end")) {
                System.out.println("\nGame over. Thanks for playing!");
                System.out.println("Final Score → Wins: " + wins + " | Losses: " + losses + " | Ties: " + ties);
                break;   // Exit the while loop
            }

            // Convert short keys to full words
            if (userChoice.equals("r")) userChoice = "rock";
            else if (userChoice.equals("p")) userChoice = "paper";
            else if (userChoice.equals("s")) userChoice = "scissors";

            // If the input is not one of the valid choices, tell user and restart loop
            if (!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.\n");
                continue;   // Skip the rest of the loop body and ask again
            }

            // Pick the computer's move at random (0, 1, or 2) from the options array
            String computerChoice = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Decide the winner and update scores
            if (userChoice.equals(computerChoice)) {   
                System.out.println("It's a tie!");
                ties++;
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
                wins++;
            } else {   
                System.out.println("Computer wins!");
                losses++;
            }

            // Show running score after each round
            System.out.println("Score → Wins: " + wins + " | Losses: " + losses + " | Ties: " + ties + "\n");
        }

        scanner.close();   // Close the scanner to release resources when game ends
    }
}
