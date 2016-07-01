package co.com.tac.orm;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TCentoCosto")
public class TCentoCosto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCentroCostoPK tCentroCostoPK;
	@Column(name = "ccoEstado")
	private boolean ccoEstado;
	@Column(name = "ccoNombre", length = 150)
	private String ccoNombre;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ccoCliente", insertable = false, updatable = false, referencedColumnName = "cliCliente", foreignKey = @ForeignKey(name = "FK_TCliente_TCentroCosto")),
			@JoinColumn(name = "ccoArea", insertable = false, updatable = false, referencedColumnName = "cliArea", foreignKey = @ForeignKey(name = "FK_TCliente_TCentroCosto")) })
	private TCliente tCliente;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tCentoCosto")
	private Set<TAsignacion> tAsignacions = new HashSet<TAsignacion>(0);

	public TCentroCostoPK gettCentroCostoPK() {
		return tCentroCostoPK;
	}

	public void settCentroCostoPK(TCentroCostoPK tCentroCostoPK) {
		this.tCentroCostoPK = tCentroCostoPK;
	}

	public boolean isCcoEstado() {
		return ccoEstado;
	}

	public void setCcoEstado(boolean ccoEstado) {
		this.ccoEstado = ccoEstado;
	}

	public String getCcoNombre() {
		return ccoNombre;
	}

	public void setCcoNombre(String ccoNombre) {
		this.ccoNombre = ccoNombre;
	}

	public TCliente gettCliente() {
		return tCliente;
	}

	public void settCliente(TCliente tCliente) {
		this.tCliente = tCliente;
	}

	public Set<TAsignacion> gettAsignacions() {
		return tAsignacions;
	}

	public void settAsignacions(Set<TAsignacion> tAsignacions) {
		this.tAsignacions = tAsignacions;
	}
}