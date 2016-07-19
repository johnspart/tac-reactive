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

import co.com.tac.dto.Area;

@Entity
@Table(name = "tarea")
public class TArea implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3027664445627702175L;

	@Id
	@Column(name = "areArea", length = 2)
	private String areArea;
	@Column(name = "areNombre", length = 150)
	private String areNombre;
	@Column(name = "areEstado")
	private boolean areEstado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "areUsuarioPropietario", referencedColumnName = "usrUsuario", foreignKey = @ForeignKey(name = "FK_TRolUsuario_TArea"))
	private TRolUsuario tRolUsuario;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tArea")
	private Set<TCliente> tClientes = new HashSet<TCliente>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tArea")
	private Set<TEmpleado> tEmpleados = new HashSet<TEmpleado>(0);

	public TArea() {
		super();
	}

	public TArea(Area area) {
		this.areArea = area.getCodigo();
		this.areNombre = area.getNombre();
		this.areEstado = area.getEstado();
		this.tRolUsuario = new TRolUsuario();
		this.tRolUsuario.setUsrUsuario(area.getUsuario());
	}

	public String getAreArea() {
		return areArea;
	}

	public void setAreArea(String areArea) {
		this.areArea = areArea;
	}

	public String getAreNombre() {
		return areNombre;
	}

	public void setAreNombre(String areNombre) {
		this.areNombre = areNombre;
	}

	public boolean isAreEstado() {
		return areEstado;
	}

	public void setAreEstado(boolean areEstado) {
		this.areEstado = areEstado;
	}

	public TRolUsuario getTRolUsuario() {
		return tRolUsuario;
	}

	public void setTRolUsuario(TRolUsuario tRolUsuario) {
		this.tRolUsuario = tRolUsuario;
	}

	public Set<TCliente> gettClientes() {
		return tClientes;
	}

	public void settClientes(Set<TCliente> tClientes) {
		this.tClientes = tClientes;
	}

	public Set<TEmpleado> gettEmpleados() {
		return tEmpleados;
	}

	public void settEmpleados(Set<TEmpleado> tEmpleados) {
		this.tEmpleados = tEmpleados;
	}
}
