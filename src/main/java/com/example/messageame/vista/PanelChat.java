package com.example.messageame.vista;

import javax.swing.*;
import java.awt.*;

public class PanelChat extends JPanel {
    private JTextArea areaChat;

    // Constructor
    public PanelChat() {
        // Configuración del panel de chat
        setLayout(new BorderLayout());
        areaChat = new JTextArea();
        areaChat.setEditable(false); // El área de chat no es editable por el usuario
        JScrollPane scrollPane = new JScrollPane(areaChat);
        add(scrollPane, BorderLayout.CENTER);
    }

    // Método para mostrar un mensaje en el área de chat
    public void mostrarMensaje(String mensaje) {
        areaChat.append(mensaje + "\n");
    }
}
