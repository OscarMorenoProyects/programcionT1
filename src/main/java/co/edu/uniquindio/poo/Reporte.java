package co.edu.uniquindio.poo;
import java.util.List;

public class Reporte {

    public static int cantidad;
    private double subTotal;
    private Prestamo prestamo;
    public Libro libro;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Reporte(int cantidad, double subTotal, Prestamo prestamo, Libro libro) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.prestamo = prestamo;
        this.libro = libro;
    }

    public void estudianteConMasPrestamos() {
        int maxPrestamos = 0;
        int esMayor = -1;

        for (int i = 0; i < Biblioteca.estudiantes.size(); i++) {
            Estudiante estudiante = Biblioteca.estudiantes.get(i);
            int prestamosE = estudiante.getCantidadPrestamos();
            if (prestamosE > maxPrestamos) {
                esMayor = prestamosE;
                esMayor = i;

            }

        }

        if (esMayor != -1) {
            Estudiante estudiamteMax = Biblioteca.estudiantes.get(esMayor);
            Biblioteca.imprimir("el estudiante con mas prestamos es: " + estudiamteMax.toString()
                    + "que tiene una cantidad de prestamos de: " + maxPrestamos);

        } else {
            Biblioteca.imprimir("no hay estudiante con mayor numero de prestamos");
        }

    }

    public void totalDineroRecaudadoEmpresa() {
        double costoT = 0.0;
        for (Prestamo prestamo : Biblioteca.prestamos) {
            costoT = costoT + (Prestamo.costoPrestamo(prestamo.getFechaPrestamo(), prestamo.getFechaEntrega(),
                    prestamo.getCostoDia()));
        }
        Biblioteca.imprimir("el costo total recaudado por la biblioteca es: " + costoT);

    }

    public void valorPagarBibliotecarios() {
        int contB;
        double costoT;
        int totalP=0 ;
        Biblioteca biblioteca = new Biblioteca("BibliotecaQuindio", "cra 18 norte");
        List<Bibliotecario> bibliotecarios = biblioteca.getBibliotecarios();
     for (Bibliotecario bibliotecario:bibliotecarios) {
        int prestamosRealizados=bibliotecario.getPrestamos().size();
         contB=bibliotecario.getAñosAntiguedad();

        for (Prestamo prestamo : bibliotecario.getPrestamos()) {
            costoT=prestamo.costoPrestamo(prestamo.getFechaPrestamo() , prestamo.getFechaEntrega(),prestamo.costoDia);
            costoT=costoT*0.20;
            

        }

        
        
        
            
     }

}
}