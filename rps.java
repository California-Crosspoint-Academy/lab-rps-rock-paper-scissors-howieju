// NAME:                          -- RPS v3 QUIZ

import java.util.Scanner;
import java.util.Random;

public class rps3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object for reading user input
        Random random = new Random();               // Create a Random object for random number generation
        String[] options = {"rock", "paper", "scissors"}; // An array holding the three valid moves

      int wins = 0, losses = 0, ties = 0;   //// QUESTION 1

        //// QUESTION 2
        System.out.println("Welcome to Rock–Paper–Scissors!");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println("Shortcuts: 'r' = rock, 'p' = paper, 's' = scissors.");
        System.out.println("Type 'end' to quit the game.\n");

        // Infinite loop so the game repeats until the user types "end"
        ______ (______) { //// QUESTION 3: Fill in the 2 blanks. Which loops and condition(s) to fill in here?
            System.out.print("Your choice: ");           
            String userChoice = scanner.nextLine().trim().toLowerCase(); // Read input, trim spaces, make lowercase

            // If user types "end", break out of the loop and finish the game
            if (                               ) { //// QUESTION 4: Fill in the blank. Write the expression to end the game.
                System.out.println("\nGame over. Thanks for playing!");
                System.out.println("Final Score → Wins: " + wins + " | Losses: " + losses + " | Ties: " + ties);
                break;   // Exit the while loop
            }

            //// QUESTION 5: Explain what this logic is doing 
            if (userChoice.equals("r")) userChoice = "rock";
            else if (userChoice.equals("p")) userChoice = "paper";
            else if (userChoice.equals("s")) userChoice = "scissors";

            //// QUESTION 6: Explain what this logic is doing
            if (!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.\n");
                continue;   // Skip the rest of the loop body and ask again
            }

            // Pick the computer's move at random (0, 1, or 2) from the options array
            String computerChoice = options[random.nextInt(3)]; //// QUESTION 7: Explain what this line of code is doing.
            System.out.println("Computer chose: " + _________________________); //// QUESTION 8: Fill in the blank. Which variable type do you use here?

            // Decide the winner and update scores
            if (userChoice.equals(computerChoice)) {   
                System.out.println("It's a tie!");
                ties++;
            } else if ( //// QUESTION 8: Fill in the blank.
                (userChoice.equals("___________") && computerChoice.equals("___________")) ||
                (userChoice.equals("___________") && computerChoice.equals("___________")) ||
                (userChoice.equals("___________") && computerChoice.equals("___________"))
            ) { //// QUESTION 9: What is this section doing?
                System.out.println("You win!");
                wins++;
            } else { 
                System.out.println("Computer wins!");
                losses++; 
            }

            // Show running score after each round 
            System.out.println(_______________________________________________________________________); //// EXTRA CREDIT QUESTION: Write down all the strings and variables that goes inside this argument. 
        }

        scanner._________;   // Close the scanner to release resources when the game ends. //// QUESTION 10: Which method do you use to close the scanner?
    }
}
