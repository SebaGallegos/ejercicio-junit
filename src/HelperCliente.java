import java.io.*;
import java.util.ArrayList;
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

    @Override
    public void escribirArchivo() {

    }

    @Override
    public void actualizarArchivo() {

    }

    public void escribirArchivo(Cliente clienteNuevo) {
        try{
            String path = new File("src/csv/clientes.csv").getAbsolutePath();
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            boolean existeCliente = false;
            String linea;

            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if(Integer.parseInt(datos[2]) == clienteNuevo.getIdCliente()){
                    existeCliente = true;
                    break;
                }
            }

            br.close();
            fr.close();

            if(existeCliente){
                System.out.println("Cliente ya existe");
                return;
            }

            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(clienteNuevo.getRut() + "," +
                    clienteNuevo.getNombre() + "," +
                    clienteNuevo.getIdCliente() + "," +
                    clienteNuevo.getDireccion() + "," +
                    clienteNuevo.getTelefono() + "," +
                    clienteNuevo.getEmail() + System.lineSeparator());

            bw.close();
            fw.close();


        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public void actualizarArchivo(Cliente clienteActualizado) {
        try{
            String path = new File("src/csv/clientes.csv").getAbsolutePath();
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> lineas = new ArrayList<String>();
            String lineaActual;
            boolean encontrado = false;
            boolean primeraLinea = true;

            while ((lineaActual = br.readLine()) != null){

                if(primeraLinea){
                    lineas.add(lineaActual);
                    primeraLinea = false;
                    continue;
                }

                String[] datosCliente = lineaActual.split(",");
                int idCliente;

                try{
                    idCliente = Integer.parseInt(datosCliente[2]);
                } catch (NumberFormatException e){
                    //System.out.println("Error al convertir el id del cliente: " + e.getMessage());
                    continue;
                }

                if (idCliente == clienteActualizado.getIdCliente()){
                    lineaActual = String.valueOf(clienteActualizado.getRut()) + "," +
                                    clienteActualizado.getNombre() + "," +
                                    idCliente + "," +
                                    clienteActualizado.getDireccion() + "," +
                                    String.valueOf(clienteActualizado.getTelefono()) + "," +
                                    clienteActualizado.getEmail();

                    encontrado = true;
                }

                lineas.add(lineaActual);
            }

            br.close();
            fr.close();

            if(!encontrado){
                System.out.println("Cliente no existe");
                return;
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < lineas.size(); i++) {
                bw.write(lineas.get(i));

                if (i < lineas.size() - 1) {
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
            String path = new File("src/csv/clientes.csv").getAbsolutePath();
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if (datos.length > 2 && datos[2].equals(String.valueOf(id))){
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
