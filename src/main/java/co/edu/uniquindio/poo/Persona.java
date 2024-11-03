package co.edu.uniquindio.poo;

public class Persona {
    private String nombre, correo;
    private int edad,cedula,telefono;


    public Persona(String nombre, String correo, int edad, int cedula, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


   

}
