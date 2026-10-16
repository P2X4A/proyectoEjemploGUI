package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DialogoRegistro extends JPanel {
    // Datos a trabajar
    private JTable tablaDatos;
    private DefaultTableModel modeloTabla;

    public DialogoRegistro() {
        // Se usa BorderLayout para que la tabla ocupe todo el espacio disponible
        setLayout(new BorderLayout());
        initComponents();
    }

    public void initComponents() {
        // Se crean las columnas basándose en las etiquetas que haya
        String[] columnas = { "Nombre", "Correo", "Programa", "Facultad", "Celular" };

        // Se inicializa el modelo de la tabla
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaDatos = new JTable(modeloTabla);

        // El JScrollPane es obligatorio para que los encabezados de las columnas sean visibles
        JScrollPane scrollTabla = new JScrollPane(tablaDatos);

        add(scrollTabla, BorderLayout.CENTER);
    }

    // Getters para manipular los datos de la tabla desde el Controlador
    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public JTable getTablaDatos() {
        return tablaDatos;
    }
}
