package model;

public class TableAlumnMaster {

    private int idAlumno;
    private String nombreAlumno;
    private  String ciudad;
    private  String estado;
    private  String usuario;

    public  TableAlumnMaster(){

    }
    public TableAlumnMaster(int idAlumno, String nombreAlumno, String ciudad, String estado, String usuario) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.ciudad = ciudad;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
