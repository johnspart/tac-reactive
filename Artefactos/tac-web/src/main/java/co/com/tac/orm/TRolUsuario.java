package co.com.tac.orm;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.com.tac.constant.CargoUsuario;

@Entity
@Table(name = "TUsuario")
public class TRolUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4086703697807314485L;

	@Id
	@Column(name = "usrUsuario", length = 45)
	private String usrUsuario;
	@Enumerated(EnumType.STRING)
	@Column(name = "usrCargo", length = 30, nullable = false)
	private CargoUsuario usrCargo;
	@Column(name = "usrEmail", length = 150, nullable = false)
	private String usrEmail;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "usrUltimoIngreso", nullable = true)
	private Date usrUltimoIngreso;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tRolUsuario")
	private Set<TArea> tAreas = new HashSet<TArea>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tRolUsuario")
	private Set<TEmpFavoritos> tEmpFavoritos = new HashSet<TEmpFavoritos>(0);

	public String getUsrUsuario() {
		return usrUsuario;
	}

	public void setUsrUsuario(String usrUsuario) {
		this.usrUsuario = usrUsuario;
	}

	public CargoUsuario getUsrCargo() {
		return usrCargo;
	}

	public void setUsrCargo(CargoUsuario usrCargo) {
		this.usrCargo = usrCargo;
	}

	public String getUsrEmail() {
		return usrEmail;
	}

	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}

	public Date getUsrUltimoIngreso() {
		return usrUltimoIngreso;
	}

	public void setUsrUltimoIngreso(Date usrUltimoIngreso) {
		this.usrUltimoIngreso = usrUltimoIngreso;
	}

	public Set<TArea> gettAreas() {
		return tAreas;
	}

	public void settAreas(Set<TArea> tAreas) {
		this.tAreas = tAreas;
	}

	public Set<TEmpFavoritos> gettEmpFavoritos() {
		return tEmpFavoritos;
	}

	public void settEmpFavoritos(Set<TEmpFavoritos> tEmpFavoritos) {
		this.tEmpFavoritos = tEmpFavoritos;
	}
}
