import java.util.Scanner;
import java.util.Random;

public class elemental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"lightning", "water", "fire", "earth"};
        int wins = 0, losses = 0, ties = 0;

        System.out.println("Welcome to ELEMENTAL Game!");

        while (true) {
            // Show instructions and rules every round
            System.out.println("====== Instructions ======");
            System.out.println("Type 'lightning', 'water', 'fire', or 'earth' to play.");
            System.out.println("Shortcuts: l=lightning, w=water, f=fire, e=earth");
            System.out.println();
            System.out.println("How results are decided:");
            System.out.println("• Lightning>>Water Water>>Fire Fire>>Earth Earth>>Lightning");
            System.out.println("• Same choice = tie");
            System.out.println("• Lightning vs Fire and Water vs Earth = coin toss (50/50)");
            System.out.println();
            System.out.println("Type 'end' to quit.\n");
            System.out.println("==========================\n");

            // Prompt without "Your choice"
            System.out.print("> ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (userChoice.equals("end")) {
                System.out.println("\nGame over!");
                System.out.println("Final Score → Wins: " + wins + " | Losses: " + losses + " | Ties: " + ties);
                break;
            }

            // Shortcuts
            if (userChoice.equals("l")) userChoice = "lightning";
            else if (userChoice.equals("w")) userChoice = "water";
            else if (userChoice.equals("f")) userChoice = "fire";
            else if (userChoice.equals("e")) userChoice = "earth";

            if (!userChoice.equals("lightning") && !userChoice.equals("water") &&
                !userChoice.equals("fire") && !userChoice.equals("earth")) {
                System.out.println("Invalid choice! Try again.\n");
                continue;
            }

            String computerChoice = options[random.nextInt(4)];
            String resultMessage;

            // Same choice → tie
            if (userChoice.equals(computerChoice)) {
                resultMessage = "It's a tie!";
                ties++;
            }
            // Coin toss: Lightning vs Fire
            else if (
                (userChoice.equals("lightning") && computerChoice.equals("fire")) ||
                (userChoice.equals("fire") && computerChoice.equals("lightning"))
            ) {
                boolean userWins = random.nextBoolean();
                if (userWins) {
                    resultMessage = "Coin toss! You win!";
                    wins++;
                } else {
                    resultMessage = "Coin toss! Computer wins!";
                    losses++;
                }
            }
            // Coin toss: Water vs Earth
            else if (
                (userChoice.equals("water") && computerChoice.equals("earth")) ||
                (userChoice.equals("earth") && computerChoice.equals("water"))
            ) {
                boolean userWins = random.nextBoolean();
                if (userWins) {
                    resultMessage = "Coin toss! You win!";
                    wins++;
                } else {
                    resultMessage = "Coin toss! Computer wins!";
                    losses++;
                }
            }
            // Normal cycle:
            // Lightning beats Water
            // Water beats Fire
            // Fire beats Earth
            // Earth beats Lightning
            else if (
                (userChoice.equals("lightning") && computerChoice.equals("water")) ||
                (userChoice.equals("water") && computerChoice.equals("fire")) ||
                (userChoice.equals("fire") && computerChoice.equals("earth")) ||
                (userChoice.equals("earth") && computerChoice.equals("lightning"))
            ) {
                resultMessage = "You win!";
                wins++;
            } else {
                resultMessage = "Bot wins!";
                losses++;
            }

            // Result on top, then blank line, then choices
            System.out.println(resultMessage);
            System.out.println();
            System.out.println("You chose: " + userChoice);
            System.out.println("Bot chose: " + computerChoice);
            System.out.println();
            System.out.println("Score → You: " + wins + " | Bot: " + losses + " | Ties: " + ties + "\n");
            System.out.println();

            // Pause 2 seconds before next round
            try {
                Thread.sleep(2000); // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                // Ignore interruption and continue
            }
        }

        scanner.close();
    }
}