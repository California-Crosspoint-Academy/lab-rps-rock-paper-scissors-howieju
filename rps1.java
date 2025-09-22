// Mr. Howie Ju -- RPS v1

import java.util.Scanner;          // Imports the Scanner class for reading keyboard input
import java.util.Random;           // Imports the Random class for generating random numbers

public class rps1 {   // Declares a public class named RockPaperScissors (must match filename)
    public static void main(String[] args) {   // Program entry point: the JVM starts execution here
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner object to read text input from the console
        Random random = new Random();              // Creates a Random object to generate random values

        String[] options = {"rock", "paper", "scissors"}; // An array holding the possible moves

        System.out.println("Welcome to Rock Paper Scissors!"); // Prints a welcome message
        System.out.print("Enter rock, paper, or scissors: ");  // Prompts the user for their move
        String userChoice = scanner.nextLine().toLowerCase();  // Reads a full line, converts it to lowercase

        int computerIndex = random.nextInt(3);  // Generates a random int 0, 1, or 2 (upper bound 3 is exclusive)
        String computerChoice = options[computerIndex]; // Maps that index to "rock", "paper", or "scissors"

        System.out.println("Computer chose: " + computerChoice); // Displays the computer's move

        // Compares the user's move to the computer's move to decide the outcome
        if (userChoice.equals(computerChoice)) {              // If both strings are equal, it's a tie
            System.out.println("It's a tie!");
        } else if (                                           // Otherwise, check all user-winning cases
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");                   // If any winning case is true, user wins
        } else {                                              // If not a tie and not a user win, computer wins
            System.out.println("Computer wins!");
        }

        scanner.close();                                      // Closes the Scanner to free system resources
    }
}
