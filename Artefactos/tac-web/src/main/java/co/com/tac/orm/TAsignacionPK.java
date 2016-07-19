package co.com.tac.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TAsignacionPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2843591682349533959L;

	@Column(name = "asgEmpleado", length = 15)
	private String asgEmpleado;
	@Column(name = "asgCentroCosto", length = 2)
	private String asgCentroCosto;
	@Column(name = "asgCliente", length = 2)
	private String asgCliente;
	@Column(name = "asgArea", length = 2)
	private String asgArea;
	@Column(name = "asgMes", length = 2)
	private Short asgMes;
	@Column(name = "asgAnio", length = 4)
	private Short asgAnio;

	public String getAsgEmpleado() {
		return asgEmpleado;
	}

	public void setAsgEmpleado(String asgEmpleado) {
		this.asgEmpleado = asgEmpleado;
	}

	public String getAsgCentroCosto() {
		return asgCentroCosto;
	}

	public void setAsgCentroCosto(String asgCentroCosto) {
		this.asgCentroCosto = asgCentroCosto;
	}

	public String getAsgCliente() {
		return asgCliente;
	}

	public void setAsgCliente(String asgCliente) {
		this.asgCliente = asgCliente;
	}

	public String getAsgArea() {
		return asgArea;
	}

	public void setAsgArea(String asgArea) {
		this.asgArea = asgArea;
	}

	public Short getAsgMes() {
		return asgMes;
	}

	public void setAsgMes(Short asgMes) {
		this.asgMes = asgMes;
	}

	public Short getAsgAnio() {
		return asgAnio;
	}

	public void setAsgAnio(Short asgAnio) {
		this.asgAnio = asgAnio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asgAnio == null) ? 0 : asgAnio.hashCode());
		result = prime * result + ((asgArea == null) ? 0 : asgArea.hashCode());
		result = prime * result + ((asgCentroCosto == null) ? 0 : asgCentroCosto.hashCode());
		result = prime * result + ((asgCliente == null) ? 0 : asgCliente.hashCode());
		result = prime * result + ((asgEmpleado == null) ? 0 : asgEmpleado.hashCode());
		result = prime * result + ((asgMes == null) ? 0 : asgMes.hashCode());
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
		TAsignacionPK other = (TAsignacionPK) obj;
		if (asgAnio == null) {
			if (other.asgAnio != null)
				return false;
		} else if (!asgAnio.equals(other.asgAnio))
			return false;
		if (asgArea == null) {
			if (other.asgArea != null)
				return false;
		} else if (!asgArea.equals(other.asgArea))
			return false;
		if (asgCentroCosto == null) {
			if (other.asgCentroCosto != null)
				return false;
		} else if (!asgCentroCosto.equals(other.asgCentroCosto))
			return false;
		if (asgCliente == null) {
			if (other.asgCliente != null)
				return false;
		} else if (!asgCliente.equals(other.asgCliente))
			return false;
		if (asgEmpleado == null) {
			if (other.asgEmpleado != null)
				return false;
		} else if (!asgEmpleado.equals(other.asgEmpleado))
			return false;
		if (asgMes == null) {
			if (other.asgMes != null)
				return false;
		} else if (!asgMes.equals(other.asgMes))
			return false;
		return true;
	}
}
