package pe.gob.sblm.sgi.bean;

/**
* Resumen.
* Objeto : DetallecomprobanteBean
* Descripci�n : POJO para almacenar los datos del detalle del comprobante
* Fecha de Creaci�n : 10/02/2014.
* Autor : Franco Mallqui
* ------------------------------------------------------------------------
* Modificaciones
* Fecha            Nombre                     Descripci�n
* ------------------------------------------------------------------------
* 
*/
public class DetallecomprobanteBean {
	private int iddetallecomprobante;
	private String mes;
	private int anio;
	private Double subtotal;
	private Double total;
	private Double mora;
	private int periodo;
	private int indicador;
	private Integer id_maedcondiciondetalle;
	private Integer numerocuotas;
	private String idtipoconcepto;
	private Double penalidad;
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(	int periodo) {
		this.periodo = periodo;
	}
	public int getIddetallecomprobante() {
		return iddetallecomprobante;
	}
	public void setIddetallecomprobante(int iddetallecomprobante) {
		this.iddetallecomprobante = iddetallecomprobante;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getMora() {
		return mora;
	}
	public void setMora(Double mora) {
		this.mora = mora;
	}
	public int getIndicador() {
		return indicador;
	}
	public void setIndicador(int indicador) {
		this.indicador = indicador;
	}
	public Integer getId_maedcondiciondetalle() {
		return id_maedcondiciondetalle;
	}
	public void setId_maedcondiciondetalle(Integer id_maedcondiciondetalle) {
		this.id_maedcondiciondetalle = id_maedcondiciondetalle;
	}
	public Integer getNumerocuotas() {
		return numerocuotas;
	}
	public void setNumerocuotas(Integer numerocuotas) {
		this.numerocuotas = numerocuotas;
	}
	public String getIdtipoconcepto() {
		return idtipoconcepto;
	}
	public void setIdtipoconcepto(String idtipoconcepto) {
		this.idtipoconcepto = idtipoconcepto;
	}
	public Double getPenalidad() {
		return penalidad;
	}
	public void setPenalidad(Double penalidad) {
		this.penalidad = penalidad;
	}

    

	
	
}
