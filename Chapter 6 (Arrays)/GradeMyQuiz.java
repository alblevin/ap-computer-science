/**
 * This program successfully grades arithmetic quizzes and presents 
 * the score to the user.
 *
 * Created by Albert Levin
 * Date Modified: 12/21/18
 */
import java.util.*;
public class GradeMyQuiz
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many questions are in the quiz?");
        int numA = scan.nextInt();
        int rightAns = 0;

        int[] answerKey = new int[numA];
        System.out.println("\nEnter the answer key in a single line with a space between the answers: ");
        for(int i = 0; i < numA; i++)
            answerKey[i] = scan.nextInt();

        System.out.println("\nEnter the answers to be graded in a single line with a space between the answers: ");
        for(int i = 0; i < numA; i++)
            if(answerKey[i] == scan.nextInt());
        rightAns++;
        System.out.println("\nYou got " + ((double)rightAns/numA*100 + "%."));
    }
}

