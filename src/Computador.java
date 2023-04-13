public class Computador extends Producto{

    private String cpu;
    private int ram;
    private int disco;

    public Computador(int id, String marca, int precioU, String cpu, int ram, int disco) {
        super(id, marca, precioU);
        this.cpu = cpu;
        this.ram = ram;
        this.disco = disco;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public int getDisco() {
        return disco;
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
