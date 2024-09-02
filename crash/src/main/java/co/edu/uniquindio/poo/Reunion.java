package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private LinkedList<Contacto> contactos;

    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactos = new LinkedList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarAsistente(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
        }
    }

    public void removerAsistente(Contacto contacto) {
        contactos.remove(contacto);
    }

    @Override
    public String toString() {
        return "Descripción de la reunión: " + descripcion + "\n La fecha de la reunión es: " + fecha + " \n La hora inicial de la reunión es: " + hora + "\n\n Los contactos asistentes son: \n" + contactos;
    }
}