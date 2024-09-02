package co.edu.uniquindio.poo;

public class Grupo {
    private String nombre;
    private String categoria;
   

    public Grupo(String nombre, String categoria){
        this.nombre= nombre;
        this.categoria= categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "El nombre del grupo es: " + nombre + " \n La categoría es: " + categoria;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
