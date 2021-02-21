
/**
 * It's a magic 8 ball!
 *
 * @author (Sara Schafer)
 * @version (2/1/18)
 * 
 * Fix by adding code that prevents people from putting just a number in.
 */
import java.util.Random;
import java.util.Scanner;
public class Magic8Ball
{
    public static void main (String [] args) {
        // Declare variables here
        Random getRand = new Random();
        Scanner input = new Scanner(System.in);
        int number;
        String question;
        int count =1;
        int answer;

        System.out.println("=========================================");
        System.out.println("   Welcome to Sara's Magic Eight Ball!");
        System.out.println("=========================================");
        while (count == 1) {
            // Generate a number
            number = getRand.nextInt(10)+1;
            System.out.println("What is your question? ");
            question = input.next();
            System.out.println("");
            // Increment the coin
            switch (number)
            {
                case 1: System.out.println("It will happen soon.");
                System.out.println("");
                break;

                case 2: System.out.println("It will not happen anytime soon.");
                System.out.println("");
                break;

                case 3: System.out.println("Yes.");
                System.out.println("");
                break;

                case 4: System.out.println("No.");
                System.out.println("");
                break;

                case 5: System.out.println("It is up to you.");
                System.out.println("");
                break;

                case 6: System.out.println("Ask again later.");
                System.out.println("");
                break;

                case 7: System.out.println("Even the Fates themselves do not know.");
                System.out.println("");
                break;

                case 8: System.out.println("Not a chance of it happening.");
                System.out.println("");
                break;

                default: System.out.println("There is a chance of it happening.");
                System.out.println("");
                break;

            }
            count++;
            input.nextLine();
            System.out.println("Do you wish to play again?");
            System.out.print("1 for yes and 2 for no. ");
            answer = input.nextInt();
            System.out.println("");


            if (answer == 1){
                count--;
            }
            else {
                System.out.println("Thanks for playing!");
            }
        } 
    }
}