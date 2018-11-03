/* This program implements the while loop. It uses a data verification loop to verify the the year entered is > 1582. 
The loop will continue to ask the user for a year until they have entered a year > 1582. The program also allows the user 
to enter another year if they shall choose. If the user wants to exit the program, then they would type 0 into the console. 
Created by Albert Levin
Date Modified: 10/26/18 */

import java.util.Scanner;
public class leapYearLoops {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year = -1; // Gave an int a default value so the main loop will execute immediately.
        while (year != 0) // -1 not equal to zero, so the program will execute.
        {
            System.out.print("Please enter a year: ");
            year = scan.nextInt();
            if (year < 1582)
            {
                if (year != 0)
                    System.out.println("The year must not be less than 1582! \n"); // Notifies the user, unless they are exiting the program
                continue; // Restarts the while loop (This statement can be used in any of the loop control structures.)
            }
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // Expression to check if it's a leap year
                System.out.println("Congrats, that is a leap year! \n");
            else
                System.out.println("That is not a leap year, please try again! \n");
                System.out.println("Type '0' if you want to exit the program. \n");
        }
    }
}
