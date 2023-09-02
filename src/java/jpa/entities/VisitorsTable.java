/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvp5345
 */
@Entity
@Table(name = "VISITORS_TABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VisitorsTable.findAll", query = "SELECT v FROM VisitorsTable v")
    , @NamedQuery(name = "VisitorsTable.findByVisitorid", query = "SELECT v FROM VisitorsTable v WHERE v.visitorid = :visitorid")
    , @NamedQuery(name = "VisitorsTable.findByVfirstname", query = "SELECT v FROM VisitorsTable v WHERE v.vfirstname = :vfirstname")
    , @NamedQuery(name = "VisitorsTable.findByVlastname", query = "SELECT v FROM VisitorsTable v WHERE v.vlastname = :vlastname")
    , @NamedQuery(name = "VisitorsTable.findByVphonenum", query = "SELECT v FROM VisitorsTable v WHERE v.vphonenum = :vphonenum")
    , @NamedQuery(name = "VisitorsTable.findByVpartynum", query = "SELECT v FROM VisitorsTable v WHERE v.vpartynum = :vpartynum")
    , @NamedQuery(name = "VisitorsTable.findByPayment", query = "SELECT v FROM VisitorsTable v WHERE v.payment = :payment")})
public class VisitorsTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VISITORID")
    private Integer visitorid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "VFIRSTNAME")
    private String vfirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "VLASTNAME")
    private String vlastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "VPHONENUM")
    private String vphonenum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VPARTYNUM")
    private int vpartynum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PAYMENT")
    private String payment;

    public VisitorsTable() {
    }

    public VisitorsTable(Integer visitorid) {
        this.visitorid = visitorid;
    }

    public VisitorsTable(Integer visitorid, String vfirstname, String vlastname, String vphonenum, int vpartynum, String payment) {
        this.visitorid = visitorid;
        this.vfirstname = vfirstname;
        this.vlastname = vlastname;
        this.vphonenum = vphonenum;
        this.vpartynum = vpartynum;
        this.payment = payment;
    }

    public Integer getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(Integer visitorid) {
        this.visitorid = visitorid;
    }

    public String getVfirstname() {
        return vfirstname;
    }

    public void setVfirstname(String vfirstname) {
        this.vfirstname = vfirstname;
    }

    public String getVlastname() {
        return vlastname;
    }

    public void setVlastname(String vlastname) {
        this.vlastname = vlastname;
    }

    public String getVphonenum() {
        return vphonenum;
    }

    public void setVphonenum(String vphonenum) {
        this.vphonenum = vphonenum;
    }

    public int getVpartynum() {
        return vpartynum;
    }

    public void setVpartynum(int vpartynum) {
        this.vpartynum = vpartynum;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitorid != null ? visitorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitorsTable)) {
            return false;
        }
        VisitorsTable other = (VisitorsTable) object;
        if ((this.visitorid == null && other.visitorid != null) || (this.visitorid != null && !this.visitorid.equals(other.visitorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.VisitorsTable[ visitorid=" + visitorid + " ]";
    }
    
}
