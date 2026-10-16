package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import co.edu.unbosque.util.Constants;

public class VentanaPrincipal extends JFrame {

    private JMenuBar barraMenu;
    private DialogoRegistro dialogoRegistro;

    public VentanaPrincipal(ActionListener actionListener) {
        // Tamaño de la ventana
        setSize(700, 300);
        // Título
        setTitle("Registro Tabla");
        // No redimensionable
        setResizable(false);
        // Cerrar aplicación al pulsar X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centrar en pantalla
        setLocationRelativeTo(null);
        // Layout principal
        setLayout(new BorderLayout());

        // Construir menú
        construirBarraMenu(actionListener);

        // Instanciar el panel que contiene la JTable
        dialogoRegistro = new DialogoRegistro();
        // Agregarlo al centro de la ventana
        add(dialogoRegistro, BorderLayout.CENTER);
    }

    private void construirBarraMenu(ActionListener actionListener) {
        barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");

        JMenuItem menuArchivoItemNuevo = new JMenuItem("Nueva Tabla");

        // Usar constante del package util
        menuArchivoItemNuevo.setActionCommand(Constants.ITEM_NUEVA_TABLA);
        menuArchivoItemNuevo.addActionListener(actionListener);

        menuArchivo.add(menuArchivoItemNuevo);
        barraMenu.add(menuArchivo);

        setJMenuBar(barraMenu);
    }

    public DialogoRegistro getDialogoRegistro() {
        return dialogoRegistro;
    }
}
