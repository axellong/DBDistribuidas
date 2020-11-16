package dao;

import hibernate.ConexionHibernet;
import model.Ciudad;
import model.Estado;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoCiudad {

    private static SessionFactory factory;


    public DaoCiudad() {
        ConexionHibernet.generarConexion();
        factory=ConexionHibernet.getFactory();
    }

    public void  getCiudad(){
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Ciudad.class);
        List listEstado = crit.list();
        System.out.println(listEstado+"ciudad");


    }
}
