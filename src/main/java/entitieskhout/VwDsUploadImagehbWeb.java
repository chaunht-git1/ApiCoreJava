/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitieskhout;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "VW_DS_UPLOAD_IMAGEHB_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDsUploadImagehbWeb.findAll", query = "SELECT v FROM VwDsUploadImagehbWeb v"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdCode", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idCode = :idCode"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findBySobn", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.sobn = :sobn"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdDotData", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idDotData = :idDotData"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByHoten", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.hoten = :hoten"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByMaNguoinhan", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.maNguoinhan = :maNguoinhan"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNguoigoi", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.nguoigoi = :nguoigoi"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByMaKhachhang", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.maKhachhang = :maKhachhang"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdLoaitienchitra", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idLoaitienchitra = :idLoaitienchitra"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdLoaitiengoi", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idLoaitiengoi = :idLoaitiengoi"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findBySotiengoi", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.sotiengoi = :sotiengoi"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByTygia", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.tygia = :tygia"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByThanhtien", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.thanhtien = :thanhtien"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByDiachi", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.diachi = :diachi"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByDachitra", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.dachitra = :dachitra"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByDahoibao", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.dahoibao = :dahoibao"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdNvHoibao", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idNvHoibao = :idNvHoibao"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNgayHoibao", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ngayHoibao = :ngayHoibao"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByXacminh", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.xacminh = :xacminh"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByLydoxacminh", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.lydoxacminh = :lydoxacminh"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdNvChitra", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idNvChitra = :idNvChitra"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdChinhanh", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findBySophieu", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.sophieu = :sophieu"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByDienthoai", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.dienthoai = :dienthoai"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByGhichuGoi", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ghichuGoi = :ghichuGoi"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByStt", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.stt = :stt"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdMobiHb", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idMobiHb = :idMobiHb"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNgayMobiHb", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ngayMobiHb = :ngayMobiHb"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByBiennhanC", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.biennhanC = :biennhanC"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByIdNvBiennhan", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.idNvBiennhan = :idNvBiennhan"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNgayBiennhan", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ngayBiennhan = :ngayBiennhan"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNgayChitra", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ngayChitra = :ngayChitra"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByNgayChitraTrue", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.ngayChitraTrue = :ngayChitraTrue"),
    @NamedQuery(name = "VwDsUploadImagehbWeb.findByDachitratreo", query = "SELECT v FROM VwDsUploadImagehbWeb v WHERE v.dachitratreo = :dachitratreo")})
public class VwDsUploadImagehbWeb implements Serializable {
    @Size(max = 20)
    @Column(name = "SO_CT_TUYTHAN")
    private String soCtTuythan;
    @Size(max = 20)
    @Column(name = "ID_CT_TUYTHAN")
    private String idCtTuythan;
    @Size(max = 1)
    @Column(name = "ID_TREOPHIEU")
    private String idTreophieu;
    @Size(max = 1)
    @Column(name = "DACHITRAKT")
    private String dachitrakt;
    @Column(name = "NGAYCHITRATREO")
    @Temporal(TemporalType.DATE)
    private Date ngaychitratreo;
    @Size(max = 20)
    @Column(name = "ID_DOITAC")
    private String idDoitac;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 80)
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "SOBN")
    private Long sobn;
    @Column(name = "ID_DOT_DATA")
    private BigInteger idDotData;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HOTEN")
    private String hoten;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "MA_NGUOINHAN")
    private String maNguoinhan;
    @Size(max = 60)
    @Column(name = "NGUOIGOI")
    private String nguoigoi;
    @Size(max = 20)
    @Column(name = "MA_KHACHHANG")
    private String maKhachhang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENCHITRA")
    private String idLoaitienchitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_LOAITIENGOI")
    private String idLoaitiengoi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOTIENGOI")
    private BigDecimal sotiengoi;
    @Column(name = "TYGIA")
    private BigDecimal tygia;
    @Column(name = "THANHTIEN")
    private BigDecimal thanhtien;
    @Size(max = 150)
    @Column(name = "DIACHI")
    private String diachi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DACHITRA")
    private Character dachitra;
    @Size(max = 0)
    @Column(name = "DAHOIBAO")
    private String dahoibao;
    @Size(max = 0)
    @Column(name = "ID_NV_HOIBAO")
    private String idNvHoibao;
    @Column(name = "NGAY_HOIBAO")
    @Temporal(TemporalType.DATE)
    private Date ngayHoibao;
    @Column(name = "XACMINH")
    private Character xacminh;
    @Size(max = 0)
    @Column(name = "LYDOXACMINH")
    private String lydoxacminh;
    @Size(max = 20)
    @Column(name = "ID_NV_CHITRA")
    private String idNvChitra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Size(max = 40)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    @Size(max = 400)
    @Column(name = "GHICHU_GOI")
    private String ghichuGoi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private BigInteger stt;
    @Size(max = 1)
    @Column(name = "ID_MOBI_HB")
    private String idMobiHb;
    @Column(name = "NGAY_MOBI_HB")
    @Temporal(TemporalType.DATE)
    private Date ngayMobiHb;
    @Size(max = 1)
    @Column(name = "BIENNHAN_C")
    private String biennhanC;
    @Size(max = 20)
    @Column(name = "ID_NV_BIENNHAN")
    private String idNvBiennhan;
    @Column(name = "NGAY_BIENNHAN")
    @Temporal(TemporalType.DATE)
    private Date ngayBiennhan;
    @Column(name = "NGAY_CHITRA")
    @Temporal(TemporalType.DATE)
    private Date ngayChitra;
    @Column(name = "NGAY_CHITRA_TRUE")
    @Temporal(TemporalType.DATE)
    private Date ngayChitraTrue;
    @Size(max = 1)
    @Column(name = "DACHITRATREO")
    private String dachitratreo;
    @Size(max=60)
    @Column(name = "MAVACH")
    private String mavach;

    public VwDsUploadImagehbWeb() {
    }

    public String getMavach() {
        return mavach;
    }

    public void setMavach(String mavach) {
        this.mavach = mavach;
    }
    
    

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Long getSobn() {
        return sobn;
    }

    public void setSobn(Long sobn) {
        this.sobn = sobn;
    }

    public BigInteger getIdDotData() {
        return idDotData;
    }

    public void setIdDotData(BigInteger idDotData) {
        this.idDotData = idDotData;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaNguoinhan() {
        return maNguoinhan;
    }

    public void setMaNguoinhan(String maNguoinhan) {
        this.maNguoinhan = maNguoinhan;
    }

    public String getNguoigoi() {
        return nguoigoi;
    }

    public void setNguoigoi(String nguoigoi) {
        this.nguoigoi = nguoigoi;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getIdLoaitienchitra() {
        return idLoaitienchitra;
    }

    public void setIdLoaitienchitra(String idLoaitienchitra) {
        this.idLoaitienchitra = idLoaitienchitra;
    }

    public String getIdLoaitiengoi() {
        return idLoaitiengoi;
    }

    public void setIdLoaitiengoi(String idLoaitiengoi) {
        this.idLoaitiengoi = idLoaitiengoi;
    }

    public BigDecimal getSotiengoi() {
        return sotiengoi;
    }

    public void setSotiengoi(BigDecimal sotiengoi) {
        this.sotiengoi = sotiengoi;
    }

    public BigDecimal getTygia() {
        return tygia;
    }

    public void setTygia(BigDecimal tygia) {
        this.tygia = tygia;
    }

    public BigDecimal getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(BigDecimal thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Character getDachitra() {
        return dachitra;
    }

    public void setDachitra(Character dachitra) {
        this.dachitra = dachitra;
    }

    public String getDahoibao() {
        return dahoibao;
    }

    public void setDahoibao(String dahoibao) {
        this.dahoibao = dahoibao;
    }

    public String getIdNvHoibao() {
        return idNvHoibao;
    }

    public void setIdNvHoibao(String idNvHoibao) {
        this.idNvHoibao = idNvHoibao;
    }

    public Date getNgayHoibao() {
        return ngayHoibao;
    }

    public void setNgayHoibao(Date ngayHoibao) {
        this.ngayHoibao = ngayHoibao;
    }

    public Character getXacminh() {
        return xacminh;
    }

    public void setXacminh(Character xacminh) {
        this.xacminh = xacminh;
    }

    public String getLydoxacminh() {
        return lydoxacminh;
    }

    public void setLydoxacminh(String lydoxacminh) {
        this.lydoxacminh = lydoxacminh;
    }

    public String getIdNvChitra() {
        return idNvChitra;
    }

    public void setIdNvChitra(String idNvChitra) {
        this.idNvChitra = idNvChitra;
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

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getGhichuGoi() {
        return ghichuGoi;
    }

    public void setGhichuGoi(String ghichuGoi) {
        this.ghichuGoi = ghichuGoi;
    }

    public BigInteger getStt() {
        return stt;
    }

    public void setStt(BigInteger stt) {
        this.stt = stt;
    }

    public String getIdMobiHb() {
        return idMobiHb;
    }

    public void setIdMobiHb(String idMobiHb) {
        this.idMobiHb = idMobiHb;
    }

    public Date getNgayMobiHb() {
        return ngayMobiHb;
    }

    public void setNgayMobiHb(Date ngayMobiHb) {
        this.ngayMobiHb = ngayMobiHb;
    }

    public String getBiennhanC() {
        return biennhanC;
    }

    public void setBiennhanC(String biennhanC) {
        this.biennhanC = biennhanC;
    }

    public String getIdNvBiennhan() {
        return idNvBiennhan;
    }

    public void setIdNvBiennhan(String idNvBiennhan) {
        this.idNvBiennhan = idNvBiennhan;
    }

    public Date getNgayBiennhan() {
        return ngayBiennhan;
    }

    public void setNgayBiennhan(Date ngayBiennhan) {
        this.ngayBiennhan = ngayBiennhan;
    }

    public Date getNgayChitra() {
        return ngayChitra;
    }

    public void setNgayChitra(Date ngayChitra) {
        this.ngayChitra = ngayChitra;
    }

    public Date getNgayChitraTrue() {
        return ngayChitraTrue;
    }

    public void setNgayChitraTrue(Date ngayChitraTrue) {
        this.ngayChitraTrue = ngayChitraTrue;
    }

    public String getDachitratreo() {
        return dachitratreo;
    }

    public void setDachitratreo(String dachitratreo) {
        this.dachitratreo = dachitratreo;
    }

    public String getIdDoitac() {
        return idDoitac;
    }

    public void setIdDoitac(String idDoitac) {
        this.idDoitac = idDoitac;
    }

    public String getIdTreophieu() {
        return idTreophieu;
    }

    public void setIdTreophieu(String idTreophieu) {
        this.idTreophieu = idTreophieu;
    }

    public String getDachitrakt() {
        return dachitrakt;
    }

    public void setDachitrakt(String dachitrakt) {
        this.dachitrakt = dachitrakt;
    }

    public Date getNgaychitratreo() {
        return ngaychitratreo;
    }

    public void setNgaychitratreo(Date ngaychitratreo) {
        this.ngaychitratreo = ngaychitratreo;
    }

    public String getSoCtTuythan() {
        return soCtTuythan;
    }

    public void setSoCtTuythan(String soCtTuythan) {
        this.soCtTuythan = soCtTuythan;
    }

    public String getIdCtTuythan() {
        return idCtTuythan;
    }

    public void setIdCtTuythan(String idCtTuythan) {
        this.idCtTuythan = idCtTuythan;
    }
    
}
