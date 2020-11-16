package model;

import java.util.List;

public class Estado {

    private int idEstado;
    private String nombre;


    //i added this list beacasuse is necesary fro mapping the relation one to many in hbn

    private List<Ciudad> listaCiudad;

    public List<Ciudad> getListaCiudad() {
        return listaCiudad;
    }

    public void setListaCiudad(List<Ciudad> listaCiudad) {
        this.listaCiudad = listaCiudad;
    }

    public Estado(int idEstado, String nombre, List<Ciudad> listaCiudad) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.listaCiudad = listaCiudad;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado() {
    }

    public Estado(int idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }
}
