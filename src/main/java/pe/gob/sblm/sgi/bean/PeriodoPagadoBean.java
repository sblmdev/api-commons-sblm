package pe.gob.sblm.sgi.bean;

import java.util.Date;


public class PeriodoPagadoBean implements java.io.Serializable {

	private static final long serialVersionUID = -5042124107624268204L;
	private int idcuota;
	private Double monto;
	private Double montodolar;
	private Double mora;
	private Double montopenalizacion;
	private Integer nrocuota;
	private String mes;
	private Integer periodo;
	private int anio;
	private Integer nropagos;
	private String sipagado;//Para  la deteccion de la  grilla
	private boolean siacuenta;// Para  la deteccion de la  grilla
	//private String siacuenta;
	private String nroserie;
	private String nrocomprobante;
	private String nroseriecomprobante;
	private String nronotacreditoref;
	private String nronotadebitoref; 
	private String idtipdocu;
	private String idtippago;
	private String idtipmovimiento;
	private String nombrecobrador;
	private Date fecEmision;
	private Date fecCancelacion;
	private String usrcre;
	private Date feccre;
	private String estado;
	private String index;
	private String observacion;
	private Integer trimestre;
	private Double total;
	
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
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
	
	
	public Double getMontodolar() {
		return montodolar;
	}
	public void setMontodolar(Double montodolar) {
		this.montodolar = montodolar;
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
	public String getNombrecobrador() {
		return nombrecobrador;
	}
	public void setNombrecobrador(String nombrecobrador) {
		this.nombrecobrador = nombrecobrador;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getNropagos() {
		return nropagos;
	}
	public void setNropagos(Integer nropagos) {
		this.nropagos = nropagos;
	}
	public int getIdcuota() {
		return idcuota;
	}
	public void setIdcuota(int idcuota) {
		this.idcuota = idcuota;
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
	public String getNronotadebitoref() {
		return nronotadebitoref;
	}
	public void setNronotadebitoref(String nronotadebitoref) {
		this.nronotadebitoref = nronotadebitoref;
	}
	public String getNronotacreditoref() {
		return nronotacreditoref;
	}
	public void setNronotacreditoref(String nronotacreditoref) {
		this.nronotacreditoref = nronotacreditoref;
	}
	
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public Integer getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(Integer trimestre) {
		this.trimestre = trimestre;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getMontopenalizacion() {
		return montopenalizacion;
	}
	public void setMontopenalizacion(Double montopenalizacion) {
		this.montopenalizacion = montopenalizacion;
	}
	
	
}
