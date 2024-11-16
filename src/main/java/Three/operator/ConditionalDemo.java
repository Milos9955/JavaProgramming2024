package Three.operator;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * && AND
 *
 *  || (AltGR+ W) ILI (operator)
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        out.println("Enter first number");
        int number1 = new Scanner(in).nextInt();
        out.println("Enter second number");
        int number2 = new Scanner(in).nextInt();
        boolean b;
        boolean b6 = number1 >= number2;
        if (b6) b = true;
        else b = false;
        boolean b1 = b6;
        boolean b2 = b6;
        boolean b3 = b6;
        boolean b4 = b6;
        boolean b5 = b6;
        boolean b7 = b6;
        if(number1 == 23) ||b6 {
            out.println("Moj uslov je zadovoljen");
            JOptionPane.showMessageDialog(null, "Moj uslov je zadovoljen");
        }
        if(number1==23) &&b6 {
            out.println("Moj DRUGI rigorozniji uslov je zadovoljen");
            JOptionPane.showMessageDialog(null, "Moj DRUGI rigorozniji uslov je zadovoljen");
    }
}
