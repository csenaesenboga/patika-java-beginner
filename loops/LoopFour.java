import java.util.Scanner;

//Mathematical operation: Combination calculation
public class LoopFour {
    //Calculate factorial
    public static int Factorial(int a) {
        int total = 1;

        for(int i=1; i<=a; i++) total *= i;

    return total;
    }
    //Calculate combination
    public static void main(String[] args) {
        int n, r, combination;

        //Take 2 numbers to operate on, first one should be higher according to mathematical rules
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n = s.nextInt();
        System.out.print("Enter the second number: ");
        r = s.nextInt();
        while(n<r){
            System.out.println("Please enter the numbers again. First one should be higher.");
            n = s.nextInt();
            r = s.nextInt();
        }
        s.close();

        //Calculate combination using Factorial class
        combination = Factorial(n)/(Factorial(r)*Factorial(n-r));

        System.out.println("Combination of " + n + " and " + r + " equals " + combination);
    }
}
