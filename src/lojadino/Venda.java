/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Dell
 */
@Entity
@Table(name = "venda", catalog = "dinostore", schema = "")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v")
    , @NamedQuery(name = "Venda.findByIdVenda", query = "SELECT v FROM Venda v WHERE v.idVenda = :idVenda")
    , @NamedQuery(name = "Venda.findByDataAtual", query = "SELECT v FROM Venda v WHERE v.dataAtual = :dataAtual")
    , @NamedQuery(name = "Venda.findByClienteNome", query = "SELECT v FROM Venda v WHERE v.clienteNome = :clienteNome")
    , @NamedQuery(name = "Venda.findByPrdNome", query = "SELECT v FROM Venda v WHERE v.prdNome = :prdNome")
    , @NamedQuery(name = "Venda.findByPrdValor", query = "SELECT v FROM Venda v WHERE v.prdValor = :prdValor")})
public class Venda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_venda")
    private Integer idVenda;
    @Column(name = "data_atual")
    private String dataAtual;
    @Column(name = "cliente_nome")
    private String clienteNome;
    @Column(name = "prd_nome")
    private String prdNome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prd_valor")
    private BigDecimal prdValor;

    public Venda() {
    }

    public Venda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        Integer oldIdVenda = this.idVenda;
        this.idVenda = idVenda;
        changeSupport.firePropertyChange("idVenda", oldIdVenda, idVenda);
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        String oldDataAtual = this.dataAtual;
        this.dataAtual = dataAtual;
        changeSupport.firePropertyChange("dataAtual", oldDataAtual, dataAtual);
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        String oldClienteNome = this.clienteNome;
        this.clienteNome = clienteNome;
        changeSupport.firePropertyChange("clienteNome", oldClienteNome, clienteNome);
    }

    public String getPrdNome() {
        return prdNome;
    }

    public void setPrdNome(String prdNome) {
        String oldPrdNome = this.prdNome;
        this.prdNome = prdNome;
        changeSupport.firePropertyChange("prdNome", oldPrdNome, prdNome);
    }

    public BigDecimal getPrdValor() {
        return prdValor;
    }

    public void setPrdValor(BigDecimal prdValor) {
        BigDecimal oldPrdValor = this.prdValor;
        this.prdValor = prdValor;
        changeSupport.firePropertyChange("prdValor", oldPrdValor, prdValor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenda != null ? idVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.idVenda == null && other.idVenda != null) || (this.idVenda != null && !this.idVenda.equals(other.idVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lojadino.Venda[ idVenda=" + idVenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
