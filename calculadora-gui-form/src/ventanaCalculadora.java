/***************************************************************************************************************
 * @autor: Juan Elier Rosales Rosas
 * Fecha: 02/08/2023
 * Descripción: Este programa es una muestra para la creación de una calculadora mediante el GUI que proporciona
 * intelliJ
 ***************************************************************************************************************/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaCalculadora extends JFrame{

    //Se inicializa total1 para poder trabajar con doubles
    private double totalEntrada = 0.0;

    //Variable donde se va a asignar la salida
    private double totalSalida = 0.0;

    //Variable para asignarle el operador a realizar
    private char operadorMatematico;

    /************************************
     * Insercion de botones en la ventana
     ************************************/
    private JPanel ventana;
    private JTextField pantallaResultados;
    private JButton botonIgual;
    private JButton botonSuma;
    private JButton numeroCinco;
    private JButton numeroSiete;
    private JButton numeroNueve;
    private JButton numeroCuatro;
    private JButton numeroUno;
    private JButton botonResta;
    private JButton numeroOcho;
    private JButton numeroDos;
    private JButton numeroCero;
    private JButton botonMultiplicacion;
    private JButton numeroSeis;
    private JButton numeroTres;
    private JButton botonPunto;
    private JButton botonDivision;
    private JButton botonBorrar;
    private JButton botonPorcentaje;

    public ventanaCalculadora() {
        super("Calculadora en Java");
        setContentPane(ventana);
        /*****************************************
         * Configuracion de los botones numericos
         *****************************************/
        //Listener para el numero 0
        numeroCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonCero = pantallaResultados.getText() + numeroCero.getText();
                pantallaResultados.setText(escribirBotonCero);
            }
        });
        //Listener para el numero 1
        numeroUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonUno = pantallaResultados.getText() + numeroUno.getText();
                pantallaResultados.setText(escribirBotonUno);
            }
        });
        //Listener para el numero 2
        numeroDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonDos = pantallaResultados.getText() + numeroDos.getText();
                pantallaResultados.setText(escribirBotonDos);
            }
        });
        //Listener para el numero 3
        numeroTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonTres = pantallaResultados.getText() + numeroTres.getText();
                pantallaResultados.setText(escribirBotonTres);
            }
        });
        //Listener para el numero 4
        numeroCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonCuatro = pantallaResultados.getText() + numeroCuatro.getText();
                pantallaResultados.setText(escribirBotonCuatro);
            }
        });
        //Listener para el numero 5
        numeroCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonCinco = pantallaResultados.getText() + numeroCinco.getText();
                pantallaResultados.setText(escribirBotonCinco);
            }
        });
        //Listener para el numero 6
        numeroSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonSeis = pantallaResultados.getText() + numeroSeis.getText();
                pantallaResultados.setText(escribirBotonSeis);
            }
        });
        //Listener para el numero 7
        numeroSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonSiete = pantallaResultados.getText() + numeroSiete.getText();
                pantallaResultados.setText(escribirBotonSiete);
            }
        });
        //Listener para el numero 8
        numeroOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonOcho = pantallaResultados.getText() + numeroOcho.getText();
                pantallaResultados.setText(escribirBotonOcho);
            }
        });
        //Listener para el numero 9
        numeroNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escribirBotonNueve = pantallaResultados.getText() + numeroNueve.getText();
                pantallaResultados.setText(escribirBotonNueve);
            }
        });
        //Listener para boton punto
        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pantallaResultados.getText().equals(" ")){
                    pantallaResultados.setText("0.");
                }
                else if (pantallaResultados.getText().contains(".")) {
                    botonPunto.setEnabled(false);
                }
                else{
                    String escribirBotonPunto = pantallaResultados.getText() + botonPunto.getText();
                    pantallaResultados.setText(escribirBotonPunto);
                }
                botonPunto.setEnabled(true);
            }
        });

        /******************************************
         * Creación de acciones para la calculadora
         ******************************************/
        //Listener para el botón suma
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalEntrada = totalEntrada + Double.parseDouble(pantallaResultados.getText());
                pantallaResultados.setText(" ");
            }
        });

        //Listener para botón resta
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*totalSalida = totalEntrada - Double.parseDouble(pantallaResultados.getText());
                pantallaResultados.setText(Double.toString(totalSalida));
                totalEntrada = 0;*/

            }
        });

        //Listener para botón igual
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalSalida = totalEntrada + Double.parseDouble(pantallaResultados.getText());
                pantallaResultados.setText(Double.toString(totalSalida));
                totalEntrada = 0;

            }
        });
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalSalida = 0;
                pantallaResultados.setText(" ");
            }
        });

    }
}
