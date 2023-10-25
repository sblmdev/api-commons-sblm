package pe.gob.sblm.sgi.bean;

import java.util.Date;

public class ArchivoAdjuntoBean {
	private int idarchivoadjunto;
	private String nombre;
	private String uuidSftp;
	private String uuidAlfresco;
	private String tipo;
	private Integer peso;
	private String titulo;
	private String descripcion;
	private String observacion;
	private String ruta;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private byte[] stream;
	
	
	public int getIdarchivoadjunto() {
		return idarchivoadjunto;
	}
	public void setIdarchivoadjunto(int idarchivoadjunto) {
		this.idarchivoadjunto = idarchivoadjunto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
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

	public byte[] getStream() {
		return stream;
	}
	public void setStream(byte[] stream) {
		this.stream = stream;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getUuidSftp() {
		return uuidSftp;
	}
	public void setUuidSftp(String uuidSftp) {
		this.uuidSftp = uuidSftp;
	}
	public String getUuidAlfresco() {
		return uuidAlfresco;
	}
	public void setUuidAlfresco(String uuidAlfresco) {
		this.uuidAlfresco = uuidAlfresco;
	}
	public String getNombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
}
