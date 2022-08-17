import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum, secondNum, operation, result;

        Scanner s = new Scanner(System.in);

        //Take the first number
        System.out.printf("First Number: ");
        firstNum = s.nextInt();

        //Operation selection
        System.out.println("Which operation? Please enter the number.\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        operation = s.nextInt();

        //Take the second number
        System.out.printf("Second Number: ");
        secondNum = s.nextInt();

        //Do the operation and give the result
        switch(operation) {
            case 1:
                System.out.println(firstNum + "+" + secondNum +"="+ (firstNum+secondNum));
                break;
            case 2:
                System.out.println(firstNum + "-" + secondNum +"="+(firstNum-secondNum));
                break;
            case 3:
                System.out.println(firstNum + "*" + secondNum +"="+(firstNum*secondNum));
                break;
            case 4:
                if(secondNum!=0) System.out.println(firstNum + "/" + secondNum +"="+(firstNum/secondNum));
                break;
            default:
                System.out.println("Please enter a number from 1 to 4");
        }
    }
}
