/**
 * This program plays the Hi-Lo guessing game with numbers. 
 * The application picks a random number between 1 and 100 inclusive, then keep prompting the user 
 * to guess the number until they get it right or give up. With each guess, the program informs the user 
 * if they are too high or too low. The program also keeps track of the number of guesses a user has. 
 * At the end of each game, report the number of guesses, and prompt the user to play again.
 * Created by Albert Levin
 * Date Modified: 11/3/18
 */

import java.util.Scanner;
import java.util.Random;

public class hiLoGuessingGame {
    public static void main(String[] args)
    {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        String restart = "Y";
        while (restart.equalsIgnoreCase("Y")) {
            int attempt = 0;
            int answer = generator.nextInt(100) + 1;

            System.out.print("Guess a number (enter 0 to exit)? ");
            while (true) {
                int guess = scan.nextInt();
                if (guess == 0) {
                    System.out.println("\nQuitting game...");
                    break;
                }

                attempt++;
                if (guess == answer) {
                    System.out.println("That's correct! You made " + attempt + " guesses.");
                    break;
                }

                if (guess < answer) {
                    System.out.println("Your guess is too low, try again!");
                } else {
                    System.out.println("Your guess is too high, try again!");
                }
            }

            System.out.println("\nWould you like to play again (Y/N)?");
            restart = scan.next();
        }
    }
}
