package pe.gob.sblm.sgi.bean;

import java.io.Serializable;

/**
 * Resumen.
 * Objecto : ItemBean
 * Descripcion : Pojo genero para cargar combos, autocompletar, etc.
 * Fecha de creacion : 18/12/2014 
 * @author Franco Mallqui
 * ----------------------------------------------------------------
 * Modificaciones.
 * Fecha		Nombre		Descripcion
 * ----------------------------------------------------------------
 *
 */
public class ItemBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String	descripcion;
	private String	descripcionCorta;
	
	public ItemBean(){
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	
	public String toString(){
		return this.descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
