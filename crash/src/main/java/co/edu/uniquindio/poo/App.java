package co.edu.uniquindio.poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        ArrayList<Contacto>listaDeContactos=new ArrayList<>();
        String nombreGrupo=JOptionPane.showInputDialog("Ingrese el nombre del grupo: ");
        String categoria=JOptionPane.showInputDialog("Ingrese la categoría del grupo: ");
        Grupo datosGrupo=new Grupo(nombreGrupo,categoria);
        String descripcion=JOptionPane.showInputDialog("Ingrese la descripción del grupo: ");
        String fecha=JOptionPane.showInputDialog("Ingrese la fecha de la reunión: ");
        String hora=JOptionPane.showInputDialog("Ingrese la hora de la reunión: ");
        Reunion datosReunion= new Reunion(descripcion, fecha, hora);
        boolean continuar=true;
        
        while (continuar){
        
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre completo del contacto: ");
        String alias= JOptionPane.showInputDialog("Ingrese el Alias del contacto: ");
        String direccion= JOptionPane.showInputDialog("Ingrese la dirección de residencia del contacto: ");
        String telefono= JOptionPane.showInputDialog("Ingrese el número telefónico del contacto: ");
        String correo= JOptionPane.showInputDialog("Ingrese la dirección de correo electrónico del contacto: ");
        Contacto nuevoContacto=new Contacto(nombre, alias, direccion, telefono, correo);
        listaDeContactos.add(nuevoContacto);
        int respuesta =JOptionPane.showConfirmDialog(null,"Desea agregar otro contacto? ","Agregar contacto",JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.NO_OPTION){
            continuar=false;
        }
        

     }
     
     Grupo.mostrarMensaje(datosGrupo.toString());
     Grupo.mostrarMensaje(datosReunion.toString());
     Grupo.mostrarMensaje(listaDeContactos.toString());
    }
}
