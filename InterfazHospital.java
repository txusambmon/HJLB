import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazHospital {
    private Hospital hospital;
    private JFrame frame;
    private JButton botona;
    private Dialog dialogo;
    private JPanel panel;
    private JPanel panelInfo;
    private JTextField textField;
    private JButton buttonInfo, buttonFuncion;
    private Container contenedor;
    

    public InterfazHospital(Hospital hospital) {
        //hospital = new Hospital(); // Suponiendo que tienes una clase Hospital implementada

        frame = new JFrame("Interfaz Hospital");
        frame.setLayout(new GridLayout(2,2));
        contenedor=frame.getContentPane();
        botona= new JButton("Botona");
        panel = new JPanel();
        contenedor.add(panel);
        contenedor.add(botona);
        textField = new JTextField(20);
        buttonInfo = new JButton("Información");
        buttonFuncion = new JButton("Función");

        panel.add(textField);
        panel.add(buttonInfo);
        panel.add(buttonFuncion);

        buttonInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInformacion();
            }
        });

        buttonFuncion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaParametros();
            }
        });

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        textField.setSize(300,300);
    }

    private void mostrarInformacion() {
        // Aquí puedes mostrar información del hospital en el textField
        hospital.getUnidades(); // Suponiendo que tienes un método obtenerInformacion en la clase Hospital
        //textField.setText(info);
    }

    private void mostrarVentanaParametros() {
        // Aquí debes crear una nueva ventana para solicitar los parámetros
        JFrame ventanaParametros = new JFrame("Ingresar Parámetros");
        JPanel panelParametros = new JPanel();
        JLabel labelParametro1 = new JLabel("Parámetro 1:");
        JLabel labelParametro2 = new JLabel("Parámetro 2:");
        JTextField campoParametro1 = new JTextField(10);
        JTextField campoParametro2 = new JTextField(10);
        JButton botonAceptar = new JButton("Aceptar");

        panelParametros.add(labelParametro1);
        panelParametros.add(campoParametro1);
        panelParametros.add(labelParametro2);
        panelParametros.add(campoParametro2);
        panelParametros.add(botonAceptar);

        botonAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes tomar los valores ingresados y hacer algo con ellos
                String parametro1 = campoParametro1.getText();
                String parametro2 = campoParametro2.getText();
                // Llamar a un método en la clase Hospital pasando los parámetros, por ejemplo:
                // hospital.realizarAccionConParametros(parametro1, parametro2);
                ventanaParametros.dispose(); // Cerrar la ventana de parámetros
            }
        });

        ventanaParametros.add(panelParametros);
        ventanaParametros.setSize(300, 150);
        ventanaParametros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar solo la ventana de parámetros
        ventanaParametros.setVisible(true);
    }
}

