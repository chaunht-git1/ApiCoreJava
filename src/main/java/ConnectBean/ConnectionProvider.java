 
package ConnectBean;
import java.sql.*;
 
 
public class ConnectionProvider {
  
public static Connection getCon() throws ClassNotFoundException,SQLException {
 
     // Khai báo class Driver cho DB Oracle
     Class.forName(Provider.DRIVER);
     String connectionURL =Provider.CONNECTION_URL;
     Connection conn = DriverManager.getConnection(connectionURL, Provider.USERNAME,Provider.PASSWORD);
     return conn;
 }
 
}
