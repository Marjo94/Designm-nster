import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databaseConnectionFactory {

    private static databaseConnectionFactory factoryInstance;

    private databaseConnectionFactory() {
    }

    public static synchronized databaseConnectionFactory getInstance() throws ClassNotFoundException {
        if (factoryInstance == null) {
            Class.forName("com.mysql.jdbc.Driver");
            factoryInstance = new databaseConnectionFactory();

        }

        return factoryInstance;
    }

    public Connection getConnection() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/museum?" + "user=admin&password=12345&useSSL=false");
        } catch (SQLException e) {
            System.out.println("Unable to connect to database");
            e.printStackTrace();
        }
        return null;
    }
}
