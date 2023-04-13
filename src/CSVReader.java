import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {

    // Constructor
    public CSVReader() {
    }

    public void productoCSV(String nCaracteristica) throws FileNotFoundException {
        String path = new File("src/csv/productos.csv").getAbsolutePath();
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",");

        if (nCaracteristica.equals("0") || nCaracteristica.equals("1") || nCaracteristica.equals("3")) {
            String encabezado = sc.nextLine();
            String[] columnas = encabezado.split(",");

            // Se restan 3 columnas base
            int numColumnas = columnas.length - 3;

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] valores = linea.split(",");
                if ((valores.length - 3) == Integer.parseInt(nCaracteristica)) {
                    for (int i = 0; i < valores.length; i++) {
                        System.out.print(valores[i] + "\t");
                    }
                    System.out.println();
                }
            }
        } else if (nCaracteristica.equals("no")) {
            while (sc.hasNext()) {
                System.out.print(sc.next() + "\t");
            }
        } else {
            System.out.println("Opcion no valida");
        }
        sc.close();
    }

    public void clienteCSV() {
        try {
            String path = new File("src/csv/clientes.csv").getAbsolutePath();
            Scanner sc = new Scanner(new File(path));
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                System.out.print(sc.next() + "\t");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
