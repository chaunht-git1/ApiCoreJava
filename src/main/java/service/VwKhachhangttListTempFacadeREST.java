 
package service;

import HamXuLy.Hamgiaophieu;
import com.google.gson.Gson;
import entitieskhout.KhachhangttListChinha;
import entitieskhout.VwKhachhangttListTemp;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 
@Stateless
@Path("vwkhachhangttlisttemp")
public class VwKhachhangttListTempFacadeREST extends AbstractFacade<VwKhachhangttListTemp> {

    @PersistenceContext(unitName = "ServerRestKieuhoiPU")
    private EntityManager emkhout;
    
 
    Gson gson= new Gson();
    public VwKhachhangttListTempFacadeREST() {
        super(VwKhachhangttListTemp.class);
    }

    @POST
    @Path("/capnhatkh")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(String input) throws NamingException {

        try {
            PostdataFacadeREST postdataFacadeREST= new PostdataFacadeREST();
            String chuoitrave=null;
            VwKhachhangttListTemp khachhangttListTemp= new VwKhachhangttListTemp();
            KhachhangttListChinha chinha= new KhachhangttListChinha();
            khachhangttListTemp = gson.fromJson(input, VwKhachhangttListTemp.class);
            // Lay thong tin khach hang  .
            chinha=emkhout.find(KhachhangttListChinha.class, khachhangttListTemp.getIdCode());
            // Cap nhat thong tin  .
            chinha.setDachuanhoa("Y");
            chinha.setHoten(khachhangttListTemp.getHoten());
            chinha.setIdActive("Y");
            chinha.setSonhaHientai(khachhangttListTemp.getSonhaHientai());
            chinha.setDidong1(khachhangttListTemp.getDidong1());
            chinha.setTpHientai(khachhangttListTemp.getTpHientai());
            chinha.setQuanHientai(khachhangttListTemp.getQuanHientai());
            chinha.setGioitinh(khachhangttListTemp.getGioitinh());
            chinha.setNgaycapCmnd(khachhangttListTemp.getNgaycapCmnd());
            chinha.setSochungminh(khachhangttListTemp.getSochungminh());
            chinha.setIdNoicapcmnd(khachhangttListTemp.getIdNoicapcmnd());
             // Them vao giao dich khach hang .
            Boolean kq;
            try {
               emkhout.merge(chinha);
               kq=true;
            } catch (Exception e) {
               kq=false;
            }
          
           
            if(kq)
            {
                chuoitrave=gson.toJson(chinha);
            }
            else
            {
                chuoitrave="F";
            }   
            return Response.status(201).entity(chuoitrave).build();
        } catch (Exception ex) {
            return Response.status(201).entity(ex.getMessage()).build();
        }

    }
    
 
 

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, VwKhachhangttListTemp entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON})
    public String find(@PathParam("id") String id) {
        return gson.toJson(super.find(id));
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public String findAllRest() {
        return gson.toJson(super.findAll());
    }
    
    
    @GET
    @Path("user/{userid}/{dch}")
    @Produces({ MediaType.APPLICATION_JSON})
    public String findAllUser(@PathParam("userid")  String userid ,@PathParam("dch")  String dch ) {
        
       Query query= emkhout.createNamedQuery("VwKhachhangttListTemp.findByMakerIdDch");
       query.setParameter("makerId", userid);
       query.setParameter("dachuanhoa", dch);
       String kq =gson.toJson(query.getResultList());
       return kq;
        
    }
  
  

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<VwKhachhangttListTemp> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return emkhout;
    }
    
}
