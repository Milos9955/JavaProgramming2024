package Three.operator;

import javax.swing.JOptionPane;


import static java.lang.Integer.*;

/**
 * SHIFT + (Fn + F6)
 * <p>
 * Operatori pordjenja.
 * <li> 1. == equality (jednako) </li>
 * <li> 2. != not equal (nejednako) </li>
 * <li> 3. > (vece) </li>
 * <li> 4. >= </li>
 * <li> 5. < (manje) </li>
 * <li> 6. <= </li>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvu celobrojnu vrednost");
        int number1 = parseInt(JOptionPane.showInputDialog("Unesi prvu celobrojnu"));
        System.out.println("Unesi drugu celoborojnu");
        int number2= parseInt(JOptionPane.showInputDialog("Unesi drugu celoborojnu"));
        if (number1 == number2) {
            System.out.println("Jednaki brojevi");
        }
        if (number1 != number2) {
            System.out.println("Nejednaki brojevi");
        }
        if (number1 > number2) {
            System.out.println("Prvi veci od drugog");
        }
        if (number1 >= number2) {
            System.out.println("Prvi veci ili jednak drugom");
            if (number1 < number2) {

                System.out.println("Prvi manji od od drugog");
            }
            if (number1 >= number2) {
                System.out.println("Prvi veci ili jednak drugom");
            }
        }

    }

}