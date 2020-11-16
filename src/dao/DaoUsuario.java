package dao;

import hibernate.ConexionHibernet;
import model.Estado;
import model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoUsuario {
    private static SessionFactory factory;


    public DaoUsuario() {
        ConexionHibernet.generarConexion();
        factory=ConexionHibernet.getFactory();
    }

    public void  getUsuario(){
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Usuario.class);
        List listEstado = crit.list();
        System.out.println(listEstado+"Usuario");


    }
}
