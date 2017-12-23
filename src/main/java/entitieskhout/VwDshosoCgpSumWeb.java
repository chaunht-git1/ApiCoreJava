 
package entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

 
@Entity
@Table(name = "VW_DSHOSO_CGP_SUM_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDshosoCgpSumWeb.findAll", query = "SELECT v FROM VwDshosoCgpSumWeb v"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByIdCode", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByIdChinhanh", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByTenchinhanh", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByIdCity", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByCityName", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.cityName = :cityName"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByDistrictName", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.districtName = :districtName"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByNvhis", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.nvhis = :nvhis"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByIdDistrict", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByShs", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByIdLoaigiaophieu", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.idLoaigiaophieu = :idLoaigiaophieu"),
    @NamedQuery(name = "VwDshosoCgpSumWeb.findByDesloaigiaophieu", query = "SELECT v FROM VwDshosoCgpSumWeb v WHERE v.desloaigiaophieu = :desloaigiaophieu")})
public class VwDshosoCgpSumWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 50)
    @Column(name = "ID_CODE")
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 4000)
    @Column(name = "CITY_NAME")
    private String cityName;
    @Size(max = 4000)
    @Column(name = "DISTRICT_NAME")
    private String districtName;
    @Size(max = 4000)
    @Column(name = "NVHIS")
    private String nvhis;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "SHSMG")
    private BigInteger shsmg;
    @Size(max = 2)
    @Column(name = "ID_LOAIGIAOPHIEU")
    private String idLoaigiaophieu;
    @Size(max = 22)
    @Column(name = "DESLOAIGIAOPHIEU")
    private String desloaigiaophieu;
   

    public VwDshosoCgpSumWeb() {
    }

    public BigInteger getShsmg() {
        return shsmg;
    }

    public void setShsmg(BigInteger shsmg) {
        this.shsmg = shsmg;
    }
 
    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getTenchinhanh() {
        return tenchinhanh;
    }

    public void setTenchinhanh(String tenchinhanh) {
        this.tenchinhanh = tenchinhanh;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getNvhis() {
        return nvhis;
    }

    public void setNvhis(String nvhis) {
        this.nvhis = nvhis;
    }

    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public String getIdLoaigiaophieu() {
        return idLoaigiaophieu;
    }

    public void setIdLoaigiaophieu(String idLoaigiaophieu) {
        this.idLoaigiaophieu = idLoaigiaophieu;
    }

    public String getDesloaigiaophieu() {
        return desloaigiaophieu;
    }

    public void setDesloaigiaophieu(String desloaigiaophieu) {
        this.desloaigiaophieu = desloaigiaophieu;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
    
}
