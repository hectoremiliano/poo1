import javax.swing.*;
import java.awt.Font;

public class _p139_HolaMundoGUI extends JFrame {

    private JLabel lblSaludo;

    public _p139_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola mundo GUI, Bienvenido");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 20)); // Cambié el tamaño de la fuente a 20 para que se ajuste mejor
        lblSaludo.setBounds(10, 20, 600, 30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        _p139_HolaMundoGUI app = new _p139_HolaMundoGUI();
        app.setSize(400, 100); // Cambié setBounds por setSize para establecer solo el tamaño
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Utilicé JFrame.EXIT_ON_CLOSE en lugar de EXIT_ON_CLOSE
    }
}
