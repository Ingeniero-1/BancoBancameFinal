/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.bancobancame.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pmari
 */
@Entity
@Table(name = "bonos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bonos.findAll", query = "SELECT b FROM Bonos b")
    , @NamedQuery(name = "Bonos.findById", query = "SELECT b FROM Bonos b WHERE b.id = :id")
    , @NamedQuery(name = "Bonos.findByValor", query = "SELECT b FROM Bonos b WHERE b.valor = :valor")})
public class Bonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;

    public Bonos() {
    }

    public Bonos(Integer id) {
        this.id = id;
    }

    public Bonos(Integer id, int valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bonos)) {
            return false;
        }
        Bonos other = (Bonos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.bancobancame.entities.Bonos[ id=" + id + " ]";
    }
    
}
