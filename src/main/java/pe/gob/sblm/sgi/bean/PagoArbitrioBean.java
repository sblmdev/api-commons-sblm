package pe.gob.sblm.sgi.bean;

public class PagoArbitrioBean {
private int idcuota;
private int idpagoarbitrio;
private double mc;
private double igv;
private double pagoarbitrio;
private double pagoarbitrioTemp;
private double montopagar;
private String mes;
private Integer periodo;
private String anio;
private double montopagoposterior=0.0;
private String observacionpagoposterior="";
private double montopagofraccionarbitrio=0.0;
private String observacionpagofraccionArbitrio="";
private Integer secuencia;
private boolean sipagogenerado;
private Integer nropagos; //cuantas veces fue pagada
private Integer idcuotaArbitrio;//Pago a que idcuotarbitrio esta referenciada
private double montoacuenta;
private String cancelado;
private int trimestre;
private Double monto;
private int nromes;
private String estado;

public int getIdpagoarbitrio() {
	return idpagoarbitrio;
}
public void setIdpagoarbitrio(int idpagoarbitrio) {
	this.idpagoarbitrio = idpagoarbitrio;
}
public double getMc() {
	return mc;
}
public void setMc(double mc) {
	this.mc = mc;
}
public double getIgv() {
	return igv;
}
public void setIgv(double igv) {
	this.igv = igv;
}
public double getPagoarbitrio() {
	return pagoarbitrio;
}
public void setPagoarbitrio(double pagoarbitrio) {
	this.pagoarbitrio = pagoarbitrio;
}
public double getPagoarbitrioTemp() {
	return pagoarbitrioTemp;
}
public void setPagoarbitrioTemp(double pagoarbitrioTemp) {
	this.pagoarbitrioTemp = pagoarbitrioTemp;
}
public double getMontopagar() {
	return montopagar;
}
public void setMontopagar(double montopagar) {
	this.montopagar = montopagar;
}
public String getMes() {
	return mes;
}
public void setMes(String mes) {
	this.mes = mes;
}
public String getAnio() {
	return anio;
}
public void setAnio(String anio) {
	this.anio = anio;
}
public double getMontopagoposterior() {
	return montopagoposterior;
}
public void setMontopagoposterior(double montopagoposterior) {
	this.montopagoposterior = montopagoposterior;
}
public String getObservacionpagoposterior() {
	return observacionpagoposterior;
}
public void setObservacionpagoposterior(String observacionpagoposterior) {
	this.observacionpagoposterior = observacionpagoposterior;
}
public double getMontopagofraccionarbitrio() {
	return montopagofraccionarbitrio;
}
public void setMontopagofraccionarbitrio(double montopagofraccionarbitrio) {
	this.montopagofraccionarbitrio = montopagofraccionarbitrio;
}
public String getObservacionpagofraccionArbitrio() {
	return observacionpagofraccionArbitrio;
}
public void setObservacionpagofraccionArbitrio(
		String observacionpagofraccionArbitrio) {
	this.observacionpagofraccionArbitrio = observacionpagofraccionArbitrio;
}
public Integer getSecuencia() {
	return secuencia;
}
public void setSecuencia(Integer secuencia) {
	this.secuencia = secuencia;
}
public boolean isSipagogenerado() {
	return sipagogenerado;
}
public void setSipagogenerado(boolean sipagogenerado) {
	this.sipagogenerado = sipagogenerado;
}
public Integer getNropagos() {
	return nropagos;
}
public void setNumeropagos(Integer nropagos) {
	this.nropagos = nropagos;
}
public Integer getIdcuotaArbitrio() {
	return idcuotaArbitrio;
}
public void setIdcuotaArbitrio(Integer idcuotaArbitrio) {
	this.idcuotaArbitrio = idcuotaArbitrio;
}
public double getMontoacuenta() {
	return montoacuenta;
}
public void setMontoacuenta(double montoacuenta) {
	this.montoacuenta = montoacuenta;
}
public String getCancelado() {
	return cancelado;
}
public void setCancelado(String cancelado) {
	this.cancelado = cancelado;
}
public Integer getPeriodo() {
	return periodo;
}
public void setPeriodo(Integer periodo) {
	this.periodo = periodo;
}
public int getIdcuota() {
	return idcuota;
}
public void setIdcuota(int idcuota) {
	this.idcuota = idcuota;
}

public int getTrimestre() {
	return trimestre;
}
public void setTrimestre(int trimestre) {
	this.trimestre = trimestre;
}
public Double getMonto() {
	return monto;
}
public void setMonto(Double monto) {
	this.monto = monto;
}
public int getNromes() {
	return nromes;
}
public void setNromes(int nromes) {
	this.nromes = nromes;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public void setNropagos(Integer nropagos) {
	this.nropagos = nropagos;
}



}
