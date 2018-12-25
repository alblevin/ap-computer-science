/**
 * This driver class creates two rational numbers (by prompting the user for numerator and denominator) and then compares them.
 * After, the user is allowed to compare more numbers until they decide to quit.
 *
 * Created by Albert Levin
 * Date Modified: 12/21/18
 */
import java.util.*;
public class Driver
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numer1, denom1, numer2, denom2;

        Scanner scanAgain = new Scanner(System.in);
        String doAgain = "y";

        while(doAgain.equalsIgnoreCase("y"))
        {
            System.out.println("\nEnter the numerator of the first rational number or q to quit: ");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("q")) {
                System.exit(0);
            }
            try {
                numer1 = Integer.parseInt(answer);
            }
            catch(NumberFormatException e) {
                System.out.println("Numerator is not a number.");
                continue;
            }

            System.out.println("Enter the denominator of the first rational number: ");
            answer = scan.next();

            try {
                denom1 = Integer.parseInt(answer);
            }
            catch(NumberFormatException e) {
                System.out.println("Denominator is not a number.");
                continue;
            }

            System.out.println("\nEnter the numerator of the second rational number: ");
            answer = scan.next();

            try {
                numer2 = Integer.parseInt(answer);
            }
            catch(NumberFormatException e) {
                System.out.println("Numerator is not a number.");
                continue;
            }
            System.out.println("Enter the demominator of the second rational number: ");
            answer = scan.next();

            try {
                denom2 = Integer.parseInt(answer);
            }
            catch(NumberFormatException e) {
                System.out.println("Denominator is not a number.");
                continue;
            }

            Rational r1 = new Rational(numer1, denom1);
            Rational r2 = new Rational(numer2, denom2);

            int compared = r1.compareTo(r2);
            if(compared ==1)
                System.out.println(r1 + " is greater than " + r2);
            else if(compared == -1)
                System.out.println(r1 + " is less than " + r2);
            else
                System.out.println(r1 + " is equal to " + r2);

        }
    }
}

