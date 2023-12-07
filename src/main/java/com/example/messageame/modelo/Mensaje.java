package com.example.messageame.modelo;

import java.time.LocalDateTime;    

public class Mensaje {
    private String contenido;
    private String remitente;
    private LocalDateTime horaEnvio;

    // Constructor
    public Mensaje(String contenido, String remitente) {
        this.contenido = contenido;
        this.remitente = remitente;
        this.horaEnvio = LocalDateTime.now();
    }

    // Métodos getter y setter

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public LocalDateTime getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(LocalDateTime horaEnvio) {
        this.horaEnvio = horaEnvio;
    }
    

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Mensaje{" +
                "contenido='" + contenido + '\'' +
                ", remitente='" + remitente + '\'' +
                ", horaEnvio=" + horaEnvio +
                '}';
    }
}
    

