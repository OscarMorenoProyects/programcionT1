package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante  extends Persona{

   public Biblioteca biblioteca;
   
   public  LinkedList<Prestamo>prestamos;

   
  

@Override
public String toString() {
    return "Estudiante [getNombre()=" + getNombre() + ", getCorreo()=" + getCorreo() + ", getEdad()=" + getEdad()
            + ", getCedula()=" + getCedula() + ", getTelefono()=" + getTelefono() + "]";
}

public Biblioteca getBiblioteca() {
    return biblioteca;
}

public void setBiblioteca(Biblioteca biblioteca) {
    this.biblioteca = biblioteca;
}

public LinkedList<Prestamo> getPrestamos() {
    return prestamos;
}

public void setPrestamos(LinkedList<Prestamo> prestamos) {
    this.prestamos = prestamos;
}

public int getCantidadPrestamos() {
    return prestamos.size();
}

public Estudiante(String nombre, String correo, int edad, int cedula, int telefono, Biblioteca biblioteca) {
    super(nombre, correo, edad, cedula, telefono);
    this.biblioteca = biblioteca;
}



    
    
}
