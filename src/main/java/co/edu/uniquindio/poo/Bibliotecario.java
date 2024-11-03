package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona {
    
    public  double salario;
    public Biblioteca biblioteca;
    private int añosAntiguedad;
 

    private  static LinkedList<Prestamo>prestamos;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public Bibliotecario(String nombre, String correo, int edad, int cedula, int telefono, double salario,
            Biblioteca biblioteca,int añosAntiguedad) {
        super(nombre, correo, edad, cedula, telefono);
        this.salario = salario;
        this.añosAntiguedad=añosAntiguedad;
        this.biblioteca = biblioteca;
        prestamos=new LinkedList<>();
    }
    
}
