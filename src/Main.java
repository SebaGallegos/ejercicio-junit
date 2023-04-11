
public class Main {
    public static void main(String[] args) {

        Cliente cl = new Cliente(10, 1, "Seba", "Chile", 123, "hola@hola.com");
        Producto p = new Producto(1, "HP", "10");
        Computador c = new Computador(2, "Lenovo", "100", "amd", 8, 500);
        Monitor m = new Monitor(3, "lg", "200", "1920x1080");
        Mouse mo = new Mouse(4, "Logitech", "1000000");
        ReadCSV csv1 = new ReadCSV("/home/alumnos/IdeaProjects/ejercicio-junit5/src/csv/clientes.csv");
        ReadCSV csv2 = new ReadCSV("/home/alumnos/IdeaProjects/ejercicio-junit5/src/csv/productos.csv");

        /*System.out.println(cl);
        System.out.println(p);
        System.out.println(c);
        System.out.println(m);
        System.out.println(mo);*/


        csv2.doReadCSV();
    }
}