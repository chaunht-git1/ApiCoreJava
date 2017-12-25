 
package SessionEntities;

import SessionEntities.exceptions.NonexistentEntityException;
import SessionEntities.exceptions.PreexistingEntityException;
import SessionEntities.exceptions.RollbackFailureException;
import entitieskhout.KhachhangttListChinha;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

 
public class KhachhangttListChinhaJpaController implements Serializable {

    public KhachhangttListChinhaJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(KhachhangttListChinha khachhangttListChinha) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(khachhangttListChinha);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findKhachhangttListChinha(khachhangttListChinha.getIdCode()) != null) {
                throw new PreexistingEntityException("KhachhangttListChinha " + khachhangttListChinha + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(KhachhangttListChinha khachhangttListChinha) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            khachhangttListChinha = em.merge(khachhangttListChinha);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = khachhangttListChinha.getIdCode();
                if (findKhachhangttListChinha(id) == null) {
                    throw new NonexistentEntityException("The khachhangttListChinha with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            KhachhangttListChinha khachhangttListChinha;
            try {
                khachhangttListChinha = em.getReference(KhachhangttListChinha.class, id);
                khachhangttListChinha.getIdCode();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The khachhangttListChinha with id " + id + " no longer exists.", enfe);
            }
            em.remove(khachhangttListChinha);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<KhachhangttListChinha> findKhachhangttListChinhaEntities() {
        return findKhachhangttListChinhaEntities(true, -1, -1);
    }

    public List<KhachhangttListChinha> findKhachhangttListChinhaEntities(int maxResults, int firstResult) {
        return findKhachhangttListChinhaEntities(false, maxResults, firstResult);
    }

    private List<KhachhangttListChinha> findKhachhangttListChinhaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(KhachhangttListChinha.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public KhachhangttListChinha findKhachhangttListChinha(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(KhachhangttListChinha.class, id);
        } finally {
            em.close();
        }
    }

    public int getKhachhangttListChinhaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<KhachhangttListChinha> rt = cq.from(KhachhangttListChinha.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
