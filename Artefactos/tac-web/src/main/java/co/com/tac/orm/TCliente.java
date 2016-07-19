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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tcliente")
public class TCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7625485460936084891L;

	@EmbeddedId
	private TClientePK tClientePK;
	@Column(name = "cliNombe", nullable = false, length = 150)
	private String cliNombe;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliArea", insertable = false, updatable = false, referencedColumnName = "areArea", foreignKey = @ForeignKey(name = "FK_TArea_TCliente"))
	private TArea tArea;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tCliente")
	private Set<TCentoCosto> tCentoCostos = new HashSet<TCentoCosto>(0);

	public TClientePK gettClientePK() {
		return tClientePK;
	}

	public void settClientePK(TClientePK tClientePK) {
		this.tClientePK = tClientePK;
	}

	public String getCliNombe() {
		return cliNombe;
	}

	public void setCliNombe(String cliNombe) {
		this.cliNombe = cliNombe;
	}

	public TArea gettArea() {
		return tArea;
	}

	public void settArea(TArea tArea) {
		this.tArea = tArea;
	}

	public Set<TCentoCosto> gettCentoCostos() {
		return tCentoCostos;
	}

	public void settCentoCostos(Set<TCentoCosto> tCentoCostos) {
		this.tCentoCostos = tCentoCostos;
	}
}
