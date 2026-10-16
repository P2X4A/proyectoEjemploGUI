package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.util.Constants;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.DialogoRegistro;

public class Controller implements ActionListener {

    private VentanaPrincipal ventanaPrincipal;

    public Controller() {
        // Iniciar Swing en el hilo correcto
        SwingUtilities.invokeLater(() -> {
            ventanaPrincipal = new VentanaPrincipal(this);
            ventanaPrincipal.setVisible(true);
        });
    }

    public void execute() {
        // Punto de entrada opcional si se necesitara instanciar la persistencia y logica de negocio
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case Constants.ITEM_NUEVA_TABLA -> manejarNuevaTabla();
            //En caso de mas botones se manejan otras acciones
        }
    }



    private void manejarNuevaTabla() {
        DialogoRegistro dialogo = ventanaPrincipal.getDialogoRegistro();
        DefaultTableModel modelo = dialogo.getModeloTabla();

        // Limpiar todas las filas existentes
        modelo.setRowCount(0);
    }
}
