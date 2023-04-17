package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado{
    private  String contra;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String bibliografia;
    private ArrayList <Producto> productos;

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Vendedor(String nombre, String apellido, String cedula, String direccion, String user, String password){
         super(new Usuario(user, password));
         Usuario userNew = new Usuario(user, password);
         this.nombre = nombre;
         this.apellido = apellido;
         this.cedula = cedula;
         this.direccion = direccion;
         this.bibliografia = bibliografia;
         contra = userNew.getPassword();
         productos=new ArrayList<>();

     }

     public String getContra(){
         return this.contra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "contra='" + contra + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", bibliografia='" + bibliografia + '\'' +
                '}';
    }
}
