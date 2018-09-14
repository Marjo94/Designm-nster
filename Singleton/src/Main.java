import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        databaseConnectionFactory ocf = databaseConnectionFactory.getInstance();
        Connection conn = ocf.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM art");
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                System.out.println(result.getString("title"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Could not fetch data from server");
        }


    }
}