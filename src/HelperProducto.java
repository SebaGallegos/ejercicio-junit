import java.io.*;
import java.util.ArrayList;
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
                    for (String valor : valores) {
                        System.out.print(valor + " \t");
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

    @Override
    public void escribirArchivo() {

    }

    @Override
    public void actualizarArchivo() {

    }

    public void escribirArchivo(Producto producto) {
        try{
            String path = new File("src/csv/productos.csv").getAbsolutePath();
            File archivo = new File(path);
            FileWriter fw = new FileWriter(archivo, true);
            StringBuilder sb = new StringBuilder();

            sb.append(producto.getIdProducto()).append(",");
            sb.append(producto.getMarca()).append(",");
            sb.append(producto.getPrecioUnitario()).append(",");

            if(producto instanceof Computador){
                Computador c = (Computador) producto;
                sb.append(c.getCpu()).append(",");
                sb.append(c.getRam()).append(",");
                sb.append(c.getDisco());
            } else if (producto instanceof Monitor){
                Monitor m = (Monitor) producto;
                sb.append(m.getTamanio());
            } else {
                // Mouse
            }

            sb.append("\n");
            fw.write(sb.toString());
            fw.close();

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void actualizarArchivo(Producto producto) {
        try{
            String path = new File("src/csv/productos.csv").getAbsolutePath();
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> lineas = new ArrayList<String>();
            String lineaActual;
            boolean encontrado = false;
            boolean primeralinea = true;

            while ((lineaActual = br.readLine()) != null){
                if(primeralinea){
                    lineas.add(lineaActual);
                    primeralinea = false;
                    continue;
                }

                String[] datosProducto = lineaActual.split(",");
                int idProducto;

                try{
                    idProducto = Integer.parseInt(datosProducto[0]);
                } catch (NumberFormatException e){
                    //System.out.println("Error");
                    continue;
                }

                if (idProducto == producto.getIdProducto()) {
                    lineaActual = producto.getIdProducto() + "," +
                            producto.getMarca() + "," +
                            producto.getPrecioUnitario();

                    if (producto instanceof Computador) {
                        Computador c = (Computador) producto;
                        lineaActual = lineaActual + "," +
                                c.getCpu() + "," +
                                c.getRam() + "," +
                                c.getDisco();
                    } else if (producto instanceof Monitor) {
                        Monitor m = (Monitor) producto;
                        lineaActual = lineaActual + "," +
                                m.getTamanio();
                    } else {
                        // Mouse
                    }

                    encontrado = true;
                }

                lineas.add(lineaActual);
            }

            br.close();
            fr.close();

            if(!encontrado){
                System.out.println("Producto no existe");
                return;
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < lineas.size(); i++){
                bw.write(lineas.get(i));

                if (i < lineas.size() - 1){
                    bw.newLine();
                }
            }

            bw.close();
            fw.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void leerLinea(int id){
        try{
            String path = new File("src/csv/productos.csv").getAbsolutePath();
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if (datos.length > 2 && datos[0].equals(String.valueOf(id))){
                    System.out.println(linea);
                    break;
                }
            }

            br.close();
            fr.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
