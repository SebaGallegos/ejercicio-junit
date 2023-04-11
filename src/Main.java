import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Cliente cl = new Cliente(10, 1, "Seba", "Chile", 123, "hola@hola.com");
        Producto p = new Producto(1, "HP", "10");
        Computador c = new Computador(2, "Lenovo", "100", "amd", 8, 500);
        Monitor m = new Monitor(3, "lg", "200", "1920x1080");
        Mouse mo = new Mouse(4, "Logitech", "1000000");

        // Metodos de tipo CSVReader
        CSVReader listaclientes = new CSVReader();
        CSVReader listaproductos = new CSVReader();
        CSVReader listaproductos_pc = new CSVReader();
        CSVReader listaproductos_m = new CSVReader();
        CSVReader listaproductos_mo = new CSVReader();

        // Lectura de distintos tipos de datos en Archivos CSV


    }
}