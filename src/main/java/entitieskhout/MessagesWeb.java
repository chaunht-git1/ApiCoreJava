/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitieskhout;

import java.io.Serializable;
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

/**
 *
 * @author TamChauDAMTC
 */
@Entity
@Table(name = "MESSAGES_WEB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MessagesWeb.findAll", query = "SELECT m FROM MessagesWeb m"),
    @NamedQuery(name = "MessagesWeb.findByMessageid", query = "SELECT m FROM MessagesWeb m WHERE m.messageid = :messageid"),
    @NamedQuery(name = "MessagesWeb.findByDateModified", query = "SELECT m FROM MessagesWeb m WHERE m.dateModified = :dateModified"),
    @NamedQuery(name = "MessagesWeb.findByMessagedetail", query = "SELECT m FROM MessagesWeb m WHERE m.messagedetail = :messagedetail"),
    @NamedQuery(name = "MessagesWeb.findByReceiverid", query = "SELECT m FROM MessagesWeb m WHERE m.receiverid = :receiverid"),
    @NamedQuery(name = "MessagesWeb.findBySenderid", query = "SELECT m FROM MessagesWeb m WHERE m.senderid = :senderid"),
    @NamedQuery(name = "MessagesWeb.findBySobn", query = "SELECT m FROM MessagesWeb m WHERE m.sobn = :sobn"),
    @NamedQuery(name = "MessagesWeb.findByIdChinhanh", query = "SELECT m FROM MessagesWeb m WHERE m.idChinhanh = :idChinhanh"),
    @NamedQuery(name = "MessagesWeb.findBySophieu", query = "SELECT m FROM MessagesWeb m WHERE m.sophieu = :sophieu"),
    @NamedQuery(name = "MessagesWeb.findByStt", query = "SELECT m FROM MessagesWeb m WHERE m.stt = :stt"),
    @NamedQuery(name = "MessagesWeb.findByManguoinhan", query = "SELECT m FROM MessagesWeb m WHERE m.manguoinhan = :manguoinhan"),
    @NamedQuery(name = "MessagesWeb.findByNoidungxl", query = "SELECT m FROM MessagesWeb m WHERE m.noidungxl = :noidungxl"),
    @NamedQuery(name = "MessagesWeb.findByNgayxl", query = "SELECT m FROM MessagesWeb m WHERE m.ngayxl = :ngayxl"),
    @NamedQuery(name = "MessagesWeb.findByDuyet", query = "SELECT m FROM MessagesWeb m WHERE m.duyet = :duyet"),
    @NamedQuery(name = "MessagesWeb.findByIdNvChitranhan", query = "SELECT m FROM MessagesWeb m WHERE m.idNvChitranhan = :idNvChitranhan"),
    @NamedQuery(name = "MessagesWeb.findByIdNvChitrangui", query = "SELECT m FROM MessagesWeb m WHERE m.idNvChitrangui = :idNvChitrangui"),
    @NamedQuery(name = "MessagesWeb.findByIdcode", query = "SELECT m FROM MessagesWeb m WHERE m.idcode = :idcode"),
    @NamedQuery(name = "MessagesWeb.findByGhichuchuyen", query = "SELECT m FROM MessagesWeb m WHERE m.ghichuchuyen = :ghichuchuyen")})
public class MessagesWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MESSAGEID")
    private String messageid;
    @Column(name = "DATE_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date dateModified;
    @Size(max = 255)
    @Column(name = "MESSAGEDETAIL")
    private String messagedetail;
    @Size(max = 255)
    @Column(name = "RECEIVERID")
    private String receiverid;
    @Size(max = 255)
    @Column(name = "SENDERID")
    private String senderid;
    @Size(max = 40)
    @Column(name = "SOBN")
    private String sobn;
    @Size(max = 40)
    @Column(name = "ID_CHINHANH")
    private String idChinhanh;
    @Size(max = 40)
    @Column(name = "SOPHIEU")
    private String sophieu;
    @Size(max = 40)
    @Column(name = "STT")
    private String stt;
    @Size(max = 60)
    @Column(name = "MANGUOINHAN")
    private String manguoinhan;
    @Size(max = 1000)
    @Column(name = "NOIDUNGXL")
    private String noidungxl;
    @Column(name = "NGAYXL")
    @Temporal(TemporalType.DATE)
    private Date ngayxl;
    @Size(max = 1)
    @Column(name = "DUYET")
    private String duyet;
    @Size(max = 40)
    @Column(name = "ID_NV_CHITRANHAN")
    private String idNvChitranhan;
    @Size(max = 40)
    @Column(name = "ID_NV_CHITRANGUI")
    private String idNvChitrangui;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "IDCODE")
    private String idcode;
    @Size(max = 1000)
    @Column(name = "GHICHUCHUYEN")
    private String ghichuchuyen;

    public MessagesWeb() {
    }

    public MessagesWeb(String idcode) {
        this.idcode = idcode;
    }

    public MessagesWeb(String idcode, String messageid) {
        this.idcode = idcode;
        this.messageid = messageid;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getMessagedetail() {
        return messagedetail;
    }

    public void setMessagedetail(String messagedetail) {
        this.messagedetail = messagedetail;
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public String getSobn() {
        return sobn;
    }

    public void setSobn(String sobn) {
        this.sobn = sobn;
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

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getManguoinhan() {
        return manguoinhan;
    }

    public void setManguoinhan(String manguoinhan) {
        this.manguoinhan = manguoinhan;
    }

    public String getNoidungxl() {
        return noidungxl;
    }

    public void setNoidungxl(String noidungxl) {
        this.noidungxl = noidungxl;
    }

    public Date getNgayxl() {
        return ngayxl;
    }

    public void setNgayxl(Date ngayxl) {
        this.ngayxl = ngayxl;
    }

    public String getDuyet() {
        return duyet;
    }

    public void setDuyet(String duyet) {
        this.duyet = duyet;
    }

    public String getIdNvChitranhan() {
        return idNvChitranhan;
    }

    public void setIdNvChitranhan(String idNvChitranhan) {
        this.idNvChitranhan = idNvChitranhan;
    }

    public String getIdNvChitrangui() {
        return idNvChitrangui;
    }

    public void setIdNvChitrangui(String idNvChitrangui) {
        this.idNvChitrangui = idNvChitrangui;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getGhichuchuyen() {
        return ghichuchuyen;
    }

    public void setGhichuchuyen(String ghichuchuyen) {
        this.ghichuchuyen = ghichuchuyen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcode != null ? idcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessagesWeb)) {
            return false;
        }
        MessagesWeb other = (MessagesWeb) object;
        if ((this.idcode == null && other.idcode != null) || (this.idcode != null && !this.idcode.equals(other.idcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MessagesWeb[ idcode=" + idcode + " ]";
    }
    
}
