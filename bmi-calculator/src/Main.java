import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight, bmi;

        System.out.println("Enter your height in meter");
        Scanner s = new Scanner(System.in);
        height = s.nextDouble();
        System.out.println("Enter your weight in kilogram");
        weight = s.nextDouble();

        //calculate bmi
        bmi = weight/(height*height);

        System.out.println("Your bmi: " + bmi);

        //congrats if super-healthy
        if (bmi > 18.5 && bmi < 24.9){
            System.out.println("Congrats! You're healthy :)");
        }
        else if (bmi>24.9){
            System.out.println("Maybe you should skip the dessert for a while :P");
        }
        else {
            System.out.println("Eating is fun! You should try it sometime :)");
        }
    }
}
