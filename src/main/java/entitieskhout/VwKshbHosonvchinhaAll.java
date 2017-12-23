 
package entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
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
@Table(name = "VW_KSHB_HOSONVCHINHA_ALL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findAll", query = "SELECT v FROM VwKshbHosonvchinhaAll v"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByIdChinhanh", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByTenchinhanh", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.tenchinhanh = :tenchinhanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByIdNvChitra", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByHoten", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByDachitra", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByChuachitra", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.chuachitra = :chuachitra"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByShs", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByDaquyetbn", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.daquyetbn = :daquyetbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByChoduyetbn", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.choduyetbn = :choduyetbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByThieutt", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.thieutt = :thieutt"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByErrorbn", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.errorbn = :errorbn"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByDachitrachuabn", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.dachitrachuabn = :dachitrachuabn"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByHoanthanh", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.hoanthanh = :hoanthanh"),
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByShstondong", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.shstondong = :shstondong")})
    @NamedQuery(name = "VwKshbHosonvchinhaAll.findByChinhanhNvchitra", query = "SELECT v FROM VwKshbHosonvchinhaAll v WHERE v.idChinhanh=:idChinhanh AND v.idNvChitra=:idNvchitra")
public class VwKshbHosonvchinhaAll implements Serializable {
    @Id
    @Column(name = "IDCODE")
    private String idCode;
    @Column(name = "SOLUONGHBMOBILE")
    private BigInteger soluonghbmobile;
    @Column(name = "SLMONEYGRAMDOT1")
    private BigInteger slmoneygramdot1;
    @Column(name = "SLMONEYGRAM")
    private BigInteger slmoneygram;
    @Size(max = 1)
    @Column(name = "CHINHAHOANTHANH")
    private String chinhahoanthanh;
    @Column(name = "SHSGUIXM")
    private BigInteger shsguixm;
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 80)
    @Column(name = "HOTEN")
    private String hoten;
    @Column(name = "DACHITRA")
    private BigInteger dachitra;
    @Column(name = "CHUACHITRA")
    private BigInteger chuachitra;
    @Column(name = "SHS")
    private BigInteger shs;
    @Column(name = "DAQUYETBN")
    private BigInteger daquyetbn;
    @Column(name = "CHODUYETBN")
    private BigInteger choduyetbn;
    @Column(name = "THIEUTT")
    private BigInteger thieutt;
    @Column(name = "ERRORBN")
    private BigInteger errorbn;
    @Column(name = "DACHITRACHUABN")
    private BigInteger dachitrachuabn;
    @Size(max = 1)
    @Column(name = "HOANTHANH")
    private String hoanthanh;
    @Column(name = "SHSTONDONG")
    private BigInteger shstondong;
    @Column(name = "SHSXACMINH")
    private BigInteger shsxacminh;
    
    
    

    public VwKshbHosonvchinhaAll() {
    }

    public BigInteger getShsxacminh() {
        return shsxacminh;
    }

    public void setShsxacminh(BigInteger shsxacminh) {
        this.shsxacminh = shsxacminh;
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

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public BigInteger getDachitra() {
        return dachitra;
    }

    public void setDachitra(BigInteger dachitra) {
        this.dachitra = dachitra;
    }

    public BigInteger getChuachitra() {
        return chuachitra;
    }

    public void setChuachitra(BigInteger chuachitra) {
        this.chuachitra = chuachitra;
    }

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public BigInteger getDaquyetbn() {
        return daquyetbn;
    }

    public void setDaquyetbn(BigInteger daquyetbn) {
        this.daquyetbn = daquyetbn;
    }

    public BigInteger getChoduyetbn() {
        return choduyetbn;
    }

    public void setChoduyetbn(BigInteger choduyetbn) {
        this.choduyetbn = choduyetbn;
    }

    public BigInteger getThieutt() {
        return thieutt;
    }

    public void setThieutt(BigInteger thieutt) {
        this.thieutt = thieutt;
    }

    public BigInteger getErrorbn() {
        return errorbn;
    }

    public void setErrorbn(BigInteger errorbn) {
        this.errorbn = errorbn;
    }

    public BigInteger getDachitrachuabn() {
        return dachitrachuabn;
    }

    public void setDachitrachuabn(BigInteger dachitrachuabn) {
        this.dachitrachuabn = dachitrachuabn;
    }

    public String getHoanthanh() {
        return hoanthanh;
    }

    public void setHoanthanh(String hoanthanh) {
        this.hoanthanh = hoanthanh;
    }

    public BigInteger getShstondong() {
        return shstondong;
    }

    public void setShstondong(BigInteger shstondong) {
        this.shstondong = shstondong;
    }

    public BigInteger getShsguixm() {
        return shsguixm;
    }

    public void setShsguixm(BigInteger shsguixm) {
        this.shsguixm = shsguixm;
    }

    public String getChinhahoanthanh() {
        return chinhahoanthanh;
    }

    public void setChinhahoanthanh(String chinhahoanthanh) {
        this.chinhahoanthanh = chinhahoanthanh;
    }

    public BigInteger getSlmoneygram() {
        return slmoneygram;
    }

    public void setSlmoneygram(BigInteger slmoneygram) {
        this.slmoneygram = slmoneygram;
    }

    public BigInteger getSlmoneygramdot1() {
        return slmoneygramdot1;
    }

    public void setSlmoneygramdot1(BigInteger slmoneygramdot1) {
        this.slmoneygramdot1 = slmoneygramdot1;
    }

    public BigInteger getSoluonghbmobile() {
        return soluonghbmobile;
    }

    public void setSoluonghbmobile(BigInteger soluonghbmobile) {
        this.soluonghbmobile = soluonghbmobile;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
    
}
