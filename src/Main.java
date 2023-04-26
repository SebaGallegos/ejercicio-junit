import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Implementar menu
        Cliente c1 = new Cliente(204935432,0,"Camilo","Osorno",935785963,"Camilo123@gmail.com");
        HelperCliente leercliente = new HelperCliente();

        leercliente.actualizarArchivo(0,c1);
        leercliente.leerArchivo();

    }
}