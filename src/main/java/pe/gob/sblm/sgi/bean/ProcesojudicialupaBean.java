package pe.gob.sblm.sgi.bean;

import java.util.Date;

public class ProcesojudicialupaBean {
   private int idprocesojudicialupa;
   private int idupa;
   private String expediente;
   private String motivo;
   private String situacion;
   private String estado;
   private Boolean sifinalizado;
   private Boolean sidocumento;
   private String observacion;
   private String usrcre;
   private Date feccre;
   private String usrmod;
   private Date fecmod;
   
public int getIdprocesojudicialupa() {
	return idprocesojudicialupa;
}
public void setIdprocesojudicialupa(int idprocesojudicialupa) {
	this.idprocesojudicialupa = idprocesojudicialupa;
}
public int getIdupa() {
	return idupa;
}
public void setIdupa(int idupa) {
	this.idupa = idupa;
}
public String getExpediente() {
	return expediente;
}
public void setExpediente(String expediente) {
	this.expediente = expediente;
}

public String getObservacion() {
	return observacion;
}
public void setObservacion(String observacion) {
	this.observacion = observacion;
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
public String getMotivo() {
	return motivo;
}
public void setMotivo(String motivo) {
	this.motivo = motivo;
}
public String getSituacion() {
	return situacion;
}
public void setSituacion(String situacion) {
	this.situacion = situacion;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public Boolean getSifinalizado() {
	return sifinalizado;
}
public void setSifinalizado(Boolean sifinalizado) {
	this.sifinalizado = sifinalizado;
}
public Boolean getSidocumento() {
	return sidocumento;
}
public void setSidocumento(Boolean sidocumento) {
	this.sidocumento = sidocumento;
}
    
   
}
