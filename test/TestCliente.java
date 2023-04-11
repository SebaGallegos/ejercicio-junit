import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCliente {

    @Test
    public void testConstructor(){
        int rut = 123456789;
        int idCliente = 1;
        String nombre = "Juan Perez";
        String direccion = "Calle falsa 123";
        int telefono = 987654321;
        String email = "juanperez@mail.com";

        Cliente cliente = new Cliente(rut, idCliente, nombre, direccion, telefono, email);

        Assertions.assertEquals(rut, cliente.getRut());
        Assertions.assertEquals(idCliente, cliente.getIdCliente());
        Assertions.assertEquals(nombre, cliente.getNombre());
        Assertions.assertEquals(direccion, cliente.getDireccion());
        Assertions.assertEquals(telefono, cliente.getTelefono());
        Assertions.assertEquals(email, cliente.getEmail());
    }
}
