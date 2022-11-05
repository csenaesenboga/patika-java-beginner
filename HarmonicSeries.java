import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = s.nextInt();

        for(int i = 1; i<=number;i++){
            sum += 1/((double)i);
        }
        System.out.print("Sum: " + sum);

    }
}
