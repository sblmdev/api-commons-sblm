package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* Resumen.
* Objeto : ArbitrioBean
* Descripci�n : POJO para almacenar los datos de los arbitrios
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class ArbitrioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idarbitrio;
	private int idupa;
	private String sifinalizado;
	private String estado;
	private String frecuencia;
	private String direccion;
	private String numeroprincipal;
	private String zona;
	private String sector;
	private String manzana;
	private String lote;
	private String etapa;
	private String sublote;
	private String urbanizacion;
	private String aahh;
	private String numnombreinterior;
	private String ubigeo;
	private Integer anio;
	private Integer periodo;
	private Double trim1;
	private Double trim2;
	private Double trim3;
	private Double trim4;
	private int iduso;
	private Double monto;
	private Double total;
	private Date feccre;
	private Date fecmod;
	private String usrcre;
	private String usrmod;
	private String clave;
	private String departamento;
	private String provincia;
	private String distrito;
	private String descripcion;
	//inquilino
	private String nombreinquilino;
	private int idinquilino;
	private String dni;
	private String ruc;
	private String tipopersona;
	private String nombreocupante;
	private String dniocupante;
	private String condicion;
	private String moneda;
	private boolean siocupante;
	private List<CuotaArbitrioBean> cuotas;
	private String claveUpa;
	private Date iniciocontrato;
	private Date fincontrato;
	private Date iniciocobro;
	private Date fincobro;
	private String uso;
	private Double totalpagado;
	private Double totalpendiente;
	private String observacion;
	private String motivomod;
	public int getIdarbitrio() {
		return idarbitrio;
	}
	public void setIdarbitrio(int idarbitrio) {
		this.idarbitrio = idarbitrio;
	}
	public int getIdupa() {
		return idupa;
	}
	public void setIdupa(int idupa) {
		this.idupa = idupa;
	}
	public String getSifinalizado() {
		return sifinalizado;
	}
	public void setSifinalizado(String sifinalizado) {
		this.sifinalizado = sifinalizado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeroprincipal() {
		return numeroprincipal;
	}
	public void setNumeroprincipal(String numeroprincipal) {
		this.numeroprincipal = numeroprincipal;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getSublote() {
		return sublote;
	}
	public void setSublote(String sublote) {
		this.sublote = sublote;
	}
	public String getUrbanizacion() {
		return urbanizacion;
	}
	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}
	public String getAahh() {
		return aahh;
	}
	public void setAahh(String aahh) {
		this.aahh = aahh;
	}
	public String getNumnombreinterior() {
		return numnombreinterior;
	}
	public void setNumnombreinterior(String numnombreinterior) {
		this.numnombreinterior = numnombreinterior;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public int getIduso() {
		return iduso;
	}
	public void setIduso(int iduso) {
		this.iduso = iduso;
	}

	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
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
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreinquilino() {
		return nombreinquilino;
	}
	public void setNombreinquilino(String nombreinquilino) {
		this.nombreinquilino = nombreinquilino;
	}
	public int getIdinquilino() {
		return idinquilino;
	}
	public void setIdinquilino(int idinquilino) {
		this.idinquilino = idinquilino;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTipopersona() {
		return tipopersona;
	}
	public void setTipopersona(String tipopersona) {
		this.tipopersona = tipopersona;
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
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public boolean isSiocupante() {
		return siocupante;
	}
	public void setSiocupante(boolean siocupante) {
		this.siocupante = siocupante;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getTrim1() {
		return trim1;
	}
	public void setTrim1(Double trim1) {
		this.trim1 = trim1;
	}
	public Double getTrim2() {
		return trim2;
	}
	public void setTrim2(Double trim2) {
		this.trim2 = trim2;
	}
	public Double getTrim3() {
		return trim3;
	}
	public void setTrim3(Double trim3) {
		this.trim3 = trim3;
	}
	public Double getTrim4() {
		return trim4;
	}
	public void setTrim4(Double trim4) {
		this.trim4 = trim4;
	}
	public List<CuotaArbitrioBean> getCuotas() {
		return cuotas;
	}
	public void setCuotas(List<CuotaArbitrioBean> cuotas) {
		this.cuotas = cuotas;
	}
	public String getClaveUpa() {
		return claveUpa;
	}
	public void setClaveUpa(String claveUpa) {
		this.claveUpa = claveUpa;
	}
	public Date getIniciocontrato() {
		return iniciocontrato;
	}
	public void setIniciocontrato(Date iniciocontrato) {
		this.iniciocontrato = iniciocontrato;
	}
	public Date getFincontrato() {
		return fincontrato;
	}
	public void setFincontrato(Date fincontrato) {
		this.fincontrato = fincontrato;
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
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public double getTotalpagado() {
		return totalpagado;
	}
	public void setTotalpagado(double totalpagado) {
		this.totalpagado = totalpagado;
	}
	public Double getTotalpendiente() {
		return totalpendiente;
	}
	public void setTotalpendiente(Double totalpendiente) {
		this.totalpendiente = totalpendiente;
	}
	public void setTotalpagado(Double totalpagado) {
		this.totalpagado = totalpagado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getMotivomod() {
		return motivomod;
	}
	public void setMotivomod(String motivomod) {
		this.motivomod = motivomod;
	}
	@Override
	public String toString() {
		return "ArbitrioBean [ idarbitrio="
				+ idarbitrio + ", idupa=" + idupa + ", sifinalizado="
				+ sifinalizado + ", estado=" + estado + ", frecuencia="
				+ frecuencia + ", direccion=" + direccion
				+ ", numeroprincipal=" + numeroprincipal + ", zona=" + zona
				+ ", sector=" + sector + ", manzana=" + manzana + ", lote="
				+ lote + ", etapa=" + etapa + ", sublote=" + sublote
				+ ", urbanizacion=" + urbanizacion + ", aahh=" + aahh
				+ ", numnombreinterior=" + numnombreinterior + ", ubigeo="
				+ ubigeo + ", anio=" + anio + ", periodo=" + periodo
				+ ", trim1=" + trim1 + ", trim2=" + trim2 + ", trim3=" + trim3
				+ ", trim4=" + trim4 + ", iduso=" + iduso + ", monto=" + monto
				+ ", total=" + total + ", feccre=" + feccre + ", fecmod="
				+ fecmod + ", usrcre=" + usrcre + ", usrmod=" + usrmod
				+ ", clave=" + clave + ", departamento=" + departamento
				+ ", provincia=" + provincia + ", distrito=" + distrito
				+ ", descripcion=" + descripcion + ", nombreinquilino="
				+ nombreinquilino + ", idinquilino=" + idinquilino + ", dni="
				+ dni + ", ruc=" + ruc + ", tipopersona=" + tipopersona
				+ ", nombreocupante=" + nombreocupante + ", dniocupante="
				+ dniocupante + ", condicion=" + condicion + ", moneda="
				+ moneda + ", siocupante=" + siocupante + ", cuotas=" + cuotas
				+ ", claveUpa=" + claveUpa + ", iniciocontrato="
				+ iniciocontrato + ", fincontrato=" + fincontrato
				+ ", iniciocobro=" + iniciocobro + ", fincobro=" + fincobro
				+ ", uso=" + uso + ", totalpagado=" + totalpagado
				+ ", totalpendiente=" + totalpendiente + ", observacion="
				+ observacion + "]";
	}
	
	
	
	
}
