import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {

    private String ruta;

    public ReadCSV(String ruta){
        this.ruta = ruta;
    }

    public void doReadCSV(){
        try {
            Scanner sc = new Scanner(new File(ruta));
            sc.useDelimiter(",");
            while (sc.hasNext()){
                System.out.print(sc.next() + " ");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
