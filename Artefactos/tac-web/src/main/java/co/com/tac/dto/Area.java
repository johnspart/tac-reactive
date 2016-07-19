package co.com.tac.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Area implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5702612459110679287L;

	@XmlElement
	private String codigo;
	@XmlElement
	private String nombre;
	@XmlElement
	private Boolean estado;
	@XmlElement
	private String usuario;

	@Override
	public String toString() {
		return "Area []";
	}

	public Area(String codigo, String nombre, Boolean estado, String usuario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.usuario = usuario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
