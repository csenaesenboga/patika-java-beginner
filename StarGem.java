import java.util.Scanner;

public class StarGem {
    public static void main(String[] args) {
        int n;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(" ");

            for (int k = 1; k <= (2*(n-i)-1); k++) System.out.print("*");
            System.out.println(" ");
        }

    }
}