/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "cadastroproduto", catalog = "dinostore", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastroproduto.findAll", query = "SELECT c FROM Cadastroproduto c")
    , @NamedQuery(name = "Cadastroproduto.findByIdPrd", query = "SELECT c FROM Cadastroproduto c WHERE c.idPrd = :idPrd")
    , @NamedQuery(name = "Cadastroproduto.findByNomePrd", query = "SELECT c FROM Cadastroproduto c WHERE c.nomePrd = :nomePrd")
    , @NamedQuery(name = "Cadastroproduto.findByAlimentacao", query = "SELECT c FROM Cadastroproduto c WHERE c.alimentacao = :alimentacao")
    , @NamedQuery(name = "Cadastroproduto.findByEspecie", query = "SELECT c FROM Cadastroproduto c WHERE c.especie = :especie")
    , @NamedQuery(name = "Cadastroproduto.findByTamanho", query = "SELECT c FROM Cadastroproduto c WHERE c.tamanho = :tamanho")
    , @NamedQuery(name = "Cadastroproduto.findByValorPrd", query = "SELECT c FROM Cadastroproduto c WHERE c.valorPrd = :valorPrd")
    , @NamedQuery(name = "Cadastroproduto.findBySexoPrd", query = "SELECT c FROM Cadastroproduto c WHERE c.sexoPrd = :sexoPrd")
    , @NamedQuery(name = "Cadastroproduto.findByQtdEstoque", query = "SELECT c FROM Cadastroproduto c WHERE c.qtdEstoque = :qtdEstoque")})
public class Cadastroproduto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prd")
    private Integer idPrd;
    @Column(name = "nome_prd")
    private String nomePrd;
    @Column(name = "alimentacao")
    private String alimentacao;
    @Column(name = "especie")
    private String especie;
    @Column(name = "tamanho")
    private String tamanho;
    @Column(name = "valor_prd")
    private String valorPrd;
    @Column(name = "sexo_prd")
    private String sexoPrd;
    @Column(name = "qtd_estoque")
    private String qtdEstoque;

    public Cadastroproduto() {
    }

    public Cadastroproduto(Integer idPrd) {
        this.idPrd = idPrd;
    }

    public Integer getIdPrd() {
        return idPrd;
    }

    public void setIdPrd(Integer idPrd) {
        Integer oldIdPrd = this.idPrd;
        this.idPrd = idPrd;
        changeSupport.firePropertyChange("idPrd", oldIdPrd, idPrd);
    }

    public String getNomePrd() {
        return nomePrd;
    }

    public void setNomePrd(String nomePrd) {
        String oldNomePrd = this.nomePrd;
        this.nomePrd = nomePrd;
        changeSupport.firePropertyChange("nomePrd", oldNomePrd, nomePrd);
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        String oldAlimentacao = this.alimentacao;
        this.alimentacao = alimentacao;
        changeSupport.firePropertyChange("alimentacao", oldAlimentacao, alimentacao);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        String oldEspecie = this.especie;
        this.especie = especie;
        changeSupport.firePropertyChange("especie", oldEspecie, especie);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        String oldTamanho = this.tamanho;
        this.tamanho = tamanho;
        changeSupport.firePropertyChange("tamanho", oldTamanho, tamanho);
    }

    public String getValorPrd() {
        return valorPrd;
    }

    public void setValorPrd(String valorPrd) {
        String oldValorPrd = this.valorPrd;
        this.valorPrd = valorPrd;
        changeSupport.firePropertyChange("valorPrd", oldValorPrd, valorPrd);
    }

    public String getSexoPrd() {
        return sexoPrd;
    }

    public void setSexoPrd(String sexoPrd) {
        String oldSexoPrd = this.sexoPrd;
        this.sexoPrd = sexoPrd;
        changeSupport.firePropertyChange("sexoPrd", oldSexoPrd, sexoPrd);
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        String oldQtdEstoque = this.qtdEstoque;
        this.qtdEstoque = qtdEstoque;
        changeSupport.firePropertyChange("qtdEstoque", oldQtdEstoque, qtdEstoque);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrd != null ? idPrd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastroproduto)) {
            return false;
        }
        Cadastroproduto other = (Cadastroproduto) object;
        if ((this.idPrd == null && other.idPrd != null) || (this.idPrd != null && !this.idPrd.equals(other.idPrd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lojadino.Cadastroproduto[ idPrd=" + idPrd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
