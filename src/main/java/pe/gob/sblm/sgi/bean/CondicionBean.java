package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* Resumen.
* Objeto : ContratoBean
* Descripci�n : POJO para almacenar los datos de los contratos
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class CondicionBean implements Serializable {

	private static final long serialVersionUID = -3149159299882083022L;

	private int idcontrato;
	
	private String claveUpa;
	private int idupa;
	
	
	private String tipo;
	private String tipocontrato;
	private String direccion;
	private String numeroprincipal;
	private String numerointerior;
	private String distrito;
	private String provincia;
	private String departamento;
	
	private String nombresInquilino;
	private int idinquilino;
	private String dni;
	private String ruc;
	private String carnetextranjeria;
	private String tipopersona;
	private Integer idtipopersona;
	
	
	private String nombreocupante;
	private Boolean siocupante;
	private String dniocupante;
	
	private String condicion;
	private String moneda;
	private Date iniciocobro;
	private Date fincobro;
	private Double cuota1;
	private Double cuota2;
	private Double cuota3;
	private Double cuota4;
	private Double cuota5;
	private Double cuota6;
	private Integer numerocuotas;
	private boolean sicuotascanceladas;
	private int iddetallecartera;
	private String uso;
	private String usoespecifico;

	private String nrocontrato;
	private String estado;
	private Date iniciocontrato;
	private Date fincontrato;
	
	private boolean sisuscrito;
	private Date fechasuscrito;
	
	private boolean siresolucion;
	private String numeroresolucion;
	private Date fecharesolucion;
	
	
	private boolean siactaentrega;
	private String numeroactaentrega;
	private Date fechaactaentrega;
	
	
	private boolean siadenda;
	private String observacionadenda;
	private int nroadenda;//numero de adenda 
	private Date fincontratoadenda;
	
	private boolean siresuelto;
	private Date fecmodresuelto;
	private Date fincontratoresuelto;
	private String observacionresuelto;
	
	private String observacion;
	private Boolean siprocesojudicial;
	
	private boolean sifinalizado;
	private String aniocontrato;
	private String observacionfinalizado;
	
	private String numerocartera;
	
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	
    private Boolean sicartafianza;
    private Date fechavencimientocartafianza;
    private Double valorcartafianza; 
	
    private Boolean siclausulareconocimientorenta;
    private Boolean siclausulaperiodogracia;
    private Boolean siclausulareconocimientoinversion;
    private Boolean siclausulapagoposterior;
    private Boolean sipagofraccionrenta;
    private Boolean siclausulasuspensiontemporalrenta;
    private Boolean siactadevolucion;
	
    
    
    private Double contraprestacion;
    private Double contraprestacionadicional;
    private Boolean sicontraprestacionadicional;
    private Integer aniocontraprestacionadicional;
    
    private String tiporeajusteanual;
    private Double reajusteanual;
    
    private Boolean sinuevomantenimiento;
    
    
	private List<CuotaBean> cuotas;
	private List<RentaBean> rentas;
	private List<PeriodoContratoBean> listaperiodos;
	
	private String numeroactadevolucion;
	private Date fechaactadevolucion;
	private String observacionpenalidad;
	private Boolean sipenalidad;
	private Double porcentajepenalidad;
	private Boolean sicompromisopago;
	private int idadenda;
	private String observacionmod;
	private Boolean sianulado;
	private String observacionanulado;
	private boolean sidocumento;
	private Double montosoles;
	//Reconocimiento de deuda
	private Boolean sireconocimientodeuda;
	private Double montodeuda;
	private Double montoinicialdeuda;
	private Boolean simontoinicialdeuda;
	private String nroacta;
	//escritura publica
	private Boolean siescriturapublica;
	private Boolean sidetraccion;
	private Boolean sicopropiedad;
	private String claveupanueva;
	private String estadoupa;
	private String idcondicion;
	private Date inicio_acta;
	private Date fin_acta;
	private Integer nromes_rec;
	private Date fechadesde_rec;
	private Date fechahasta_rec;
	private Double monto_acta;
	private Double montoinicial_acta;
	private Double montocuota_acta;
	private Double totalsoles_rec;
	private Double totaldolares_Rec;
	private Boolean sireferenciareconocimientodeuda;
	//adenda
	private String tipocondicionadenda;
	private Date inicioAdendaContrato;
	private Date finAdendaContrato;
	private Double rentaMensualAdenda;
	private String motivodetalleadenda;
	// Renta pagada
	private Double rentaActual;
	private Double rentaPagada;
	private Date fechaPagada;
	// tipo de periodo incremento 
	private Boolean siincrementoporcentajevariable;
	private Boolean siincrementomontovariable;
	private Integer tipoincremento;
	private String  nombretipoincremento;
	private Boolean siinteresmoratorio;
	private Integer idfechapago;
	private String descripcionFecha;
	private Boolean sicondicionclausula;
	private String tipointeresmoratorio;
	private Integer nro_meses_pendientes;
	private Integer nro_meses_pagados;
	private Double total_adeudado;
	private Double total_renta;
	private Double total_interesmoratorio;
    private Double total_penalidad_1;
    private Double total_penalidad_2;
    private Double total_cancelado;
    private String tipomoneda;
    private String motivo_anula;
    private String ip_host_anula;
    private Date fec_anula;



	
	public int getIddetallecartera() {
		return iddetallecartera;
	}

	public void setIddetallecartera(int iddetallecartera) {
		this.iddetallecartera = iddetallecartera;
	}

	public int getIdcontrato() {
		return idcontrato;
	}
	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getClaveUpa() {
		return claveUpa;
	}
	public void setClaveUpa(String claveUpa) {
		this.claveUpa = claveUpa;
	}
	public String getNombresInquilino() {
		return nombresInquilino;
	}
	public void setNombresInquilino(String nombresInquilino) {
		this.nombresInquilino = nombresInquilino;
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
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
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
	public List<CuotaBean> getCuotas() {
		return cuotas;
	}
	public void setCuotas(List<CuotaBean> cuotas) {
		this.cuotas = cuotas;
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
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getNombreocupante() {
		return nombreocupante;
	}
	public void setNombreocupante(String nombreocupante) {
		this.nombreocupante = nombreocupante;
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
	public String getNrocontrato() {
		return nrocontrato;
	}
	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public Integer getNumerocuotas() {
		return numerocuotas;
	}
	public void setNumerocuotas(Integer numerocuotas) {
		this.numerocuotas = numerocuotas;
	}
	public String getNumeroprincipal() {
		return numeroprincipal;
	}
	public void setNumeroprincipal(String numeroprincipal) {
		this.numeroprincipal = numeroprincipal;
	}
	public String getNumerointerior() {
		return numerointerior;
	}
	public void setNumerointerior(String numerointerior) {
		this.numerointerior = numerointerior;
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTipopersona() {
		return tipopersona;
	}
	public void setTipopersona(String tipopersona) {
		this.tipopersona = tipopersona;
	}
	public Boolean getSiocupante() {
		return siocupante;
	}
	public void setSiocupante(Boolean siocupante) {
		this.siocupante = siocupante;
	}
	public boolean getSisuscrito() {
		return sisuscrito;
	}
	public void setSisuscrito(boolean sisuscrito) {
		this.sisuscrito = sisuscrito;
	}
	public boolean getSiactaentrega() {
		return siactaentrega;
	}
	public void setSiactaentrega(boolean siactaentrega) {
		this.siactaentrega = siactaentrega;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getSiadenda() {
		return siadenda;
	}
	public void setSiadenda(boolean siadenda) {
		this.siadenda = siadenda;
	}
	public boolean getSiresuelto() {
		return siresuelto;
	}
	public void setSiresuelto(boolean siresuelto) {
		this.siresuelto = siresuelto;
	}
	public int getIdupa() {
		return idupa;
	}
	public void setIdupa(int idupa) {
		this.idupa = idupa;
	}
	public int getIdinquilino() {
		return idinquilino;
	}
	public void setIdinquilino(int idinquilino) {
		this.idinquilino = idinquilino;
	}
	public String getObservacionadenda() {
		return observacionadenda;
	}
	public void setObservacionadenda(String observacionadenda) {
		this.observacionadenda = observacionadenda;
	}
	public Date getFecmodresuelto() {
		return fecmodresuelto;
	}
	public void setFecmodresuelto(Date fecmodresuelto) {
		this.fecmodresuelto = fecmodresuelto;
	}
	public String getObservacionresuelto() {
		return observacionresuelto;
	}
	public void setObservacionresuelto(String observacionresuelto) {
		this.observacionresuelto = observacionresuelto;
	}
	public Date getFincontratoresuelto() {
		return fincontratoresuelto;
	}
	public void setFincontratoresuelto(Date fincontratoresuelto) {
		this.fincontratoresuelto = fincontratoresuelto;
	}
	public Date getFincontratoadenda() {
		return fincontratoadenda;
	}
	public void setFincontratoadenda(Date fincontratoadenda) {
		this.fincontratoadenda = fincontratoadenda;
	}

	public String getUsoespecifico() {
		return usoespecifico;
	}

	public void setUsoespecifico(String usoespecifico) {
		this.usoespecifico = usoespecifico;
	}

	public String getDniocupante() {
		return dniocupante;
	}

	public void setDniocupante(String dniocupante) {
		this.dniocupante = dniocupante;
	}

	public Date getFechasuscrito() {
		return fechasuscrito;
	}

	public void setFechasuscrito(Date fechasuscrito) {
		this.fechasuscrito = fechasuscrito;
	}

	public String getNumeroactaentrega() {
		return numeroactaentrega;
	}

	public void setNumeroactaentrega(String numeroactaentrega) {
		this.numeroactaentrega = numeroactaentrega;
	}

	public Date getFechaactaentrega() {
		return fechaactaentrega;
	}

	public void setFechaactaentrega(Date fechaactaentrega) {
		this.fechaactaentrega = fechaactaentrega;
	}

	public boolean getSiresolucion() {
		return siresolucion;
	}

	public void setSiresolucion(boolean siresolucion) {
		this.siresolucion = siresolucion;
	}

	public Date getFecharesolucion() {
		return fecharesolucion;
	}

	public void setFecharesolucion(Date fecharesolucion) {
		this.fecharesolucion = fecharesolucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}



	public Boolean getSiprocesojudicial() {
		return siprocesojudicial;
	}

	public void setSiprocesojudicial(Boolean siprocesojudicial) {
		this.siprocesojudicial = siprocesojudicial;
	}

	public boolean getSicuotascanceladas() {
		return sicuotascanceladas;
	}

	public void setSicuotascanceladas(boolean sicuotascanceladas) {
		this.sicuotascanceladas = sicuotascanceladas;
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
	public String getNumeroresolucion() {
		return numeroresolucion;
	}
	public void setNumeroresolucion(String numeroresolucion) {
		this.numeroresolucion = numeroresolucion;
	}
	public String getAniocontrato() {
		return aniocontrato;
	}
	public void setAniocontrato(String aniocontrato) {
		this.aniocontrato = aniocontrato;
	}
	public String getObservacionfinalizado() {
		return observacionfinalizado;
	}
	public void setObservacionfinalizado(String observacionfinalizado) {
		this.observacionfinalizado = observacionfinalizado;
	}
	public boolean getSifinalizado() {
		return sifinalizado;
	}
	public void setSifinalizado(boolean sifinalizado) {
		this.sifinalizado = sifinalizado;
	}
	public String getNumerocartera() {
		return numerocartera;
	}
	public void setNumerocartera(String numerocartera) {
		this.numerocartera = numerocartera;
	}
	public Boolean getSicartafianza() {
		return sicartafianza;
	}
	public void setSicartafianza(Boolean sicartafianza) {
		this.sicartafianza = sicartafianza;
	}
	public Date getFechavencimientocartafianza() {
		return fechavencimientocartafianza;
	}
	public void setFechavencimientocartafianza(Date fechavencimientocartafianza) {
		this.fechavencimientocartafianza = fechavencimientocartafianza;
	}
	public Double getValorcartafianza() {
		return valorcartafianza;
	}
	public void setValorcartafianza(Double valorcartafianza) {
		this.valorcartafianza = valorcartafianza;
	}
	public String getTipocontrato() {
		return tipocontrato;
	}
	public void setTipocontrato(String tipocontrato) {
		this.tipocontrato = tipocontrato;
	}
	public Boolean getSiclausulareconocimientorenta() {
		return siclausulareconocimientorenta;
	}
	public void setSiclausulareconocimientorenta(Boolean siclausulareconocimientorenta) {
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
	public void setSiclausulareconocimientoinversion(Boolean siclausulareconocimientoinversion) {
		this.siclausulareconocimientoinversion = siclausulareconocimientoinversion;
	}
	public Boolean getSiclausulapagoposterior() {
		return siclausulapagoposterior;
	}
	public void setSiclausulapagoposterior(Boolean siclausulapagoposterior) {
		this.siclausulapagoposterior = siclausulapagoposterior;
	}
	public Double getContraprestacion() {
		return contraprestacion;
	}
	public void setContraprestacion(Double contraprestacion) {
		this.contraprestacion = contraprestacion;
	}
	public Double getContraprestacionadicional() {
		return contraprestacionadicional;
	}
	public void setContraprestacionadicional(Double contraprestacionadicional) {
		this.contraprestacionadicional = contraprestacionadicional;
	}
	public Boolean getSicontraprestacionadicional() {
		return sicontraprestacionadicional;
	}
	public void setSicontraprestacionadicional(Boolean sicontraprestacionadicional) {
		this.sicontraprestacionadicional = sicontraprestacionadicional;
	}
	public Integer getAniocontraprestacionadicional() {
		return aniocontraprestacionadicional;
	}
	public void setAniocontraprestacionadicional(Integer aniocontraprestacionadicional) {
		this.aniocontraprestacionadicional = aniocontraprestacionadicional;
	}
	public String getTiporeajusteanual() {
		return tiporeajusteanual;
	}
	public void setTiporeajusteanual(String tiporeajusteanual) {
		this.tiporeajusteanual = tiporeajusteanual;
	}
	public Double getReajusteanual() {
		return reajusteanual;
	}
	public void setReajusteanual(Double reajusteanual) {
		this.reajusteanual = reajusteanual;
	}
	public Boolean getSipagofraccionrenta() {
		return sipagofraccionrenta;
	}
	public void setSipagofraccionrenta(Boolean sipagofraccionrenta) {
		this.sipagofraccionrenta = sipagofraccionrenta;
	}
	public Boolean getSinuevomantenimiento() {
		return sinuevomantenimiento;
	}
	public void setSinuevomantenimiento(Boolean sinuevomantenimiento) {
		this.sinuevomantenimiento = sinuevomantenimiento;
	}
	public Boolean getSiclausulasuspensiontemporalrenta() {
		return siclausulasuspensiontemporalrenta;
	}
	public void setSiclausulasuspensiontemporalrenta(Boolean siclausulasuspensiontemporalrenta) {
		this.siclausulasuspensiontemporalrenta = siclausulasuspensiontemporalrenta;
	}
	public List<RentaBean> getRentas() {
		return rentas;
	}
	public void setRentas(List<RentaBean> rentas) {
		this.rentas = rentas;
	}

	public String getNumeroactadevolucion() {
		return numeroactadevolucion;
	}

	public void setNumeroactadevolucion(String numeroactadevolucion) {
		this.numeroactadevolucion = numeroactadevolucion;
	}

	public Date getFechaactadevolucion() {
		return fechaactadevolucion;
	}

	public void setFechaactadevolucion(Date fechaactadevolucion) {
		this.fechaactadevolucion = fechaactadevolucion;
	}

	public String getObservacionpenalidad() {
		return observacionpenalidad;
	}

	public void setObservacionpenalidad(String observacionpenalidad) {
		this.observacionpenalidad = observacionpenalidad;
	}

	public Boolean getSipenalidad() {
		return sipenalidad;
	}

	public void setSipenalidad(Boolean sipenalidad) {
		this.sipenalidad = sipenalidad;
	}

	public Double getPorcentajepenalidad() {
		return porcentajepenalidad;
	}

	public void setPorcentajepenalidad(Double porcentajepenalidad) {
		this.porcentajepenalidad = porcentajepenalidad;
	}

	public Boolean getSicompromisopago() {
		return sicompromisopago;
	}

	public void setSicompromisopago(Boolean sicompromisopago) {
		this.sicompromisopago = sicompromisopago;
	}

	public Boolean getSiactadevolucion() {
		return siactadevolucion;
	}

	public void setSiactadevolucion(Boolean siactadevolucion) {
		this.siactadevolucion = siactadevolucion;
	}

	public int getNroadenda() {
		return nroadenda;
	}

	public void setNroadenda(int nroadenda) {
		this.nroadenda = nroadenda;
	}

	public int getIdadenda() {
		return idadenda;
	}

	public void setIdadenda(int idadenda) {
		this.idadenda = idadenda;
	}

	public String getObservacionmod() {
		return observacionmod;
	}

	public void setObservacionmod(String observacionmod) {
		this.observacionmod = observacionmod;
	}

	public Boolean getSianulado() {
		return sianulado;
	}

	public void setSianulado(Boolean sianulado) {
		this.sianulado = sianulado;
	}

	public String getObservacionanulado() {
		return observacionanulado;
	}

	public void setObservacionanulado(String observacionanulado) {
		this.observacionanulado = observacionanulado;
	}

	public boolean getSidocumento() {
		return sidocumento;
	}

	public void setSidocumento(boolean sidocumento) {
		this.sidocumento = sidocumento;
	}

	public Double getMontosoles() {
		return montosoles;
	}

	public void setMontosoles(Double montosoles) {
		this.montosoles = montosoles;
	}

	public Boolean getSireconocimientodeuda() {
		return sireconocimientodeuda;
	}

	public void setSireconocimientodeuda(Boolean sireconocimientodeuda) {
		this.sireconocimientodeuda = sireconocimientodeuda;
	}

	public Double getMontodeuda() {
		return montodeuda;
	}

	public void setMontodeuda(Double montodeuda) {
		this.montodeuda = montodeuda;
	}

	public Double getMontoinicialdeuda() {
		return montoinicialdeuda;
	}

	public void setMontoinicialdeuda(Double montoinicialdeuda) {
		this.montoinicialdeuda = montoinicialdeuda;
	}

	public Boolean getSimontoinicialdeuda() {
		return simontoinicialdeuda;
	}

	public void setSimontoinicialdeuda(Boolean simontoinicialdeuda) {
		this.simontoinicialdeuda = simontoinicialdeuda;
	}

	public String getNroacta() {
		return nroacta;
	}

	public void setNroacta(String nroacta) {
		this.nroacta = nroacta;
	}

	public Boolean getSiescriturapublica() {
		return siescriturapublica;
	}

	public void setSiescriturapublica(Boolean siescriturapublica) {
		this.siescriturapublica = siescriturapublica;
	}

	public Boolean getSidetraccion() {
		return sidetraccion;
	}

	public void setSidetraccion(Boolean sidetraccion) {
		this.sidetraccion = sidetraccion;
	}

	public Boolean getSicopropiedad() {
		return sicopropiedad;
	}

	public void setSicopropiedad(Boolean sicopropiedad) {
		this.sicopropiedad = sicopropiedad;
	}

	public String getClaveupanueva() {
		return claveupanueva;
	}

	public void setClaveupanueva(String claveupanueva) {
		this.claveupanueva = claveupanueva;
	}

	public String getEstadoupa() {
		return estadoupa;
	}

	public void setEstadoupa(String estadoupa) {
		this.estadoupa = estadoupa;
	}

	public String getIdcondicion() {
		return idcondicion;
	}

	public void setIdcondicion(String idcondicion) {
		this.idcondicion = idcondicion;
	}

	public Date getInicio_acta() {
		return inicio_acta;
	}

	public void setInicio_acta(Date inicio_acta) {
		this.inicio_acta = inicio_acta;
	}

	public Date getFin_acta() {
		return fin_acta;
	}

	public void setFin_acta(Date fin_acta) {
		this.fin_acta = fin_acta;
	}

	public Integer getNromes_rec() {
		return nromes_rec;
	}

	public void setNromes_rec(Integer nromes_rec) {
		this.nromes_rec = nromes_rec;
	}

	public Date getFechadesde_rec() {
		return fechadesde_rec;
	}

	public void setFechadesde_rec(Date fechadesde_rec) {
		this.fechadesde_rec = fechadesde_rec;
	}

	public Date getFechahasta_rec() {
		return fechahasta_rec;
	}

	public void setFechahasta_rec(Date fechahasta_rec) {
		this.fechahasta_rec = fechahasta_rec;
	}

	public Double getMonto_acta() {
		return monto_acta;
	}

	public void setMonto_acta(Double monto_acta) {
		this.monto_acta = monto_acta;
	}

	public Double getMontoinicial_acta() {
		return montoinicial_acta;
	}

	public void setMontoinicial_acta(Double montoinicial_acta) {
		this.montoinicial_acta = montoinicial_acta;
	}

	public Double getMontocuota_acta() {
		return montocuota_acta;
	}

	public void setMontocuota_acta(Double montocuota_acta) {
		this.montocuota_acta = montocuota_acta;
	}

	public Double getTotalsoles_rec() {
		return totalsoles_rec;
	}

	public void setTotalsoles_rec(Double totalsoles_rec) {
		this.totalsoles_rec = totalsoles_rec;
	}

	public Double getTotaldolares_Rec() {
		return totaldolares_Rec;
	}

	public void setTotaldolares_Rec(Double totaldolares_Rec) {
		this.totaldolares_Rec = totaldolares_Rec;
	}

	public Boolean getSireferenciareconocimientodeuda() {
		return sireferenciareconocimientodeuda;
	}

	public void setSireferenciareconocimientodeuda(
			Boolean sireferenciareconocimientodeuda) {
		this.sireferenciareconocimientodeuda = sireferenciareconocimientodeuda;
	}


	public Boolean getSiincrementomontovariable() {
		return siincrementomontovariable;
	}

	public void setSiincrementomontovariable(Boolean siincrementomontovariable) {
		this.siincrementomontovariable = siincrementomontovariable;
	}

	public Boolean getSiincrementoporcentajevariable() {
		return siincrementoporcentajevariable;
	}

	public void setSiincrementoporcentajevariable(
			Boolean siincrementoporcentajevariable) {
		this.siincrementoporcentajevariable = siincrementoporcentajevariable;
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

	public List<PeriodoContratoBean> getListaperiodos() {
		return listaperiodos;
	}

	public void setListaperiodos(List<PeriodoContratoBean> listaperiodos) {
		this.listaperiodos = listaperiodos;
	}

	public String getTipocondicionadenda() {
		return tipocondicionadenda;
	}

	public void setTipocondicionadenda(String tipocondicionadenda) {
		this.tipocondicionadenda = tipocondicionadenda;
	}

	public Date getInicioAdendaContrato() {
		return inicioAdendaContrato;
	}

	public void setInicioAdendaContrato(Date inicioAdendaContrato) {
		this.inicioAdendaContrato = inicioAdendaContrato;
	}

	public Date getFinAdendaContrato() {
		return finAdendaContrato;
	}

	public void setFinAdendaContrato(Date finAdendaContrato) {
		this.finAdendaContrato = finAdendaContrato;
	}

	public Double getRentaMensualAdenda() {
		return rentaMensualAdenda;
	}

	public void setRentaMensualAdenda(Double rentaMensualAdenda) {
		this.rentaMensualAdenda = rentaMensualAdenda;
	}

	public String getMotivodetalleadenda() {
		return motivodetalleadenda;
	}

	public void setMotivodetalleadenda(String motivodetalleadenda) {
		this.motivodetalleadenda = motivodetalleadenda;
	}
   
	public Integer getIdtipopersona() {
		return idtipopersona;
	}

	public void setIdtipopersona(Integer idtipopersona) {
		this.idtipopersona = idtipopersona;
	}
    
	public String getCarnetextranjeria() {
		return carnetextranjeria;
	}

	public void setCarnetextranjeria(String carnetextranjeria) {
		this.carnetextranjeria = carnetextranjeria;
	}
    	
	public Boolean getSiinteresmoratorio() {
		return siinteresmoratorio;
	}

	public void setSiinteresmoratorio(Boolean siinteresmoratorio) {
		this.siinteresmoratorio = siinteresmoratorio;
	}

	public Integer getIdfechapago() {
		return idfechapago;
	}

	public void setIdfechapago(Integer idfechapago) {
		this.idfechapago = idfechapago;
	}
	
	public Boolean getSicondicionclausula() {
		return sicondicionclausula;
	}

	public void setSicondicionclausula(Boolean sicondicionclausula) {
		this.sicondicionclausula = sicondicionclausula;
	}
    
	public String getDescripcionFecha() {
		return descripcionFecha;
	}

	public void setDescripcionFecha(String descripcionFecha) {
		this.descripcionFecha = descripcionFecha;
	}
    
	public String getTipointeresmoratorio() {
		return tipointeresmoratorio;
	}

	public void setTipointeresmoratorio(String tipointeresmoratorio) {
		this.tipointeresmoratorio = tipointeresmoratorio;
	}
    
	public Double getTotal_adeudado() {
		return total_adeudado;
	}

	public void setTotal_adeudado(Double total_adeudado) {
		this.total_adeudado = total_adeudado;
	}

	public Double getTotal_renta() {
		return total_renta;
	}

	public void setTotal_renta(Double total_renta) {
		this.total_renta = total_renta;
	}
    
	public Double getTotal_interesmoratorio() {
		return total_interesmoratorio;
	}

	public void setTotal_interesmoratorio(Double total_interesmoratorio) {
		this.total_interesmoratorio = total_interesmoratorio;
	}

	public Double getTotal_penalidad_1() {
		return total_penalidad_1;
	}

	public void setTotal_penalidad_1(Double total_penalidad_1) {
		this.total_penalidad_1 = total_penalidad_1;
	}

	public Double getTotal_penalidad_2() {
		return total_penalidad_2;
	}

	public void setTotal_penalidad_2(Double total_penalidad_2) {
		this.total_penalidad_2 = total_penalidad_2;
	}
    
	public String getTipomoneda() {
		return tipomoneda;
	}

	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	
	public Integer getNro_meses_pendientes() {
		return nro_meses_pendientes;
	}

	public void setNro_meses_pendientes(Integer nro_meses_pendientes) {
		this.nro_meses_pendientes = nro_meses_pendientes;
	}

	public Integer getNro_meses_pagados() {
		return nro_meses_pagados;
	}

	public void setNro_meses_pagados(Integer nro_meses_pagados) {
		this.nro_meses_pagados = nro_meses_pagados;
	}
    
	public Double getTotal_cancelado() {
		return total_cancelado;
	}

	public void setTotal_cancelado(Double total_cancelado) {
		this.total_cancelado = total_cancelado;
	}

	public String getMotivo_anula() {
		return motivo_anula;
	}

	public void setMotivo_anula(String motivo_anula) {
		this.motivo_anula = motivo_anula;
	}

	public String getIp_host_anula() {
		return ip_host_anula;
	}

	public void setIp_host_anula(String ip_host_anula) {
		this.ip_host_anula = ip_host_anula;
	}
    
	public Date getFec_anula() {
		return fec_anula;
	}

	public void setFec_anula(Date fec_anula) {
		this.fec_anula = fec_anula;
	}
	
	public Double getRentaActual() {
		return rentaActual;
	}

	public void setRentaActual(Double rentaActual) {
		this.rentaActual = rentaActual;
	}

	public Double getRentaPagada() {
		return rentaPagada;
	}

	public void setRentaPagada(Double rentaPagada) {
		this.rentaPagada = rentaPagada;
	}

	public Date getFechaPagada() {
		return fechaPagada;
	}

	public void setFechaPagada(Date fechaPagada) {
		this.fechaPagada = fechaPagada;
	}

	@Override
	public String toString() {
		return "CondicionBean [idcontrato=" + idcontrato + ", claveUpa="
				+ claveUpa + ", idupa=" + idupa + ", tipo=" + tipo
				+ ", tipocontrato=" + tipocontrato + ", direccion=" + direccion
				+ ", numeroprincipal=" + numeroprincipal + ", numerointerior="
				+ numerointerior + ", distrito=" + distrito + ", provincia="
				+ provincia + ", departamento=" + departamento
				+ ", nombresInquilino=" + nombresInquilino + ", idinquilino="
				+ idinquilino + ", dni=" + dni + ", ruc=" + ruc
				+ ", tipopersona=" + tipopersona + ", nombreocupante="
				+ nombreocupante + ", siocupante=" + siocupante
				+ ", dniocupante=" + dniocupante + ", condicion=" + condicion
				+ ", moneda=" + moneda + ", iniciocobro=" + iniciocobro
				+ ", fincobro=" + fincobro + ", cuota1=" + cuota1 + ", cuota2="
				+ cuota2 + ", cuota3=" + cuota3 + ", cuota4=" + cuota4
				+ ", cuota5=" + cuota5 + ", cuota6=" + cuota6
				+ ", numerocuotas=" + numerocuotas + ", sicuotascanceladas="
				+ sicuotascanceladas + ", iddetallecartera=" + iddetallecartera
				+ ", uso=" + uso + ", usoespecifico=" + usoespecifico
				+ ", nrocontrato=" + nrocontrato + ", estado=" + estado
				+ ", iniciocontrato=" + iniciocontrato + ", fincontrato="
				+ fincontrato + ", sisuscrito=" + sisuscrito
				+ ", fechasuscrito=" + fechasuscrito + ", siresolucion="
				+ siresolucion + ", numeroresolucion=" + numeroresolucion
				+ ", fecharesolucion=" + fecharesolucion + ", siactaentrega="
				+ siactaentrega + ", numeroactaentrega=" + numeroactaentrega
				+ ", fechaactaentrega=" + fechaactaentrega + ", siadenda="
				+ siadenda + ", observacionadenda=" + observacionadenda
				+ ", nroadenda=" + nroadenda + ", fincontratoadenda="
				+ fincontratoadenda + ", siresuelto=" + siresuelto
				+ ", fecmodresuelto=" + fecmodresuelto
				+ ", fincontratoresuelto=" + fincontratoresuelto
				+ ", observacionresuelto=" + observacionresuelto
				+ ", observacion=" + observacion + ", siprocesojudicial="
				+ siprocesojudicial + ", sifinalizado=" + sifinalizado
				+ ", aniocontrato=" + aniocontrato + ", observacionfinalizado="
				+ observacionfinalizado + ", numerocartera=" + numerocartera
				+ ", usrcre=" + usrcre + ", usrmod=" + usrmod + ", feccre="
				+ feccre + ", fecmod=" + fecmod + ", sicartafianza="
				+ sicartafianza + ", fechavencimientocartafianza="
				+ fechavencimientocartafianza + ", valorcartafianza="
				+ valorcartafianza + ", siclausulareconocimientorenta="
				+ siclausulareconocimientorenta + ", siclausulaperiodogracia="
				+ siclausulaperiodogracia
				+ ", siclausulareconocimientoinversion="
				+ siclausulareconocimientoinversion
				+ ", siclausulapagoposterior=" + siclausulapagoposterior
				+ ", sipagofraccionrenta=" + sipagofraccionrenta
				+ ", siclausulasuspensiontemporalrenta="
				+ siclausulasuspensiontemporalrenta + ", siactadevolucion="
				+ siactadevolucion + ", contraprestacion=" + contraprestacion
				+ ", contraprestacionadicional=" + contraprestacionadicional
				+ ", sicontraprestacionadicional="
				+ sicontraprestacionadicional
				+ ", aniocontraprestacionadicional="
				+ aniocontraprestacionadicional + ", tiporeajusteanual="
				+ tiporeajusteanual + ", reajusteanual=" + reajusteanual
				+ ", sinuevomantenimiento=" + sinuevomantenimiento
				+ ", cuotas=" + cuotas + ", rentas=" + rentas
				+ ", listaperiodos=" + listaperiodos
				+ ", numeroactadevolucion=" + numeroactadevolucion
				+ ", fechaactadevolucion=" + fechaactadevolucion
				+ ", observacionpenalidad=" + observacionpenalidad
				+ ", sipenalidad=" + sipenalidad + ", porcentajepenalidad="
				+ porcentajepenalidad + ", sicompromisopago="
				+ sicompromisopago + ", idadenda=" + idadenda
				+ ", observacionmod=" + observacionmod + ", sianulado="
				+ sianulado + ", observacionanulado=" + observacionanulado
				+ ", sidocumento=" + sidocumento + ", montosoles=" + montosoles
				+ ", sireconocimientodeuda=" + sireconocimientodeuda
				+ ", montodeuda=" + montodeuda + ", montoinicialdeuda="
				+ montoinicialdeuda + ", simontoinicialdeuda="
				+ simontoinicialdeuda + ", nroacta=" + nroacta
				+ ", siescriturapublica=" + siescriturapublica
				+ ", sidetraccion=" + sidetraccion + ", sicopropiedad="
				+ sicopropiedad + ", claveupanueva=" + claveupanueva
				+ ", estadoupa=" + estadoupa + ", idcondicion=" + idcondicion
				+ ", inicio_acta=" + inicio_acta + ", fin_acta=" + fin_acta
				+ ", nromes_rec=" + nromes_rec + ", fechadesde_rec="
				+ fechadesde_rec + ", fechahasta_rec=" + fechahasta_rec
				+ ", monto_acta=" + monto_acta + ", montoinicial_acta="
				+ montoinicial_acta + ", montocuota_acta=" + montocuota_acta
				+ ", totalsoles_rec=" + totalsoles_rec + ", totaldolares_Rec="
				+ totaldolares_Rec + ", sireferenciareconocimientodeuda="
				+ sireferenciareconocimientodeuda + ", tipocondicionadenda="
				+ tipocondicionadenda + ", inicioAdendaContrato="
				+ inicioAdendaContrato + ", finAdendaContrato="
				+ finAdendaContrato + ", rentaMensualAdenda="
				+ rentaMensualAdenda + ", motivodetalleadenda="
				+ motivodetalleadenda + ", siincrementoporcentajevariable="
				+ siincrementoporcentajevariable
				+ ", siincrementomontovariable=" + siincrementomontovariable
				+ ", tipoincremento=" + tipoincremento
				+ ", nombretipoincremento=" + nombretipoincremento + "]";
	}
    
	
		  
	
}
