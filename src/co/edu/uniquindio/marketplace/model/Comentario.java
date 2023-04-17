package co.edu.uniquindio.marketplace.model;

import java.util.Date;

public class Comentario extends Muro{
    Date fecha;
    Vendedor autor;

    public Comentario(String nombre, String apellido, String cedula, String direccion, String user, String password) {
        super(nombre, apellido, cedula, direccion, user, password);
    }
}
