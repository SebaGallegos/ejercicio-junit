public class Monitor extends Producto{

    private int tamanio;
    public Monitor(int id, String marca, int precioU, int tamanio) {
        super(id, marca, precioU);
        this.tamanio = tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                "tamanio='" + tamanio + '\'' +
                '}';
    }
}
