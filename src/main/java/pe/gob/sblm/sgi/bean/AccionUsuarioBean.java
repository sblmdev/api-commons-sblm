package pe.gob.sblm.sgi.bean;

public class AccionUsuarioBean {
	private int idusuario;
	private int idaccion;
	private String nombreAccion;
	private String descripcionAccion;
	private String nombresUsuario;
	private String correoUsuario;;
	
	/**
	 * @return the idusuario
	 */
	public int getIdusuario() {
		return idusuario;
	}
	/**
	 * @param idusuario the idusuario to set
	 */
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	/**
	 * @return the idaccion
	 */
	public int getIdaccion() {
		return idaccion;
	}
	/**
	 * @param idaccion the idaccion to set
	 */
	public void setIdaccion(int idaccion) {
		this.idaccion = idaccion;
	}
	/**
	 * @return the descripcionAccion
	 */
	public String getDescripcionAccion() {
		return descripcionAccion;
	}
	/**
	 * @param descripcionAccion the descripcionAccion to set
	 */
	public void setDescripcionAccion(String descripcionAccion) {
		this.descripcionAccion = descripcionAccion;
	}
	/**
	 * @return the nombresUsuario
	 */
	public String getNombresUsuario() {
		return nombresUsuario;
	}
	/**
	 * @param nombresUsuario the nombresUsuario to set
	 */
	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}
	/**
	 * @return the correoUsuario
	 */
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	/**
	 * @param correoUsuario the correoUsuario to set
	 */
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	/**
	 * @return the nombreAccion
	 */
	public String getNombreAccion() {
		return nombreAccion;
	}
	/**
	 * @param nombreAccion the nombreAccion to set
	 */
	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}

}
