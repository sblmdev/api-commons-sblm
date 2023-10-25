package pe.gob.sblm.sgi.bean;

import java.util.Date;

/**
* Resumen.
* Objeto : CuotaBean
* Descripci�n : POJO para almacenar los datos de la cuota_arbitrio
* Fecha de Creaci�n : 10/02/2014.
* Autor : Marco ALarcon
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class CuotaArbitrioBean implements java.io.Serializable {

	private static final long serialVersionUID = -5042124107624268204L;
	
	private Double monto;
	private Double montodolar;
	private Double mora;
	private Integer nrocuota;
	private String mes;
	private Integer periodo;
	private int anio;
	//private boolean sipagado;//Para  la deteccion de la  grilla
	private String sipagado;//Para  la deteccion de la  grilla
	private boolean siacuenta;// Para  la deteccion de la  grilla
	private String condicion;//Pagar grabar
	private String claveUpa;
	private String moneda;
	private Double deudaacuenta;
	private Double rentapagada;
	private Integer idcuota;
	private Integer nropagos;
	private Double moraacumulada;
	private Double ischange;
	private Double subtotal;
	private Integer nromes;
	private Double renta;
	private Double ratiomora;
	private Double mc;
	private Double nuevarenta;
	private Double nuevamc;
	private Double igv;
	private String inquilino;
	private Boolean siActivo;
	private int iddetallecondicion;
	private int trimestre;
	private String estado;
	private String observacion;
	private String usrcre;
	private Date feccre;
	private String usrmod;
	private Date fecmod;
	private Integer cuota;
	private String cancelado;
	private Integer secuencia;
	
	//050219
	private String clave;
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getMora() {
		return mora;
	}
	public void setMora(Double mora) {
		this.mora = mora;
	}
	public Integer getNrocuota() {
		return nrocuota;
	}
	public void setNrocuota(Integer nrocuota) {
		this.nrocuota = nrocuota;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getSipagado() {
		return sipagado;
	}
	public void setSipagado(String sipagado) {
		this.sipagado = sipagado;
	}
	public boolean getSiacuenta() {
		return siacuenta;
	}
	public void setSiacuenta(boolean siacuenta) {
		this.siacuenta = siacuenta;
	}
	public Double getDeudaacuenta() {
		return deudaacuenta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public void setDeudaacuenta(Double deudaacuenta) {
		this.deudaacuenta = deudaacuenta;
	}
	public Integer getIdcuota() {
		return idcuota;
	}
	public void setIdcuota(Integer idcuota) {
		this.idcuota = idcuota;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public Integer getNropagos() {
		return nropagos;
	}
	public void setNropagos(Integer nropagos) {
		this.nropagos = nropagos;
	}
	public Double getMoraacumulada() {
		return moraacumulada;
	}
	public void setMoraacumulada(Double moraacumulada) {
		this.moraacumulada = moraacumulada;
	}
	public Double getIschange() {
		return ischange;
	}
	public void setIschange(Double ischange) {
		this.ischange = ischange;
	}
	public Double getRenta() {
		return renta;
	}
	public void setRenta(Double renta) {
		this.renta = renta;
	}
	public Double getMontodolar() {
		return montodolar;
	}
	public void setMontodolar(Double montodolar) {
		this.montodolar = montodolar;
	}
	public Double getRatiomora() {
		return ratiomora;
	}
	public void setRatiomora(Double ratiomora) {
		this.ratiomora = ratiomora;
	}
	public Double getMc() {
		return mc;
	}
	public void setMc(Double mc) {
		this.mc = mc;
	}
	public Double getNuevarenta() {
		return nuevarenta;
	}
	public void setNuevarenta(Double nuevarenta) {
		this.nuevarenta = nuevarenta;
	}
	public Double getNuevamc() {
		return nuevamc;
	}
	public void setNuevamc(Double nuevamc) {
		this.nuevamc = nuevamc;
	}
	public Double getRentapagada() {
		return rentapagada;
	}
	public void setRentapagada(Double rentapagada) {
		this.rentapagada = rentapagada;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public String getClaveupa() {
		return claveUpa;
	}
	public void setClaveupa(String claveupa) {
		this.claveUpa = claveupa;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getInquilino() {
		return inquilino;
	}
	public void setInquilino(String inquilino) {
		this.inquilino = inquilino;
	}
	public Boolean getSiActivo() {
		return siActivo;
	}
	public void setSiActivo(Boolean siActivo) {
		this.siActivo = siActivo;
	}
	public int getIddetallecondicion() {
		return iddetallecondicion;
	}
	public void setIddetallecondicion(int iddetallecondicion) {
		this.iddetallecondicion = iddetallecondicion;
	}
	
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	
	public int getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(int trimestre) {
		this.trimestre = trimestre;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public String getUsrcre() {
		return usrcre;
	}
	public void setUsrcre(String usrcre) {
		this.usrcre = usrcre;
	}
	public Date getFeccre() {
		return feccre;
	}
	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}
	
	public String getClaveUpa() {
		return claveUpa;
	}
	public void setClaveUpa(String claveUpa) {
		this.claveUpa = claveUpa;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	public Integer getCuota() {
		return cuota;
	}
	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}
	
	public Integer getNromes() {
		return nromes;
	}
	public void setNromes(Integer nromes) {
		this.nromes = nromes;
	}
	
	public String getCancelado() {
		return cancelado;
	}
	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}
	
	
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
		
	public String getUsrmod() {
		return usrmod;
	}
	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}
	public Date getFecmod() {
		return fecmod;
	}
	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}
	@Override
	public String toString() {
		return "CuotaBean [monto=" + monto + ", montodolar=" + montodolar
				+ ", mora=" + mora + ", nrocuota=" + nrocuota + ", mes=" + mes
				+ ", anio=" + anio + ", sipagado=" + sipagado + ", siacuenta="
				+ siacuenta + ", condicion=" + condicion + ", claveupa="
				+ claveUpa + ", moneda=" + moneda + ", deudaacuenta="
				+ deudaacuenta + ", rentapagada=" + rentapagada + ", idcuota="
				+ idcuota + ", nropagos=" + nropagos + ", moraacumulada="
				+ moraacumulada + ", ischange=" + ischange + ", renta=" + renta
				+ ", ratiomora=" + ratiomora + ", mc=" + mc + ", nuevarenta="
				+ nuevarenta + ", nuevamc=" + nuevamc + ", igv=" + igv
				+ ", inquilino=" + inquilino + "]";
	}
	

}
