import javax.swing.*;
import java.awt.*;

public class Inp {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton buttonInfo, buttonFuncion;
    private Dialog dialog;

    public Inp() {
        frame = new JFrame("Interfaz Hospital");
        panel = new JPanel(new GridLayout(2, 2)); // GridLayout de 2 filas y 2 columnas
        textField = new JTextField(20);
        buttonInfo = new JButton("Información");
        buttonFuncion = new JButton("Función"); 
        //dialog = new Dialog("frame");
        // Añadir textField en la primera fila y primera columna
        panel.add(textField);
        // Crear un panel para agrupar los botones
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        // Crear GridBagConstraints para controlar la ubicación de los botones
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Establecer la columna 1
        gbc.gridy = 0; // Establecer la fila 1
        gbc.fill = GridBagConstraints.VERTICAL; // Expandir horizontalmente
        buttonPanel.add(buttonInfo, gbc); // Añadir el botón de Información al panel
        gbc.gridy = 1; // Establecer la fila 2
        buttonPanel.add(buttonFuncion, gbc); // Añadir el botón de Función al panel

        panel.add(buttonPanel); // Añadir el panel de botones a la segunda columna
        //panel.add(dialog);
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}
