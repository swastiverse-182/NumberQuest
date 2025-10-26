import java.util.Scanner;
import java.util.Random;

public class NumberQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("** Welcome to NumberQuest! **");
        System.out.println("Your mission: Guess the hidden number and complete the quest!");

        // User sets the range
        System.out.print("Enter the minimum number for your quest: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum number for your quest: ");
        int max = sc.nextInt();

        // User sets the number of attempts
        System.out.print("How many chances will you take to find the hidden number? ");
        int attempts = sc.nextInt();

        int hiddenNumber = rand.nextInt(max - min + 1) + min;

        System.out.println("\nGreat! The number is somewhere between " + min + " and " + max + ".");
        System.out.println("Can you find it in " + attempts + " attempts? Let the quest begin!\n");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Your guess? ");
            int guess = sc.nextInt();

            if (guess == hiddenNumber) {
                System.out.println("Congratulations! You completed the NumberQuest in " + i + " tries!");
                break;
            } else {
                if (guess < hiddenNumber) System.out.println("Too low! Keep trying.");
                else System.out.println("Too high! Keep trying.");

                // Very close hint
                if (Math.abs(hiddenNumber - guess) <= 2) {
                    System.out.println("You're very close!");
                }

                if (i == attempts) {
                    System.out.println("\nAlas! Your quest ends here.");
                    System.out.println("The hidden number was: " + hiddenNumber);
                }
            }

            System.out.println(); // extra line for readability
        }

        System.out.println("\nThanks for playing NumberQuest! Come back for another challenge!");
        sc.close();
    }
}