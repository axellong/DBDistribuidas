package controllers;

import dao.DaoAlumno;
import dao.DaoCiudad;
import dao.DaoEstado;
import dao.DaoUsuario;
import hibernate.ConexionHibernet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> idColum;

    @FXML
    private TableColumn<?, ?> nombreColum;

    @FXML
    private TableColumn<?, ?> ciudadColumb;

    @FXML
    private TableColumn<?, ?> estadoColum;

    @FXML
    private Button buscar;

    @FXML
    void BuscarAlumnos(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ConexionHibernet.setDriver("postgres");
        DaoEstado daoEstado = new DaoEstado();
        daoEstado.getEstado();
        DaoCiudad daoCiudad = new DaoCiudad();
        daoCiudad.getCiudad();


        System.out.println("termina ña bd de postgres");


        ConexionHibernet.setDriver("mysql");
        DaoAlumno daoAlumno = new DaoAlumno();
        daoAlumno.getAlumno();
        System.out.println("termina ña bd de mysql");
        ConexionHibernet.setDriver("sqlServer");
        DaoUsuario daoUsuario = new DaoUsuario();
        daoUsuario.getUsuario();
        System.out.println("termina ña bd de sql");
    }
}
