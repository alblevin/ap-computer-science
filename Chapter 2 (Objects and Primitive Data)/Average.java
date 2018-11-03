/**
 * This program can hold the numbers 5, 7, and 11 using variables, calculate the average
 * of the three variables and output the result.
 * 
 * @ Albert Levin
 * @ 09/17/18
 */
public class Average
{
    public static void main(String[] args) {
        final int valA = 5;
        final int valB = 7;
        final int valC = 11;
        double result;
        result = (double)(valA + valB + valC) / 3;
        System.out.println(String.format("The average for the numbers 5, 7, and 11 is %2.8f", result));

    }
}
