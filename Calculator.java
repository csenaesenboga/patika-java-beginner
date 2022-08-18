import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum, secondNum, operation;

        Scanner s = new Scanner(System.in);

        //Take the first number
        System.out.printf("First Number: ");
        firstNum = s.nextInt();

        //Operation selection
        System.out.println("Which operation? Please enter the number.\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        operation = s.nextInt();
        
        //Prevent invalid operation
        while (operation<1 || 4<operation){
            System.out.println("Please enter a number from 1 to 4");
            operation = s.nextInt();
        }

        //Take the second number
        System.out.printf("Second Number: ");
        secondNum = s.nextInt();
        
        //Prevent undefined result
        while (operation == 4 && secondNum ==0){
            System.out.println("Second number cannot be zero for division.");
            secondNum = s.nextInt();
        }

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
                System.out.println(firstNum + "/" + secondNum +"="+(firstNum/secondNum));
                break;
            default:
                break;
        }
    }
}
