public class Producto {

    private int idProducto;
    private String marca;
    private int precioUnitario;

    public Producto(int id, String marca, int precioU){
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

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }
}
