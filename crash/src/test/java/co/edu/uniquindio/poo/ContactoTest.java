package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ContactoTest {
    private ArrayList<Contacto> listaDeContactos;

    @BeforeEach
    public void setUp() {
        listaDeContactos = new ArrayList<>();
    }

    @Test
    public void testAgregarContactoNoDuplicado() {
        Contacto contacto1 = new Contacto("Juan Perez", "Juan", "Calle 123", "1234567890", "juan@example.com");
        agregarContacto(listaDeContactos, contacto1);
        assertEquals(1, listaDeContactos.size());
    }

    @Test
    public void testAgregarContactoDuplicado() {
        Contacto contacto1 = new Contacto("Juan Perez", "Juan", "Calle 123", "1234567890", "juan@example.com");
        Contacto contactoDuplicado = new Contacto("Juan Perez", "Juan", "Calle 123", "1234567890", "juan@example.com");
        agregarContacto(listaDeContactos, contacto1);
        agregarContacto(listaDeContactos, contactoDuplicado);
        assertEquals(1, listaDeContactos.size());
    }

    private void agregarContacto(ArrayList<Contacto> listaDeContactos, Contacto nuevoContacto) {
        if (!esDuplicado(listaDeContactos, nuevoContacto)) {
            listaDeContactos.add(nuevoContacto);
        }
    }

    private boolean esDuplicado(ArrayList<Contacto> listaDeContactos, Contacto nuevoContacto) {
        for (Contacto contacto : listaDeContactos) {
            if (contacto.getNombre().equals(nuevoContacto.getNombre()) && contacto.getTelefono().equals(nuevoContacto.getTelefono())) {
                return true;
            }
        }
        return false;
    }
}