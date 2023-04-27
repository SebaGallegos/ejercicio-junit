import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProductos {

    @Test
    public void testProducto(){
        int idProducto = 1;
        String marca = "Marca";
        int precioUnitario = 1000;

        Producto producto = new Producto(idProducto, marca, precioUnitario);

        Assertions.assertEquals(idProducto, producto.getIdProducto());
        Assertions.assertEquals(marca, producto.getMarca());
        Assertions.assertEquals(precioUnitario, producto.getPrecioUnitario());
    }

    @Test
    public void testComputador(){
        int idProducto = 1;
        String marca = "Marca";
        int precioUnitario = 1000;
        String cpu = "intel";
        int ram = 8;
        int disco = 500;

        Computador computador = new Computador(idProducto, marca, precioUnitario, cpu, ram, disco);

        Assertions.assertEquals(idProducto, computador.getIdProducto());
        Assertions.assertEquals(marca, computador.getMarca());
        Assertions.assertEquals(precioUnitario, computador.getPrecioUnitario());
        Assertions.assertEquals(cpu, computador.getCpu());
        Assertions.assertEquals(ram, computador.getRam());
        Assertions.assertEquals(disco, computador.getDisco());
    }

    @Test
    public void testMonitor(){
        int idProducto = 1;
        String marca = "Marca";
        int precioUnitario = 1000;
        int tamanio = 32;

        Monitor monitor = new Monitor(idProducto, marca, precioUnitario, tamanio);

        Assertions.assertEquals(idProducto, monitor.getIdProducto());
        Assertions.assertEquals(marca, monitor.getMarca());
        Assertions.assertEquals(precioUnitario, monitor.getPrecioUnitario());
        Assertions.assertEquals(tamanio, monitor.getTamanio());
    }

    @Test
    public void testMouse(){
        int idProducto = 1;
        String marca = "Marca";
        int precioUnitario = 1000;

        Mouse mouse = new Mouse(idProducto, marca, precioUnitario);

        Assertions.assertEquals(idProducto, mouse.getIdProducto());
        Assertions.assertEquals(marca, mouse.getMarca());
        Assertions.assertEquals(precioUnitario, mouse.getPrecioUnitario());
    }
}
