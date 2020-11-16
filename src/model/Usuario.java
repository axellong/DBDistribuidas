package model;

import java.util.List;

public class Usuario {

    private int idUsuario;
    private String nombre;

    // i add this beacuse is required by th emapping of many to one in hbn, but i need more explications abopur how to used
    private List<Alumno> alumnoList;

    public Usuario(int idUsuario, String nombre, List<Alumno> alumnoList) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.alumnoList = alumnoList;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public Usuario() {
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
}
