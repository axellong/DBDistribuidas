package model;

public class Alumno {

    private int idAlumno;
    private int idUsuario;
    private String nombre;
    private int idCiudad;

    public Alumno(int idAlumno, int idUsuario, String nombre, int idCiudad) {
        this.idAlumno = idAlumno;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.idCiudad = idCiudad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Alumno() {
        
    }

    @Override
    public String toString() {
        return nombre;
    }
}
