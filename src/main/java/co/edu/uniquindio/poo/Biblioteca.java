package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre, direccion;
    private LinkedList<Bibliotecario> bibliotecarios;
    public static ArrayList<Prestamo> prestamos;
    public static ArrayList<Estudiante> estudiantes;
    private Collection<Reporte> reportes;
    public ArrayList<Libro> libros;

    public static ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public static void setPrestamos(ArrayList<Prestamo> prestamos) {
        Biblioteca.prestamos = prestamos;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Collection<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(Collection<Reporte> reportes) {
        this.reportes = reportes;
    }

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        bibliotecarios = new LinkedList<>();
        prestamos = new ArrayList<>();
        estudiantes = new ArrayList<>();
        reportes = new LinkedList<>();
        libros = new ArrayList<>();
    }

    public void crearBibliotecario(String nombre, int cedula, int edad, int telefono, String correo, double salario,
            Biblioteca biblioteca,int añosAntiguedad) {
        Bibliotecario bibliotecario = new Bibliotecario(nombre, correo, edad, cedula, telefono, salario, biblioteca, añosAntiguedad);
        bibliotecarios.add(bibliotecario);

    }

    public void crearEstudiante(String nombre, int cedula, int edad, int telefono, String correo,
            Biblioteca biblioteca) {
        Estudiante estudiante = new Estudiante(nombre, correo, edad, cedula, telefono, biblioteca);
        estudiantes.add(estudiante);
    }

    public void crearLibro(String Codigo, String titulo, String isbn, String editorial, int uDisponibles, Estado estado,
            Autor autor) {
        Libro libro = new Libro(Codigo, isbn, titulo, editorial, uDisponibles, estado, autor);
        libros.add(libro);
    }

    public void consultarDatoLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                imprimir(libro.toString());
            }
        }
    }

    public int consultarCantidadPrestamo(String nombre) {
        int cont = 0;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(nombre)) {
                cont = Reporte.cantidad;
            }
        }

        return cont;
    }

    public void reemplazarLibro(String nombre, String nNombre, String isbn, String nTitulo, String nEditorial,
            int uDisponibles, Estado estado, Biblioteca biblioteca, Autor autor, String nCode) {
        for (int i = 0; i < libros.size() + 1; i++) {
            Libro libro = libros.get(i);
            if (libro.getTitulo().equals(nombre)) {
                Libro libroN = new Libro(nCode, isbn, nTitulo, nEditorial, uDisponibles, estado, autor);
                libros.set(i, libroN);
            }
        }
    }

    public void crearPrestamo(LocalDate fechaEntrega, LocalDate fechaPrestamo, String codigo, double costoDia,
            Estudiante estudiante, Bibliotecario bibliotecario, Biblioteca biblioteca) {
        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaEntrega, codigo, costoDia, estudiante, bibliotecario,
                biblioteca);
        prestamos.add(prestamo);
        imprimir("Prestamo creado exitosamente ");
    }

    /**
     * metodo para adicionar libro a Prestamo disminuyendo las unidadesDisponibles
     * 
     * @param nombre
     * @param codigoP
     */
    public void adicionarLibroPrestamo(String nombre, String codigoP,LocalDate fechaPrestamo, LocalDate fechaEntregua,double costoDia) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(nombre)) {
                if (libro.getuDisponibles() == 0) {
                    Estado estado1 = Estado.agotado;
                    imprimir(estado1);
                    break;
                } else if (libro.getuDisponibles() > 0) {

                    Estado estado = Estado.Disponible;
                    imprimir(estado);
                    for (Prestamo prestamo : prestamos) {
                        if (prestamo.getCodigo().equals(codigoP)) {
                            prestamo.agregarLibro(libro, libro.getuDisponibles(), Prestamo.costoPrestamo(fechaPrestamo, fechaEntregua, costoDia));
                            libro.setuDisponibles(libro.getuDisponibles() - 1);
                            imprimir(" libro agregado exitosamente al prestamo ");

                        }
                    }
                }

            }
        }

    }

    public void consultarDatosPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                imprimir(prestamo.toString());
            }
        }
    }

    public void mostrarCantidadPrestamosEmpleado() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            imprimir("nombre: " + bibliotecario.getNombre() + " cantidad Prestamos: "
                    + bibliotecario.getPrestamos().size());

        }

    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public void imprimir(Estado estado) {
        System.out.println(estado);
    }

}
