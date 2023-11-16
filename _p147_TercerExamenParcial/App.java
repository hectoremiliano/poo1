package _p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    private ArrayList<Jugador> datos;
    private JMenuBar menuBar;
    private JMenu mnuArchivo, mnuAyuda;
    private JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    private JPanel pnlTabla, pnlDatos, pnlBotones;
    private JTable table;
    private DefaultTableModel modelo;
    private JButton btnAgregar, btnGrabar;
    private JLabel lblTotalSalario, lblHombres, lblMujeres, lblSolteros, lblCasados;

    public App() {
        super("Control de Jugadores de Fútbol");

        // Configuración del menú
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnuArchivo = new JMenu("Archivo");
        mnuAyuda = new JMenu("Ayuda");

        smnAbrir = new JMenuItem("Abrir");
        smnGuardar = new JMenuItem("Guardar");
        smnSalir = new JMenuItem("Salir");

        smnAbrir.addActionListener(this);
        smnGuardar.addActionListener(this);
        smnSalir.addActionListener(this);

        mnuArchivo.add(smnAbrir);
        mnuArchivo.add(smnGuardar);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);

        smnAcercade = new JMenuItem("Acerca de...");
        smnAcercade.addActionListener(this);
        mnuAyuda.add(smnAcercade);

        menuBar.add(mnuArchivo);
        menuBar.add(mnuAyuda);

        // Configuración del diseño y componentes del JFrame
        pnlTabla = new JPanel();
        add(pnlTabla, BorderLayout.CENTER);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"});
        table = new JTable(modelo);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        pnlTabla.add(new JScrollPane(table));

        pnlDatos = new JPanel(new GridLayout(6, 2));
        add(pnlDatos, BorderLayout.WEST);

        lblTotalSalario = new JLabel("Total Salario: ");
        lblHombres = new JLabel("Hombres: ");
        lblMujeres = new JLabel("Mujeres: ");
        lblSolteros = new JLabel("Solteros: ");
        lblCasados = new JLabel("Casados: ");

        pnlDatos.add(lblTotalSalario);
        pnlDatos.add(new JLabel(""));
        pnlDatos.add(lblHombres);
        pnlDatos.add(new JLabel(""));
        pnlDatos.add(lblMujeres);
        pnlDatos.add(new JLabel(""));
        pnlDatos.add(lblSolteros);
        pnlDatos.add(new JLabel(""));
        pnlDatos.add(lblCasados);
        pnlDatos.add(new JLabel(""));

        pnlBotones = new JPanel(new GridLayout(2, 1));
        add(pnlBotones, BorderLayout.SOUTH);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);

        pnlBotones.add(btnAgregar);
        pnlBotones.add(btnGrabar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        datos = Util.inicializarDatos();
        cargarDatos();
        calcularEstadisticas();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            System.exit(0);
        } else if (e.getSource() == smnAbrir) {
            // Implementa la lógica para cargar datos desde un archivo
        } else if (e.getSource() == smnGuardar) {
            // Implementa la lógica para guardar datos en un archivo
        } else if (e.getSource() == smnAcercade) {
            // Implementa la lógica para mostrar información "Acerca de..."
        } else if (e.getSource() == btnAgregar) {
            // Muestra un cuadro de diálogo para agregar un nuevo jugador
            mostrarDialogoAgregarJugador();
        } else if (e.getSource() == btnGrabar) {
            // Implementa la lógica para grabar los datos del jugador actual
        }

        // Después de cada acción, actualiza las estadísticas y la tabla
        calcularEstadisticas();
        cargarDatos();
    }

    private void mostrarDialogoAgregarJugador() {
        JDialog dialog = new JDialog(this, "Agregar Jugador", true);
        dialog.setLayout(new GridLayout(7, 2));

        JTextField txtNuevoNombre = new JTextField();
        JTextField txtNuevaEdad = new JTextField();
        JTextField txtNuevoSexo = new JTextField();
        JTextField txtNuevoEstadoCivil = new JTextField();
        JTextField txtNuevaDescripcion = new JTextField();
        JTextField txtNuevoSalario = new JTextField();

        dialog.add(new JLabel("Nombre:"));
        dialog.add(txtNuevoNombre);
        dialog.add(new JLabel("Edad:"));
        dialog.add(txtNuevaEdad);
        dialog.add(new JLabel("Sexo:"));
        dialog.add(txtNuevoSexo);
        dialog.add(new JLabel("Estado Civil:"));
        dialog.add(txtNuevoEstadoCivil);
        dialog.add(new JLabel("Descripción:"));
        dialog.add(txtNuevaDescripcion);
        dialog.add(new JLabel("Salario:"));
        dialog.add(txtNuevoSalario);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(e -> {
            try {
                String nombre = txtNuevoNombre.getText();
                int edad = Integer.parseInt(txtNuevaEdad.getText());
                String sexo = txtNuevoSexo.getText();
                String estadoCivil = txtNuevoEstadoCivil.getText();
                String descripcion = txtNuevaDescripcion.getText();
                double salario = Double.parseDouble(txtNuevoSalario.getText());

                Jugador nuevoJugador = new Jugador(nombre, edad, sexo.charAt(0), estadoCivil, descripcion, salario);
                datos.add(nuevoJugador);

                // Cierra el cuadro de diálogo
                dialog.dispose();

                // Después de agregar, actualiza las estadísticas y la tabla
                calcularEstadisticas();
                cargarDatos();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dialog, "Error en el formato de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        dialog.add(btnAceptar);

        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void cargarDatos() {
        // Implementa la lógica para cargar datos en la tabla
        modelo.setRowCount(0); // Limpia la tabla antes de cargar nuevos datos

        for (Jugador jugador : datos) {
            Object[] row = {jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(),
                    jugador.getDescripcion(), jugador.getSalario()};
            modelo.addRow(row);
        }
    }

    private void calcularEstadisticas() {
        double totalSalario = 0;
        int hombres = 0, mujeres = 0, solteros = 0, casados = 0;

        for (Jugador jugador : datos) {
            totalSalario += jugador.getSalario();
            if (jugador.getSexo() == 'M') {
                hombres++;
            } else {
                mujeres++;
            }

            if (jugador.getEstadoCivil().equalsIgnoreCase("Soltero")) {
                solteros++;
            } else {
                casados++;
            }
        }

        lblTotalSalario.setText("Total Salario: " + totalSalario);
        lblHombres.setText("Hombres: " + hombres);
        lblMujeres.setText("Mujeres: " + mujeres);
        lblSolteros.setText("Solteros: " + solteros);
        lblCasados.setText("Casados: " + casados);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);
        });
    }
}
