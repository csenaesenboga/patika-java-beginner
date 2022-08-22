/* Gets a temperature from the user,
* Suggests skiing when it's less than 5 degrees,
* Cinema when it's between 5 and 15,
* Picnic when it's between 10 and 25,
* Swimming when it's more than 25.
 */
import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        int temperature;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a temperature: ");
        temperature = s.nextInt();

        if(temperature<5) System.out.println("Bet you've always wanted to try skiing (if you're not already a fan :))");
        else if (temperature<=15) System.out.println("A good day to go to the cinema.");
        if(10<=temperature && temperature<=25) System.out.println("Chef's Choice: Picnic with your loved ones.");
        else if(temperature>25) System.out.println("Warm waters are calling you. Better get your swimsuit ready :)");
    }
}