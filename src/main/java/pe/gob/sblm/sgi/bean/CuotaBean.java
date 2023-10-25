package pe.gob.sblm.sgi.bean;

import java.util.Date;
import java.util.List;

/**
* Resumen.
* Objeto : CuotaBean
* Descripci�n : POJO para almacenar los datos de la cuota
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class CuotaBean implements java.io.Serializable {

	private static final long serialVersionUID = -5042124107624268204L;
	
	private Double monto;
	private Double montodolar;
	private Double mora;
	private Integer nrocuota;
	private String mes;
	private int anio;
	//private boolean sipagado;//Para  la deteccion de la  grilla
	private String sipagado;//Para  la deteccion de la  grilla
	private boolean siacuenta;// Para  la deteccion de la  grilla
	private String condicion;//Pagar grabar
	private String claveupa;
	private String moneda;
	private Double deudaacuenta;
	private Double rentapagada;
	private Integer idcuota;
	private Integer nropagos;
	private Double moraacumulada;
	private Double ischange;
	
	private Double renta;
	private Double ratiomora;
	private Double mc;
	private Double nuevarenta;
	private Double nuevamc;
	private Double igv;
	private String inquilino;
	private Boolean siActivo;
	private int iddetallecondicion;
	private String cancelado;
//	private String estado;
	private String observacion;
	private String observacionpenalizacion;
	private Double montopenalizacion;
	private Double tipocambio;
	private int idcontrato;
	private String numerocuota;
	private Date fechavencimiento;
	private List<MaeDetCondicionDetalleBean> maecondiciondetalle;
	private List<CuotaBean> listacuota;
	private Integer id_maedetallecondicion;
	private Integer id_maedcondiciondetalle;
	private String concepto;
	private String  idconcepto;
	private String tipomoneda;
	private String estado_maed;
	
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
		return claveupa;
	}
	public void setClaveupa(String claveupa) {
		this.claveupa = claveupa;
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
	
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}	
	public String getObservacionpenalizacion() {
		return observacionpenalizacion;
	}
	public void setObservacionpenalizacion(String observacionpenalizacion) {
		this.observacionpenalizacion = observacionpenalizacion;
	}
	public String getCancelado() {
		return cancelado;
	}
	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}
		
	public Double getMontopenalizacion() {
		return montopenalizacion;
	}
	public void setMontopenalizacion(Double montopenalizacion) {
		this.montopenalizacion = montopenalizacion;
	}
	
	public Double getTipocambio() {
		return tipocambio;
	}
	public void setTipocambio(Double tipocambio) {
		this.tipocambio = tipocambio;
	}	
	public List<MaeDetCondicionDetalleBean> getMaecondiciondetalle() {
		return maecondiciondetalle;
	}
	public void setMaecondiciondetalle(
			List<MaeDetCondicionDetalleBean> maecondiciondetalle) {
		this.maecondiciondetalle = maecondiciondetalle;
	}
	public int getIdcontrato() {
		return idcontrato;
	}
	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}
	public String getNumerocuota() {
		return numerocuota;
	}
	public void setNumerocuota(String numerocuota) {
		this.numerocuota = numerocuota;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public Integer getId_maedetallecondicion() {
		return id_maedetallecondicion;
	}
	public void setId_maedetallecondicion(Integer id_maedetallecondicion) {
		this.id_maedetallecondicion = id_maedetallecondicion;
	}
	public Integer getId_maedcondiciondetalle() {
		return id_maedcondiciondetalle;
	}
	public void setId_maedcondiciondetalle(Integer id_maedcondiciondetalle) {
		this.id_maedcondiciondetalle = id_maedcondiciondetalle;
	}
	public List<CuotaBean> getListacuota() {
		return listacuota;
	}
	public void setListacuota(List<CuotaBean> listacuota) {
		this.listacuota = listacuota;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getIdconcepto() {
		return idconcepto;
	}
	public void setIdconcepto(String idconcepto) {
		this.idconcepto = idconcepto;
	}
	
	public String getTipomoneda() {
		return tipomoneda;
	}
	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	

	public String getEstado_maed() {
		return estado_maed;
	}
	public void setEstado_maed(String estado_maed) {
		this.estado_maed = estado_maed;
	}
	@Override
	public String toString() {
		return "CuotaBean [monto=" + monto + ", montodolar=" + montodolar
				+ ", mora=" + mora + ", nrocuota=" + nrocuota + ", mes=" + mes
				+ ", anio=" + anio + ", sipagado=" + sipagado + ", siacuenta="
				+ siacuenta + ", condicion=" + condicion + ", claveupa="
				+ claveupa + ", moneda=" + moneda + ", deudaacuenta="
				+ deudaacuenta + ", rentapagada=" + rentapagada + ", idcuota="
				+ idcuota + ", nropagos=" + nropagos + ", moraacumulada="
				+ moraacumulada + ", ischange=" + ischange + ", renta=" + renta
				+ ", ratiomora=" + ratiomora + ", mc=" + mc + ", nuevarenta="
				+ nuevarenta + ", nuevamc=" + nuevamc + ", igv=" + igv
				+ ", inquilino=" + inquilino + ", siActivo=" + siActivo
				+ ", iddetallecondicion=" + iddetallecondicion + ", cancelado="
				+ cancelado + ", observacion=" + observacion
				+ ", observacionpenalizacion=" + observacionpenalizacion
				+ ", montopenalizacion=" + montopenalizacion + ", tipocambio="
				+ tipocambio + ", idcontrato=" + idcontrato + ", numerocuota="
				+ numerocuota + ", fechavencimiento=" + fechavencimiento
				+ ", maecondiciondetalle=" + maecondiciondetalle
				+ ", listacuota=" + listacuota + ", id_maedetallecondicion="
				+ id_maedetallecondicion + ", id_maedcondiciondetalle="
				+ id_maedcondiciondetalle + ", concepto=" + concepto
				+ ", idconcepto=" + idconcepto + ", tipomoneda=" + tipomoneda
				+ ", estado_maedetallecondicion=" + estado_maed
				+ ", clave=" + clave + "]";
	}

	

}
