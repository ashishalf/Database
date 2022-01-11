package App;

// import some packages
import java.sql.Connection;
import java.sql.DriverManager;

// code for connect to database
class connect {

    static Connection con;

    public static Connection createC() {

        try {

            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connet to the database
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/students";

            con = DriverManager.getConnection(url, user, password);
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
