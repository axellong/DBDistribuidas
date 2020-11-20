package model;

import java.util.Objects;

public class TableAlumn {

    private Estado estado = null;
    private int id;
    private Alumno alumno;
    private Usuario usuario;
    private Ciudad ciudad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TableAlumn(Estado estado, Alumno alumno, Usuario usuario, Ciudad ciudad) {
        this.estado = estado;
        this.id = alumno.getIdAlumno();
        this.alumno = alumno;
        this.usuario = usuario;
        this.ciudad = ciudad;
    }

    public  TableAlumn (){
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
        this.id = alumno.getIdAlumno();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuairo(Usuario usuairo) {
        this.usuario = usuairo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "TableAlumn{" +
                "estado=" + estado +
                ", id=" + id +
                ", alumno=" + alumno +
                ", usuario=" + usuario +
                ", ciudad=" + ciudad +
                '}';
    }
}

