import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double sideOneLength, sideTwoLength, sideThreeLength, hypotenuse, area, perimeter, u;

        //Gets the lengths of 2 sides of a triangle and calculates the hypotenuse
        System.out.println("Please enter the lengths of two perpendicular sides one by one to find the hypotenuse of the triangle.");
        Scanner newInput = new Scanner(System.in);
        sideOneLength = newInput.nextDouble();
        sideTwoLength = newInput.nextDouble();

        //hypotenuse formula
        hypotenuse = Math.sqrt(sideOneLength*sideOneLength + sideTwoLength*sideTwoLength);

        //area formula
        area = sideOneLength*sideTwoLength/2;

        System.out.println("Here's the hypotenuse of your triangle: " + hypotenuse);
        System.out.println("And here's the area in case you need it: " + area);

        //Gets the lengths of 3 sides of a triangle and calculates the area
        System.out.println("Enter 3 sides of another triangle to find out its area, one by one.");
        sideOneLength = newInput.nextDouble();
        sideTwoLength = newInput.nextDouble();
        sideThreeLength = newInput.nextDouble();

        //another area formula using perimeter
        perimeter = sideOneLength + sideTwoLength + sideThreeLength;
        u = perimeter/2;
        area = Math.sqrt(u*(u-sideOneLength)*(u-sideTwoLength)*(u-sideThreeLength));

        System.out.println("The area of your triangle : " + area);

    }
}
