package Four.control;

import javax.swing.*;

/**
 * instanceof -> klase, apstraktne klase, interfejse i nasledjivanje.
 * <p>
 *     switch i if
 * </p>
 * <p>
 *     Trebamo napraviti program u kojem ce korisnik uneti
 *     naziv dana na Engleskom, a program ce nam izbaciti kao rezultat redni
 *     broj dana u sedmici.
 *     String unosNazivaDana = "Monday"
 *     int redniBrojDanaUSedmici + ?
 * </p>
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String userDayInput = JOptionPane.showInputDialog("Unesite naziv dana u sedmici na Engleskom jeziku");
        int numberOfDayWithinWeek = switch (userDayInput) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        };
        String meesage;
        if (numberOfDayWithinWeek != 0) {
            meesage = " Za uneseni naziv dana u sedmici na eng. jez. '" + userDayInput + "' redni broj dana u sedmici je" + numberOfDayWithinWeek;
            JOptionPane.showMessageDialog(null, meesage);
        } else {
            meesage = "Nisi uneo ispravan naziv dana na eng. jez.";
            JOptionPane.showMessageDialog(null, meesage);
        }
    }
}


