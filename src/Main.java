import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Cliente cl = new Cliente(10, 1, "Seba", "Chile", 123, "hola@hola.com");
        Producto p = new Producto(1, "HP", 10);
        Computador c = new Computador(2, "Lenovo", 100, "amd", 8, 500);
        Monitor m = new Monitor(3, "lg", 200, 32);
        Mouse mo = new Mouse(4, "Logitech", 1000000);

        // Metodo de tipo CSVReader
        //CSVReader listascsv = new CSVReader();
        HelperCliente csvcliente = new HelperCliente();
        HelperProducto prod = new HelperProducto();

        // Lectura de distintos tipos de datos en Archivos CSV
        // Descomentar llamada a metodo

        System.out.println("Lista de clientes\n");
        //listascsv.clienteCSV();
        //csvcliente.leerArchivo();

        System.out.println("Lista de todos los productos\n");
        //listascsv.productoCSV("no");
        prod.leerArchivo(3);

        System.out.println("Lista de todos los computadores\n");
        //listascsv.productoCSV("3");

        System.out.println("Lista de todos los monitores\n");
        //listascsv.productoCSV("1");

        System.out.println("Lista de todos los Mouse\n");
        //listascsv.productoCSV("0");


    }
}