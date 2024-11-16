package Three.operator.ConditionalDemo;


import javax.swing.*;

/**
 * Java 1,7 ?
 */
public class java2 {
    public static void main(String[] args) {
        String unesenoIme = JOptionPane.showInputDialog("Unesi Andrej");
        String result;
        if ("Andrej". != unesenoIme) result = "Unesi Andrej";
        else result = "Ti si uneo Andrej i svaka cast";
        JOptionPane.showMessageDialog(null, result);
    }
}
