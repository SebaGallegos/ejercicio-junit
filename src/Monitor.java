public class Monitor extends Producto{

    private String tamanio;
    public Monitor(int id, String marca, String precioU, String tamanio) {
        super(id, marca, precioU);
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                "tamanio='" + tamanio + '\'' +
                '}';
    }
}
