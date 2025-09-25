// NAME:                          -- RPS v3 QUIZ

import java.util.Scanner;
import java.util.Random;

public class rps3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object for reading user input
        Random random = new Random();               // Create a Random object for random number generation
        String[] options = {"rock", "paper", "scissors"}; // An array holding the three valid moves

      int wins = 0, losses = 0, ties = 0;   //// QUESTION 1: Comment what this line of code does

        System.out.println("Welcome to Rock–Paper–Scissors!");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println("Shortcuts: 'r' = rock, 'p' = paper, 's' = scissors.");
        System.out.println("Type 'end' to quit the game.\n");

        // Infinite loop so the game repeats until the user types "end"
        ______ (______) { //// QUESTION 2: Fill in the 2 blanks. Which loops and condition(s) to fill in here?
            System.out.print("Your choice: ");           
            String userChoice = scanner.nextLine().trim().toLowerCase(); // Read input, trim spaces, make lowercase

            // If user types "end", break out of the loop and finish the game
            if (______________________________) { //// QUESTION 3: Fill in the blank. Write the expression to end the game.
                System.out.println("\nGame over. Thanks for playing!");
                System.out.println("Final Score → Wins: " + wins + " | Losses: " + losses + " | Ties: " + ties);
                break;   // Exit the while loop
            }

            //// QUESTION 4: Explain what this logic is doing 
            if (userChoice.equals("r")) userChoice = "rock";
            else if (userChoice.equals("p")) userChoice = "paper";
            else if (userChoice.equals("s")) userChoice = "scissors";

            //// QUESTION 5: Explain what this logic is doing
            if (!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.\n");
                continue;   // Skip the rest of the loop body and ask again
            }

            String computerChoice = options[random.nextInt(3)]; //// QUESTION 6: Explain what this line of code is doing.
            System.out.println("Computer chose: " + _________________________); //// QUESTION 7a: Fill in the blank. Which variable type do you use here?

            // Decide the winner and update scores
            if (userChoice.equals(_________________________)) {   //// QUESTION 7b: Fill in the blank. Which variable type do you use here? 
                System.out.println("It's a tie!");
                ties++;
            } else if ( //// QUESTION 8: Fill in the blank for this section below. Write the logic for all the winning combinations with the appropriate bitwise operators
                (userChoice.equals("___________") ____ computerChoice.equals("___________")) ____
                (userChoice.equals("___________") ____ computerChoice.equals("___________")) ____
                (userChoice.equals("___________") ____ computerChoice.equals("___________"))
            ) { 
                //// QUESTION 9a: Write the code to output "You Win" and increase winning score by 1

            } else { 
                //// QUESTION 9b: Write the code to output "You Lose" and increase winning losing by 1

            }

            // Show running score after each round 
            //// QUESTION 10: Write down all the strings and variables that goes inside this argument.  
            System.out.println(_______________________________________________________________________); 
        }

        scanner._________;   // Close the scanner to release resources when the game ends. //// QUESTION 11: Which method do you use to close the scanner?
    }
}