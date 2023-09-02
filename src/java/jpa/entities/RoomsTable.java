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
@Table(name = "ROOMS_TABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomsTable.findAll", query = "SELECT r FROM RoomsTable r")
    , @NamedQuery(name = "RoomsTable.findByRoomid", query = "SELECT r FROM RoomsTable r WHERE r.roomid = :roomid")
    , @NamedQuery(name = "RoomsTable.findByBednum", query = "SELECT r FROM RoomsTable r WHERE r.bednum = :bednum")
    , @NamedQuery(name = "RoomsTable.findByRoomtype", query = "SELECT r FROM RoomsTable r WHERE r.roomtype = :roomtype")})
public class RoomsTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMID")
    private Integer roomid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BEDNUM")
    private int bednum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ROOMTYPE")
    private String roomtype;

    public RoomsTable() {
    }

    public RoomsTable(Integer roomid) {
        this.roomid = roomid;
    }

    public RoomsTable(Integer roomid, int bednum, String roomtype) {
        this.roomid = roomid;
        this.bednum = bednum;
        this.roomtype = roomtype;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public int getBednum() {
        return bednum;
    }

    public void setBednum(int bednum) {
        this.bednum = bednum;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomsTable)) {
            return false;
        }
        RoomsTable other = (RoomsTable) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.RoomsTable[ roomid=" + roomid + " ]";
    }
    
}
