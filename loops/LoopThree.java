//Takes a number, prints the powers of 4 and 5 until the input number
import java.util.Scanner;
import java.lang.Math;

public class LoopThree {
    public static void main(String[] args) {
        int k;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        k = s.nextInt();
        System.out.println("Powers of 4");
        for(int i = 0; i<=k;i++) System.out.print(Math.pow(4,i) + " ");

        System.out.println("");
        System.out.println("Powers of 5");
        for(int i = 0; i<=k;i++) System.out.print(Math.pow(5,i) + " ");
    }
}
