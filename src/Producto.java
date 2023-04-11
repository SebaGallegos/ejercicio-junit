public class Producto {

    private int idProducto;
    private String marca;
    private String precioUnitario;

    public Producto(int id, String marca, String precioU){
        this.idProducto = id;
        this.marca = marca;
        this.precioUnitario = precioU;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", marca='" + marca + '\'' +
                ", precioUnitario='" + precioUnitario + '\'' +
                '}';
    }
}
