 
package entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "DM_XACMINH_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXacminhHistory.findAll", query = "SELECT d FROM DmXacminhHistory d"),
    @NamedQuery(name = "DmXacminhHistory.findByKhoa", query = "SELECT d FROM DmXacminhHistory d WHERE d.khoa = :khoa"),
    @NamedQuery(name = "DmXacminhHistory.findByNoidungxm", query = "SELECT d FROM DmXacminhHistory d WHERE d.noidungxm = :noidungxm"),
    @NamedQuery(name = "DmXacminhHistory.findByFileno", query = "SELECT d FROM DmXacminhHistory d WHERE d.fileno = :fileno"),
    @NamedQuery(name = "DmXacminhHistory.findByKiemtra", query = "SELECT d FROM DmXacminhHistory d WHERE d.kiemtra = :kiemtra"),
    @NamedQuery(name = "DmXacminhHistory.findByIdNvKt", query = "SELECT d FROM DmXacminhHistory d WHERE d.idNvKt = :idNvKt"),
    @NamedQuery(name = "DmXacminhHistory.findByNgayKt", query = "SELECT d FROM DmXacminhHistory d WHERE d.ngayKt = :ngayKt"),
    @NamedQuery(name = "DmXacminhHistory.findByDotbn", query = "SELECT d FROM DmXacminhHistory d WHERE d.dotbn = :dotbn"),
    @NamedQuery(name = "DmXacminhHistory.findByDateModified", query = "SELECT d FROM DmXacminhHistory d WHERE d.dateModified = :dateModified"),
    @NamedQuery(name = "DmXacminhHistory.findByIdDoitac", query = "SELECT d FROM DmXacminhHistory d WHERE d.idDoitac = :idDoitac"),
    @NamedQuery(name = "DmXacminhHistory.findByMaNguoinhan", query = "SELECT d FROM DmXacminhHistory d WHERE d.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "DmXacminhHistory.findByMarkerId", query = "SELECT d FROM DmXacminhHistory d WHERE d.markerId = :markerId"),
    @NamedQuery(name = "DmXacminhHistory.findByNgayBiennhan", query = "SELECT d FROM DmXacminhHistory d WHERE d.ngayBiennhan = :ngayBiennhan"),
    @NamedQuery(name = "DmXacminhHistory.findByIdChinhanh", query = "SELECT d FROM DmXacminhHistory d WHERE d.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "DmXacminhHistory.findBySophieu", query = "SELECT d FROM DmXacminhHistory d WHERE d.sophieu = :sophieu"),
    @NamedQuery(name = "DmXacminhHistory.findByStt", query = "SELECT d FROM DmXacminhHistory d WHERE d.stt = :stt"),
    @NamedQuery(name = "DmXacminhHistory.findByIdCtTuythan", query = "SELECT d FROM DmXacminhHistory d WHERE d.idCtTuythan = :idCtTuythan"),
    @NamedQuery(name = "DmXacminhHistory.findBySoCtTuythan", query = "SELECT d FROM DmXacminhHistory d WHERE d.soCtTuythan = :soCtTuythan"),
    @NamedQuery(name = "DmXacminhHistory.findByIdNvChitra", query = "SELECT d FROM DmXacminhHistory d WHERE d.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "DmXacminhHistory.findBySobn", query = "SELECT d FROM DmXacminhHistory d WHERE d.sobn = :sobn"),
    @NamedQuery(name = "DmXacminhHistory.findByIderror", query = "SELECT d FROM DmXacminhHistory d WHERE d.iderror = :iderror"),
    @NamedQuery(name = "DmXacminhHistory.findByIdLoaixm", query = "SELECT d FROM DmXacminhHistory d WHERE d.idLoaixm = :idLoaixm"),
    @NamedQuery(name = "DmXacminhHistory.findByTrangthai", query = "SELECT d FROM DmXacminhHistory d WHERE d.trangthai = :trangthai"),
    @NamedQuery(name = "DmXacminhHistory.findByNgaytao", query = "SELECT d FROM DmXacminhHistory d WHERE d.ngaytao = :ngaytao"),
    @NamedQuery(name = "DmXacminhHistory.findByIdCode", query = "SELECT d FROM DmXacminhHistory d WHERE d.idCode = :idCode")})
public class DmXacminhHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "KHOA")
    private String khoa;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXM")
    private String noidungxm;
    @Column(name = "FILENO")
    private BigInteger fileno;
    @Size(max = 1)
    @Column(name = "KIEMTRA")
    private String kiemtra;
    @Size(max = 20)
    @Column(name = "ID_NV_KT")
    private String idNvKt;
    @Column(name = "NGAY_KT")
    @Temporal(TemporalType.DATE)
    private Date ngayKt;
    @Size(max = 200)
    @Column(name = "DOTBN")
    private String dotbn;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    @Size(max = 20)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 20)
    @Column(name = "MARKER_ID")
    private String markerId;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayBiennhan;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 60)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 60)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 60)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 60)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Size(max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Size(max = 1)
    @Column(name = "IDERROR")
    private String iderror;
    @Size(max = 40)
    @Column(name = "ID_LOAIXM")
    private String idLoaixm;
    @Size(max = 1)
    @Column(name = "TRANGTHAI")
    private String trangthai;
    @Column(name = "NGAYTAO")
    @Temporal(TemporalType.DATE)
    private Date ngaytao;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ID_CODE")
    private String idCode;

    public DmXacminhHistory() {
    }

    public DmXacminhHistory(String idCode) {
        this.idCode = idCode;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNoidungxm() {
        return noidungxm;
    }

    public void setNoidungxm(String noidungxm) {
        this.noidungxm = noidungxm;
    }

 

    public BigInteger getFileno() {
        return fileno;
    }

    public void setFileno(BigInteger fileno) {
        this.fileno = fileno;
    }

    public String getKiemtra() {
        return kiemtra;
    }

    public void setKiemtra(String kiemtra) {
        this.kiemtra = kiemtra;
    }

    public String getIdNvKt() {
        return idNvKt;
    }

    public void setIdNvKt(String idNvKt) {
        this.idNvKt = idNvKt;
    }

    public Date getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(Date ngayKt) {
        this.ngayKt = ngayKt;
    }

    public String getDotbn() {
        return dotbn;
    }

    public void setDotbn(String dotbn) {
        this.dotbn = dotbn;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public String getIdChinhanh() {
        return idChinhanh;
    }

    public void setIdChinhanh(String idChinhanh) {
        this.idChinhanh = idChinhanh;
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

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
    }

    public String getIderror() {
        return iderror;
    }

    public void setIderror(String iderror) {
        this.iderror = iderror;
    }

    public String getIdLoaixm() {
        return idLoaixm;
    }

    public void setIdLoaixm(String idLoaixm) {
        this.idLoaixm = idLoaixm;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
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
        if (!(object instanceof DmXacminhHistory)) {
            return false;
        }
        DmXacminhHistory other = (DmXacminhHistory) object;
        if ((this.idCode == null && other.idCode != null) || (this.idCode != null && !this.idCode.equals(other.idCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DmXacminhHistory[ idCode=" + idCode + " ]";
    }
    
}
