 
package HamImage;

import ConnectBean.ConnectionProvider;
//import static Image.Xulyimage.base64StringtoImg;
import entitieskhout.VwDsUploadImagehbWeb;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.imageio.ImageIO;

 
public class ConvertImage {
    
    /* Convert Image tu Base 64 to Image */
    
     // Ham insert du lieu vao bang tim kiem nhanh  . 
  public    InputStream convertbuffertovInputStream(String source ) throws IOException  {
   
      try {
                // Convert du lieu ve BufferImage . 
          BufferedImage image=null;//base64StringtoImg(source);
          ByteArrayOutputStream os = new ByteArrayOutputStream();
          ImageIO.write(image, "jpg", os);
          InputStream is = new ByteArrayInputStream(os.toByteArray());
          return is;
          
      } catch (Exception e) {
          return null;
      }
   
  }
  
     public Boolean uploadimagetoservertoday( InputStream filein,String maso,VwDsUploadImagehbWeb imagehbWeb,String userid, String chinhanh,String iderror,String dotbnhan,String duoifile) throws IOException, ClassNotFoundException, SQLException   {
         
   
            InputStream inputStream=filein; 
            String ghichu =null;
              // Tao hinh tren Server . 
 
            ConnectionProvider connectionProvider= new ConnectionProvider();
            Connection con = connectionProvider.getCon();
            con.setAutoCommit(false);
            
            try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO KHOUT.DM_QUANLYIMAGE_TODAY(KHOA,DOTBN,FILENO,MARKER_ID,ID_DOITAC,ID_CHINHANH,SOPHIEU,STT,SOBN,IDERROR,DATE_MODIFIED,HINH_BN,SO_CT_TUYTHAN,ID_CT_TUYTHAN,ID_NV_CHITRA) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            String khoa=null;
            
            if (iderror.equalsIgnoreCase("N"))
            {
                khoa=imagehbWeb.getIdChinhanh().toString()+maso;
                ps.setString(5,imagehbWeb.getIdDoitac()); 
                ps.setString(6,imagehbWeb.getIdChinhanh()); 
                ps.setString(7,imagehbWeb.getSophieu());
                ps.setInt(8,imagehbWeb.getStt().intValue());
                ps.setString(9, imagehbWeb.getSobn().toString()); 
                ps.setString(10, iderror); 
 
                ps.setString(1,khoa);
                ps.setBinaryStream(12, inputStream,300000);
                ps.setString(2,userid+dotbnhan);
                ps.setInt(3,1);
                ps.setString(4,userid);    
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(13,imagehbWeb.getSoCtTuythan());
                ps.setString(14,imagehbWeb.getIdCtTuythan());
                ps.setString(15,imagehbWeb.getIdNvChitra());
                ps.executeUpdate();
                ps.close();
                con.commit();
                con.close();
    
            }
           //Error . 
           else{
                khoa= maso;
                ps.setString(5,""); 
                ps.setString(6,""); 
                ps.setString(7,"");
                ps.setInt(8,0);
                ps.setString(9,""); 
                ps.setString(10, "Y"); 
                Date d= new  Date();
                ps.setDate(11, new java.sql.Date(d.getTime())); 
                ps.setString(1,maso);
                ps.setBinaryStream(12, inputStream,200000);
                ps.setString(13,"");
                ps.setString(14,"");
                ps.setString(15,imagehbWeb.getIdNvChitra());
                ps.setString(2,"ER"+userid+dotbnhan);
                ps.setInt(3,1);
                ps.setString(4,userid);    
                ps.executeUpdate();
                ps.close();
                con.commit();

            }
 
             return true;
             
         } catch (Exception e) {
 
             return false;
         }

 
 
    }
    
    
}
