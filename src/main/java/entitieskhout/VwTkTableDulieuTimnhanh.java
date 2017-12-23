 
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
@Table(name = "VW_TK_TABLE_DULIEU_TIMNHANH")
@XmlRootElement
@Cacheable
@NamedQueries({
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findAll", query = "SELECT v FROM VwTkTableDulieuTimnhanh v"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByIdcode", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.idcode = :idcode"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findBySophieu", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByStt", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findBySobn", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByMaNguoinhan", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findBySoCtTuythan", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByDienthoai", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByHoten", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.hoten LIKE :hoten"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByDiachi", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByMakhachhang", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.makhachhang = :makhachhang"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByIdDoitac", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByAgent", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.agent = :agent"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByIdNvChitra", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByIdDiadiemchitra", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.idDiadiemchitra = :idDiadiemchitra"),
    @NamedQuery(name = "VwTkTableDulieuTimnhanh.findByIdThanhtoan", query = "SELECT v FROM VwTkTableDulieuTimnhanh v WHERE v.idThanhtoan = :idThanhtoan")})
public class VwTkTableDulieuTimnhanh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "IDCODE")
    private String idcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 40)
    @Column(name = "SOBN")
    private Number sobn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 100)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 200)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 1000)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 200)
    @Column(name = "MAKHACHHANG")
    private String makhachhang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 200)
    @Column(name = "AGENT")
    private String agent;
    @Size(max = 200)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ID_DIADIEMCHITRA")
    private String idDiadiemchitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;

    public VwTkTableDulieuTimnhanh() {
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }

    public Number getSobn() {
        return sobn;
    }

    public void setSobn(Number sobn) {
        this.sobn = sobn;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getIdDiadiemchitra() {
        return idDiadiemchitra;
    }

    public void setIdDiadiemchitra(String idDiadiemchitra) {
        this.idDiadiemchitra = idDiadiemchitra;
    }

    public String getIdThanhtoan() {
        return idThanhtoan;
    }

    public void setIdThanhtoan(String idThanhtoan) {
        this.idThanhtoan = idThanhtoan;
    }
    
}
