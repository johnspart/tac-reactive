package co.com.tac.orm;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "templeado")
public class TEmpleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3387434769654417244L;

	@Id
	@Column(name = "empCedula", length = 15)
	private String empCedula;
	@Column(name = "empNombre", length = 100)
	private String empNombre;
	@Column(name = "empEstado")
	private boolean empEstado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empArea", referencedColumnName = "areArea", foreignKey = @ForeignKey(name = "FK_TArea_TEmpleado"))
	private TArea tArea;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tEmpleado")
	private Set<TEmpFavoritos> tEmpFavoritos = new HashSet<TEmpFavoritos>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tEmpleado")
	private Set<TAsignacion> tAsignacions = new HashSet<TAsignacion>(0);

	public String getEmpCedula() {
		return empCedula;
	}

	public void setEmpCedula(String empCedula) {
		this.empCedula = empCedula;
	}

	public String getEmpNombre() {
		return empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public boolean isEmpEstado() {
		return empEstado;
	}

	public void setEmpEstado(boolean empEstado) {
		this.empEstado = empEstado;
	}

	public TArea gettArea() {
		return tArea;
	}

	public void settArea(TArea tArea) {
		this.tArea = tArea;
	}

	public Set<TEmpFavoritos> gettEmpFavoritos() {
		return tEmpFavoritos;
	}

	public void settEmpFavoritos(Set<TEmpFavoritos> tEmpFavoritos) {
		this.tEmpFavoritos = tEmpFavoritos;
	}

	public Set<TAsignacion> gettAsignacions() {
		return tAsignacions;
	}

	public void settAsignacions(Set<TAsignacion> tAsignacions) {
		this.tAsignacions = tAsignacions;
	}
}
