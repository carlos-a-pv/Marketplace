package co.edu.uniquindio.marketplace.model;

import java.util.Date;

public class Like extends Muro{
    Date fecha;
    Vendedor autor;

    public Like(String nombre, String apellido, String cedula, String direccion, String user, String password) {
        super(nombre, apellido, cedula, direccion, user, password);
    }
}
