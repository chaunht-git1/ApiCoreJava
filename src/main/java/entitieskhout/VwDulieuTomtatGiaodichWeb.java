 
package entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "VW_DULIEU_TOMTAT_GIAODICH_WEB")
@XmlRootElement
@Cacheable
@NamedQueries({
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findAll", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdcode", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idcode = :idcode"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findBySophieu", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByStt", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdChinhanh", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findBySoCtTuythan", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findBySobn", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByMaNguoinhan", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByDienthoai", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByHoten", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByDiachi", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByMakhachhang", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.makhachhang = :makhachhang"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdDoitac", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idDoitac = :idDoitac"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByAgent", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.agent = :agent"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdNvChitra", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdDiadiemchitra", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idDiadiemchitra = :idDiadiemchitra"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByIdThanhtoan", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.idThanhtoan = :idThanhtoan"),
    @NamedQuery(name = "VwDulieuTomtatGiaodichWeb.findByNgayNhaplieu", query = "SELECT v FROM VwDulieuTomtatGiaodichWeb v WHERE v.ngayNhaplieu = :ngayNhaplieu")})
public class VwDulieuTomtatGiaodichWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 80)
    @Column(name = "IDCODE")
    @Id
    private String idcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Column(name = "SOBN")
    private Long sobn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 40)
    @Column(name = "MAKHACHHANG")
    private String makhachhang;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 40)
    @Column(name = "AGENT")
    private String agent;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_DIADIEMCHITRA")
    private String idDiadiemchitra;
    @Size(max = 20)
    @Column(name = "ID_THANHTOAN")
    private String idThanhtoan;
    @Column(name = "NGAY_NHAPLIEU")
    @Temporal(TemporalType.DATE)
    private Date ngayNhaplieu;

    public VwDulieuTomtatGiaodichWeb() {
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

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
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

    public Date getNgayNhaplieu() {
        return ngayNhaplieu;
    }

    public void setNgayNhaplieu(Date ngayNhaplieu) {
        this.ngayNhaplieu = ngayNhaplieu;
    }
    
}
