 
package service;

import HamXuLy.Hamgiaophieu;
import LocalModel.DmCitylist;
import entitieskh.ChitietgiaodichModel;
import java.sql.SQLException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("post")
public class ApicoreResource {

    @Context
    private UriInfo context;

  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ApicoreResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Path("capnhatsocmnd")
    @Consumes({"application/json"+ ";charset=utf-8"})
    public Response  capnhatcmnd(String  entity) {
           
           String result = "Track saved : " + entity;
       return Response.status(201).entity(result).build();
    }
}
