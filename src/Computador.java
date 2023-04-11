public class Computador extends Producto{

    private String cpu;
    private int ram;
    private int disco;

    public Computador(int id, String marca, String precioU, String cpu, int ram, int disco) {
        super(id, marca, precioU);
        this.cpu = cpu;
        this.ram = ram;
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Computador{" +
                super.toString() +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
                '}';
    }
}
