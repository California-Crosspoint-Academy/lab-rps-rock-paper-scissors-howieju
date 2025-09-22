// Mr. Howie Ju -- RPS v2

import java.util.Scanner;   // Import Scanner class so we can read text input from the keyboard
import java.util.Random;    // Import Random class so we can generate random numbers

public class rps2 {   // Declare a public class named RockPaperScissors
    public static void main(String[] args) {   // Main method: execution of the program starts here
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object for reading user input
        Random random = new Random();               // Create a Random object for random number generation
        String[] options = {"rock", "paper", "scissors"}; // An array holding the three valid moves

        // Print welcome messages and instructions
        System.out.println("Welcome to Rock–Paper–Scissors!");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println("Type 'end' to quit the game.\n");

        // Infinite loop so the game repeats until the user types "end"
        while (true) {
            System.out.print("Your choice: ");           // Prompt the user
            String userChoice = scanner.nextLine().toLowerCase(); // Read input and make it lowercase

            // If user types "end", break out of the loop and finish the game
            if (userChoice.equals("end")) {
                System.out.println("Game over. Thanks for playing!");
                break;   // Exit the while loop
            }

            // If the input is not one of the valid choices, tell user and restart loop
            if (!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.");
                continue;   // Skip the rest of the loop body and ask again
            }

            // Pick the computer's move at random (0, 1, or 2) from the options array
            String computerChoice = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Decide the winner
            if (userChoice.equals(computerChoice)) {   // If both are the same
                System.out.println("It's a tie!");
            } else if (                               // User wins in these 3 cases:
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {   // If it's not a tie and user didn’t win, then computer wins
                System.out.println("Computer wins!");
            }

            System.out.println(); // Print a blank line for readability between rounds
        }

        scanner.close();   // Close the scanner to release resources when game ends
    }
}
