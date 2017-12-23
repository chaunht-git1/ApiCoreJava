 
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
@Table(name = "VW_DSHOSO_DGP_SUM_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDshosoDgpSumWeb.findAll", query = "SELECT v FROM VwDshosoDgpSumWeb v"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByIdCode", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByIdChinhanh", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByTenchinhanh", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByIdNvChitra", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByIdCity", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idCity = :idCity"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByIdDistrict", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idDistrict = :idDistrict"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByCityName", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.cityName = :cityName"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByDistrictName", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.districtName = :districtName"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByShs", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByShsmg", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.shsmg = :shsmg"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByShsria", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.shsria = :shsria"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByShssaigon", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.shssaigon = :shssaigon"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByShsdtt", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.shsdtt = :shsdtt"),
    @NamedQuery(name = "VwDshosoDgpSumWeb.findByKhoaMaster", query = "SELECT v FROM VwDshosoDgpSumWeb v WHERE v.idChinhanh=:idChinhanh AND  v.idDistrict=:idDistrict AND v.idCity=:idCity AND v.idNvChitra = :idNvChitra")})
public class VwDshosoDgpSumWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 83)
    @Column(name = "ID_CODE")
    @Id
    private String idCode;
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 20)
    @Column(name = "ID_CITY")
    private String idCity;
    @Size(max = 20)
    @Column(name = "ID_DISTRICT")
    private String idDistrict;
    @Size(max = 4000)
    @Column(name = "CITY_NAME")
    private String cityName;
    @Size(max = 4000)
    @Column(name = "DISTRICT_NAME")
    private String districtName;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "SHSMG")
    private BigInteger shsmg;
    @Column(name = "SHSRIA")
    private BigInteger shsria;
    @Column(name = "SHSSAIGON")
    private BigInteger shssaigon;
    @Column(name = "SHSDTT")
    private BigInteger shsdtt;

    public VwDshosoDgpSumWeb() {
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
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

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
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

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getShsmg() {
        return shsmg;
    }

    public void setShsmg(BigInteger shsmg) {
        this.shsmg = shsmg;
    }

    public BigInteger getShsria() {
        return shsria;
    }

    public void setShsria(BigInteger shsria) {
        this.shsria = shsria;
    }

    public BigInteger getShssaigon() {
        return shssaigon;
    }

    public void setShssaigon(BigInteger shssaigon) {
        this.shssaigon = shssaigon;
    }

    public BigInteger getShsdtt() {
        return shsdtt;
    }

    public void setShsdtt(BigInteger shsdtt) {
        this.shsdtt = shsdtt;
    }
    
}
