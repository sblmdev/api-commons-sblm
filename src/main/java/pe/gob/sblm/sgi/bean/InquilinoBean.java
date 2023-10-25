package pe.gob.sblm.sgi.bean;

import java.io.Serializable;
import java.util.Date;

/**
* Resumen.
* Objeto : InquilinoBean
* Descripci�n : POJO para almacenar los datos de los inquilinos
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class InquilinoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idinquilino;
	private String nombrescompletos;
	private String apellidopat;
	private String apellidomat;
	private String nombre;
	private String razonsocial;
	private String direccion;
	private String dni;
	private String ruc;
	private String carnetextranjeria;
	private String estado;
	private Integer calificacion;
	private Integer idtipopersona;
	private String descripciontipopersona;
	private Boolean sifallecido;
	private Boolean sianulado;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	public int getIdinquilino() {
		return idinquilino;
	}
	public void setIdinquilino(int idinquilino) {
		this.idinquilino = idinquilino;
	}
	public String getNombrescompletos() {
		return nombrescompletos;
	}
	public void setNombrescompletos(String nombrescompletos) {
		this.nombrescompletos = nombrescompletos;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	public Integer getIdtipopersona() {
		return idtipopersona;
	}
	public void setIdtipopersona(Integer idtipopersona) {
		this.idtipopersona = idtipopersona;
	}
	public String getApellidopat() {
		return apellidopat;
	}
	public void setApellidopat(String apellidopat) {
		this.apellidopat = apellidopat;
	}
	public String getApellidomat() {
		return apellidomat;
	}
	public void setApellidomat(String apellidomat) {
		this.apellidomat = apellidomat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarnetextranjeria() {
		return carnetextranjeria;
	}
	public void setCarnetextranjeria(String carnetextranjeria) {
		this.carnetextranjeria = carnetextranjeria;
	}
	public Boolean getSifallecido() {
		return sifallecido;
	}
	public void setSifallecido(Boolean sifallecido) {
		this.sifallecido = sifallecido;
	}
	public Boolean getSianulado() {
		return sianulado;
	}
	public void setSianulado(Boolean sianulado) {
		this.sianulado = sianulado;
	}
	public String getDescripciontipopersona() {
		return descripciontipopersona;
	}
	public void setDescripciontipopersona(String descripciontipopersona) {
		this.descripciontipopersona = descripciontipopersona;
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
	

}
