/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

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
 * @author lvp5345
 */
@Entity
@Table(name = "VISIT_TABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VisitTable.findAll", query = "SELECT v FROM VisitTable v")
    , @NamedQuery(name = "VisitTable.findByVisitid", query = "SELECT v FROM VisitTable v WHERE v.visitid = :visitid")
    , @NamedQuery(name = "VisitTable.findByVisitorid", query = "SELECT v FROM VisitTable v WHERE v.visitorid = :visitorid")
    , @NamedQuery(name = "VisitTable.findByEmployeeid", query = "SELECT v FROM VisitTable v WHERE v.employeeid = :employeeid")
    , @NamedQuery(name = "VisitTable.findByRoomid", query = "SELECT v FROM VisitTable v WHERE v.roomid = :roomid")
    , @NamedQuery(name = "VisitTable.findByCheckindatetime", query = "SELECT v FROM VisitTable v WHERE v.checkindatetime = :checkindatetime")
    , @NamedQuery(name = "VisitTable.findByCheckoutdatetime", query = "SELECT v FROM VisitTable v WHERE v.checkoutdatetime = :checkoutdatetime")
    , @NamedQuery(name = "VisitTable.findByRoomnum", query = "SELECT v FROM VisitTable v WHERE v.roomnum = :roomnum")
    , @NamedQuery(name = "VisitTable.findByReservation", query = "SELECT v FROM VisitTable v WHERE v.reservation = :reservation")})
public class VisitTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VISITID")
    private Integer visitid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VISITORID")
    private int visitorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEEID")
    private int employeeid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMID")
    private int roomid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHECKINDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkindatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CHECKOUTDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkoutdatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMNUM")
    private int roomnum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "RESERVATION")
    private String reservation;

    public VisitTable() {
    }

    public VisitTable(Integer visitid) {
        this.visitid = visitid;
    }

    public VisitTable(Integer visitid, int visitorid, int employeeid, int roomid, Date checkindatetime, Date checkoutdatetime, int roomnum, String reservation) {
        this.visitid = visitid;
        this.visitorid = visitorid;
        this.employeeid = employeeid;
        this.roomid = roomid;
        this.checkindatetime = checkindatetime;
        this.checkoutdatetime = checkoutdatetime;
        this.roomnum = roomnum;
        this.reservation = reservation;
    }

    public Integer getVisitid() {
        return visitid;
    }

    public void setVisitid(Integer visitid) {
        this.visitid = visitid;
    }

    public int getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(int visitorid) {
        this.visitorid = visitorid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public Date getCheckindatetime() {
        return checkindatetime;
    }

    public void setCheckindatetime(Date checkindatetime) {
        this.checkindatetime = checkindatetime;
    }

    public Date getCheckoutdatetime() {
        return checkoutdatetime;
    }

    public void setCheckoutdatetime(Date checkoutdatetime) {
        this.checkoutdatetime = checkoutdatetime;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitid != null ? visitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitTable)) {
            return false;
        }
        VisitTable other = (VisitTable) object;
        if ((this.visitid == null && other.visitid != null) || (this.visitid != null && !this.visitid.equals(other.visitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.VisitTable[ visitid=" + visitid + " ]";
    }
    
}
