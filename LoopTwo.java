//Takes input from the user until a single number is entered,
//Uses loops and adds multiples of 4 from the entered values, prints the sum
import java.util.Scanner;

public class LoopTwo {
    public static void main(String[] args) {
        int k, sum=0;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        k = s.nextInt();

        while(k%2==0){
            if (k % 4 == 0) sum += k;
            System.out.print("Please enter another number: ");
            k = s.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}
