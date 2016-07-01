package co.com.tac.orm;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "TEmpFavoritos")
public class TEmpFavoritos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1221975576482741449L;

	@EmbeddedId
	private TEmpFavoritoPK tEmpFavoritoPK;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empCedula", insertable = false, updatable = false, referencedColumnName = "empCedula", foreignKey = @ForeignKey(name = "FK_TEmpleado_TEmpFavoritos"))
	private TEmpleado tEmpleado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emfRolUsuario", insertable = false, updatable = false, referencedColumnName = "usrUsuario", foreignKey = @ForeignKey(name = "FK_TRolUsuario_TEmpFavoritos"))
	private TRolUsuario tRolUsuario;

	public TEmpFavoritoPK gettEmpFavoritoPK() {
		return tEmpFavoritoPK;
	}

	public void settEmpFavoritoPK(TEmpFavoritoPK tEmpFavoritoPK) {
		this.tEmpFavoritoPK = tEmpFavoritoPK;
	}

	public TEmpleado gettEmpleado() {
		return tEmpleado;
	}

	public void settEmpleado(TEmpleado tEmpleado) {
		this.tEmpleado = tEmpleado;
	}

	public TRolUsuario gettRolUsuario() {
		return tRolUsuario;
	}

	public void settRolUsuario(TRolUsuario tRolUsuario) {
		this.tRolUsuario = tRolUsuario;
	}

}
