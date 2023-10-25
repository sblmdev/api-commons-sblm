package pe.gob.sblm.api.commons.constants.sgi;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Constantes implements Serializable {
	
	private static final long serialVersionUID = 5016964361609493799L;
	
	public static final String APLICATIVO_SGI 							= "SGI";
	
	
	public static final String EMPTY = "";
	public static final String EXTENSION_FORMATO_PDF 					= ".pdf";
	public static final String EXTENSION_FORMATO_XLS 					= ".xls";
	public static final String EXTENSION_FORMATO_XLSX 					= ".xlsx";
	public static final String EXTENSION_FORMATO_DOC 					= ".doc";
	public static final String EXTENSION_FORMATO_DOCX 					= ".docx";
	public static final String EXTENSION_FORMATO_PPT 					= ".ppt";
	public static final String EXTENSION_FORMATO_PPTX 					= ".pptx";
	public static final String EXTENSION_FORMATO_AVI 					= ".avi";
	public static final String EXTENSION_FORMATO_MP3 					= ".mp3";
	public static final String EXTENSION_FORMATO_ZIP 					= ".zip";
	public static final String EXTENSION_FORMATO_GIF 					= ".gif";
	public static final String EXTENSION_FORMATO_PNG 					= ".png";
	public static final String EXTENSION_FORMATO_JPG 					= ".jpg";
	public static final String EXTENSION_FORMATO_DBF 					= ".dbf";
	
	public static final String APPLICATION_PDF 							= "application/pdf";
	public static final String APPLICATION_XLS 							= "application/vnd.ms-excel";
	//public static final String APPLICATION_XLSX 						= "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	public static final String APPLICATION_XLSX 						= "application/msexcel";
	public static final String APPLICATION_DOC 							= "application/msword";
	public static final String APPLICATION_DOCX 						= "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
	public static final String APPLICATION_PPT							= "application/vnd.ms-powerpointtd>";
	public static final String APPLICATION_PPTX 						= "application/vnd.openxmlformats-officedocument.presentationml.presentation";
	public static final String APPLICATION_AVI 							= "video/msvideo, video/avi, video/x-msvideo";
	public static final String APPLICATION_MP3							= "audio/mpeg";
	public static final String APPLICATION_ZIP 							= "application/zip, application/x-compressed-zip";
	public static final String APPLICATION_GIF 							= "image/gif";
	public static final String APPLICATION_PNG 							= "image/png";
	public static final String APPLICATION_JPG 							= "image/jpeg";
	public static final String APPLICATION_DBF 							= "application/dbf";
	
	public static final String PDF = "pdf";
	public static final String XLS = "xls";
	
	/** Acciones **/	
	public static final String ACCION_CREAR_CONTRATO 						= "Nuevo Contrato";
	public static final String ACCION_CREAR_SIN_CONTRATO 					= "Nuevo Sin Contrato";
	public static final String ACCION_CREAR_PRE_CONTRATO 					= "Nuevo Precontrato";
	public static final String ACCION_CREAR_RECONOCIMIENTO_DEUDA     		= "Nuevo Reconocimiemto de Deuda";
	public static final String ACCION_ACTUALIZAR_CONTRATO 					= "Contrato Actualizado";
	public static final String ACCION_ACTUALIZAR_SIN_CONTRATO 				= "Sin Contrato Actualizado";
	public static final String ACCION_ACTUALIZAR_PRE_CONTRATO 				= "Precontrato Actualizado";
	public static final String ACCION_ACTUALIZAR_RECONOCIMIENTO_DEUDA		= "Reconocimiento de Deuda Actualizado";
	public static final String ACCION_ELIMINAR_CONTRATO 					= "Contrato Eliminado";
	public static final String ACCION_ELIMINAR_SIN_CONTRATO 				= "Sin Contrato Eliminado";
	public static final String ACCION_ELIMINAR_PRE_CONTRATO 				= "Precontrato Eliminado";
	public static final String ACCION_ELIMINAR_RECONOCIMIENTO_DEUDA			= "Reconocimiento de Deuda Eliminado";
	
	
	public static final String CORREO_SGI 									= "sistemasgi@sblm.gob.pe";
	
	
	

	
	public static final String MSG_TITULO_ERROR_VALIDACION					= "Error de validación";
	public static final String MSG_TITULO_EXITO								= "Éxito";
	
	/**INQUILINO**/
	public static final Integer TIPO_PERSONA_NATURAL						= 1;
	public static final Integer TIPO_PERSONA_JURIDICA						= 2;
	public static final String  TIPO_PERSONA_1                              ="NATURAL";
	public static final String  TIPO_PERSONA_2                              ="JURIDICA";
	public static final String 	ESTADO_INQUILINO_1                     		="ACTIVO";
	public static final String 	ESTADO_INQUILINO_2                     		="ANULADO";
	
	
	/**BUSQUEDA**/
	public static final String BUSQUEDA_DIRECCION							= "direccion";
	public static final String BUSQUEDA_CLAVE								= "clave";
	public static final String BUSQUEDA_DNI									= "dni";
	public static final String BUSQUEDA_RUC									= "ruc";
	public static final String BUSQUEDA_NOMBRES_RAZONSOCIAL					= "nombresRazonSocial";
	
	/** CONDICIONES **/
	public static final String CONDICION_ESTADO_FINALIZADO					= "FINALIZADO";
	public static final String CONDICION_ESTADO_VIGENTE						= "VIGENTE";
	public static final String CONDICION_ESTADO_PENDIENTE					= "PENDIENTE";
	
	
	/** TIPO DE CONTRATO **/
	public static final String CONTRATO_TIPO_ALQUILER						= "Alquiler";
	public static final String CONTRATO_TIPO_SUPERFICIE						= "Usufructo";
	public static final String CONTRATO_TIPO_USUFRUCTO						= "Usufructo";
	public static final String CONTRATO_TIPO_CONVENIO						= "Convenio";
	
	public static final String CONDICION_CONTRATO							= "Contrato";
	public static final String CONDICION_SIN_CONTRATO						= "Sin Contrato";
	public static final String CONDICION_PRE_CONTRATO						= "Precontrato";
	public static final String CONDICION_RECONOCIMIENTO_DEUDA				= "Reconocimiento Deuda";
	
	/** CONTRATO **/
	public static final String CONTRATO_TIPO_RENOVACION						= "Renovación";
	public static final String CONTRATO_NUMERO_PENDIENTE					= "Pendiente";
	public static final String CONTRATO_TIPO_CONVOCATORIA_PUBLICA			= "Convocatoria Pública";

	/**CODIGO EN TABLA DE CONFIGURACION DE SERVICIOS**/
	public static final String CODIGO_TABLA_ALFRESCO 						= "TBL_CONF_ALFRESCO";
	public static final String CODIGO_TABLA_EMAIL 							= "TBL_CONF_EMAIL";
	public static final String CODIGO_TABLA_SFTP 							= "TBL_CONF_SFTP";

	
	
	/**PARAMETRO EN TABLA DE CONFIGURACION DE SERVICIOS**/
	public static final String PARAM_CONFIG_USER_ALFRESCO 					= "USER_ALFRESCO";
	public static final String PARAM_CONFIG_PASS_ALFRESCO 					= "PASS_ALFRESCO";
	public static final String PARAM_CONFIG_HOST_ALFRESCO 					= "HOST_ALFRESCO";
	public static final String PARAM_CONFIG_PORT_ALFRESCO 					= "PORT_ALFRESCO";
	public static final String PARAM_CONFIG_ATOMPUB_ALFRESCO 				= "ATOMPUB_ALFRESCO";
	public static final String PARAM_CONFIG_ROOT_ALFRESCO 					= "ROOT_ALFRESCO";

	public static final String PARAM_CONFIG_USER_SFTP 						= "USER_SFTP";
	public static final String PARAM_CONFIG_PASS_SFTP 						= "PASS_SFTP";
	public static final String PARAM_CONFIG_HOST_SFTP 						= "HOST_SFTP";
	public static final String PARAM_CONFIG_PORT_SFTP 						= "PORT_SFTP";
	
	
	

	public static final String ACTIVO 										= "1";
	public static final String INACTIVO 									= "0";
	
	
	
	public static final String DIR_INMUEBLE_SGI 						= "/SGI/Inmueble";
	public static final String DIR_UPA_SGI								= "/SGI/Upa";
	public static final String DIR_CONDICION_SGI						= "/SGI/Condicion";
	
	
	public static final String TAREA_ARRENDAMIENTO_DIFUSION_ESTADO_CONDICIONES		= "TAREA_ARRENDAMIENTO_DIFUSION_ESTADO_CONDICIONES";
	public static final String TAREA_ARRENDAMIENTO_CONTRATO_POR_FINALIZAR			= "TAREA_ARRENDAMIENTO_CONTRATO_POR_FINALIZAR";
	public static final String TAREA_ARRENDAMIENTO_ALERTA_REGISTRO_IPC				= "TAREA_ARRENDAMIENTO_ALERTA_REGISTRO_IPC";
	
	
	public static final String DIR_PRINCIPAL_SGI									= "/SGI";
	public static final String DIR_SGI_RECIBO_CAJA									= "/SGI/ReciboCaja";
	public static final String DIR_REP_INFO_ESTADO_CONDICIONES						= "/SGI/Reportes/Arrendamiento/Reporte Informacion Estado Condiciones";
	public static final String DIR_REP_CONTRATO_POR_VENCER							= "/SGI/Reportes/Arrendamiento/Reporte Contrato Por Vencer";
	
	public static final String NOMBRE_REP_ARRENDAMIENTO_CONTRATO_POR_VENCER			= "ARRENDAMIENTO_CONTRATO_POR_FINALIZAR";
	
	public static final String TITULO_NOTIFICACION_CONTRATO_POR_VENCER				= "Notificación Electrónica - Reporte de contratos por vencer";
	public static final String CONTENIDO_NOTIFICACION_CONTRATO_POR_VENCER			= " de Contratos por vencer.";
	
	
	public static final String TITULO_NOTIFICACION_REGISTRO_IPC 					= "Notificación Electrónica - Alerta registro de IPC";
	public static final String TITULO_CORREO_NOTIFICACION_NUEVO_REPORTE 			= "Notificación Electrónica - Nuevo Reporte";
	
	
	public static final String TITULO_CORREO_NOTIFICACION 					= "Notificación Electronica";
	
	
	public static final String INMUEBLE_SGI								= "Inmueble";
	public static final String UPA_SGI									= "Upa";
	public static final String INQUILINO_GI								= "Inquilino";
	public static final String CONDICION_SGI							= "Condicion";
	public static final String CONTRATO_SGI							    = "Contrato";
	public static final String PRECONTRATO_SGI							= "PreContrato";
	public static final String PROCESOJUDICIALUPA_SGI					= "ProcesoJudicialUpa";
	public static final String RECONOCIMIENTO_DEUDA_SGI					= "Reconocimiento Deuda";
	public static final String SIN_CONTRATO_SGI							= "Sin Contrato";
	public static final String COMPROBANTEPAGO                          = "Comprobantepago";
	
	

	public static final String MONEDA_SOLES							= "S";
	public static final String MONEDA_DOLARES						= "D";
	
	/**Cobranza**/
	public static final String TIPOPAGO_ID_USOCARTAFIANZA			= "05";
	public static final String TIPOPAGO_ID_USOGARANTIA				= "06";
	public static final String TIPOPAGO_ID_EXTINCION_DEUDA			= "07";
	public static final String TIPOPAGO_ID_USO_RESOLUCION_COACTIVA	= "08";
	
	public static final String TIPO_FACTURACION_FISICA				= "Fisica";
	public static final String TIPO_FACTURACION_ELECTRONICA			= "Electronica";
	
	public static final List<Double> ratiosMoraSoles = Arrays.asList(1.017993,1.036309,1.054955,1.073936,1.093259,1.112930,1.132955,1.153339,1.174091,1.195216,1.216721,1.238613);
	public static final List<Double> ratiosMoraDolares = Arrays.asList(1.008360,1.016790,1.025291,1.033862,1.042506,1.051221,1.060009,1.068871,1.077807,1.086818,1.095904,1.105066,1.114304,1.123620,1.133013,1.142486,1.152037,1.161668,1.171380,1.181173,1.191048,1.201005,1.211045,1.221170,1.231379,1.241674,1.252054,1.262522,1.273076,1.283719,1.294452,1.305273,1.316186,1.327189,1.338285,1.349473);

	public static final String MSG_GENERO_ERROR_OPERACION				="Se genero error en operación.";

	
	//PROVISIONAL
	public static String TAREA_ARRENDAMIENTO_GENERAR_SIN_CONTRATO;
	public static String NO_SELECCIONADO="no seleccionado";
	public static final String TABLA_PJU="PROCESOJUDICIALUPA";
	
	// TIPO CONDICION 
	public static String TIPO_CONDICION_MORA      ="01";
	public static String TIPO_CONDICION_PENALIDAD ="02";
	

	
	
}
