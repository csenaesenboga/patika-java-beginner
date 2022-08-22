//Takes birth year as input,
//Prints the corresponding Chinese zodiac sign
//Uses enhanced switch statement
import java.util.Scanner;

public class ChineseZodiacFinder {
    public static void main(String[] args) {
        int birthYear, x;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        birthYear = s.nextInt();
        System.out.print("Your Chinese zodiac sign is ");

        //The remainder (x) of division of birth year and 12 gives the zodiac sign
        x = birthYear%12;
        switch (x) {
            case 0 -> System.out.print("Monkey");
            case 1 -> System.out.print("Rooster");
            case 2 -> System.out.print("Dog");
            case 3 -> System.out.print("Pig");
            case 4 -> System.out.print("Rat");
            case 5 -> System.out.print("Ox");
            case 6 -> System.out.print("Tiger");
            case 7 -> System.out.print("Rabbit");
            case 8 -> System.out.print("Dragon");
            case 9 -> System.out.print("Snake");
            case 10 -> System.out.print("Horse");
            case 11 -> System.out.print("Goat");
        }

}
}
