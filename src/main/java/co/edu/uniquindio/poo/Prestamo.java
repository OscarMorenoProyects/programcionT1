package co.edu.uniquindio.poo;


import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;


public class Prestamo {

    public    LocalDate fechaPrestamo;
    public   LocalDate fechaEntrega;
    public static String codigo;
    public   double costoDia;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    public Biblioteca biblioteca;
    

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    private Collection<Reporte> reportes;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, String codigo, double costoDia,
            Estudiante estudiante,
            Bibliotecario bibliotecario, Biblioteca biblioteca) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.codigo = codigo;
        this.costoDia = costoDia;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.biblioteca = biblioteca;

        reportes = new LinkedList<>();

    }

    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega + ", codigo=" + codigo
                + ", costoDia=" + costoDia + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario
                + ", reportes=" + reportes + "]";
    }


    public void agregarLibro(Libro libro, int cantidad, double precioUnitario) {
        Reporte reporte = new Reporte(cantidad, precioUnitario, this, libro);
        reportes.add(reporte);
    }

    public static double costoPrestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, double costoDia) {
        
        int dias = (int) (fechaEntrega.toEpochDay() - fechaPrestamo.toEpochDay());
        double costoTotal = dias * costoDia;
        
        return costoTotal;
    }

}
