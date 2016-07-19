package co.com.tac.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasignacion")
public class TAsignacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5733071161460588457L;

	@EmbeddedId
	private TAsignacionPK tAsignacionPK;
	@Column(name = "asgPorcentaje", precision = 3, scale = 1, nullable = false)
	private Float asgPorcentaje;
	@Column(name = "asgObservacion", length = 200)
	private String asgObservacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asgEmpleado", insertable = false, updatable = false, referencedColumnName = "empCedula", foreignKey = @ForeignKey(name = "FK_TEmpleado_TAsignacion"))
	private TEmpleado tEmpleado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "asgCentroCosto", insertable = false, updatable = false, referencedColumnName = "ccoCentroCosto", foreignKey = @ForeignKey(name = "FK_TCentroCosto_TAsignacion")),
			@JoinColumn(name = "asgCliente", insertable = false, updatable = false, referencedColumnName = "ccoCliente", foreignKey = @ForeignKey(name = "FK_TCentroCosto_TAsignacion")),
			@JoinColumn(name = "asgArea", insertable = false, updatable = false, referencedColumnName = "ccoArea", foreignKey = @ForeignKey(name = "FK_TCentroCosto_TAsignacion")) })
	private TCentoCosto tCentoCosto;
	@Column(name = "asgEmpleadoNoPertArea")
	private boolean asgEmpleadoNoPertArea;
	@Embedded
	private Auditoria auditoria;

	public TAsignacionPK gettAsignacionPK() {
		return tAsignacionPK;
	}

	public void settAsignacionPK(TAsignacionPK tAsignacionPK) {
		this.tAsignacionPK = tAsignacionPK;
	}

	public Float getAsgPorcentaje() {
		return asgPorcentaje;
	}

	public void setAsgPorcentaje(Float asgPorcentaje) {
		this.asgPorcentaje = asgPorcentaje;
	}

	public String getAsgObservacion() {
		return asgObservacion;
	}

	public void setAsgObservacion(String asgObservacion) {
		this.asgObservacion = asgObservacion;
	}

	public TEmpleado gettEmpleado() {
		return tEmpleado;
	}

	public void settEmpleado(TEmpleado tEmpleado) {
		this.tEmpleado = tEmpleado;
	}

	public TCentoCosto gettCentoCosto() {
		return tCentoCosto;
	}

	public void settCentoCosto(TCentoCosto tCentoCosto) {
		this.tCentoCosto = tCentoCosto;
	}

	public boolean isAsgEmpleadoNoPertArea() {
		return asgEmpleadoNoPertArea;
	}

	public void setAsgEmpleadoNoPertArea(boolean asgEmpleadoNoPertArea) {
		this.asgEmpleadoNoPertArea = asgEmpleadoNoPertArea;
	}

	public Auditoria getAuditoria() {
		return auditoria;
	}

	public void setAuditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
}
