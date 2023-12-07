package com.example.messageame.controlador;

import java.util.ArrayList;
import java.util.List;

import com.example.messageame.modelo.Mensaje;

public class ControladorMensajes {
    private List<Mensaje> mensajes;

    public ControladorMensajes() {
        this.mensajes = new ArrayList<>();
    }

    // Método para enviar un mensaje
    public void enviarMensaje(String contenido, String remitente) {
        Mensaje mensaje = new Mensaje(contenido, remitente);
        mensajes.add(mensaje);
        // Aquí podrías implementar la lógica para enviar el mensaje a través de la red, por ejemplo, a un servidor de mensajería.
    }

    // Método para recibir un mensaje
    public void recibirMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
        // Aquí podrías implementar la lógica para mostrar el mensaje recibido en la interfaz de usuario.
    }

    // Método para obtener todos los mensajes
    public List<Mensaje> obtenerTodosLosMensajes() {
        return new ArrayList<>(mensajes);
    }
}
