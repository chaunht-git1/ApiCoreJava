/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitieskhout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "VW_DM_QUANLYDOT_IMAGETONG_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findAll", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByIdcode", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.idcode = :idcode"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByMarkerId", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.markerId = :markerId"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByIderror", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.iderror = :iderror"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByDotbn", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.dotbn = :dotbn"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByDateModified", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.dateModified = :dateModified"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByShs", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.shs = :shs"),
    @NamedQuery(name = "VwDmQuanlydotImagetongWeb.findByKiemtra", query = "SELECT v FROM VwDmQuanlydotImagetongWeb v WHERE v.kiemtra = :kiemtra")})
public class VwDmQuanlydotImagetongWeb implements Serializable {
    @Size(max = 20)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 4000)
    @Column(name = "TENCHINHANH")
    private String tenchinhanh;
    @Size(max = 5)
    @Column(name = "DESERROR")
    private String deserror;
    private static final long serialVersionUID = 1L;
    @Id
    @Size(max = 202)
    @Column(name = "IDCODE")
    private String idcode;
    @Size(max = 20)
    @Column(name = "MARKER_ID")
    private String markerId;
    @Size(max = 1)
    @Column(name = "IDERROR")
    private String iderror;
    @Size(max = 200)
    @Column(name = "DOTBN")
    private String dotbn;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Column(name = "SHS")
    private BigInteger shs;
    @Size(max = 1)
    @Column(name = "KIEMTRA")
    private String kiemtra;
    //Du lieu them vao  .
    
 

    public VwDmQuanlydotImagetongWeb() {
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public String getIderror() {
        return iderror;
    }

    public void setIderror(String iderror) {
        this.iderror = iderror;
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

    public BigInteger getShs() {
        return shs;
    }

    public void setShs(BigInteger shs) {
        this.shs = shs;
    }

    public String getKiemtra() {
        return kiemtra;
    }

    public void setKiemtra(String kiemtra) {
        this.kiemtra = kiemtra;
    }

    public String getDeserror() {
        return deserror;
    }

    public void setDeserror(String deserror) {
        this.deserror = deserror;
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
    
}
