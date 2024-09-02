package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReunionTest {
    private Reunion reunion;
    private Contacto contacto1;
    private Contacto contacto2;

    @BeforeEach
    public void setUp() {
        reunion = new Reunion("Reunión de Proyecto", "2024-09-02", "10:00 AM");
        contacto1 = new Contacto("Juan Perez", "Juan", "Calle 123", "1234567890", "juan@example.com");
        contacto2 = new Contacto("Maria Gomez", "Maria", "Avenida 456", "0987654321", "maria@example.com");
    }

    @Test
    public void testAgregarAsistente() {
        reunion.agregarAsistente(contacto1);
        assertEquals(1, reunion.getContactos().size());
        assertTrue(reunion.getContactos().contains(contacto1));
    }

    @Test
    public void testRemoverAsistente() {
        reunion.agregarAsistente(contacto1);
        reunion.removerAsistente(contacto1);
        assertEquals(0, reunion.getContactos().size());
        assertFalse(reunion.getContactos().contains(contacto1));
    }

    @Test
    public void testAgregarAsistenteDuplicado() {
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto1);
        assertEquals(1, reunion.getContactos().size());
    }
}
