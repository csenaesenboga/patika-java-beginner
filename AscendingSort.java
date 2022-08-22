//Takes 3 numbers from the user and sorts them from lowest to highest
//Sorting algorithm uses if-else statements
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        int a,b,c;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        a = s.nextInt();

        System.out.print("Enter the second number (b): ");
        b = s.nextInt();

        System.out.print("Enter the third number (c): ");
        c = s.nextInt();

        if(a<b && a<c){
            if(b<c) System.out.println("a < b < c");
            else System.out.println("a < c < b");
        }
        else if(b<a && b<c){
            if(a<c) System.out.println("b < a < c");
            else System.out.println("b < c < a");
        }
        else{
            if(a<b) System.out.println("c < a < b");
            else System.out.println("c < b < a");
        }
    }
}