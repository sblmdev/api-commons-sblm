package pe.gob.sblm.api.commons.utility;

public class CorreoUtil {
	
	public static String obtenerPlantillaContenidoCorreoNotificacion(String nombreDestino){
		
		 String htmlText ="<!DOCTYPE html>"
       		 +"<html>"
       		 +"<head>"
       		 +"<title>Page Title</title>"
       		 +"</head>"
       		 +"<body>"
       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' style='font-family: Arial, Helvetica, sans-serif; font-weight: 100; background-color: #fff; padding: 0 14px'>"
       		 +"<tbody>"
       		 +"<tr >"
       		 +"<td >"
       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' >"
       		 +"<tbody>"
       		 +"<tr>"
       		 +"<td ><a href='https://beneficenciadelima.org/public/' style='margin-bottom: 10px' target='_blank' data-saferedirecturl='https://beneficenciadelima.org/public/'><img src='https://www.beneficenciadelima.org/public/images/logo.png'></a>"
       		 +"</td>"
       		 +"</tr>"
       		 +"<tr>"
       		 +"<td align='right'>"
       		 +"<p style='width: 540px; margin: 25px 10px 0 0; font-size: 32px; font-weight: bold; color: #333; border-width: 0 0 4px 0; border-color: #e8e8e8; border-style: solid; padding-right: 5px'>Notificación Electrónica</p>"
       		 +"</td>"
       		 +"</tr>"
       		 +"</tbody>"
       		 +"</table>"
       		 +"</td>"
       		 +"</tr>"
       		 +"<tr>"
       		 +"<td>"
       		 +"<table width='720' border='0' align='center' cellpadding='0' cellspacing='0' >"
       		 +"<tbody>"
       		 +"<tr >"
       		 +"<td align='left' >"
       		 +"<p style='margin-top: 20px; font-size: 14px; color: #333; padding: 20px 0'>"
       		 +"<span style='font-weight: bold; font-size: 16px'> Hola,&nbsp;"+nombreDestino+" </span>"
       		 +"</p>"
//       		 +"<div class='m_-2270994237225827650paragraph1 gmail_msg'>¡Usted ha recibido un reporte!.<b > Recuerda que podrás hacer SEGUIMIENTO DE LA NOTIFICACIÓN DANDO CLIC EN EL SIGUIENTE ENLACE<a href='"+url+"' target='_blank' data-saferedirecturl='"+url+"'>ABRIR</a>"
       		 +"</b> Si tienes alguna duda o inconveniente, por favor llámanos al ."
       		 +"</div>"
       		 +"</td>"
       		 +"</tr>"
       		 +"</tbody>"
       		 +"</table>"
       		 +"</td>"
       		 +"</tr>"
       		 +"</tbody>"
       		 +"</table>"
       		 +"</body>"
       		 +"</html>";
		 
		 return htmlText;

		
	}
	
	
	public static String obtenerPlantillaContenidoCorreoNotificacion(String nombreDestino, String mensaje,String url){
		
		
		 String htmlText ="<!DOCTYPE html>"
	       		 +"<html>"
	       		 +"<head>"
	       		 +"<title>Page Title</title>"
	       		 +"</head>"
	       		 +"<body>"
	       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' style='font-family: Arial, Helvetica, sans-serif; font-weight: 100; background-color: #fff; padding: 0 14px'>"
	       		 +"<tbody>"
	       		 +"<tr >"
	       		 +"<td >"
	       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' >"
	       		 +"<tbody>"
	       		 +"<tr>"
	       		 +"<td ><a href='https://beneficenciadelima.org/public/' style='margin-bottom: 10px' target='_blank' data-saferedirecturl='https://beneficenciadelima.org/public/'><img src='https://www.beneficenciadelima.org/public/images/logo.png'></a>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"<tr>"
	       		 +"<td align='right'>"
	       		 +"<p style='width: 540px; margin: 25px 10px 0 0; font-size: 32px; font-weight: bold; color: #333; border-width: 0 0 4px 0; border-color: #e8e8e8; border-style: solid; padding-right: 5px'>Notificación Electrónica</p>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"<tr>"
	       		 +"<td>"
	       		 +"<table width='720' border='0' align='center' cellpadding='0' cellspacing='0' >"
	       		 +"<tbody>"
	       		 +"<tr >"
	       		 +"<td align='left' >"
	       		 +"<p style='margin-top: 20px; font-size: 14px; color: #333; padding: 20px 0'>"
	       		 +"<span style='font-weight: bold; font-size: 16px'> Hola,&nbsp;"+nombreDestino+" </span>"
	       		 +"</p>"
	       		 +"<div class='m_-2270994237225827650paragraph1 gmail_msg'><b >El Sistema de Gestión Inmobiliaria "+mensaje
	       		 +"</b> <a href='"+url+"' target='_blank' data-saferedirecturl='"+url+"'>ABRIR</a><br/> Si tiene alguna duda o inconveniente, por favor comunicarse con el área de indicada."
	       		 +"</div>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</body>"
	       		 +"</html>";
			 
			 return htmlText;
	}
	
	public static String obtenerPlantillaContenidoCorreoNotificacion(String nombreDestino, String mensaje){
		
		
		 String htmlText ="<!DOCTYPE html>"
	       		 +"<html>"
	       		 +"<head>"
	       		 +"<title>Page Title</title>"
	       		 +"</head>"
	       		 +"<body>"
	       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' style='font-family: Arial, Helvetica, sans-serif; font-weight: 100; background-color: #fff; padding: 0 14px'>"
	       		 +"<tbody>"
	       		 +"<tr >"
	       		 +"<td >"
	       		 +"<table width='auto' border='0' align='center' cellpadding='0' cellspacing='0' >"
	       		 +"<tbody>"
	       		 +"<tr>"
	       		 +"<td ><a href='https://www.beneficenciadelima.org/public/' style='margin-bottom: 10px' target='_blank' data-saferedirecturl='http://www.sblm.gob.pe'><img src='https://www.beneficenciadelima.org/public/images/logo.png'></a>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"<tr>"
	       		 +"<td align='right'>"
	       		 +"<p style='width: 540px; margin: 25px 10px 0 0; font-size: 32px; font-weight: bold; color: #333; border-width: 0 0 4px 0; border-color: #e8e8e8; border-style: solid; padding-right: 5px'>Notificación Electrónica</p>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"<tr>"
	       		 +"<td>"
	       		 +"<table width='720' border='0' align='center' cellpadding='0' cellspacing='0' >"
	       		 +"<tbody>"
	       		 +"<tr >"
	       		 +"<td align='left' >"
	       		 +"<p style='margin-top: 20px; font-size: 14px; color: #333; padding: 20px 0'>"
	       		 +"<span style='font-weight: bold; font-size: 16px'> Hola,&nbsp;"+nombreDestino+" </span>"
	       		 +"</p>"
	       		 +"<div class='m_-2270994237225827650paragraph1 gmail_msg'><b >El Sistema de Gestión Inmobiliaria "+mensaje
	       		 +"</b><br/> Si tiene alguna duda o inconveniente, por favor comunicarse con el área de indicada."
	       		 +"</div>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</td>"
	       		 +"</tr>"
	       		 +"</tbody>"
	       		 +"</table>"
	       		 +"</body>"
	       		 +"</html>";
			 
			 return htmlText;
	}

}
