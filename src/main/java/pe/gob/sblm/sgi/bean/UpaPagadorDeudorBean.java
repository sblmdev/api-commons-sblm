package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;

/**
* Resumen.
* Objeto : UpaPagadorDeudorBean
* Descripción : Clase Bean para generar reportes tipo.
* Fecha de Creación : 02/07/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripción
* ------------------------------------------------------------------------
* 03/11/2014	Franco Mallqui  	- Creacion del bean tipo para el
* 									  reporte.
* */
public class UpaPagadorDeudorBean implements Serializable{

	private static final long serialVersionUID = -8351391245726597955L;
	private String id;
	private String claveUpa;
	private Date fecEmision;
	private Date fecCancelacion;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private String nombreInquilino;
	
	private String nombrecobrador;
	private String nombreocupante;
	
	private String ruc;
	private String direccion;
	private String observacion;
	private String concepto;
	private String pagante;
	private String nrocartera;
	private String dni;
	private String nroseriecomprobante;
	private String nrodocumento;
	private Boolean sicompromisopago;
	private String distrito;
	private String provincia;
	
	//Detalle
	private String mes;
	private Integer anio;
	
	private String primeraRentaPendiente;
	
	private int idcontrato;
	private Double renta;
	private Double cuota1;
	private Double cuota2;
	private Double cuota3;
	private Double cuota4;
	private Double cuota5;
	private Double cuota6;
	private String condicion;
	private String moneda;
	private Date iniciocobro;
	private Date fincobro;
	
	
	
	private Integer mesesdeuda;
	private Double deudatotal;
	private String uso;
	private String situacion;
	private Boolean siprocesojudicial;
	private Boolean sicuotascanceladas;
	
	
	private Integer idupa;
	private String resumendeuda;
	
	private Date iniciocontrato;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClaveUpa() {
		return claveUpa;
	}
	public void setClaveUpa(String claveUpa) {
		this.claveUpa = claveUpa;
	}
	public Date getFecEmision() {
		return fecEmision;
	}
	public void setFecEmision(Date fecEmision) {
		this.fecEmision = fecEmision;
	}
	public Date getFecCancelacion() {
		return fecCancelacion;
	}
	public void setFecCancelacion(Date fecCancelacion) {
		this.fecCancelacion = fecCancelacion;
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
	public String getNombreInquilino() {
		return nombreInquilino;
	}
	public void setNombreInquilino(String nombreInquilino) {
		this.nombreInquilino = nombreInquilino;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNombrecobrador() {
		return nombrecobrador;
	}
	public void setNombrecobrador(String nombrecobrador) {
		this.nombrecobrador = nombrecobrador;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getPagante() {
		return pagante;
	}
	public void setPagante(String pagante) {
		this.pagante = pagante;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNrocartera() {
		return nrocartera;
	}
	public void setNrocartera(String nrocartera) {
		this.nrocartera = nrocartera;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getNroseriecomprobante() {
		return nroseriecomprobante;
	}
	public void setNroseriecomprobante(String nroseriecomprobante) {
		this.nroseriecomprobante = nroseriecomprobante;
	}
	public String getNrodocumento() {
		return nrodocumento;
	}
	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}
	public Double getRenta() {
		return renta;
	}
	public void setRenta(Double renta) {
		this.renta = renta;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public Boolean getSicompromisopago() {
		return sicompromisopago;
	}
	public void setSicompromisopago(Boolean sicompromisopago) {
		this.sicompromisopago = sicompromisopago;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Integer getMesesdeuda() {
		return mesesdeuda;
	}
	public void setMesesdeuda(Integer mesesdeuda) {
		this.mesesdeuda = mesesdeuda;
	}
	public Double getDeudatotal() {
		return deudatotal;
	}
	public void setDeudatotal(Double deudatotal) {
		this.deudatotal = deudatotal;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	public Double getCuota1() {
		return cuota1;
	}
	public void setCuota1(Double cuota1) {
		this.cuota1 = cuota1;
	}
	public Double getCuota2() {
		return cuota2;
	}
	public void setCuota2(Double cuota2) {
		this.cuota2 = cuota2;
	}
	public Double getCuota3() {
		return cuota3;
	}
	public void setCuota3(Double cuota3) {
		this.cuota3 = cuota3;
	}
	public Double getCuota4() {
		return cuota4;
	}
	public void setCuota4(Double cuota4) {
		this.cuota4 = cuota4;
	}
	public Double getCuota5() {
		return cuota5;
	}
	public void setCuota5(Double cuota5) {
		this.cuota5 = cuota5;
	}
	public Double getCuota6() {
		return cuota6;
	}
	public void setCuota6(Double cuota6) {
		this.cuota6 = cuota6;
	}
	public Date getIniciocobro() {
		return iniciocobro;
	}
	public void setIniciocobro(Date iniciocobro) {
		this.iniciocobro = iniciocobro;
	}
	public Date getFincobro() {
		return fincobro;
	}
	public void setFincobro(Date fincobro) {
		this.fincobro = fincobro;
	}
	public int getIdcontrato() {
		return idcontrato;
	}
	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}
	public Boolean getSiprocesojudicial() {
		return siprocesojudicial;
	}
	public void setSiprocesojudicial(Boolean siprocesojudicial) {
		this.siprocesojudicial = siprocesojudicial;
	}
	public String getNombreocupante() {
		return nombreocupante;
	}
	public void setNombreocupante(String nombreocupante) {
		this.nombreocupante = nombreocupante;
	}
	public Integer getIdupa() {
		return idupa;
	}
	public void setIdupa(Integer idupa) {
		this.idupa = idupa;
	}
	public Boolean getSicuotascanceladas() {
		return sicuotascanceladas;
	}
	public void setSicuotascanceladas(Boolean sicuotascanceladas) {
		this.sicuotascanceladas = sicuotascanceladas;
	}
	public String getResumendeuda() {
		return resumendeuda;
	}
	public void setResumendeuda(String resumendeuda) {
		this.resumendeuda = resumendeuda;
	}
	public Date getIniciocontrato() {
		return iniciocontrato;
	}
	public void setIniciocontrato(Date iniciocontrato) {
		this.iniciocontrato = iniciocontrato;
	}
	public String getPrimeraRentaPendiente() {
		return primeraRentaPendiente;
	}
	public void setPrimeraRentaPendiente(String primeraRentaPendiente) {
		this.primeraRentaPendiente = primeraRentaPendiente;
	}

}
