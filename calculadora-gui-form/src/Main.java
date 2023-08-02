/***************************************************************************************************************
 * @autor: Juan Elier Rosales Rosas
 * Fecha: 02/08/2023
 * Descripción: Este programa es una muestra para la creación de una calculadora mediante el GUI que proporciona
 * intelliJ
 ***************************************************************************************************************/
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ventanaCalculadora();
                frame.setSize(500, 600);
                frame.setVisible(true);
            }
        });
        }
    }
