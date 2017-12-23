 
package entitieskh;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
 
@Entity
@Table(name = "CITY_LIST")
@XmlRootElement
@Cacheable
@NamedQueries({
    @NamedQuery(name = "CityList.findAll", query = "SELECT c FROM CityList c"),
    @NamedQuery(name = "CityList.findByIdCode", query = "SELECT c FROM CityList c WHERE c.idCode = :idCode"),
    @NamedQuery(name = "CityList.findByCityName", query = "SELECT c FROM CityList c WHERE c.cityName = :cityName"),
    @NamedQuery(name = "CityList.findByIdValidity", query = "SELECT c FROM CityList c WHERE c.idValidity = :idValidity"),
    @NamedQuery(name = "CityList.findByDateModified", query = "SELECT c FROM CityList c WHERE c.dateModified = :dateModified"),
    @NamedQuery(name = "CityList.findByDistrictDefault", query = "SELECT c FROM CityList c WHERE c.districtDefault = :districtDefault"),
    @NamedQuery(name = "CityList.findByIdNvUpdate", query = "SELECT c FROM CityList c WHERE c.idNvUpdate = :idNvUpdate"),
    @NamedQuery(name = "CityList.findByIdCityOmex", query = "SELECT c FROM CityList c WHERE c.idCityOmex = :idCityOmex"),
    @NamedQuery(name = "CityList.findByIdArea", query = "SELECT c FROM CityList c WHERE c.idArea = :idArea"),
    @NamedQuery(name = "CityList.findByIdHoiso", query = "SELECT c FROM CityList c WHERE c.idHoiso = :idHoiso"),
    @NamedQuery(name = "CityList.findByIdMavung", query = "SELECT c FROM CityList c WHERE c.idMavung = :idMavung"),
    @NamedQuery(name = "CityList.findByIdChinhanhChinh", query = "SELECT c FROM CityList c WHERE c.idChinhanhChinh = :idChinhanhChinh")})
public class CityList implements Serializable {

    @Size(max = 500)
    @Column(name = "CHUOITK_QHRIA")
    private String chuoitkQhria;
    @Size(max = 40)
    @Column(name = "ID_TIMQUANHUYEN_RIA")
    private String idTimquanhuyenRia;
    @Size(max = 500)
    @Column(name = "CHUOITK_RIA")
    private String chuoitkRia;
    @Size(max = 40)
    @Column(name = "ID_QUOCGIA")
    private String idQuocgia;
    @Size(max = 400)
    @Column(name = "CHUOILT_RIA")
    private String chuoiltRia;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 100)
    @Column(name = "CITY_NAME")
    private String cityName;
    @Size(max = 20)
    @Column(name = "ID_VALIDITY")
    private String idValidity;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 60)
    @Column(name = "DISTRICT_DEFAULT")
    private String districtDefault;
    @Size(max = 20)
    @Column(name = "ID_NV_UPDATE")
    private String idNvUpdate;
    @Size(max = 20)
    @Column(name = "ID_CITY_OMEX")
    private String idCityOmex;
    @Size(max = 20)
    @Column(name = "ID_AREA")
    private String idArea;
    @Size(max = 1)
    @Column(name = "ID_HOISO")
    private String idHoiso;
    @Size(max = 20)
    @Column(name = "ID_MAVUNG")
    private String idMavung;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH_CHINH")
    private String idChinhanhChinh;

    public CityList() {
    }

    public CityList(String idCode) {
        this.idCode = idCode;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getIdValidity() {
        return idValidity;
    }

    public void setIdValidity(String idValidity) {
        this.idValidity = idValidity;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getDistrictDefault() {
        return districtDefault;
    }

    public void setDistrictDefault(String districtDefault) {
        this.districtDefault = districtDefault;
    }

    public String getIdNvUpdate() {
        return idNvUpdate;
    }

    public void setIdNvUpdate(String idNvUpdate) {
        this.idNvUpdate = idNvUpdate;
    }

    public String getIdCityOmex() {
        return idCityOmex;
    }

    public void setIdCityOmex(String idCityOmex) {
        this.idCityOmex = idCityOmex;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getIdHoiso() {
        return idHoiso;
    }

    public void setIdHoiso(String idHoiso) {
        this.idHoiso = idHoiso;
    }

    public String getIdMavung() {
        return idMavung;
    }

    public void setIdMavung(String idMavung) {
        this.idMavung = idMavung;
    }

    public String getIdChinhanhChinh() {
        return idChinhanhChinh;
    }

    public void setIdChinhanhChinh(String idChinhanhChinh) {
        this.idChinhanhChinh = idChinhanhChinh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCode != null ? idCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CityList)) {
            return false;
        }
        CityList other = (CityList) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectBean.CityList[ idCode=" + idCode + " ]";
    }

    public String getChuoitkQhria() {
        return chuoitkQhria;
    }

    public void setChuoitkQhria(String chuoitkQhria) {
        this.chuoitkQhria = chuoitkQhria;
    }

    public String getIdTimquanhuyenRia() {
        return idTimquanhuyenRia;
    }

    public void setIdTimquanhuyenRia(String idTimquanhuyenRia) {
        this.idTimquanhuyenRia = idTimquanhuyenRia;
    }

    public String getChuoitkRia() {
        return chuoitkRia;
    }

    public void setChuoitkRia(String chuoitkRia) {
        this.chuoitkRia = chuoitkRia;
    }

    public String getIdQuocgia() {
        return idQuocgia;
    }

    public void setIdQuocgia(String idQuocgia) {
        this.idQuocgia = idQuocgia;
    }

    public String getChuoiltRia() {
        return chuoiltRia;
    }

    public void setChuoiltRia(String chuoiltRia) {
        this.chuoiltRia = chuoiltRia;
    }
    
}
