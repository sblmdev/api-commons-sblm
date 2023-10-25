package pe.gob.sblm.sgi.bean;

import java.util.Date;
import java.math.BigDecimal;

public class MaeDetCondicionDetalleBean {
	private int id_condicion_detalle;
	private int id_condicion;	//maedetallecondicion
	private String  idconcepto;
	private String  concepto;
	private String  mes ;
	private String  anio;
	private Double  monto;
	private String  tipomoneda;
	private Integer numeromes;
	private Integer secuencia;
	private int idcontrato;
	private Integer iddetallecondicion;
	private String usrcre;
	private Date feccre;
	private String obs;
	private String host_ip_cre;
	private String usrmod;
	private Date fecmod;
	private String obs_mod;
	private String host_ip_mod;	
	private Boolean sianulado; // 0 =activo  1//anulado  	
	private String usr_anula;
	private Date fec_anula;
	private String motivo_anula;
	private String host_ip_anula;
	private String estado; // REGISTRADO // ANULADO
	private Double montodolar;
	private Boolean siacuenta;// cuota
	private Integer idcuota;
	private Integer nropagos;
	private Double moraacumulada;
	private Double rentapagada;
	private Double deudaacuenta;
	private Double mora;
	private Double montopenalizacion;

	
	public int getId_condicion_detalle() {
		return id_condicion_detalle;
	}
	public void setId_condicion_detalle(int id_condicion_detalle) {
		this.id_condicion_detalle = id_condicion_detalle;
	}
	public int getId_condicion() {
		return id_condicion;
	}
	public void setId_condicion(int id_condicion) {
		this.id_condicion = id_condicion;
	}
	public String getIdconcepto() {
		return idconcepto;
	}
	public void setIdconcepto(String idconcepto) {
		this.idconcepto = idconcepto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
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
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getTipomoneda() {
		return tipomoneda;
	}
	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	public Integer getNumeromes() {
		return numeromes;
	}
	public void setNumeromes(Integer numeromes) {
		this.numeromes = numeromes;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public int getIdcontrato() {
		return idcontrato;
	}
	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}
	public Integer getIddetallecondicion() {
		return iddetallecondicion;
	}
	public void setIddetallecondicion(Integer iddetallecondicion) {
		this.iddetallecondicion = iddetallecondicion;
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
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getHost_ip_cre() {
		return host_ip_cre;
	}
	public void setHost_ip_cre(String host_ip_cre) {
		this.host_ip_cre = host_ip_cre;
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
	public String getObs_mod() {
		return obs_mod;
	}
	public void setObs_mod(String obs_mod) {
		this.obs_mod = obs_mod;
	}
	public String getHost_ip_mod() {
		return host_ip_mod;
	}
	public void setHost_ip_mod(String host_ip_mod) {
		this.host_ip_mod = host_ip_mod;
	}
	public Boolean getSianulado() {
		return sianulado;
	}
	public void setSianulado(Boolean sianulado) {
		this.sianulado = sianulado;
	}
	public String getUsr_anula() {
		return usr_anula;
	}
	public void setUsr_anula(String usr_anula) {
		this.usr_anula = usr_anula;
	}
	public Date getFec_anula() {
		return fec_anula;
	}
	public void setFec_anula(Date fec_anula) {
		this.fec_anula = fec_anula;
	}
	public String getMotivo_anula() {
		return motivo_anula;
	}
	public void setMotivo_anula(String motivo_anula) {
		this.motivo_anula = motivo_anula;
	}
	public String getHost_ip_anula() {
		return host_ip_anula;
	}
	public void setHost_ip_anula(String host_ip_anula) {
		this.host_ip_anula = host_ip_anula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getMontodolar() {
		return montodolar;
	}
	public void setMontodolar(Double montodolar) {
		this.montodolar = montodolar;
	}
	public Boolean getSiacuenta() {
		return siacuenta;
	}
	public void setSiacuenta(Boolean siacuenta) {
		this.siacuenta = siacuenta;
	}
	public Integer getIdcuota() {
		return idcuota;
	}
	public void setIdcuota(Integer idcuota) {
		this.idcuota = idcuota;
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
	public Double getRentapagada() {
		return rentapagada;
	}
	public void setRentapagada(Double rentapagada) {
		this.rentapagada = rentapagada;
	}
	public Double getDeudaacuenta() {
		return deudaacuenta;
	}
	public void setDeudaacuenta(Double deudaacuenta) {
		this.deudaacuenta = deudaacuenta;
	}
	public Double getMora() {
		return mora;
	}
	public void setMora(Double mora) {
		this.mora = mora;
	}
	public Double getMontopenalizacion() {
		return montopenalizacion;
	}
	public void setMontopenalizacion(Double montopenalizacion) {
		this.montopenalizacion = montopenalizacion;
	}
    
   
	
	
}
