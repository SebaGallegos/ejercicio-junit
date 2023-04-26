import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        // Toma de datos
        System.out.print("Rut? ");
        int rut = sc.nextInt();

        System.out.print("id? ");
        int id = sc.nextInt();

        System.out.print("Nombre? ");
        String nombre = sc.next();

        System.out.print("dir? ");
        String dir = sc.next();

        System.out.print("tel? ");
        int tel = sc.nextInt();

        System.out.print("mail? ");
        String mail = sc.next();

        Cliente c = new Cliente(rut, id, nombre, dir, tel, mail);
        HelperCliente hc = new HelperCliente();

        hc.actualizarArchivo(c.getIdCliente(),c);
        hc.leerArchivo();



    }
}