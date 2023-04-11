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
            String path = new File(ruta).getAbsolutePath();
            Scanner sc = new Scanner(new File(path));
            //sc.useDelimiter(",");
            while (sc.hasNext()){
                System.out.print(sc.next() + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
