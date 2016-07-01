package co.com.tac.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TClientePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7735333775457462152L;

	@Column(name = "cliCliente", length = 2)
	private String cliCliente;
	@Column(name = "cliArea", length = 2)
	private String cliArea;

	public String getCliCliente() {
		return cliCliente;
	}

	public void setCliCliente(String cliCliente) {
		this.cliCliente = cliCliente;
	}

	public String getCliArea() {
		return cliArea;
	}

	public void setCliArea(String cliArea) {
		this.cliArea = cliArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliArea == null) ? 0 : cliArea.hashCode());
		result = prime * result + ((cliCliente == null) ? 0 : cliCliente.hashCode());
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
		TClientePK other = (TClientePK) obj;
		if (cliArea == null) {
			if (other.cliArea != null)
				return false;
		} else if (!cliArea.equals(other.cliArea))
			return false;
		if (cliCliente == null) {
			if (other.cliCliente != null)
				return false;
		} else if (!cliCliente.equals(other.cliCliente))
			return false;
		return true;
	}
}
