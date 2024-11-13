package Three.operator;

import java.util.Scanner;

/**
 * Aritmeticki operatori
 * <li>1. + Additive operatot </li>
 * <li>2. - Subtraction operator </li>
 * <li>3. * Multiplikation operator </li>
 * <li>4. / Division operator </li>
 * <li>5. % Remainder opertor </li>
 */

public class AritmetihDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj;");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj;");
        int number2 = new Scanner(System.in).nextInt();
        int suma = number1 + number2;
        System.out.println("Suma: " + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika: " + razlika);
        int product = number1 * number2;
        System.out.println("Product:" + product);
        int division = number1 / number2;
        System.out.println("Division: " + division);
        // number1 = 46 i number2 = 24 46/24=1 i ostatak 22
        //number1 % number2 = 22
        int remainder = number1 % number2;
        System.out.println("Remainder: " + remainder);

    }


}
