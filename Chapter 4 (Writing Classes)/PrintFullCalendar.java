/**
This program creates a calendar for a given year. The program will input the year from the keyboard.
Then, it will calculate which day of the week (SUN, MON, TUE, WED, THU, FRI, SAT) 
is the first day of the year and print the calendar for that given year. 
After printing the year, it will ask if the user wants to continue. 
If the answer is yes, it will print the calendar for another year until the 
user is done using the program. If the answer is no, then the program will exit.

Created by Albert Levin
Date Modified: 12/10/18
 */
import java.util.*;

public class PrintFullCalendar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();
        Calendar cal = new GregorianCalendar();
        printCalendar(year, cal);

        while(true) {
            System.out.print("Do you want to continue (Y or N)? ");
            String answer = scan.next();
            if(!answer.toLowerCase().equals("y") && !answer.toLowerCase().equals("n")) {
                System.out.println("Invalid answer, please try again!");
                continue;
            }
            else if(answer.toLowerCase().equals("n")) {
                return;
            }
            else {
                System.out.print("Enter year: ");
                year = scan.nextInt();
                printCalendar(year, cal);
            }
        }
    }

    private static void printCalendar(int year, Calendar cal) {
        int startDay;
        int numberOfDays;
        for (int i=0; i<12; i++){
            cal.set(year, i, 1);
            startDay = cal.get(Calendar.DAY_OF_WEEK);
            numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.print(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
            System.out.println( " " + year);
            printMonth(numberOfDays,startDay);
            System.out.println();
        }   
    }

    private static void printMonth(int numberOfDays, int startDay) {

        int weekdayIndex = 0;
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

        for (int day = 1; day < startDay; day++) {
            System.out.print("    ");
            weekdayIndex++;
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%1$2d", day);
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                System.out.println();
            } else { 
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

