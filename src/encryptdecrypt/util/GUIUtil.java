/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptdecrypt.util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Ernesto Mancebo T
 */
public class GUIUtil {

    public static void clearText(Container con) {
        for (Component c : con.getComponents()) {
            if (c instanceof JTextComponent) {
                ((JTextComponent) c).setText("");
            } else if (c instanceof Component) {
                clearText((Container) c);
            }
        }
    }

    public static void centerFrame(JFrame c) {
        c.setLocationRelativeTo(null);
    }
}
