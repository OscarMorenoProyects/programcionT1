package co.edu.uniquindio.poo;

import java.util.Collection;

public class Libro {
    public String codigo, isbn, titulo, editorial;
    public   int uDisponibles;
    
    public static Estado estado;
    public Biblioteca biblioteca;
    public Collection<Reporte> reportes;
    public Autor autor;

    public String getCodigo() {
        return codigo;
    }
    public int getuDisponibles() {
        return uDisponibles;
    }

    public void setuDisponibles(int uDisponibles) {
        this.uDisponibles = uDisponibles;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Collection<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(Collection<Reporte> reportes) {
        this.reportes = reportes;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro(String codigo, String isbn, String titulo, String editorial, int uDisponibles, Estado estado,
            Autor autor) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.uDisponibles = uDisponibles;
        this.estado = estado;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial
                + ", uDisponibles=" + uDisponibles + ", estado=" + estado + ", autor=" + autor + "]";
    }

}
