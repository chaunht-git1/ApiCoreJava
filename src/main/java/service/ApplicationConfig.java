 
package service;

import java.util.Set;
import javax.ws.rs.core.Application;
 
@javax.ws.rs.ApplicationPath("apicore")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.ApicoreResource.class);
        resources.add(service.CityListFacadeREST.class);
        resources.add(service.DiabanListFacadeREST.class);
        resources.add(service.DistrictListFacadeREST.class);
        resources.add(service.DmBankListFacadeREST.class);
        resources.add(service.KhachhangttListFacadeREST.class);
        resources.add(service.PostdataFacadeREST.class);
        resources.add(service.VwSmtbUserListFacadeREST.class);
        resources.add(service.VwTondongNvAllWebFacadeREST.class);
    }
    
}
