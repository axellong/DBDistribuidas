package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionSqlMaster {


    static Connection connection = null;

    private ConectionSqlMaster() {

    }

    private static void setConnection() {
        String connectionString = "jdbc:sqlserver://localhost;database=bdsec";
        String user = "usuario1";
        String password = "Acoco";
        try {
            connection = DriverManager.getConnection(connectionString, user, password);
            System.out.println(connection.getClass().getCanonicalName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized static Connection getConnection() {
        if(connection == null) {
            setConnection();
        }
        return connection;
    }

}
