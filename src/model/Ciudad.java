package model;

import java.util.List;

public class Ciudad {

    private int idCiudad;
    private Estado idEstado;
    private String nombre;

    private List<Alumno> listaAlumno;

    public List<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad(int idCiudad, Estado idEstado, String nombre) {
        this.idCiudad = idCiudad;
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    public Ciudad() {
    }

    public Ciudad(int idCiudad, Estado idEstado, String nombre, List<Alumno> listaAlumno) {
        this.idCiudad = idCiudad;
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.listaAlumno = listaAlumno;
    }

    @Override
    public String toString() {
        return nombre;

    }
}
