//Takes a number from user and prints the even numbers until the input number
//Also prints the average of multiples of 3 and 4 until the input number
import java.util.Scanner;

public class LoopOne {
    public static void main(String[] args) {
        int firstNum, sum = 0;
        double avg, count = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        firstNum = s.nextInt();

        //Print even numbers and find numbers that are multiples of 3 or 4
        for (int i = 0; i <= firstNum; i++) {

            if (i%2 == 0) System.out.print(i + " ");

            if (i % 3 == 0 && i % 4 == 0) {
                if(i != 0) {
                    sum += i;
                    count += 1;
                }
            }
        }
        //Calculate and print the average of multiples of 3 or 4
        avg = (count != 0)? (sum / count) : 0;
        System.out.println("Average: " + avg);
    }
}
