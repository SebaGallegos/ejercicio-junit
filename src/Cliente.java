import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int rut;
    private int idCliente;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;

    // Revisar atributo de lista de producto por cada cliente
    List<Producto> listaP = new ArrayList<Producto>();

    public Cliente(int rut, int idCliente, String nombre, String direccion, int tel, String email){
        this.rut = rut;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = tel;
        this.email = email;
    }

    public Cliente(){ }

    //public void comprarProducto(){}

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getRut() {
        return rut;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Producto> getListaP() {
        return listaP;
    }
}
