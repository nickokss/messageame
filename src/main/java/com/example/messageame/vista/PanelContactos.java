package com.example.messageame.vista;

import javax.swing.*;
import java.awt.*;

public class PanelContactos extends JPanel {
    private JList<String> listaContactos;

    // Constructor
    public PanelContactos() {
        // Configuración del panel de contactos
        setLayout(new BorderLayout());
        listaContactos = new JList<>();
        JScrollPane scrollPane = new JScrollPane(listaContactos);
        add(scrollPane, BorderLayout.CENTER);
    }

    // Método para actualizar la lista de contactos
    public void actualizarListaContactos(String[] contactos) {
        listaContactos.setListData(contactos);
    }
}
