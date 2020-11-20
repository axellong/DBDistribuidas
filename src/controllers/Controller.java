package controllers;

import dao.DaoAlumno;
import dao.DaoCiudad;

import dao.DaoEstado;
import dao.DaoUsuario;
import hibernate.ConexionHibernet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    //    these are resources necesaris for the table i would use
    private ObservableList listaTabla;
    private List<TableAlumn> alumnosTabla;


    //    these are the objects of javafx tha i need in order to create mi view
    @FXML
    private TableView<TableAlumn> table;

    @FXML
    private TableColumn<Integer, Integer> idC;

    @FXML
    private TableColumn<Alumno, String> nombreC;

    @FXML
    private TableColumn<Ciudad, String> ciuadadC;

    @FXML
    private TableColumn<Estado, String> estadoC;

    @FXML
    private TableColumn<Usuario, String> usuarioC;

    @FXML
    private Button buscar;

    @FXML
    void BuscarOA(ActionEvent event) {
        alumnosTabla.clear();
        listaTabla.clear();
        table.getItems().clear();
        join();

//      here i full muy table
        this.idC.setCellValueFactory(new PropertyValueFactory("id"));
        this.nombreC.setCellValueFactory(new PropertyValueFactory("alumno"));
        this.usuarioC.setCellValueFactory(new PropertyValueFactory("usuario"));
        this.ciuadadC.setCellValueFactory(new PropertyValueFactory("ciudad"));
        this.estadoC.setCellValueFactory(new PropertyValueFactory("estado"));
        listaTabla.addAll(alumnosTabla);
        table.setItems(listaTabla);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


//      here i initialize my arraylist of objectos of tableAlumns to full my table and also initialize my observable list
        alumnosTabla = new ArrayList<TableAlumn>();
        listaTabla = FXCollections.observableArrayList();

//      here i call my method join that join all my databse in order to i can used to full my table

    }


    public void join() {
//      here i put mi variable tha i will use to join my 3 databses
        ArrayList<TableAlumn> joined = new ArrayList<>();

//      here i get mi cities from my database postrges
        ConexionHibernet.setDriver("postgres");
        DaoCiudad daoCiudad = new DaoCiudad();
        List<Ciudad> listaCiudad = daoCiudad.getCiudad();
        int ciudades = listaCiudad.size();

//      heere i get mi states
        DaoEstado daoEstado = new DaoEstado();
        List<Estado> listaEstado = daoEstado.getEstado();
        int estados = listaEstado.size();


//      here i get mi alumns of my databse mysql
        ConexionHibernet.setDriver("mysql");
        DaoAlumno daoAlumno = new DaoAlumno();
        List<Alumno> listaAlumno = daoAlumno.getAlumno();
        int alumnos = listaAlumno.size();


//      here i get my users from my databese sqlServer
        ConexionHibernet.setDriver("sqlServer");
        DaoUsuario daoUsuario = new DaoUsuario();
        List<Usuario> listaUsuario = daoUsuario.getUsuario();
        int usuarios = listaUsuario.size();


//        this for join alumnos and cities and estates
        for (int i = 0; i < alumnos; i++) {

            TableAlumn newAlumn = new TableAlumn();
            newAlumn.setAlumno(listaAlumno.get(i));
            joined.add(newAlumn);

            for (int x = 0; x < ciudades; x++) {

                if (listaAlumno.get(i).getIdCiudad() == listaCiudad.get(x).getIdCiudad()) {
                    joined.get(i).setCiudad(listaCiudad.get(x));
                    System.out.println(joined.get(i));
                }
            }
        }

//      aqui uno los alumnos con los estados
        for (int i = 0; i < alumnos; i++) {

            for (int x = 0; x < estados; x++) {

                if (joined.get(i).getCiudad().getIdEstado().getIdEstado() == listaEstado.get(x).getIdEstado()) {
                    joined.get(i).setEstado(listaEstado.get(x));
                }


            }
        }


//        here i join my alumns and users
        for (int i = 0; i < alumnos; i++) {
            for (int x = 0; x < usuarios; x++) {
                if (listaAlumno.get(i).getIdUsuario() == listaUsuario.get(x).getIdUsuario()) {
                    joined.get(i).setUsuairo(listaUsuario.get(i));
                    System.out.println(joined.get(i));
                }
            }
        }


//       here i pass my table from joined to my observable list
        for (TableAlumn x : joined) {
            alumnosTabla.add(x);
        }

//        System.out.println(alumnosTabla);


    }

}

