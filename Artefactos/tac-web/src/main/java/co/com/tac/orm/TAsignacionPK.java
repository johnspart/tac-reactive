package co.com.tac.orm;

import java.io.Serializable;

import javax.persistence.Column;

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
}
