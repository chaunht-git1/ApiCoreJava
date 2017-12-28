 
package service;

import LocalModel.Track;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.Metamodel;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import ConnectBean.Provider;

 
@Path("systeminfor")
public class SysteminforResource {
    
    @PersistenceContext(unitName =Provider.DADABASEKH)
    private EntityManager em;
    
    @PersistenceContext(unitName =Provider.DADABASEVW)
    private EntityManager emkhout;
    
    @Resource
    UserTransaction utx;

    @Context
    private UriInfo context;
    
    
    Gson gson= new Gson();
   
    public SysteminforResource() {
    }

 
    @GET
    @Path("connect")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SQLException {
        try {
            utx.begin();
            java.sql.Connection connectionkh = em.unwrap(java.sql.Connection.class);
            String urlconnectionkh=Provider.DADABASEKH+"-"+connectionkh.getMetaData().getURL();
            utx.commit();

            utx.begin();
            java.sql.Connection connectionemkhout = emkhout.unwrap(java.sql.Connection.class);
            String urlconnectionemkhout=Provider.DADABASEVW+"-"+connectionemkhout.getMetaData().getURL();
            utx.commit();
 
            Track track= new Track("System Information",urlconnectionkh,urlconnectionemkhout);
            return gson.toJson(track);
        } catch (NotSupportedException ex) {
            Logger.getLogger(SysteminforResource.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SystemException ex) {
            Logger.getLogger(SysteminforResource.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
