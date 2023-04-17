package co.edu.uniquindio.marketplace.model;

import java.util.List;

public class Muro extends Vendedor{
    String mensaje;
    List<Comentario> comentarios;
    List<Vendedor> vendedores;
    List<Like> likeList;

    public Muro(String nombre, String apellido, String cedula, String direccion, String user, String password) {
        super(nombre, apellido, cedula, direccion, user, password);
    }
}
