package co.com.tac.dto;

import java.util.Date;

import co.com.tac.constant.CargoUsuario;

public class Usuario {
	private String usuario;
	private String email;
	private CargoUsuario cargo;
	private Date ultimoIngreso;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CargoUsuario getCargo() {
		return cargo;
	}

	public void setCargo(CargoUsuario cargo) {
		this.cargo = cargo;
	}

	public Date getUltimoIngreso() {
		return ultimoIngreso;
	}

	public void setUltimoIngreso(Date ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}
}
