package dao;

import hibernate.ConexionHibernet;
import model.Alumno;
import model.Estado;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoAlumno {

    private static SessionFactory factory;


    public DaoAlumno() {
        ConexionHibernet.generarConexion();
        factory=ConexionHibernet.getFactory();
    }

    public List<Alumno>  getAlumno(){
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Alumno.class);
        List<Alumno> listaAlumno = crit.list();
        return listaAlumno;


    }
}
