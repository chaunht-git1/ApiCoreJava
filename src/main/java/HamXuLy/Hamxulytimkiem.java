 
package HamXuLy;

import ConnectBean.ConnectionProvider;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

 
public class Hamxulytimkiem {
    
    
    // Ham insert du lieu vao bang tim kiem nhanh  . 
     public    String validateLogin(String user, String password, String sessionid) throws ClassNotFoundException {
        boolean status = false;
        String ketqua;
        try {

           // Kiem tra trang thai reload hay moi khoi tao  .
           // Object kt = session.getAttribute("statusdatabase");
          // Connection con = null;
         //  Connection con = null;
 
            Connection con=ConnectionProvider.getCon();
           
            String fnCall = "{call ? :=  KH.SMPKS.fn_sign_on_java(?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.setString(2, user.toUpperCase());
            stm.setString(3, password.toUpperCase());
            stm.setString(4, sessionid);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
           return ketqua ;

        } catch (SQLException ex) {
 
            return "F";

        }

    }
    
    public String timtheodktongcn(String thuoctinh,String chuoitk, String userid,String chinhanh) throws ClassNotFoundException {

        try {
            String ketqua;        
            Connection con=ConnectionProvider.getCon();
            con.clearWarnings();
            String fnCall = "{call ? := KH.PKS_TIMKIEM_WEB.Timkiemgiaodich(?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, chuoitk);
            stm.setString(3, userid);
            stm.setString(4, thuoctinh);
            stm.setString(5, chinhanh);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
            return ketqua;

        } catch (SQLException ex) {

         
            return "F";

        }

    }

 
    public String timkhangdktongcn(String chuoitk, String userid,String thuoctinh,String chinhanh) throws ClassNotFoundException {

        try {
            String ketqua;
            Connection con=ConnectionProvider.getCon();
            con.clearWarnings();
            String fnCall = "{call ? := KH.PKS_TIMKIEM_WEB.Timkiemkhachhang(?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.setString(2, chuoitk);
            stm.setString(3, userid);
            stm.setString(4, thuoctinh);
            stm.setString(5, chinhanh);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
            return ketqua;

        } catch (SQLException ex) {

         
            return "F";

        }

    }

    
}
