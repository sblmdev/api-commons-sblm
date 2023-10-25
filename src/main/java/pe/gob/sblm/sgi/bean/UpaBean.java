package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;

/**
* Resumen.
* Objeto : UpaBean
* Descripci�n : POJO para almacenar los datos de los upa
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class UpaBean implements Serializable {

	private static final long serialVersionUID = -3149159299882083022L;

	private int idupa;
	private String clave;
	private String codigotitularidad;
	private String codigoinmueble;
	private String codigoupa;
	private String direccionprincipal;
	private String tipouso;
	private String numeroprincipal;
	private String numerointerior;
	private String tipointerior;
	private String direccion;
	private String dist;
	private String prov;
	private Date feccre;
	private String usrcre;
	private Date fecmod;
	private String usrmod;
	private Boolean siprocesojudicial;
	private String descripciontitularidad;
	private Integer idtipotitularidad;
	private String ubigeo;
	private String tugurizadoruinoso;
	private String simonumentoHistorico;
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getClave() {
		
		
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getTipouso() {
		return tipouso;
	}


	public void setTipouso(String tipouso) {
		this.tipouso = tipouso;
	}


	public int getIdupa() {
		return idupa;
	}

	public void setIdupa(int idupa) {
		this.idupa = idupa;
	}

	public String getDireccionprincipal() {
		return direccionprincipal;
	}

	public void setDireccionprincipal(String direccionprincipal) {
		this.direccionprincipal = direccionprincipal;
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

	public Date getFeccre() {
		return feccre;
	}

	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}

	public String getUsrcre() {
		return usrcre;
	}

	public void setUsrcre(String usrcre) {
		this.usrcre = usrcre;
	}

	public Date getFecmod() {
		return fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

	public String getUsrmod() {
		return usrmod;
	}

	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigotitularidad() {
		return codigotitularidad;
	}

	public void setCodigotitularidad(String codigotitularidad) {
		this.codigotitularidad = codigotitularidad;
	}

	public String getCodigoinmueble() {
		return codigoinmueble;
	}

	public void setCodigoinmueble(String codigoinmueble) {
		this.codigoinmueble = codigoinmueble;
	}

	public String getCodigoupa() {
		return codigoupa;
	}

	public void setCodigoupa(String codigoupa) {
		this.codigoupa = codigoupa;
	}

	public String getTipointerior() {
		return tipointerior;
	}

	public void setTipointerior(String tipointerior) {
		this.tipointerior = tipointerior;
	}


	public String getTugurizadoruinoso() {
		return tugurizadoruinoso;
	}

	public void setTugurizadoruinoso(String tugurizadoruinoso) {
		this.tugurizadoruinoso = tugurizadoruinoso;
	}


	public Boolean getSiprocesojudicial() {
		return siprocesojudicial;
	}


	public void setSiprocesojudicial(Boolean siprocesojudicial) {
		this.siprocesojudicial = siprocesojudicial;
	}


	public String getDescripciontitularidad() {
		return descripciontitularidad;
	}


	public void setDescripciontitularidad(String descripciontitularidad) {
		this.descripciontitularidad = descripciontitularidad;
	}


	public Integer getIdtipotitularidad() {
		return idtipotitularidad;
	}


	public void setIdtipotitularidad(Integer idtipotitularidad) {
		this.idtipotitularidad = idtipotitularidad;
	}


	public String getUbigeo() {
		return ubigeo;
	}


	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}


	public String getSimonumentoHistorico() {
		return simonumentoHistorico;
	}


	public void setSimonumentoHistorico(String simonumentoHistorico) {
		this.simonumentoHistorico = simonumentoHistorico;
	}
    
    

	
}
