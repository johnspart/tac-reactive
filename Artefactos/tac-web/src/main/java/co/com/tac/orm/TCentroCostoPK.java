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

}