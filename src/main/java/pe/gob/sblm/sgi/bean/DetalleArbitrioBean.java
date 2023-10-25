package pe.gob.sblm.sgi.bean;

import java.util.Date;

/**
* Resumen.
* Objeto : DetalleArbitrioBean
* Descripción : POJO para almacenar los datos del detalle de los arbitrios
* Fecha de Creación : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripción
* ------------------------------------------------------------------------
* 
*/
public class DetalleArbitrioBean {
	
	private int iddetallearbitrio;
	private String mes;
	private Integer anio;
	private Integer secuencia;
	private String situacion;
	private String nrorecibo;
	private Date fecVencimiento;
	private Double insoluto;
	private Double mora;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	
	
	
	public int getIddetallearbitrio() {
		return iddetallearbitrio;
	}
	public void setIddetallearbitrio(int iddetallearbitrio) {
		this.iddetallearbitrio = iddetallearbitrio;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	public String getNrorecibo() {
		return nrorecibo;
	}
	public void setNrorecibo(String nrorecibo) {
		this.nrorecibo = nrorecibo;
	}
	public Date getFecVencimiento() {
		return fecVencimiento;
	}
	public void setFecVencimiento(Date fecVencimiento) {
		this.fecVencimiento = fecVencimiento;
	}
	public Double getInsoluto() {
		return insoluto;
	}
	public void setInsoluto(Double insoluto) {
		this.insoluto = insoluto;
	}
	public Double getMora() {
		return mora;
	}
	public void setMora(Double mora) {
		this.mora = mora;
	}
	public String getUsrcre() {
		return usrcre;
	}
	public void setUsrcre(String usrcre) {
		this.usrcre = usrcre;
	}
	public String getUsrmod() {
		return usrmod;
	}
	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}
	public Date getFeccre() {
		return feccre;
	}
	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}
	public Date getFecmod() {
		return fecmod;
	}
	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}
	
}
