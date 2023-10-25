package pe.gob.sblm.api.commons.constants.sgi;

import java.io.File;
import java.io.Serializable;

public class ConstantesReporteSGI implements Serializable {
	
	private static final long serialVersionUID = 5016964361609493799L;

	public static final String REPORT_PATH											= new StringBuilder("reportes").append(File.separator).toString();
	public static final String REP_LIQUIDACION_RATIO_MORA 							= new StringBuilder("RECAUDACION_REP_LIQUIDACION_RATIO.jrxml").toString();
	public static final String REP_LIQUIDACION_RATIO_ARBITRIO 			   		    = new StringBuilder("RECAUDACION_REP_LIQUIDACION_RATIO_ARBITRIO.jrxml").toString();
	public static final String REP_LIQUIDACION_CANCELADAS 							= new StringBuilder("RECAUDACION_REP_LIQUIDACION_CANCELADAS.jrxml").toString();
	public static final String REP_ARBITRIO_CANCELADOS 					    		= new StringBuilder("RECAUDACION_REP_ARBITRIO_CANCELADOS.jrxml").toString();
	public static final String REP_LIQUIDACION_PENDIENTES 							= new StringBuilder("RECAUDACION_REP_LIQUIDACION_PENDIENTES.jrxml").toString();
	public static final String REP_LIQUIDACION_PENDIENTES_CANCELADAS 				= new StringBuilder("RECAUDACION_REP_LIQUIDACION_PENDIENTES_CANCELADAS.jrxml").toString();
	public static final String REP_LIQUIDACION_COBRO_COBRADOR 						= new StringBuilder("RECAUDACION_REP_LIQUIDACION_COBRO.jrxml").toString();
	public static final String REP_LIQUIDACION_COBRO_COBRADOR_DETALLADO 			= new StringBuilder("RECAUDACION_REP_LIQUIDACION_COBRO_DETALLADO.jrxml").toString();
	public static final String REP_LIQUIDACION_COBRO_COBRADOR_DETALLADO_ESPECIAL 	= new StringBuilder("RECAUDACION_REP_LIQUIDACION_COBRO_DETALLADO_ESPECIAL.jrxml").toString();
	public static final String REP_EXTINCION_DE_DEUDA_DOC_ADMINISTRATIVO 			= new StringBuilder("RECAUDACION_REP_EXTINCION_DE_DEUDA_DOC_ADMINISTRATIVO.jrxml").toString();
	public static final String REP_EXTINCION_DE_DEUDA_DOC_ADM_INDIVIDUAL 			= new StringBuilder("RECAUDACION_REP_EXTINCION_DE_DEUDA_DOC_ADMINISTRATIVO_INDIVIDUAL.jrxml").toString();
	public static final String REP_COBRO_CARTERA_ACTIVA 							= new StringBuilder("RECAUDACION_REP_COBRO_CARTERA_ACTIVA.jrxml").toString();
	public static final String REP_COBRO_INTERV_PENDIENTES_CARTERA_ACTIVA 			= new StringBuilder("RECAUDACION_REP_COBRO_INTERVALO_PENDIENTES_CARTERA_ACTIVA.jrxml").toString();	
	public static final String REP_DEUDA_TOTAL_CARTERA_ACTIVA						= new StringBuilder("RECAUDACION_REP_DEUDA_TOTAL_CARTERA_ACTIVA.jrxml").toString();	
	
	public static final String REP_COBRO_DETALLADO_CONDICION_CARTERA_ACTIVA				= new StringBuilder("RECAUDACION_REP_COBRO_DET_CONDICION_CARTERA_ACTIVA.jrxml").toString();	
	
	/**Arrendamiento**/
	public static final String REP_CONTRATOS_VIGENTES 				= new StringBuilder("ARRENDAMIENTO_REP_CONTRATOS_VIGENTES.jrxml").toString();
	public static final String REP_CONTRATOS_FINALIZADOS 			= new StringBuilder("ARRENDAMIENTO_REP_CONTRATOS_FINALIZADOS.jrxml").toString();
	public static final String REP_PRECONTRATOS_VIGENTES 			= new StringBuilder("ARRENDAMIENTO_REP_PRECONTRATOS_VIGENTES.jrxml").toString();
	public static final String REP_SIN_CONTRATOS_VIGENTES 			= new StringBuilder("ARRENDAMIENTO_REP_SIN_CONTRATOS_VIGENTES.jrxml").toString();	
	public static final String REP_CONTRATOS_GLOBAL 			    = new StringBuilder("ARRENDAMIENTO_REP_CONTRATOS_GLOBAL.jrxml").toString();
	/**Autovaluo Arbitrio*/
	public static final String REP_ARBITRIOS_PENDIENTES				= new StringBuilder("AUTOVALUO_REP_PENDIENTES.jrxml").toString();
	public static final String REP_ARBITRIOS_CANCELADOS				= new StringBuilder("AUTOVALUO_REP_CANCELADOS.jrxml").toString();
    /**Inmueble SGI*/
	public static final String REP_INMUEBLE							= new StringBuilder("INMUEBLE_MATRIZ_REP.jrxml").toString();
	/**Reporte de Detraccion*/
	public static final String REP_DETRACCION						= new StringBuilder("RECAUDACION_REP_DETRACCION.jrxml").toString();
	public static final String REP_AUTODETRACCION					= new StringBuilder("RECAUDACION_REP_AUTODETRACCION.jrxml").toString();
	/**Reporte Consulta Usuario-Cobrador*/
	public static final String REP_CONSULTA_COMPROBANTE_PAGO		= new StringBuilder("RECAUDACION_REP_COMPROBANTE_DE_PAGO_DETALLADO.jrxml").toString();
	
    /**Reporte de recibo de caja */
	public static final String REP_RECIBO_CAJA_SGI                  = new StringBuilder("RECIBO_CAJA_SGI.jrxml").toString();

}
