//Takes day and month of birth as input,
//Prints the corresponding zodiac sign
//Determines zodiac sign without using switch statement (using if-else)
import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        String zodiacSign="";
        int birthDay, birthMonth;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your birthday as a number between 1 and 31)");
        birthDay = s.nextInt();

        System.out.println("Enter your birth month as a number between 1 and 12");
        birthMonth = s.nextInt();

        if(birthMonth == 1){
            if(birthDay<=21) zodiacSign = "Capricorn (Oğlak)";
            else zodiacSign = "Aquarius (Kova)";
        }
        if(birthMonth == 2){
            if(birthDay<=19) zodiacSign = "Aquarius (Kova)";
            else zodiacSign = "Pisces (Balık)";
        }
        if(birthMonth == 3){
            if(birthDay<=20) zodiacSign = "Pisces (Balık)";
            else zodiacSign = "Aries (Koç)";
        }
        if(birthMonth == 4){
            if(birthDay<=20) zodiacSign = "Aries (Koç)";
            else zodiacSign = "Taurine (Boğa)";
        }
        if(birthMonth == 5){
            if(birthDay<=21) zodiacSign = "Taurine (Boğa)";
            else zodiacSign = "Gemini (İkizler)";
        }
        if(birthMonth == 6){
            if(birthDay<=22) zodiacSign = "Gemini (İkizler)";
            else zodiacSign = "Cancer (Yengeç)";
        }
        if(birthMonth == 7){
            if(birthDay<=22) zodiacSign = "Cancer (Yengeç)";
            else zodiacSign ="Leo (Aslan)";
        }
        if(birthMonth == 8){
            if(birthDay<=22) zodiacSign = "Leo (Aslan)";
            else zodiacSign = "Virgo (Başak)";
        }
        if(birthMonth == 9){
            if(birthDay<=22) zodiacSign = "Virgo (Başak)";
            else zodiacSign = "Libra (Terazi)";
        }
        if(birthMonth == 10){
            if(birthDay<=22) zodiacSign = "Libra (Terazi)";
            else zodiacSign = "Scorpio (Akrep)";
        }
        if(birthMonth == 11){
            if(birthDay<=21) zodiacSign = "Scorpio (Akrep)";
            else zodiacSign = "Sagittarius (Yay)";
        }
        if(birthMonth == 12){
            if(birthDay<=21) zodiacSign = "Sagittarius (Yay)";
            else zodiacSign = "Capricorn (Oğlak)";
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }
}
