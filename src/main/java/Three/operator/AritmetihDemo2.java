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

public class AritmetihDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj;");
        double number1 = new Scanner(System.in).nextDouble();
        System.out.println("Unesi drugi broj;");
        double number2 = new Scanner(System.in).nextDouble();
        double suma = number1 + number2;
        System.out.println("Suma: " + suma);
        double razlika = number1 - number2;
        System.out.println("Razlika: " + razlika);
        double product = number1 * number2;
        System.out.println("Product:" + product);
        double division = number1 / number2;
        System.out.println("Division: " + division);
        // number1 = 46 i number2 = 24 46/24=1 i ostatak 22
        //number1 % number2 = 22
        double remainder = number1 % number2;
        System.out.println("Remainder: " + remainder);

    }


}
