import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelperProducto implements Helper{

    public void leerArchivo(int nCaracteristica) {
        String path = new File("src/csv/productos.csv").getAbsolutePath();
        Scanner sc = null;
        try {
            sc = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        sc.useDelimiter(",");

        if (nCaracteristica == 0 || nCaracteristica == 1 || nCaracteristica == 3) {
            String encabezado = sc.nextLine();
            String[] columnas = encabezado.split(",");

            // Se restan 3 columnas base
            int numColumnas = columnas.length - 3;

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] valores = linea.split(",");
                if ((valores.length - 3) == nCaracteristica) {
                    for (String valore : valores) {
                        System.out.print(valore + " \t");
                    }
                    System.out.println();
                }
            }
        } else if (nCaracteristica == -1) {
            while (sc.hasNext()) {
                System.out.print(sc.next() + "\t");
            }
        } else {
            System.out.println("Opcion no valida");
        }
        sc.close();
    }

    @Override
    public void leerArchivo() {

    }

    public void escribirArchivo() {

    }

    public void actualizarArchivo() {

    }
}
