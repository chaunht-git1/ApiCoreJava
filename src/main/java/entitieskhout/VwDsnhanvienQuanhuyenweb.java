 
package entitieskhout;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
 
@Entity
@Table(name = "VW_DSNHANVIEN_QUANHUYENWEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findAll", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByIdCode", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByIdNvChitra", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByUserName", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.userName = :userName"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByIdCity", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.idCity = :idCity AND v.homeBranch=:homeBranch"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByIdDistrict", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.idDistrict = :idDistrict AND v.homeBranch=:homeBranch"),
    @NamedQuery(name = "VwDsnhanvienQuanhuyenweb.findByHomeBranch", query = "SELECT v FROM VwDsnhanvienQuanhuyenweb v WHERE v.homeBranch = :homeBranch")})
public class VwDsnhanvienQuanhuyenweb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 75)
    @Column(name = "ID_CODE")
    @Id
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 35)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 3)
    @Column(name = "HOME_BRANCH")
    private String homeBranch;

    public VwDsnhanvienQuanhuyenweb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }
    
}
