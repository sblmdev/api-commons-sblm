package pe.gob.sblm.sgi.bean;


/**
* Resumen.
* Objeto : ArbitrioBean
* Descripcion : POJO para almacenar los datos de los arbitrios
* Fecha de Creacion : 10/02/2014.
* Autor : Cindy Vallejos
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class NumeracionComprobantePagoBean {
	
	private int idnumeracioncomprobantepago;
	private String serie;
	private String numero;
	
	
	
	public int getIdnumeracioncomprobantepago() {
		return idnumeracioncomprobantepago;
	}
	public void setIdnumeracioncomprobantepago(int idnumeracioncomprobantepago) {
		this.idnumeracioncomprobantepago = idnumeracioncomprobantepago;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
