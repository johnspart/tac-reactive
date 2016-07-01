package co.com.tac.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TEmpFavoritoPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5544169425634060553L;

	@Column(name = "emfEmpleado", length = 15)
	private String emfEmpleado;
	@Column(name = "emfRolUsuario", length = 45)
	private String emfRolUsuario;

	public String getEmfEmpleado() {
		return emfEmpleado;
	}

	public void setEmfEmpleado(String emfEmpleado) {
		this.emfEmpleado = emfEmpleado;
	}

	public String getEmfRolUsuario() {
		return emfRolUsuario;
	}

	public void setEmfRolUsuario(String emfRolUsuario) {
		this.emfRolUsuario = emfRolUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emfEmpleado == null) ? 0 : emfEmpleado.hashCode());
		result = prime * result + ((emfRolUsuario == null) ? 0 : emfRolUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TEmpFavoritoPK other = (TEmpFavoritoPK) obj;
		if (emfEmpleado == null) {
			if (other.emfEmpleado != null)
				return false;
		} else if (!emfEmpleado.equals(other.emfEmpleado))
			return false;
		if (emfRolUsuario == null) {
			if (other.emfRolUsuario != null)
				return false;
		} else if (!emfRolUsuario.equals(other.emfRolUsuario))
			return false;
		return true;
	}
}
