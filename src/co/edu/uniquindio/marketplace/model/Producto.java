package co.edu.uniquindio.marketplace.model;

import javafx.scene.image.Image;

public class Producto {
    String nombre;
    String precio;

    Categoria categoria;
    Estado estado;
    Image imagen;

    public Producto( String nombre1, String precio, Categoria categoria,Estado estado) {
        this.nombre = nombre1;
        this.precio = precio;
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}

