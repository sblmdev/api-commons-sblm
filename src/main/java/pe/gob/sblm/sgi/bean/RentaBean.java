package pe.gob.sblm.sgi.bean;

import java.util.Date;
import java.util.List;


/**
* Resumen.
* Objeto : RentaBean
* Descripcion : POJO para almacenar los datos de la renta
* Fecha de Creacion : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripcion
* ------------------------------------------------------------------------
* 
*/
public class RentaBean {
	
	private int id;
	private Double mc;
	private Double igv;
	private Double contraprestacion;
	private Double renta;
	private Double rentaTemp;
	private Double montopagar;
	private Double montopagado;
    private Boolean siclausulareconocimientorenta;
    private Boolean siclausulaperiodogracia;
    private Boolean siclausulareconocimientoinversion;
    private Boolean siclausulapagoposterior;
    private Boolean sipagofraccionrenta;
    private Boolean siclausulasuspensiontemporalrenta;
	private String mes;
	private String anio;
	
	private Double montopagoposterior=0.0;
	private String observacionpagoposterior="";
	
	private Double descuentoreconocimientorenta=0.0;
	private String observacionreconocimientorenta="";
	
	private Double descuentoreconocimientoinversion=0.0;
	private String observacionreconocimientoinversion="";
	
    private Double montosuspensiontemporalrenta;
    private String observacionsuspensiontemporalrenta;
	
	private Double montopagofraccionrenta=0.0;
	private String observacionpagofraccionrenta="";
	private Integer secuencia;
	private Integer numeromes;
	
	private Boolean sirentagenerada;
	//renta pagada
	private String sipagado;
	private Boolean siacuenta;
	private String sicancelado;
//	private String clausulaactiva;
//	private Double valorclausula;
//	private String observacionclausula;
	private List<MaeDetCondicionDetalleBean> maecondiciondetalle;
	private String nrocuota;
	private Date fechavencimiento;
	private Date fechacancelacion;
	private Double interemoratorio;
	private Double penalDemoraPago;
	private Double penalDemoraEntregaInmueble;
	private Double penalLucroCesante;
	private Integer nrodias_adeudo;
	private Integer nrodias_adeudo_penalidad;
	private Double total_adeudado;
	private String tipomoneda;
	private List<DetalleCuotaBean> detalleCuotaBean;
	private String mesAnio;
	private Integer idfechapago;
	
	public Double getMc() {
		return mc;
	}
	public void setMc(Double mc) {
		this.mc = mc;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public Boolean getSiclausulareconocimientorenta() {
		return siclausulareconocimientorenta;
	}
	public void setSiclausulareconocimientorenta(
			Boolean siclausulareconocimientorenta) {
		this.siclausulareconocimientorenta = siclausulareconocimientorenta;
	}
	public Boolean getSiclausulaperiodogracia() {
		return siclausulaperiodogracia;
	}
	public void setSiclausulaperiodogracia(Boolean siclausulaperiodogracia) {
		this.siclausulaperiodogracia = siclausulaperiodogracia;
	}
	public Boolean getSiclausulareconocimientoinversion() {
		return siclausulareconocimientoinversion;
	}
	public void setSiclausulareconocimientoinversion(
			Boolean siclausulareconocimientoinversion) {
		this.siclausulareconocimientoinversion = siclausulareconocimientoinversion;
	}

	public Boolean getSiclausulapagoposterior() {
		return siclausulapagoposterior;
	}
	public void setSiclausulapagoposterior(Boolean siclausulapagoposterior) {
		this.siclausulapagoposterior = siclausulapagoposterior;
	}
	public String getObservacionpagoposterior() {
		return observacionpagoposterior;
	}
	public void setObservacionpagoposterior(String observacionpagoposterior) {
		this.observacionpagoposterior = observacionpagoposterior;
	}
	public Double getMontopagoposterior() {
		return montopagoposterior;
	}
	public void setMontopagoposterior(Double montopagoposterior) {
		this.montopagoposterior = montopagoposterior;
	}
	public Double getDescuentoreconocimientorenta() {
		return descuentoreconocimientorenta;
	}
	public void setDescuentoreconocimientorenta(Double descuentoreconocimientorenta) {
		this.descuentoreconocimientorenta = descuentoreconocimientorenta;
	}
	public Double getDescuentoreconocimientoinversion() {
		return descuentoreconocimientoinversion;
	}
	public void setDescuentoreconocimientoinversion(Double descuentoreconocimientoinversion) {
		this.descuentoreconocimientoinversion = descuentoreconocimientoinversion;
	}
	public String getObservacionreconocimientorenta() {
		return observacionreconocimientorenta;
	}
	public void setObservacionreconocimientorenta(
			String observacionreconocimientorenta) {
		this.observacionreconocimientorenta = observacionreconocimientorenta;
	}
	
	public String getObservacionreconocimientoinversion() {
		return observacionreconocimientoinversion;
	}
	public void setObservacionreconocimientoinversion(
			String observacionreconocimientoinversion) {
		this.observacionreconocimientoinversion = observacionreconocimientoinversion;
	}
	public Double getContraprestacion() {
		return contraprestacion;
	}
	public void setContraprestacion(Double contraprestacion) {
		this.contraprestacion = contraprestacion;
	}
	public Double getRenta() {
		return renta;
	}
	public void setRenta(Double renta) {
		this.renta = renta;
	}
	public Double getMontopagar() {
		return montopagar;
	}
	public void setMontopagar(Double montopagar) {
		this.montopagar = montopagar;
	}
	public Boolean getSipagofraccionrenta() {
		return sipagofraccionrenta;
	}
	public void setSipagofraccionrenta(Boolean sipagofraccionrenta) {
		this.sipagofraccionrenta = sipagofraccionrenta;
	}
	public Double getMontopagofraccionrenta() {
		return montopagofraccionrenta;
	}
	public void setMontopagofraccionrenta(Double montopagofraccionrenta) {
		this.montopagofraccionrenta = montopagofraccionrenta;
	}
	public String getObservacionpagofraccionrenta() {
		return observacionpagofraccionrenta;
	}
	public void setObservacionpagofraccionrenta(String observacionpagofraccionrenta) {
		this.observacionpagofraccionrenta = observacionpagofraccionrenta;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public Boolean getSirentagenerada() {
		return sirentagenerada;
	}
	public void setSirentagenerada(Boolean sirentagenerada) {
		this.sirentagenerada = sirentagenerada;
	}
	public Double getRentaTemp() {
		return rentaTemp;
	}
	public void setRentaTemp(Double rentaTemp) {
		this.rentaTemp = rentaTemp;
	}
//	public String getClausulaactiva() {
//		return clausulaactiva;
//	}
//	public void setClausulaactiva(String clausulaactiva) {
//		this.clausulaactiva = clausulaactiva;
//	}
//	public Double getValorclausula() {
//		return valorclausula;
//	}
//	public void setValorclausula(Double valorclausula) {
//		this.valorclausula = valorclausula;
//	}
//	public String getObservacionclausula() {
//		return observacionclausula;
//	}
//	public void setObservacionclausula(String observacionclausula) {
//		this.observacionclausula = observacionclausula;
//	}
	public Boolean getSiclausulasuspensiontemporalrenta() {
		return siclausulasuspensiontemporalrenta;
	}
	public void setSiclausulasuspensiontemporalrenta(Boolean siclausulasuspensiontemporalrenta) {
		this.siclausulasuspensiontemporalrenta = siclausulasuspensiontemporalrenta;
	}
	public Double getMontosuspensiontemporalrenta() {
		return montosuspensiontemporalrenta;
	}
	public void setMontosuspensiontemporalrenta(Double montosuspensiontemporalrenta) {
		this.montosuspensiontemporalrenta = montosuspensiontemporalrenta;
	}
	public String getObservacionsuspensiontemporalrenta() {
		return observacionsuspensiontemporalrenta;
	}
	public void setObservacionsuspensiontemporalrenta(String observacionsuspensiontemporalrenta) {
		this.observacionsuspensiontemporalrenta = observacionsuspensiontemporalrenta;
	}
	public String getSipagado() {
		return sipagado;
	}
	public void setSipagado(String sipagado) {
		this.sipagado = sipagado;
	}
	public Boolean getSiacuenta() {
		return siacuenta;
	}
	public void setSiacuenta(Boolean siacuenta) {
		this.siacuenta = siacuenta;
	}
	public String getSicancelado() {
		return sicancelado;
	}
	public void setSicancelado(String sicancelado) {
		this.sicancelado = sicancelado;
	}
	public Integer getNumeromes() {
		return numeromes;
	}
	public void setNumeromes(Integer numeromes) {
		this.numeromes = numeromes;
	}
	public List<MaeDetCondicionDetalleBean> getMaecondiciondetalle() {
		return maecondiciondetalle;
	}
	public void setMaecondiciondetalle(
			List<MaeDetCondicionDetalleBean> maecondiciondetalle) {
		this.maecondiciondetalle = maecondiciondetalle;
	}
	public String getNrocuota() {
		return nrocuota;
	}
	public void setNrocuota(String nrocuota) {
		this.nrocuota = nrocuota;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public Double getInteremoratorio() {
		return interemoratorio;
	}
	public void setInteremoratorio(Double interemoratorio) {
		this.interemoratorio = interemoratorio;
	}
	public Double getPenalDemoraPago() {
		return penalDemoraPago;
	}
	public void setPenalDemoraPago(Double penalDemoraPago) {
		this.penalDemoraPago = penalDemoraPago;
	}
	public Double getPenalDemoraEntregaInmueble() {
		return penalDemoraEntregaInmueble;
	}
	public void setPenalDemoraEntregaInmueble(Double penalDemoraEntregaInmueble) {
		this.penalDemoraEntregaInmueble = penalDemoraEntregaInmueble;
	}
	public Double getPenalLucroCesante() {
		return penalLucroCesante;
	}
	public void setPenalLucroCesante(Double penalLucroCesante) {
		this.penalLucroCesante = penalLucroCesante;
	}
	public Integer getNrodias_adeudo() {
		return nrodias_adeudo;
	}
	public void setNrodias_adeudo(Integer nrodias_adeudo) {
		this.nrodias_adeudo = nrodias_adeudo;
	}
	public Double getTotal_adeudado() {
		return total_adeudado;
	}
	public void setTotal_adeudado(Double total_adeudado) {
		this.total_adeudado = total_adeudado;
	}
	public List<DetalleCuotaBean> getDetalleCuotaBean() {
		return detalleCuotaBean;
	}
	public void setDetalleCuotaBean(List<DetalleCuotaBean> detalleCuotaBean) {
		this.detalleCuotaBean = detalleCuotaBean;
	}
	public Double getMontopagado() {
		return montopagado;
	}
	public void setMontopagado(Double montopagado) {
		this.montopagado = montopagado;
	}
	public String getTipomoneda() {
		return tipomoneda;
	}
	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	public String getMesAnio() {
		return mesAnio;
	}
	public void setMesAnio(String mesAnio) {
		this.mesAnio = mesAnio;
	}
	public Integer getIdfechapago() {
		return idfechapago;
	}
	public void setIdfechapago(Integer idfechapago) {
		this.idfechapago = idfechapago;
	}
	public Integer getNrodias_adeudo_penalidad() {
		return nrodias_adeudo_penalidad;
	}
	public void setNrodias_adeudo_penalidad(Integer nrodias_adeudo_penalidad) {
		this.nrodias_adeudo_penalidad = nrodias_adeudo_penalidad;
	}
	public Date getFechacancelacion() {
		return fechacancelacion;
	}
	public void setFechacancelacion(Date fechacancelacion) {
		this.fechacancelacion = fechacancelacion;
	}
    
    
	
	
}
