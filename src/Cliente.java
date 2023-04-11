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

    /*@Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }*/
}
