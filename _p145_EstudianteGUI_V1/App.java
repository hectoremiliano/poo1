package _p145_EstudianteGUI_V1;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    ArrayList<Estudiante> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblPeso, lblCorreo;
    JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;

    public App() {
        // ... (Tu código existente sigue aquí)
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        }
    }

    public void cargarDatos() {
        Object[] obj = new Object[4];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
    }
}