//Takes the base number and the power as integers,
// Calculates the desired power of desired number
import java.util.Scanner;

public class LoopFive {
    public static void main(String[] args) {
        int baseNumber, power, result=1;

        Scanner s = new Scanner(System.in);
        System.out.print("Base number: ");
        baseNumber = s.nextInt();
        System.out.print("Power: ");
        power = s.nextInt();

        for(int i=1; i<= power; i++) result *= baseNumber;

        System.out.println("Result: " + result);
    }
}
