 
package service;

import HamXuLy.KhachhangttListChinhaFunc;
import HamXuLy.Hamgiaophieu;
import com.google.gson.Gson;
import entitieskh.ChitietgiaodichModel;
import entitieskh.KhachhangttList;
import entitieskhout.KhachhangttListChinha;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

 
@Path("postdata")
public class PostdataFacadeREST {
    @PersistenceContext(unitName = "ServerRestKieuhoiPU2")
    private EntityManager em;
    
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
    public Response createTrackInJSON(String input) {

        try {
            ChitietgiaodichModel chitietgiaodichModel = new ChitietgiaodichModel();
            chitietgiaodichModel = gson.fromJson(input, ChitietgiaodichModel.class);
            Hamgiaophieu hamgiaophieu = new Hamgiaophieu();
            String result =hamgiaophieu.updatecmnddate(chitietgiaodichModel.getChinhanh(), chitietgiaodichModel.getSobn(),chitietgiaodichModel.getSocttuythan() , "N", chitietgiaodichModel.getIdnvchitra());
            // Them vao giao dich khach hang . 
            return Response.status(201).entity(result).build();
        } catch (SQLException ex) {
            Logger.getLogger(PostdataFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
            return Response.status(201).entity(ex.getErrorCode()).build();
        }

    }
    
//    @POST
//    @Path("/taokhgiaodich")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response createKhachhangTemp(String input) {
//        
//        ChitietgiaodichModel chitietgiaodichModel = new ChitietgiaodichModel();
//        chitietgiaodichModel = gson.fromJson(input, ChitietgiaodichModel.class);
//        KhachhangttListChinhaFunc chinhaFacadeREST= new KhachhangttListChinhaFunc();
//        KhachhangttListFacadeREST facadeREST= new KhachhangttListFacadeREST();
//        KhachhangttList khachhangttList = new KhachhangttList();
//        //String kq1=facadeREST.findRest(chitietgiaodichModel.getMakhachhang());
//        KhachhangttListChinha  listChinha = new KhachhangttListChinha();
//      //  String idcode=chitietgiaodichModel.getMakhachhang()+chitietgiaodichModel.getIdnvchitra();
//       // listChinha.setIdKhachhang(chitietgiaodichModel.getMakhachhang());
//       // listChinha.setIdCode(idcode);
//        Boolean kq=chinhaFacadeREST.themthongtinkhchinha(listChinha);
//        // chinhaFacadeREST.create(entity);
//        // Them vao giao dich khach hang .
//        return Response.status(201).entity(kq.toString()).build();
//
//    }
    
//     @POST
//    @Path("/capnhatthongtinkh")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response cnhatthongtinkh(String input) {
//        
//        KhachhangttListChinhaFunc chinhaFacadeREST= new KhachhangttListChinhaFunc();
//        KhachhangttListChinha  listChinha = new KhachhangttListChinha();
//        listChinha = gson.fromJson(input, KhachhangttListChinha.class);
//        Boolean kq=chinhaFacadeREST.capnhatthongtinkh(listChinha);
//        // chinhaFacadeREST.create(entity);
//        // Them vao giao dich khach hang .
//        return Response.status(201).entity(kq.toString()).build();
//
//    }
}
