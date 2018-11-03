// The following program does several tasks. It prompts the user for the input strings as needed, 
// and prints out the resulting string.
// Created by Albert Levin
// Last updated: 10/15/18

import java.util.Scanner;
public class learningStrings {
    public static void main(String[] args) {

        // Question 1
        System.out.println("\nQuestion 1");
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nPlease enter your name: ");
        String name = scan.nextLine();
        String last = name.substring(name.indexOf(" ")+1, name.length());
        String first = name.substring(0, name.indexOf(" "));
        System.out.println("\nInput: " + first + " and " + last);
        System.out.println("\nOutput: " );
        System.out.print ("\n" + last + ", " + first);
        System.out.println("\n" + last + ", " + first.charAt(0));
        System.out.println(last.substring(0, 1).toUpperCase() + last.substring(1, last.length()).toLowerCase() + ", " +
            first.substring(0, 1).toUpperCase() + first.substring(1, first.length()).toLowerCase());

        // Question 2
        System.out.println("\nQuestion 2");
        System.out.print ("\nPlease enter an \"out\" string with the length of 4: ");
        String outString = scan.nextLine();
        if(outString.length() != 4) {
            System.err.println("Input length is invalid");
            System.exit(-1);
        }
        System.out.print ("\nPlease enter a word: ");
        String word = scan.nextLine();
        System.out.println("\nInput: " + outString + " and " + word);
        System.out.println("\nOutput: " );
        System.out.println (outString.substring(0,2) + word + outString.substring(2,4));

        // Question 3
        System.out.println("\nQuestion 3");
        System.out.println("\nEnter a string with length more than 2:");
        String str = scan.nextLine();
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        if(str.length() < 2) {
            System.err.println("\nString is too short");
            System.exit(-1);
        }
        word = str.substring(str.length() - 2, str.length());
        System.out.println (word + word + word);

        // Question 4
        System.out.println("\nQuestion 4");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        System.out.println(str.substring(0, str.length() / 2));

        // Question 5
        System.out.println("\nQuestion 5");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        int inHalf = str.length() / 2;
        System.out.println(str.substring(inHalf-1,inHalf+1));

        // Question 6
        System.out.println("\nQuestion 6");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        int oddLength = str.length() / 2;
        System.out.println(str.substring(oddLength-1,oddLength+2));

        // Question 7
        System.out.println("\nQuestion 7");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        System.out.println(str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2));

        // Question 8
        System.out.println("\nQuestion 8");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        if (str.length() < 2)
            System.out.println(str);
        else
            System.out.println(str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2));

        // Question 9
        System.out.println("\nQuestion 9");
        System.out.println("\nInput: " + str);
        System.out.println("\nOutput: " );
        if (str.length() < 2)
            System.out.println(str + str + str);
        else {
            String newString = str.substring (0,2);
            System.out.println(newString + newString + newString);
        }
    }
}
