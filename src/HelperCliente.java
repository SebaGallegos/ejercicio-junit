import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelperCliente implements Helper{

    public void leerArchivo() {
        try {
            String path = new File("src/csv/clientes.csv").getAbsolutePath();
            Scanner sc = new Scanner(new File(path));
            sc.useDelimiter(",");
            while (sc.hasNextLine()) {
                System.out.print(sc.nextLine() + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void escribirArchivo() {

    }

    public void actualizarArchivo() {

    }
}
