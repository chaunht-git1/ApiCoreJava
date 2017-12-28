 
package service;

import ConnectBean.Provider;
import LocalModel.DshosoMg;
import com.google.gson.Gson;
import entitieskhout.VwTondongNvAllWeb;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

 
@Stateless
@Path("vwtondongnvallweb")
public class VwTondongNvAllWebFacadeREST extends AbstractFacade<VwTondongNvAllWeb> {
    @PersistenceContext(unitName = Provider.DADABASEVW)
    private EntityManager em;
    Gson gson= new Gson(); 
    public VwTondongNvAllWebFacadeREST() {
        super(VwTondongNvAllWeb.class);
    }
    
    
    @GET
    @Path("dschinhanhtheonv/{chinhanh}/{nvchitra}")
    @Produces({"application/json"+ ";charset=utf-8"})
    public String getVwTondongNvAllWebCNNVTK(@PathParam("chinhanh") String chinhanh,@PathParam("nvchitra") String nvchitra) {
        
 
        List<VwTondongNvAllWeb>  dsKq = new ArrayList<>();
 
        try { 
          Query query = null;
       //   em.refresh(query);
          query=em.createNamedQuery("VwTondongNvAllWeb.findByIdNvChitra", List.class);
        //  query.setParameter("idChinhanh", chinhanh);
          query.setParameter("idNvChitra", nvchitra);
          dsKq =  query.getResultList();
          return gson.toJson(dsKq);
        } catch (Exception e) {
             return null;
        }
        
  
    }
    
    @GET
    @Path("dshosogiaomobile/{chinhanh}/{doths}")
    @Produces({"application/json"+ ";charset=utf-8"})
    public String   getchinhanhNvchitraGroup(@PathParam("chinhanh") String chinhanh,@PathParam("doths") String doths) {
        
        List   dsTam = new ArrayList<>();
        List<DshosoMg>  dsKq = new ArrayList<>();
 
        try { 
          Query query = null;
          if(doths.equalsIgnoreCase("dot1"))
          {
            query=em.createNamedQuery("VwTondongNvAllWeb.findByChinhanhNvchitraGroup1", List.class);
            query.setParameter("idChinhanh", chinhanh);
            query.setParameter("hsdot1", "Y");
          }
          else{
            query=em.createNamedQuery("VwTondongNvAllWeb.findByChinhanhNvchitraGroup3", List.class);     
            query.setParameter("idChinhanh", chinhanh);
            query.setParameter("hsdot3", "Y");
          }
         
            dsTam =  query.getResultList();
            for (int i = 0; i < dsTam.size(); i++) {
                DshosoMg dm=new DshosoMg();
                Object[] v=(Object[]) dsTam.get(i);
                Long l=  (Long)(v[1] );
                dm.setIdnvchitra(v[0].toString());
                dm.setShs(l.longValue());
                dm.setHotennv(v[2].toString());
                dsKq.add(dm);
         
              
            }
                    

          return gson.toJson(dsKq);
        } catch (Exception e) {
             return null;
        }
        
  
    }
    
    

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(VwTondongNvAllWeb entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") String id, VwTondongNvAllWeb entity) {
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
