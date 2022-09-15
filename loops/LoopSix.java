import java.util.Scanner;

public class LoopSix {
    public static void main(String[] args) {
        String n;
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = s.nextLine();

        String[] number = n.split("");

        for (String value : number) sum += Integer.parseInt(value);

        System.out.println("Sum of the digits of your number: " + sum);
    }
}