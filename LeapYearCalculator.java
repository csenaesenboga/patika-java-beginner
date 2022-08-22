//Takes a year as input,
//Prints if it is a leap year or not
import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = s.nextInt();

        if(year%100 != 0){
            if(year %4 == 0) System.out.println(year + " is a leap year.");
            else System.out.println(year + " is not a leap year.");
        }
        else if (year%400 == 0) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
    }
}
