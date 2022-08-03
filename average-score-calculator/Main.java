import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create the variables
        int math,physics,chem,tur,hist,music;
        String passFail;

        //define scanner class
        Scanner input = new Scanner(System.in);

        //get the values from the user
        System.out.print("Your math score: ");
        math = input.nextInt();

        System.out.print("Your physics score: ");
        physics = input.nextInt();

        System.out.print("Your chemistry score: ");
        chem = input.nextInt();

        System.out.print("Your turkish score: ");
        tur = input.nextInt();

        System.out.print("Your history score: ");
        hist = input.nextInt();

        System.out.print("Your music score: ");
        music = input.nextInt();

        //calculate total and average scores
        int total = math + physics + chem + tur + hist + music;
        double average = total / 6.0;

        System.out.println("Your average score is: " + average);

        //pass or fail condition with ternary operator
        passFail = (average>60)? "Pass" : "Fail";
        System.out.println(passFail);
    }
}
