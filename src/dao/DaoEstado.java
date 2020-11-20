package dao;

import hibernate.ConexionHibernet;
import model.Estado;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoEstado {

    private static SessionFactory factory;


    public DaoEstado() {
        ConexionHibernet.generarConexion();
        factory=ConexionHibernet.getFactory();
    }

    public List<Estado> getEstado(){
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Estado.class);
        List listEstado = crit.list();
        System.out.println(listEstado);
        session.close();



        return listEstado;
    }


}
