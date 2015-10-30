/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademik;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "gru", catalog = "akademik", schema = "")
@NamedQueries({
    @NamedQuery(name = "Gru.findAll", query = "SELECT g FROM Gru g"),
    @NamedQuery(name = "Gru.findByIdGuru", query = "SELECT g FROM Gru g WHERE g.idGuru = :idGuru"),
    @NamedQuery(name = "Gru.findByNamaGuru", query = "SELECT g FROM Gru g WHERE g.namaGuru = :namaGuru"),
    @NamedQuery(name = "Gru.findByMataPelajaran", query = "SELECT g FROM Gru g WHERE g.mataPelajaran = :mataPelajaran"),
    @NamedQuery(name = "Gru.findByHari", query = "SELECT g FROM Gru g WHERE g.hari = :hari")})
public class Gru implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_guru")
    private String idGuru;
    @Basic(optional = false)
    @Column(name = "nama_guru")
    private String namaGuru;
    @Basic(optional = false)
    @Column(name = "mata_pelajaran")
    private String mataPelajaran;
    @Basic(optional = false)
    @Column(name = "hari")
    private String hari;

    public Gru() {
    }

    public Gru(String idGuru) {
        this.idGuru = idGuru;
    }

    public Gru(String idGuru, String namaGuru, String mataPelajaran, String hari) {
        this.idGuru = idGuru;
        this.namaGuru = namaGuru;
        this.mataPelajaran = mataPelajaran;
        this.hari = hari;
    }

    public String getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(String idGuru) {
        String oldIdGuru = this.idGuru;
        this.idGuru = idGuru;
        changeSupport.firePropertyChange("idGuru", oldIdGuru, idGuru);
    }

    public String getNamaGuru() {
        return namaGuru;
    }

    public void setNamaGuru(String namaGuru) {
        String oldNamaGuru = this.namaGuru;
        this.namaGuru = namaGuru;
        changeSupport.firePropertyChange("namaGuru", oldNamaGuru, namaGuru);
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        String oldMataPelajaran = this.mataPelajaran;
        this.mataPelajaran = mataPelajaran;
        changeSupport.firePropertyChange("mataPelajaran", oldMataPelajaran, mataPelajaran);
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        String oldHari = this.hari;
        this.hari = hari;
        changeSupport.firePropertyChange("hari", oldHari, hari);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGuru != null ? idGuru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gru)) {
            return false;
        }
        Gru other = (Gru) object;
        if ((this.idGuru == null && other.idGuru != null) || (this.idGuru != null && !this.idGuru.equals(other.idGuru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akademik.Gru[ idGuru=" + idGuru + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
