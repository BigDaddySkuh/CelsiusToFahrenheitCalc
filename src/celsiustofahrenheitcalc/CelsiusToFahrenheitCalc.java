package celsiustofahrenheitcalc;

import java.util.Scanner;

/**
 * This Class Converts Celsius into Fahrenheit
 *
 * @author Mark Carreira
 */
public class CelsiusToFahrenheitCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a celsius value to convert into fahrenheit");

        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.println(" Your original entered value was " + celsius + " degrees celsius.\n The adjusted temperature is " + fahrenheit + " degrees fahrenheit.");
    }

}
