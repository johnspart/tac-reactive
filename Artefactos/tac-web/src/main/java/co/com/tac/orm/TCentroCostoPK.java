package co.com.tac.orm;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class TCentroCostoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ccoCentroCosto", length = 2)
	private String ccoCentroCosto;
	@Column(name = "ccoCliente", length = 2)
	private String ccoCliente;
	@Column(name = "ccoArea", length = 2)
	private String ccoArea;

	public String getCcoCentroCosto() {
		return ccoCentroCosto;
	}

	public void setCcoCentroCosto(String ccoCentroCosto) {
		this.ccoCentroCosto = ccoCentroCosto;
	}

	public String getCcoCliente() {
		return ccoCliente;
	}

	public void setCcoCliente(String ccoCliente) {
		this.ccoCliente = ccoCliente;
	}

	public String getCcoArea() {
		return ccoArea;
	}

	public void setCcoArea(String ccoArea) {
		this.ccoArea = ccoArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ccoArea == null) ? 0 : ccoArea.hashCode());
		result = prime * result + ((ccoCentroCosto == null) ? 0 : ccoCentroCosto.hashCode());
		result = prime * result + ((ccoCliente == null) ? 0 : ccoCliente.hashCode());
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
		TCentroCostoPK other = (TCentroCostoPK) obj;
		if (ccoArea == null) {
			if (other.ccoArea != null)
				return false;
		} else if (!ccoArea.equals(other.ccoArea))
			return false;
		if (ccoCentroCosto == null) {
			if (other.ccoCentroCosto != null)
				return false;
		} else if (!ccoCentroCosto.equals(other.ccoCentroCosto))
			return false;
		if (ccoCliente == null) {
			if (other.ccoCliente != null)
				return false;
		} else if (!ccoCliente.equals(other.ccoCliente))
			return false;
		return true;
	}

}