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
@Table(name = "EMPLOYEES_TABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeesTable.findAll", query = "SELECT e FROM EmployeesTable e")
    , @NamedQuery(name = "EmployeesTable.findByEmployeeid", query = "SELECT e FROM EmployeesTable e WHERE e.employeeid = :employeeid")
    , @NamedQuery(name = "EmployeesTable.findByEfirstname", query = "SELECT e FROM EmployeesTable e WHERE e.efirstname = :efirstname")
    , @NamedQuery(name = "EmployeesTable.findByElastname", query = "SELECT e FROM EmployeesTable e WHERE e.elastname = :elastname")
    , @NamedQuery(name = "EmployeesTable.findByEphonenum", query = "SELECT e FROM EmployeesTable e WHERE e.ephonenum = :ephonenum")
    , @NamedQuery(name = "EmployeesTable.findByEposition", query = "SELECT e FROM EmployeesTable e WHERE e.eposition = :eposition")})
public class EmployeesTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEEID")
    private Integer employeeid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EFIRSTNAME")
    private String efirstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ELASTNAME")
    private String elastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EPHONENUM")
    private String ephonenum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EPOSITION")
    private String eposition;

    public EmployeesTable() {
    }

    public EmployeesTable(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public EmployeesTable(Integer employeeid, String efirstname, String elastname, String ephonenum, String eposition) {
        this.employeeid = employeeid;
        this.efirstname = efirstname;
        this.elastname = elastname;
        this.ephonenum = ephonenum;
        this.eposition = eposition;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEfirstname() {
        return efirstname;
    }

    public void setEfirstname(String efirstname) {
        this.efirstname = efirstname;
    }

    public String getElastname() {
        return elastname;
    }

    public void setElastname(String elastname) {
        this.elastname = elastname;
    }

    public String getEphonenum() {
        return ephonenum;
    }

    public void setEphonenum(String ephonenum) {
        this.ephonenum = ephonenum;
    }

    public String getEposition() {
        return eposition;
    }

    public void setEposition(String eposition) {
        this.eposition = eposition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeesTable)) {
            return false;
        }
        EmployeesTable other = (EmployeesTable) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.EmployeesTable[ employeeid=" + employeeid + " ]";
    }

}
