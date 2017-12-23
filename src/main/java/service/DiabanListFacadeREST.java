 
package service;

import com.google.gson.Gson;
import entitieskh.DiabanList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

 
@Stateless
@Path("diabanlist")
public class DiabanListFacadeREST extends AbstractFacade<DiabanList> {
    @PersistenceContext(unitName = "ServerRestKieuhoiPU2")
    private EntityManager em;
    Gson gson= new Gson(); 
    public DiabanListFacadeREST() {
        super(DiabanList.class);
    }

    @POST
    @Override
    @Consumes({ "application/json"})
    public void create(DiabanList entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") String id, DiabanList entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"+ ";charset=utf-8"})
    public String find(@PathParam("id") String id) {
        return gson.toJson(super.find(id));
    }

    @GET
    @Produces({"application/json"+ ";charset=utf-8"})
    public String findAllRest() {
      
        return gson.toJson(super.findAll());
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"+ ";charset=utf-8"})
    public String findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
         return gson.toJson(super.findRange(new int[]{from, to}));
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
