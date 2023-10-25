package pe.gob.sblm.sgi.bean;

import java.util.Date;

public class PeriodoContratoBean {
    private int idperiodocontrato;
    private int idcontrato;
    private Integer tipoincremento;
    private String nombretipoincremento;
    private Integer periodo;
    private Double monto ;
    private Double valorincremento;
    private Integer numerocuotas;
    private Date fechainicioperiodo;
    private Date fechafinperiodo;
    private String usuariocreador;
    private String usuariomodificador;
    private Date fechacreacion;
    private Date fechamodificacion;
    private String obs_creacion;
    private String obs_modificacion;
    private Boolean estado;
    private String condicion;
    
	
	public PeriodoContratoBean() {
		// TODO Auto-generated constructor stub
	}


	public int getIdperiodocontrato() {
		return idperiodocontrato;
	}


	public void setIdperiodocontrato(int idperiodocontrato) {
		this.idperiodocontrato = idperiodocontrato;
	}


	public int getIdcontrato() {
		return idcontrato;
	}


	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}


	public Integer getTipoincremento() {
		return tipoincremento;
	}


	public void setTipoincremento(Integer tipoincremento) {
		this.tipoincremento = tipoincremento;
	}


	public String getNombretipoincremento() {
		return nombretipoincremento;
	}


	public void setNombretipoincremento(String nombretipoincremento) {
		this.nombretipoincremento = nombretipoincremento;
	}


	public Integer getPeriodo() {
		return periodo;
	}


	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}


	public Double getMonto() {
		return monto;
	}


	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getNumerocuotas() {
		return numerocuotas;
	}

	public void setNumerocuotas(Integer numerocuotas) {
		this.numerocuotas = numerocuotas;
	}

	public Date getFechainicioperiodo() {
		return fechainicioperiodo;
	}

	public void setFechainicioperiodo(Date fechainicioperiodo) {
		this.fechainicioperiodo = fechainicioperiodo;
	}

	public Date getFechafinperiodo() {
		return fechafinperiodo;
	}

	public void setFechafinperiodo(Date fechafinperiodo) {
		this.fechafinperiodo = fechafinperiodo;
	}

	public String getUsuariocreador() {
		return usuariocreador;
	}

	public void setUsuariocreador(String usuariocreador) {
		this.usuariocreador = usuariocreador;
	}

	public String getUsuariomodificador() {
		return usuariomodificador;
	}

	public void setUsuariomodificador(String usuariomodificador) {
		this.usuariomodificador = usuariomodificador;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}


	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechamodificacion() {
		return fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public String getObs_creacion() {
		return obs_creacion;
	}

	public void setObs_creacion(String obs_creacion) {
		this.obs_creacion = obs_creacion;
	}


	public String getObs_modificacion() {
		return obs_modificacion;
	}

	public void setObs_modificacion(String obs_modificacion) {
		this.obs_modificacion = obs_modificacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}


	public Double getValorincremento() {
		return valorincremento;
	}


	public void setValorincremento(Double valorincremento) {
		this.valorincremento = valorincremento;
	}


	@Override
	public String toString() {
		return "PeriodoContratoBean [idperiodocontrato=" + idperiodocontrato
				+ ", idcontrato=" + idcontrato + ", tipoincremento="
				+ tipoincremento + ", nombretipoincremento="
				+ nombretipoincremento + ", periodo=" + periodo + ", monto="
				+ monto + ", valorincremento=" + valorincremento
				+ ", numerocuotas=" + numerocuotas + ", fechainicioperiodo="
				+ fechainicioperiodo + ", fechafinperiodo=" + fechafinperiodo
				+ ", usuariocreador=" + usuariocreador
				+ ", usuariomodificador=" + usuariomodificador
				+ ", fechacreacion=" + fechacreacion + ", fechamodificacion="
				+ fechamodificacion + ", obs_creacion=" + obs_creacion
				+ ", obs_modificacion=" + obs_modificacion + ", estado="
				+ estado + ", condicion=" + condicion + "]";
	}
	
	
	
}
