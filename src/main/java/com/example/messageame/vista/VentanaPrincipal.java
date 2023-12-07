package com.example.messageame.vista;

import javax.swing.*;

import com.example.messageame.controlador.ControladorMensajes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private ControladorMensajes controladorMensajes;

    // Constructor
    public VentanaPrincipal(ControladorMensajes controladorMensajes) {
        this.controladorMensajes = controladorMensajes;

        // Configuración de la ventana
        setTitle("Mensajería Instantánea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Crear componentes
        JTextArea areaChat = new JTextArea();
        JTextField campoMensaje = new JTextField();
        JButton botonEnviar = new JButton("Enviar");

        // Configurar diseño de la ventana
        setLayout(new BorderLayout());
        add(new JScrollPane(areaChat), BorderLayout.CENTER);
        add(campoMensaje, BorderLayout.SOUTH);
        add(botonEnviar, BorderLayout.EAST);

        // Configurar acciones
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = campoMensaje.getText();
                if (!mensaje.isEmpty()) {
                    controladorMensajes.enviarMensaje(mensaje, "UsuarioActual");
                    campoMensaje.setText(""); // Limpiar el campo de texto después de enviar el mensaje
                }
            }
        });

        // Mostrar un mensaje de bienvenida al iniciar la aplicación
        mostrarMensaje("Bienvenido a la aplicación de mensajería instantánea.");
    }

    // Método para mostrar un mensaje en el área de chat
    public void mostrarMensaje(String mensaje) {
        JTextArea areaChat = (JTextArea) getContentPane().getComponent(0);
        areaChat.append(mensaje + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ControladorMensajes controlador = new ControladorMensajes();
            VentanaPrincipal ventana = new VentanaPrincipal(controlador);
            ventana.setVisible(true);
        });
    }
}
