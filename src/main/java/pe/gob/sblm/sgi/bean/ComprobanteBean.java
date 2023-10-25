package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* Resumen.
* Objeto : ComprobanteBean
* Descripci�n : POJO para almacenar los datos de los comprobantes.
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class ComprobanteBean implements Serializable{

	private static final long serialVersionUID = -8351391245726597955L;
	private String id;
	private int idcomprobante;
	private String claveUpa;
	private String direccion;
	private String nroserie;
	private String nrocomprobante;
	private String nroseriecomprobante;
	
	private String idtipdocu;
	private String idtippago;
	private String idtipmovimiento;
	private String idtipconcepto;
	private String nombrecobrador;
	private Integer idcobrador;
	private Date fecEmision;
	private Date fecCancelacion;
	private Date fecVencimiento;
	
	private Integer idtipopersona;
	private Double subtotal;
	private Double igv;
	private Double total;
	private Double mora;
	private String nrocomprobanteref;
	private String nronotadebitoref;
	private String nronotacreditoref;
	private String nronotacreditoref2;
	private Date fecEmisionref;
	private Date fecCancelacionref;
	private Date fecVencimientoref;
	

	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private String nombreInquilino;
	private String ruc;
	private String dni;
	
	private String nrocontrato;
	private String condicion;
	private String observacion;
	private String concepto;
	private String documento;
	private String pagante;
	private String nrocartera;
	private Boolean siocupante;
	
	private String nombreocupante;
	private String dniocupante;
	//Tesoreria
	private Double garantia;
	private Double otro;
	/** Recuperacion de arbitrio*/
	private Double rec_A;
	/** Penalizacion*/
	private Double penalizacion;
	
	private Boolean sianulado;
	private String  tipodescuentonotacredito;
	
	private Boolean sifacturacionelectronica;
	private String numerooperacion;
	private String comp_concepto;
	
	
	private List<DetallecomprobanteBean> listadetallecomprobanteBean;
	private List<ComprobanteBean> listacomprobantebeanespecial;
	private Integer iddetallecartera;
	/** Opción detalle en el reporte */
	private String comp_opc;
	private Boolean sidetraccion;
	private Double montodetraccion;
	private Boolean siautodetraccion;
	private Double montoautodetraccion;
	private String accion_aud;
	private String tip_pago;
	private String tip_docu;
	private String dnirucpagante;
	private String nombreusr_cre;
	private String nombreusr_mod;
	//Anular documento
	private String descripcion_baja;
	//estados comprobante
	private String estado; //(ACTIVO=1)(ANULADO=2)(RECHAZADO=3)
	private String usr_anula_documento;
	private Date  fec_anula_documento;
	private String descripciontipomodalidadpago;
	private String textoimportetotal;
	private String descripcionitem;
	private String glosario;
	private Boolean sidocumento;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIdcomprobante() {
		return idcomprobante;
	}
	public void setIdcomprobante(int idcomprobante) {
		this.idcomprobante = idcomprobante;
	}
	public String getClaveUpa() {
		return claveUpa;
	}
	public void setClaveUpa(String claveUpa) {
		this.claveUpa = claveUpa;
	}
	public String getNroserie() {
		return nroserie;
	}
	public void setNroserie(String nroserie) {
		this.nroserie = nroserie;
	}
	public String getNrocomprobante() {
		return nrocomprobante;
	}
	public void setNrocomprobante(String nrocomprobante) {
		this.nrocomprobante = nrocomprobante;
	}
	public String getNroseriecomprobante() {
		return nroseriecomprobante;
	}
	public void setNroseriecomprobante(String nroseriecomprobante) {
		this.nroseriecomprobante = nroseriecomprobante;
	}
	public String getIdtipdocu() {
		return idtipdocu;
	}
	public void setIdtipdocu(String idtipdocu) {
		this.idtipdocu = idtipdocu;
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
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getMora() {
		return mora;
	}
	public void setMora(Double mora) {
		this.mora = mora;
	}
	
	public String getNrocomprobanteref() {
		return nrocomprobanteref;
	}
	public void setNrocomprobanteref(String nrocomprobanteref) {
		this.nrocomprobanteref = nrocomprobanteref;
	}
	public String getNronotadebitoref() {
		return nronotadebitoref;
	}
	public void setNronotadebitoref(String nronotadebitoref) {
		this.nronotadebitoref = nronotadebitoref;
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
	public String getIdtippago() {
		return idtippago;
	}
	public void setIdtippago(String idtippago) {
		this.idtippago = idtippago;
	}
	public String getIdtipmovimiento() {
		return idtipmovimiento;
	}
	public void setIdtipmovimiento(String idtipmovimiento) {
		this.idtipmovimiento = idtipmovimiento;
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
	public List<DetallecomprobanteBean> getListadetallecomprobanteBean() {
		return listadetallecomprobanteBean;
	}
	
	public void setListadetallecomprobanteBean(
			List<DetallecomprobanteBean> listadetallecomprobanteBean) {
		this.listadetallecomprobanteBean = listadetallecomprobanteBean;
	}
	public Double getGarantia() {
		return garantia;
	}
	public void setGarantia(Double garantia) {
		this.garantia = garantia;
	}
	public Double getOtro() {
		return otro;
	}
	public void setOtro(Double otro) {
		this.otro = otro;
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
	public String getNrocontrato() {
		return nrocontrato;
	}
	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}
	public String getNrocartera() {
		return nrocartera;
	}
	public void setNrocartera(String nrocartera) {
		this.nrocartera = nrocartera;
	}

	public Integer getIdtipopersona() {
		return idtipopersona;
	}
	public void setIdtipopersona(Integer idtipopersona) {
		this.idtipopersona = idtipopersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Boolean getSiocupante() {
		return siocupante;
	}
	public void setSiocupante(Boolean siocupante) {
		this.siocupante = siocupante;
	}
	public String getNombreocupante() {
		return nombreocupante;
	}
	public void setNombreocupante(String nombreocupante) {
		this.nombreocupante = nombreocupante;
	}
	public String getDniocupante() {
		return dniocupante;
	}
	public void setDniocupante(String dniocupante) {
		this.dniocupante = dniocupante;
	}
	public Integer getIddetallecartera() {
		return iddetallecartera;
	}
	public void setIddetallecartera(Integer iddetallecartera) {
		this.iddetallecartera = iddetallecartera;
	}
	public String getIdtipconcepto() {
		return idtipconcepto;
	}
	public void setIdtipconcepto(String idtipconcepto) {
		this.idtipconcepto = idtipconcepto;
	}
	public String getNronotacreditoref() {
		return nronotacreditoref;
	}
	public void setNronotacreditoref(String nronotacreditoref) {
		this.nronotacreditoref = nronotacreditoref;
	}
	public String getNronotacreditoref2() {
		return nronotacreditoref2;
	}
	public void setNronotacreditoref2(String nronotacreditoref2) {
		this.nronotacreditoref2 = nronotacreditoref2;
	}
	public Boolean getSianulado() {
		return sianulado;
	}
	public void setSianulado(Boolean sianulado) {
		this.sianulado = sianulado;
	}
	public Integer getIdcobrador() {
		return idcobrador;
	}
	public void setIdcobrador(Integer idcobrador) {
		this.idcobrador = idcobrador;
	}
	
	public Date getFecVencimiento() {
		return fecVencimiento;
	}
	public void setFecVencimiento(Date fecVencimiento) {
		this.fecVencimiento = fecVencimiento;
	}
	/**
	 * @return the tipodescuentonotacredito
	 */
	public String getTipodescuentonotacredito() {
		return tipodescuentonotacredito;
	}
	/**
	 * @param tipodescuentonotacredito the tipodescuentonotacredito to set
	 */
	public void setTipodescuentonotacredito(String tipodescuentonotacredito) {
		this.tipodescuentonotacredito = tipodescuentonotacredito;
	}
	public Boolean getSifacturacionelectronica() {
		return sifacturacionelectronica;
	}
	public void setSifacturacionelectronica(Boolean sifacturacionelectronica) {
		this.sifacturacionelectronica = sifacturacionelectronica;
	}
	public String getNumerooperacion() {
		return numerooperacion;
	}
	public void setNumerooperacion(String numerooperacion) {
		this.numerooperacion = numerooperacion;
	}
	public Double getRec_A() {
		return rec_A;
	}
	public void setRec_A(Double rec_A) {
		this.rec_A = rec_A;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Double getPenalizacion() {
		return penalizacion;
	}
	public void setPenalizacion(Double penalizacion) {
		this.penalizacion = penalizacion;
	}
	public String getComp_opc() {
		return comp_opc;
	}
	public void setComp_opc(String comp_opc) {
		this.comp_opc = comp_opc;
	}
	public String getComp_concepto() {
		return comp_concepto;
	}
	public void setComp_concepto(String comp_concepto) {
		this.comp_concepto = comp_concepto;
	}
	public List<ComprobanteBean> getListacomprobantebeanespecial() {
		return listacomprobantebeanespecial;
	}
	public void setListacomprobantebeanespecial(
			List<ComprobanteBean> listacomprobantebeanespecial) {
		this.listacomprobantebeanespecial = listacomprobantebeanespecial;
	}
	public Boolean getSidetraccion() {
		return sidetraccion;
	}
	public void setSidetraccion(Boolean sidetraccion) {
		this.sidetraccion = sidetraccion;
	}
	public Double getMontodetraccion() {
		return montodetraccion;
	}
	public void setMontodetraccion(Double montodetraccion) {
		this.montodetraccion = montodetraccion;
	}

	public Double getMontoautodetraccion() {
		return montoautodetraccion;
	}
	public void setMontoautodetraccion(Double montoautodetraccion) {
		this.montoautodetraccion = montoautodetraccion;
	}
	public Boolean getSiautodetraccion() {
		return siautodetraccion;
	}
	public void setSiautodetraccion(Boolean siautodetraccion) {
		this.siautodetraccion = siautodetraccion;
	}
	public String getAccion_aud() {
		return accion_aud;
	}
	public void setAccion_aud(String accion_aud) {
		this.accion_aud = accion_aud;
	}
	public String getTip_pago() {
		return tip_pago;
	}
	public void setTip_pago(String tip_pago) {
		this.tip_pago = tip_pago;
	}
	public String getDescripcion_baja() {
		return descripcion_baja;
	}
	public void setDescripcion_baja(String descripcion_baja) {
		this.descripcion_baja = descripcion_baja;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsr_anula_documento() {
		return usr_anula_documento;
	}
	public void setUsr_anula_documento(String usr_anula_documento) {
		this.usr_anula_documento = usr_anula_documento;
	}
	public Date getFec_anula_documento() {
		return fec_anula_documento;
	}
	public void setFec_anula_documento(Date fec_anula_documento) {
		this.fec_anula_documento = fec_anula_documento;
	}
	public String getTip_docu() {
		return tip_docu;
	}
	public void setTip_docu(String tip_docu) {
		this.tip_docu = tip_docu;
	}
	public String getDnirucpagante() {
		return dnirucpagante;
	}
	public void setDnirucpagante(String dnirucpagante) {
		this.dnirucpagante = dnirucpagante;
	}
	public String getNombreusr_cre() {
		return nombreusr_cre;
	}
	public void setNombreusr_cre(String nombreusr_cre) {
		this.nombreusr_cre = nombreusr_cre;
	}
	public String getNombreusr_mod() {
		return nombreusr_mod;
	}
	public void setNombreusr_mod(String nombreusr_mod) {
		this.nombreusr_mod = nombreusr_mod;
	}
	public String getDescripciontipomodalidadpago() {
		return descripciontipomodalidadpago;
	}
	public void setDescripciontipomodalidadpago(String descripciontipomodalidadpago) {
		this.descripciontipomodalidadpago = descripciontipomodalidadpago;
	}
	public String getTextoimportetotal() {
		return textoimportetotal;
	}
	public void setTextoimportetotal(String textoimportetotal) {
		this.textoimportetotal = textoimportetotal;
	}
	public String getDescripcionitem() {
		return descripcionitem;
	}
	public void setDescripcionitem(String descripcionitem) {
		this.descripcionitem = descripcionitem;
	}
	public String getGlosario() {
		return glosario;
	}
	public void setGlosario(String glosario) {
		this.glosario = glosario;
	}
	public Boolean getSidocumento() {
		return sidocumento;
	}
	public void setSidocumento(Boolean sidocumento) {
		this.sidocumento = sidocumento;
	}
	public Date getFecEmisionref() {
		return fecEmisionref;
	}
	public void setFecEmisionref(Date fecEmisionref) {
		this.fecEmisionref = fecEmisionref;
	}
	public Date getFecCancelacionref() {
		return fecCancelacionref;
	}
	public void setFecCancelacionref(Date fecCancelacionref) {
		this.fecCancelacionref = fecCancelacionref;
	}
	public Date getFecVencimientoref() {
		return fecVencimientoref;
	}
	public void setFecVencimientoref(Date fecVencimientoref) {
		this.fecVencimientoref = fecVencimientoref;
	}
    
	
     
	
}
