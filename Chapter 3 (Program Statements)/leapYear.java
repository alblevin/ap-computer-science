/* This program will execute an application that reads an integer value representing a year input by the user. 
The purpose of the program is to determine if the year is a leap year (and therefore has 29 days in February) 
in the Gregorian calendar. An error message will output for any input value less than 1582 (the year the Gregorian calendar 
was adopted). A congrats message will output stating if the year is a leap year. */
// Created by Albert Levin
// Date Modified: 10/20/18

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){  
    Scanner scan = new Scanner(System.in);
    System.out.println ("Please enter a year: ");
    int year = scan.nextInt();
    if (year > 1582) {

    if (((year % 4) == 0) && ((year % 100) == 0) && ((year % 400) == 0)) {
        System.out.print ("Congrats, that year was a leap year!");
    }
    else if (((year % 4) == 0) && ((year % 100)==0) && ((year % 400) != 0)){
        System.out.print ("Sorry, that year was not a leap year.");
    }
    else if ((year % 4) == 0){
        System.out.print ("Congrats, that year was a leap year!");
    }
    else 
        System.out.print ("Sorry, that year was not a leap year.");
    }
    else 
        System.out.print ("Error! Please enter a year after 1582.");
    }
}
