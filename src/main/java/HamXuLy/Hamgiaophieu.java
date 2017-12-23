 
package HamXuLy;

import ConnectBean.ConnectionProvider;
import entitieskh.XacminhModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.*;

 
public class Hamgiaophieu {
    
    // Ham insert du lieu vao bang tim kiem nhanh  . 
  public    String giaophieutungbiennhan(String chinhanh, String sophieu, String stt,String city,String quanhuyen,String nvgiao,String nvchitra) throws ClassNotFoundException  {
        String ketqua;
        try {

           // Kiem tra trang thai reload hay moi khoi tao  .
           // Object kt = session.getAttribute("statusdatabase");
           //Connection con = null;
         //  Connection con = null;
             Connection con=ConnectionProvider.getCon();
           
            String fnCall = "{call ? :=  KH.PKS_GIAOPHIEU_WEB.FUNC_UPDATE_GIAOPHIEU_BIENNHAN(?,?,?,?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.registerOutParameter(4, Types.VARCHAR);
            stm.setString(2, chinhanh.toUpperCase());
            stm.setString(3, sophieu.toUpperCase());
            stm.setString(4, stt);
            stm.setString(5, nvchitra);
            stm.setString(6, nvgiao);
            stm.setString(7, quanhuyen);
            stm.setString(8, city);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
           return ketqua ;

        } catch (SQLException ex) {
 
            return "F";

        }

    }
 
     // Ham insert du lieu vao bang tim kiem nhanh  . 
  public    String phuchoitungbiennhan(String chinhanh, String sophieu, String stt,String city,String quanhuyen,String nvgiao,String nvchitra) throws ClassNotFoundException   {
        String ketqua;
        try {

           // Kiem tra trang thai reload hay moi khoi tao  .
           // Object kt = session.getAttribute("statusdatabase");
          
            Connection con=ConnectionProvider.getCon(); 
           
            String fnCall = "{call ? :=  KH.PKS_GIAOPHIEU_WEB.FUNC_UPDATE_PHGIAOPHIEU_BN(?,?,?,?,?,?,?)}";
            CallableStatement stm = con.prepareCall(fnCall);
             
            stm.registerOutParameter(1, Types.VARCHAR);
            stm.registerOutParameter(2, Types.VARCHAR);
            stm.registerOutParameter(3, Types.VARCHAR);
            stm.registerOutParameter(4, Types.VARCHAR);
            stm.setString(2, chinhanh.toUpperCase());
            stm.setString(3, sophieu.toUpperCase());
            stm.setString(4, stt);
            stm.setString(5, nvchitra);
            stm.setString(6, nvgiao);
            stm.setString(7, quanhuyen);
            stm.setString(8, city);
            stm.execute();
            ketqua = (String) stm.getString(1);
            stm.close();
            con.close();
           return ketqua ;

        } catch (SQLException ex) {
 
            return "F";

        }

    }
  
  public String updatechuyentoday( String chinhanh,String sobn,String socm,String reupdate,String userid) throws SQLException, ClassNotFoundException  {
        
        
      
        Connection con=ConnectionProvider.getCon();
        String kq = null;
      //  String userid = SessionBean.getUserId();
 
        String fnCall = "{?= call KH.PKS_HOIBAO_WEB.UPDATE_CHUYENKHONGBN(?,?,?,?,?)}";
 
        try {
            CallableStatement stm = con.prepareCall(fnCall);
            
            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1,  OracleTypes.VARCHAR);
            stm.registerOutParameter(2,  OracleTypes.VARCHAR);
            stm.registerOutParameter(4,  OracleTypes.VARCHAR);
            stm.registerOutParameter(5,  OracleTypes.VARCHAR);
            
            stm.setString(2,chinhanh);
            stm.setString(3, sobn);
            stm.setString(4, "001");
            stm.setString(5, socm);
            stm.setString(6, userid);

             stm.executeUpdate();
             kq = stm.getString(1);
             stm.close();
             con.close();
            return kq;
        } catch (Exception e) {
            return "";
        }
    }
    
public String updatecmnddate( String chinhanh,String sobn,String socm,String reupdate,String userid) throws SQLException  {
        
      Connection con = null;
      try {
          con = ConnectionProvider.getCon();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Hamgiaophieu.class.getName()).log(Level.SEVERE, null, ex);
      }
        String kq = null;
       
 
        String fnCall = "{?= call KH.PKS_HOIBAO_WEB.UPDATE_CMNDKHONGBN(?,?,?,?,?)}";
 
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(5, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, chinhanh);
            stm.setString(3, sobn);
            stm.setString(4, "001");
            stm.setString(5, socm);
            stm.setString(6, userid);

             stm.executeUpdate();
             kq = stm.getString(1);
             stm.close();
             con.close();
            return kq;
        } catch (Exception e) {
            return "";
        }
    }
   
public String updatexacminhtodate( XacminhModel xacminh,String reupdate,String userid) throws SQLException, ClassNotFoundException  {
        
       
        Connection con=ConnectionProvider.getCon();
        String kq = null;
      //  String userid = SessionBean.getUserId();
        
  

        String fnCall = "{?= call KH.PKS_HOIBAO_WEB.FUNC_UPDATE_XM_CHINHA(?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(4, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(12, oracle.jdbc.OracleTypes.VARCHAR);
            
            stm.setString(2, xacminh.getId_chinhanh());
            stm.setString(3, xacminh.getSophieu());
            stm.setString(4, xacminh.getStt().toString());
            stm.setString(5, xacminh.getLydoxm());
            stm.setString(6, userid);
            stm.setString(7, xacminh.getLoaixm());
            stm.setString(8, "");
            stm.setString(9,xacminh.getXmdoitac());
            stm.setString(10,xacminh.getManguoinhan());
            stm.setString(11,xacminh.getNvchitra());
            stm.setString(12,xacminh.getSobiennhan());
 
 
             stm.executeUpdate();
             kq = stm.getString(1);
             stm.close();
             con.close();
            return kq;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

       
    
}
