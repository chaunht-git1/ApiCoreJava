 
package HamXuLy;

import entitieskhout.KhachhangttListChinha;
import entitieskhout.VwKhachhangttListTemp;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
public class KhachhangttListChinhaFunc {

    @PersistenceContext(unitName = "ServerRestKieuhoiPU")
    private EntityManager em;
 
//          List<VwDmQuanlydotImagetongWeb> dsKq=new ArrayList<>();
//        VwDmQuanlydotImagetongWeb  dmnv = new VwDmQuanlydotImagetongWeb();
//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "DatabaseView" );
//        EntityManager entitymanager = emfactory.createEntityManager();
//
//        try { 
//          Query query = null;
//          query=entitymanager.createQuery("SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.markerId=:markerId AND v.kiemtra=:kiemtra");
//          query.setParameter("markerId", user);
//          query.setParameter("kiemtra", trangthai);
//          dsKq =  query.getResultList();
//         
//          return dsKq;
//        } catch (Exception e) {

    public  boolean themthongtinkhchinha(KhachhangttListChinha khachhang){
       //Tao thong tin cap nhat
             KhachhangttListChinha khachhangttListTemp = em.getReference(KhachhangttListChinha.class, khachhang.getIdCode());

             em.getTransaction().begin();
             khachhangttListTemp.setDidong1(khachhang.getDidong1());
             khachhangttListTemp.setHoten(khachhang.getHoten());
             khachhangttListTemp.setDachuanhoa("Y");
             khachhangttListTemp.setSonhaHientai(khachhang.getSonhaHientai());
             khachhangttListTemp.setTpHientai(khachhang.getTpHientai());
             khachhangttListTemp.setSochungminh(khachhang.getSochungminh());
             khachhangttListTemp.setNgaycap(khachhang.getNgaycapCmnd());
             khachhangttListTemp.setIdNoicapcmnd(khachhang.getIdNoicapcmnd());
             khachhangttListTemp.setGiayPlx(khachhang.getGiayPlx());
             em.merge(khachhang);
             em.getTransaction().commit();
             return true;
         }
    
        public  boolean capnhatthongtinkh(KhachhangttListChinha khachhang){
       //Tao thong tin cap nhat
        VwKhachhangttListTemp kq= new VwKhachhangttListTemp();
         KhachhangttListChinha khachhangttListTemp = em.getReference(KhachhangttListChinha.class, khachhang.getIdCode());
         if(khachhangttListTemp==null)
         {
           return false;
         }
         else{
             em.getTransaction().begin();
             khachhangttListTemp.setDidong1(khachhang.getDidong1());
             khachhangttListTemp.setHoten(khachhang.getHoten());
             khachhangttListTemp.setDachuanhoa("Y");
             khachhangttListTemp.setSonhaHientai(khachhang.getSonhaHientai());
             khachhangttListTemp.setTpHientai(khachhang.getTpHientai());
             khachhangttListTemp.setSochungminh(khachhang.getSochungminh());
             khachhangttListTemp.setNgaycap(khachhang.getNgaycapCmnd());
             khachhangttListTemp.setIdNoicapcmnd(khachhang.getIdNoicapcmnd());
             khachhangttListTemp.setGiayPlx(khachhang.getGiayPlx());
             em.merge(khachhang);
             em.getTransaction().commit();
             return true;
         }
         
    }
         
    }
