 
package service;

import ConnectBean.Provider;
import HamXuLy.Hamgiaophieu;
import com.google.gson.Gson;
import entitieskh.ChitietgiaodichModel;
import entitieskh.KhachhangttList;
import entitieskhout.KhachhangttListChinha;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.annotation.Resource;
import javax.naming.NamingException;
import javax.transaction.UserTransaction;
 
@Path("postdata")
 
    
public class PostdataFacadeREST  {

    @PersistenceContext(unitName = Provider.DADABASEKH)
    private EntityManager em;
    
    @PersistenceContext(unitName = Provider.DADABASEVW)
    private EntityManager emkhout;
    
    @Resource
    UserTransaction utx;


    Gson gson= new Gson(); 
    @Context
    private UriInfo context;

    
    public PostdataFacadeREST() {
      
    }

  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Path("/capnhatsocmnd")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(String input) throws NamingException {

        try {
            String chuoitrave=null;
            ChitietgiaodichModel chitietgiaodichModel = new ChitietgiaodichModel();
            KhachhangttListChinha chinha= new KhachhangttListChinha();
            chitietgiaodichModel = gson.fromJson(input, ChitietgiaodichModel.class);
          //  String idcodekieuhoi = chitietgiaodichModel.getChinhanh()+chitietgiaodichModel.getSophieu()+chitietgiaodichModel.getStt().toString();
            //Kiem tra thong tin trong du lieu , neu trung thi khoi luu . 
          //  VwTondongNvAllWeb allWeb=new VwTondongNvAllWeb();
         //   allWeb=emkhout.find(VwTondongNvAllWeb.class, idcodekieuhoi);
            Hamgiaophieu hamgiaophieu = new Hamgiaophieu();
            String result =hamgiaophieu.updatecmnddate(chitietgiaodichModel.getChinhanh(), chitietgiaodichModel.getSobn(),chitietgiaodichModel.getSocttuythan() , "N", chitietgiaodichModel.getIdnvchitra());
            String idcode=result+"@"+chitietgiaodichModel.getIdnvchitra(); 
            String idcodecn=null;
            chinha = emkhout.find(KhachhangttListChinha.class, idcode);
            try {
                idcodecn = chinha.getIdCode();
            } catch (Exception e) {
                idcodecn = null;
            }
    
                // Them vao giao dich khach hang .
               
            
           // Them vao giao dich khach hang .
           if(idcodecn!=null)
           {
              chuoitrave=gson.toJson(chinha);
           }
           else{
               KhachhangttList khachhang = new KhachhangttList();
               khachhang = timkhachhang(result);
               String kqjson = gson.toJson(khachhang);
               chinha = gson.fromJson(kqjson, KhachhangttListChinha.class);

               chinha.setIdCode(idcode);
               chinha.setMakerId(chitietgiaodichModel.getIdnvchitra());
               chinha.setSobn(chitietgiaodichModel.getSobn());
               Boolean kq = false;
               try {
                   utx.begin();
                   emkhout.merge(chinha);
                   utx.commit();
                   kq = true;
               } catch (Exception e) {
                   kq = false;
               }
               if (kq) {
                   chuoitrave = gson.toJson(chinha);
               } else {
                   chuoitrave = "F";
               }
           }

            return Response.status(201).entity(gson.toJson(chinha)).build();
            
        } catch (SQLException ex) {
            Logger.getLogger(PostdataFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
            return Response.status(201).entity(ex.getErrorCode()).build();
        }

    }
    
 
  
    public KhachhangttList timkhachhang ( String id )  {
        try {
            Query query = null;
            KhachhangttList khachhangttList = new KhachhangttList();
            //   em.refresh(query);
            query = em.createNamedQuery("KhachhangttList.findByIdKhachhang", List.class);
            query.setParameter("idKhachhang", id);
            khachhangttList = (KhachhangttList) query.getSingleResult();
            return khachhangttList;

        } catch (Exception e) {
            return null;
        }
     
    }
    
 
    
}
