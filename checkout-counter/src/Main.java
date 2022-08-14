import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double apple = 3.67, pear = 2.14, tomato = 1.11, banana = 0.95, eggplant = 5, kg, total;

        System.out.println("How much did you buy from each of these products?");
        Scanner s = new Scanner(System.in);
        System.out.println("How much apple? ");
        kg = s.nextDouble();

        //calculate total cost simultaneously
        total = kg*apple;
        System.out.println("How much pear? ");
        kg = s.nextDouble();
        total += kg*pear;
        System.out.println("How much tomato? ");
        kg = s.nextDouble();
        total += kg*tomato;
        System.out.println("How much banana? ");
        kg= s.nextDouble();
        total += kg*banana;
        System.out.println("How much eggplant? ");
        kg = s.nextDouble();
        total += kg*eggplant;

        System.out.println("Total cost: " + total);

// bunların isimlerine zaten fiyat atadık, ya her birinin kilosu için ayrı bir var oluşturcan ya da tek bir
        //kg oluşturup her seferinde tutarı hesaplayıp toplama ekleyerek gidicez
    }
}
