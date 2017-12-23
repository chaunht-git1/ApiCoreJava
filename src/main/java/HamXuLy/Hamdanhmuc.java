 
package HamXuLy;

import entitieskhout.VwDsNhnavienctWeb;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

 
public class Hamdanhmuc {
    
 
  public static List<VwDsNhnavienctWeb> laydsnvchitra(String dknv,String branch) {
            
        List<VwDsNhnavienctWeb> dmnvlist = new ArrayList<>();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
        EntityManager entitymanager = emfactory.createEntityManager();

        try { 
          Query query = null;
          query=entitymanager.createNamedQuery("VwDsNhnavienctWeb.findByUsercnBranch");
          query.setParameter("usercn", "Y");
          query.setParameter("homeBranch", branch);
          dmnvlist =query.getResultList();
          entitymanager.close();
          emfactory.close();
          return dmnvlist;
        } catch (Exception e) {
             return null;
        }
    }
          
    
}
