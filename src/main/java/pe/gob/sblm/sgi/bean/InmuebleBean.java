package pe.gob.sblm.sgi.bean;

import java.util.Date;

public class InmuebleBean {
	
	private int idinmueble;

	
	private String idubigeo;
	
	private String departamento;
	private String provincia;
	private String distrito;
	private String ubigeo;
	
	private Integer idtipovia;
	private Integer idorigendominio;
	private String nombretipovia;
	private Integer idtipozona;
	private String nombretipozona;
	
	private String direccionprincipal;
	private String referenciadireccion;
	private String direccion;
	
	private String codigoinmueble;
	private String clave;
	private String numregistrosbn;
	
	
	private Boolean sihabilitacionurbana;
	
	//Registrales
	private int idtitularidad;
	private String nombretitularidad;
	private String codigotitularidad;
	private String tipotitularidad;
	
	private boolean simonumentohistorico;	
	private String tipomonumentohistorico;
	private String resolucionmonumentohistorico;
	private Date fecresolucionmonumentohistorico;
	private String simonumentoHistorico;
	
	private String codigopredio;
	private Date fecinscripcionregistral;
	private String asientoregistral;
	private String fojasregistral;
	private String tomoregistral;
	private String ficharegistral;
	private String partidaelectronicaregistral;
	
	private String observacionregistral;
	private String descripcionorigendominio;
	
	//Fabrica
	private boolean sideclaratoriafabrica;
	private String asientofabrica;
	private String fojasfabrica;
	private String tomofabrica;
	private String fichafabrica;
	private String partidaelectronicafabrica;
	private String observacionfabrica;		
	
	//Independizacion
	private boolean siindependizacion;
	private Integer unidadesinmobiliariasindependizacion;
	private String asientoindependizacion;
	private String fojasindependizacion;
	private String tomoindependizacion;
	private String fichaindependizacion;
	private String partidaelectronicaindependizacion;
	private Date fechainscripcionindependizacion;
	private String observacionindependizacion;		
	
	//gravamen
	private boolean sigravamen;
	private String afavordegravamen;
	private String asientogravamen;
	private String fojasgravamen;
	private String tomogravamen;
	private String fichagravamen;
	private String partidaelectronicagravamen;
	private Date fechainscripciongravamen;
	private String observaciongravamen;
	
	//Mandas o cargas
	private boolean simandascargas;
	private String afavordemandascargas;
	private String asientomandascargas;
	private String fojasmandascargas;
	private String tomomandascargas;
	private String fichamandascargas;
	private String partidaelectronicamandascargas;
	private Date fechainscripcionmandascargas;
	private String observacionmandascargas;
	
	//Saneamiento
	private boolean sisaneado;
	private String observacionsaneado;
	
	//Tecnicos
	private String materialpredominante;
	private Integer idmaterialpredominante;
	private Integer anioconstruccion;
	private Integer nropisos;
	private String areaterreno;
	private String areaconstruida;
	
	//Documentacion existente
	private boolean sipartidaregistral;
	private boolean siplanoubicacion;
	private boolean simemoriadescriptiva;
	private boolean sifotografias;
	private boolean sitasacion;
	private Date fectasacion;
	
	
	private String latitudlocalizacion;
	private String longitudlocalizacion;
	private String descripcionlocalizacion;
	private String observacion;
	
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private String condicion;
	private Boolean sidocumento;

	
	public int getIdinmueble() {
		return idinmueble;
	}
	public void setIdinmueble(int idinmueble) {
		this.idinmueble = idinmueble;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIdubigeo() {
		return idubigeo;
	}
	public void setIdubigeo(String idubigeo) {
		this.idubigeo = idubigeo;
	}
	public Boolean getSihabilitacionurbana() {
		return sihabilitacionurbana;
	}
	public void setSihabilitacionurbana(Boolean sihabilitacionurbana) {
		this.sihabilitacionurbana = sihabilitacionurbana;
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
	public String getLatitudlocalizacion() {
		return latitudlocalizacion;
	}
	public void setLatitudlocalizacion(String latitudlocalizacion) {
		this.latitudlocalizacion = latitudlocalizacion;
	}
	public String getLongitudlocalizacion() {
		return longitudlocalizacion;
	}
	public void setLongitudlocalizacion(String longitudlocalizacion) {
		this.longitudlocalizacion = longitudlocalizacion;
	}
	public String getDescripcionlocalizacion() {
		return descripcionlocalizacion;
	}
	public void setDescripcionlocalizacion(String descripcionlocalizacion) {
		this.descripcionlocalizacion = descripcionlocalizacion;
	}

	public int getIdtitularidad() {
		return idtitularidad;
	}
	public void setIdtitularidad(int idtitularidad) {
		this.idtitularidad = idtitularidad;
	}
	public String getNombretitularidad() {
		return nombretitularidad;
	}
	public void setNombretitularidad(String nombretitularidad) {
		this.nombretitularidad = nombretitularidad;
	}

	public String getCodigotitularidad() {
		return codigotitularidad;
	}
	public void setCodigotitularidad(String codigotitularidad) {
		this.codigotitularidad = codigotitularidad;
	}
	public String getTipotitularidad() {
		return tipotitularidad;
	}
	public void setTipotitularidad(String tipotitularidad) {
		this.tipotitularidad = tipotitularidad;
	}
	public boolean getSimonumentohistorico() {
		return simonumentohistorico;
	}
	public void setSimonumentohistorico(boolean simonumentohistorico) {
		this.simonumentohistorico = simonumentohistorico;
	}

	public String getTipomonumentohistorico() {
		return tipomonumentohistorico;
	}
	public void setTipomonumentohistorico(String tipomonumentohistorico) {
		this.tipomonumentohistorico = tipomonumentohistorico;
	}
	public String getResolucionmonumentohistorico() {
		return resolucionmonumentohistorico;
	}
	public void setResolucionmonumentohistorico(String resolucionmonumentohistorico) {
		this.resolucionmonumentohistorico = resolucionmonumentohistorico;
	}
	public Date getFecresolucionmonumentohistorico() {
		return fecresolucionmonumentohistorico;
	}
	public void setFecresolucionmonumentohistorico(
			Date fecresolucionmonumentohistorico) {
		this.fecresolucionmonumentohistorico = fecresolucionmonumentohistorico;
	}
	public String getCodigopredio() {
		return codigopredio;
	}
	public void setCodigopredio(String codigopredio) {
		this.codigopredio = codigopredio;
	}


	public Date getFecinscripcionregistral() {
		return fecinscripcionregistral;
	}
	public void setFecinscripcionregistral(Date fecinscripcionregistral) {
		this.fecinscripcionregistral = fecinscripcionregistral;
	}
	public String getAsientoregistral() {
		return asientoregistral;
	}
	public void setAsientoregistral(String asientoregistral) {
		this.asientoregistral = asientoregistral;
	}
	public String getFojasregistral() {
		return fojasregistral;
	}
	public void setFojasregistral(String fojasregistral) {
		this.fojasregistral = fojasregistral;
	}
	public String getTomoregistral() {
		return tomoregistral;
	}
	public void setTomoregistral(String tomoregistral) {
		this.tomoregistral = tomoregistral;
	}
	public String getFicharegistral() {
		return ficharegistral;
	}
	public void setFicharegistral(String ficharegistral) {
		this.ficharegistral = ficharegistral;
	}
	public String getPartidaelectronicaregistral() {
		return partidaelectronicaregistral;
	}
	public void setPartidaelectronicaregistral(String partidaelectronicaregistral) {
		this.partidaelectronicaregistral = partidaelectronicaregistral;
	}
	public boolean getSideclaratoriafabrica() {
		return sideclaratoriafabrica;
	}
	public void setSideclaratoriafabrica(boolean sideclaratoriafabrica) {
		this.sideclaratoriafabrica = sideclaratoriafabrica;
	}
	public String getAsientofabrica() {
		return asientofabrica;
	}
	public void setAsientofabrica(String asientofabrica) {
		this.asientofabrica = asientofabrica;
	}
	public String getFojasfabrica() {
		return fojasfabrica;
	}
	public void setFojasfabrica(String fojasfabrica) {
		this.fojasfabrica = fojasfabrica;
	}
	public String getTomofabrica() {
		return tomofabrica;
	}
	public void setTomofabrica(String tomofabrica) {
		this.tomofabrica = tomofabrica;
	}
	public String getFichafabrica() {
		return fichafabrica;
	}
	public void setFichafabrica(String fichafabrica) {
		this.fichafabrica = fichafabrica;
	}
	public String getPartidaelectronicafabrica() {
		return partidaelectronicafabrica;
	}
	public void setPartidaelectronicafabrica(String partidaelectronicafabrica) {
		this.partidaelectronicafabrica = partidaelectronicafabrica;
	}
	public String getMaterialpredominante() {
		return materialpredominante;
	}
	public void setMaterialpredominante(String materialpredominante) {
		this.materialpredominante = materialpredominante;
	}
	public Integer getIdmaterialpredominante() {
		return idmaterialpredominante;
	}
	public void setIdmaterialpredominante(Integer idmaterialpredominante) {
		this.idmaterialpredominante = idmaterialpredominante;
	}
	public Integer getAnioconstruccion() {
		return anioconstruccion;
	}
	public void setAnioconstruccion(Integer anioconstruccion) {
		this.anioconstruccion = anioconstruccion;
	}
	public Integer getNropisos() {
		return nropisos;
	}
	public void setNropisos(Integer nropisos) {
		this.nropisos = nropisos;
	}
	public String getAreaterreno() {
		return areaterreno;
	}
	public void setAreaterreno(String areaterreno) {
		this.areaterreno = areaterreno;
	}
	public String getAreaconstruida() {
		return areaconstruida;
	}
	public void setAreaconstruida(String areaconstruida) {
		this.areaconstruida = areaconstruida;
	}
	public boolean getSipartidaregistral() {
		return sipartidaregistral;
	}
	public void setSipartidaregistral(boolean sipartidaregistral) {
		this.sipartidaregistral = sipartidaregistral;
	}
	public boolean getSiplanoubicacion() {
		return siplanoubicacion;
	}
	public void setSiplanoubicacion(boolean siplanoubicacion) {
		this.siplanoubicacion = siplanoubicacion;
	}
	public boolean getSimemoriadescriptiva() {
		return simemoriadescriptiva;
	}
	public void setSimemoriadescriptiva(boolean simemoriadescriptiva) {
		this.simemoriadescriptiva = simemoriadescriptiva;
	}
	public boolean getSifotografias() {
		return sifotografias;
	}
	public void setSifotografias(boolean sifotografias) {
		this.sifotografias = sifotografias;
	}
	public boolean getSitasacion() {
		return sitasacion;
	}
	public void setSitasacion(boolean sitasacion) {
		this.sitasacion = sitasacion;
	}
	public Date getFectasacion() {
		return fectasacion;
	}
	public void setFectasacion(Date fectasacion) {
		this.fectasacion = fectasacion;
	}
	public String getCodigoinmueble() {
		return codigoinmueble;
	}
	public void setCodigoinmueble(String codigoinmueble) {
		this.codigoinmueble = codigoinmueble;
	}

	public Integer getIdtipovia() {
		return idtipovia;
	}
	public void setIdtipovia(Integer idtipovia) {
		this.idtipovia = idtipovia;
	}
	public boolean getSisaneado() {
		return sisaneado;
	}
	public void setSisaneado(boolean sisaneado) {
		this.sisaneado = sisaneado;
	}
	public String getObservacionregistral() {
		return observacionregistral;
	}
	public void setObservacionregistral(String observacionregistral) {
		this.observacionregistral = observacionregistral;
	}
	public String getObservacionfabrica() {
		return observacionfabrica;
	}
	public void setObservacionfabrica(String observacionfabrica) {
		this.observacionfabrica = observacionfabrica;
	}

	public boolean getSiindependizacion() {
		return siindependizacion;
	}
	public void setSiindependizacion(boolean siindependizacion) {
		this.siindependizacion = siindependizacion;
	}
	public String getAsientoindependizacion() {
		return asientoindependizacion;
	}
	public void setAsientoindependizacion(String asientoindependizacion) {
		this.asientoindependizacion = asientoindependizacion;
	}
	public String getFojasindependizacion() {
		return fojasindependizacion;
	}
	public void setFojasindependizacion(String fojasindependizacion) {
		this.fojasindependizacion = fojasindependizacion;
	}
	public String getTomoindependizacion() {
		return tomoindependizacion;
	}
	public void setTomoindependizacion(String tomoindependizacion) {
		this.tomoindependizacion = tomoindependizacion;
	}
	public String getFichaindependizacion() {
		return fichaindependizacion;
	}
	public void setFichaindependizacion(String fichaindependizacion) {
		this.fichaindependizacion = fichaindependizacion;
	}
	public String getPartidaelectronicaindependizacion() {
		return partidaelectronicaindependizacion;
	}
	public void setPartidaelectronicaindependizacion(
			String partidaelectronicaindependizacion) {
		this.partidaelectronicaindependizacion = partidaelectronicaindependizacion;
	}
	public String getObservacionindependizacion() {
		return observacionindependizacion;
	}
	public void setObservacionindependizacion(String observacionindependizacion) {
		this.observacionindependizacion = observacionindependizacion;
	}
	public boolean getSigravamen() {
		return sigravamen;
	}
	public void setSigravamen(boolean sigravamen) {
		this.sigravamen = sigravamen;
	}
	public String getAsientogravamen() {
		return asientogravamen;
	}
	public void setAsientogravamen(String asientogravamen) {
		this.asientogravamen = asientogravamen;
	}
	public String getFojasgravamen() {
		return fojasgravamen;
	}
	public void setFojasgravamen(String fojasgravamen) {
		this.fojasgravamen = fojasgravamen;
	}
	public String getTomogravamen() {
		return tomogravamen;
	}
	public void setTomogravamen(String tomogravamen) {
		this.tomogravamen = tomogravamen;
	}
	public String getFichagravamen() {
		return fichagravamen;
	}
	public void setFichagravamen(String fichagravamen) {
		this.fichagravamen = fichagravamen;
	}
	public String getPartidaelectronicagravamen() {
		return partidaelectronicagravamen;
	}
	public void setPartidaelectronicagravamen(String partidaelectronicagravamen) {
		this.partidaelectronicagravamen = partidaelectronicagravamen;
	}
	public String getObservaciongravamen() {
		return observaciongravamen;
	}
	public void setObservaciongravamen(String observaciongravamen) {
		this.observaciongravamen = observaciongravamen;
	}
	public boolean getSimandascargas() {
		return simandascargas;
	}
	public void setSimandascargas(boolean simandascargas) {
		this.simandascargas = simandascargas;
	}
	public String getAsientomandascargas() {
		return asientomandascargas;
	}
	public void setAsientomandascargas(String asientomandascargas) {
		this.asientomandascargas = asientomandascargas;
	}
	public String getFojasmandascargas() {
		return fojasmandascargas;
	}
	public void setFojasmandascargas(String fojasmandascargas) {
		this.fojasmandascargas = fojasmandascargas;
	}
	public String getTomomandascargas() {
		return tomomandascargas;
	}
	public void setTomomandascargas(String tomomandascargas) {
		this.tomomandascargas = tomomandascargas;
	}
	public String getFichamandascargas() {
		return fichamandascargas;
	}
	public void setFichamandascargas(String fichamandascargas) {
		this.fichamandascargas = fichamandascargas;
	}
	public String getPartidaelectronicamandascargas() {
		return partidaelectronicamandascargas;
	}
	public void setPartidaelectronicamandascargas(
			String partidaelectronicamandascargas) {
		this.partidaelectronicamandascargas = partidaelectronicamandascargas;
	}
	public String getObservacionmandascargas() {
		return observacionmandascargas;
	}
	public void setObservacionmandascargas(String observacionmandascargas) {
		this.observacionmandascargas = observacionmandascargas;
	}
	public Date getFechainscripcionindependizacion() {
		return fechainscripcionindependizacion;
	}
	public void setFechainscripcionindependizacion(
			Date fechainscripcionindependizacion) {
		this.fechainscripcionindependizacion = fechainscripcionindependizacion;
	}
	public String getAfavordegravamen() {
		return afavordegravamen;
	}
	public void setAfavordegravamen(String afavordegravamen) {
		this.afavordegravamen = afavordegravamen;
	}
	public Date getFechainscripciongravamen() {
		return fechainscripciongravamen;
	}
	public void setFechainscripciongravamen(Date fechainscripciongravamen) {
		this.fechainscripciongravamen = fechainscripciongravamen;
	}
	public String getAfavordemandascargas() {
		return afavordemandascargas;
	}
	public void setAfavordemandascargas(String afavordemandascargas) {
		this.afavordemandascargas = afavordemandascargas;
	}

	public Date getFechainscripcionmandascargas() {
		return fechainscripcionmandascargas;
	}
	public void setFechainscripcionmandascargas(Date fechainscripcionmandascargas) {
		this.fechainscripcionmandascargas = fechainscripcionmandascargas;
	}
	public Integer getUnidadesinmobiliariasindependizacion() {
		return unidadesinmobiliariasindependizacion;
	}
	public void setUnidadesinmobiliariasindependizacion(
			Integer unidadesinmobiliariasindependizacion) {
		this.unidadesinmobiliariasindependizacion = unidadesinmobiliariasindependizacion;
	}
	public Integer getIdtipozona() {
		return idtipozona;
	}
	public void setIdtipozona(Integer idtipozona) {
		this.idtipozona = idtipozona;
	}
	public String getNombretipovia() {
		return nombretipovia;
	}
	public void setNombretipovia(String nombretipovia) {
		this.nombretipovia = nombretipovia;
	}
	public String getNombretipozona() {
		return nombretipozona;
	}
	public void setNombretipozona(String nombretipozona) {
		this.nombretipozona = nombretipozona;
	}

	public String getClave() {
		//clave=codigotitularidad+"-"+codigoinmueble+"-000";
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDireccionprincipal() {
		return direccionprincipal;
	}
	public void setDireccionprincipal(String direccionprincipal) {
		this.direccionprincipal = direccionprincipal;
	}
	public String getReferenciadireccion() {
		return referenciadireccion;
	}
	public void setReferenciadireccion(String referenciadireccion) {
		this.referenciadireccion = referenciadireccion;
	}
	public String getNumregistrosbn() {
		return numregistrosbn;
	}
	public void setNumregistrosbn(String numregistrosbn) {
		this.numregistrosbn = numregistrosbn;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	public Integer getIdorigendominio() {
		return idorigendominio;
	}
	public void setIdorigendominio(Integer idorigendominio) {
		this.idorigendominio = idorigendominio;
	}
	public String getObservacionsaneado() {
		return observacionsaneado;
	}
	public void setObservacionsaneado(String observacionsaneado) {
		this.observacionsaneado = observacionsaneado;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public Boolean getSidocumento() {
		return sidocumento;
	}
	public void setSidocumento(Boolean sidocumento) {
		this.sidocumento = sidocumento;
	}
	public String getDescripcionorigendominio() {
		return descripcionorigendominio;
	}
	public void setDescripcionorigendominio(String descripcionorigendominio) {
		this.descripcionorigendominio = descripcionorigendominio;
	}
	public String getSimonumentoHistorico() {
		return simonumentoHistorico;
	}
	public void setSimonumentoHistorico(String simonumentoHistorico) {
		this.simonumentoHistorico = simonumentoHistorico;
	}
	
	
}
