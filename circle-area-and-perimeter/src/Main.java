import java.util.Scanner;
/*
* This program takes an input from the user and performs calculations.
* Input is the radius of a circle. Calculations are done to find the area and perimeter.
* Second input is the angle to find the area for a piece of circle.
*/
public class Main {
    public static void main(String[] args) {
        double radius, area, perimeter, pi = 3.14;
        int angle;

        System.out.println("Please enter the radius for area and perimeter info ");
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();

        //calculate area and perimeter
        area = pi*radius*radius;
        perimeter = 2*pi*radius;

        System.out.println("Area of this circle: " + area);
        System.out.println("Perimeter of this circle: " + perimeter);

        //Find area for a piece of circle
        System.out.println("Enter the radius and the angle of a piece of the circle for the area info");
        radius = s.nextDouble();
        angle = s.nextInt();

        area = pi*radius*radius*angle/360;

        System.out.println("Area of this piece of circle is " + area);

    }
}
