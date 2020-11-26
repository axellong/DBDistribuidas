package dao;

import hibernate.ConectionSqlMaster;
import model.TableAlumnMaster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoMaster {
    Connection connection;

    public DaoMaster(){
        connection= ConectionSqlMaster.getConnection();
    }


    public List<TableAlumnMaster> getAllUsers() {
        List<TableAlumnMaster> users = new ArrayList<>();
        if(connection != null) {
            String sql = "select alumno.idAlumno,alumno.nombre, ciudad.nombre as ciudad, estado.nombre as estado,usuario.nombre as nombreUsuario from MYSQLDBP...alumno as alumno\n" +
                    "left join  POSTGRESBDP...ciudad as ciudad on ciudad.idciudad = alumno.idCiudad\n" +
                    "left join POSTGRESBDP...estado as estado on ciudad.idestado=estado.idestado\n" +
                    "left join bdsec..usuario as usuario on usuario.idUsuario = alumno.idUsuario;";

            try {
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    int idUser = results.getInt(1);
                    String nombreAlumno = results.getString(2);
                    String ciudad = results.getString(3);
                    String estado = results.getString(4);
                    String usuario = results.getString(5);

                    TableAlumnMaster user = new TableAlumnMaster(idUser,nombreAlumno,ciudad,estado,usuario);
                    users.add(user);
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return users;
    }

}
