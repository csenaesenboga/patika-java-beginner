//Takes a number, prints the powers of 4 and 5 until the input number
import java.util.Scanner;


public class LoopThree {
    public static void main(String[] args) {
        int k;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        k = s.nextInt();
        System.out.println("Powers of 4");
        for(int i = 1; i<=k;i*=4) System.out.print(i + " ");

        System.out.println("");
        System.out.println("Powers of 5");
        for(int i = 1; i<=k;i*=5) System.out.print(i + " ");
    }
}
