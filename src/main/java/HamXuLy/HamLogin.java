 
package HamXuLy;

import ConnectBean.ConnectionProvider;
import static ConnectBean.Provider.CONNECTION_URL;
import entity.danhmuc.UserModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class HamLogin {
     
    
    public   UserModel layThongUser(String Id) throws SQLException, ClassNotFoundException{
       
        Connection con=ConnectionProvider.getCon();
        //Connection con=DriverManager.getConnection(CONNECTION_URL);
        //ConnectionProvider.reconnectdbastatic();
        //Connection con= null;//ConnectionProvider.getCon();
   
        
        UserModel Cn=new UserModel();
      
        try {
            

            // Tạo một câu SQL có 1 tham số (?)
            String sql = " SELECT USER_ID,USER_NAME,HOME_BRANCH FROM KH.SMTB_USER WHERE USER_ID= ?   ";

            // Tạo một đối tượng PreparedStatement.
            PreparedStatement pstm = con.prepareStatement(sql);

            // Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)        
            pstm.setString(1, Id);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                
                Cn.setHomebranch(rs.getString("HOME_BRANCH"));
                Cn.setUserid(rs.getString("USER_ID"));
                Cn.setUsername(rs.getString("USER_NAME"));
                
            }
            pstm.close();
            con.close();
            return Cn;
            
        } catch (Exception e) {
            
            return  null ;
        
        }    
    
    
    
}

   
    
    
}
