package controllers;

import dao.*;

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
    private ObservableList<TableAlumnMaster> listaTabla;
    private List<TableAlumnMaster> alumnosTabla;


    //    these are the objects of javafx tha i need in order to create mi view
    @FXML
    private TableView<TableAlumnMaster> table;

    @FXML
    private TableColumn<Integer, Integer> idC;

    @FXML
    private TableColumn<String, String> nombreC;

    @FXML
    private TableColumn<String, String> ciuadadC;

    @FXML
    private TableColumn<String, String> estadoC;

    @FXML
    private TableColumn<String, String> usuarioC;

    @FXML
    private Button buscar;

    @FXML
    void BuscarOA(ActionEvent event) {

        listaTabla.clear();
        DaoMaster daoMaster = new DaoMaster();
        alumnosTabla=daoMaster.getAllUsers();
        listaTabla.addAll(alumnosTabla);



    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


//      here i initialize my arraylist of objectos of tableAlumns to full my table and also initialize my observable list
        alumnosTabla = new ArrayList<>();
        listaTabla = FXCollections.observableArrayList();

        this.idC.setCellValueFactory(new PropertyValueFactory("idAlumno"));
        this.nombreC.setCellValueFactory(new PropertyValueFactory("nombreAlumno"));
        this.usuarioC.setCellValueFactory(new PropertyValueFactory("usuario"));
        this.ciuadadC.setCellValueFactory(new PropertyValueFactory("ciudad"));
        this.estadoC.setCellValueFactory(new PropertyValueFactory("Estado"));
        listaTabla.addAll(alumnosTabla);
        table.setItems(listaTabla);




    }




}

