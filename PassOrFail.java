/* Gets test scores of 5 subjects as inputs,
* Asks until getting a valid input,
* Calculates average score,
* Outputs the pass/fail situation and average score.
 */
import java.util.Scanner;

public class PassOrFail{
    public static void main(String[] args) {
        //Create variables
        int math,physics,chem,tur,music;
        double average;

        //define scanner class
        Scanner input = new Scanner(System.in);

        //get the values from the user
        //ask until getting a valid input
        System.out.print("Your math score: ");
        math = input.nextInt();
        while(0>math || math>100){
            System.out.println("Please enter a score from 0 to 100");
            math = input.nextInt();
        }

        System.out.print("Your physics score: ");
        physics = input.nextInt();
        while(0>physics||physics>100){
            System.out.println("Please enter a score from 0 to 100");
            physics = input.nextInt();
        }

        System.out.print("Your chemistry score: ");
        chem = input.nextInt();
        while(0>chem||chem>100){
            System.out.println("Please enter a score from 0 to 100");
            chem = input.nextInt();
        }

        System.out.print("Your turkish score: ");
        tur = input.nextInt();
        while(0>tur||tur>100){
            System.out.println("Please enter a score from 0 to 100");
            tur = input.nextInt();
        }

        System.out.print("Your music score: ");
        music = input.nextInt();
        while(0>music||music>100){
            System.out.println("Please enter a score from 0 to 100");
            music = input.nextInt();
        }

        //calculate average score
        average = (math + physics + chem + tur + music)/ 5.0;

        //determine the pass/fail situation
        if(average>=55) System.out.println("Congratulations! You passed.");
        else System.out.println("You failed. See you next time.");

        System.out.println("Your average score is: " + average);
    }
}