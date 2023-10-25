package pe.gob.sblm.api.commons.utility;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import pe.gob.sblm.api.commons.constants.sgi.Constantes;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;



public class CommonsUtilities {

	public static String getRemoteIpAddress(){
		String strIp = null;
		if(null != FacesContext.getCurrentInstance()){
			HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
			if(null != request){
				strIp  = request.getRemoteAddr();
			}
		}
		
		if(null == strIp){
			strIp = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getRemoteAddr();
		}
		 return strIp;
	}
	public static String getRemoteHostName(){
		String strhostname = null;
		if(null != FacesContext.getCurrentInstance()){
			HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
			if(null != request){
				strhostname  = request.getRemoteHost();
			}
		}
		
		if(null == strhostname){
			strhostname = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getRemoteHost();
		}
		 return strhostname;
	}
	public static HttpServletRequest getRequest() {
		  RequestAttributes attribs = RequestContextHolder.getRequestAttributes();
		  if (attribs instanceof ServletRequestAttributes) {
		    HttpServletRequest request = ((ServletRequestAttributes)attribs).getRequest();
		    return request;
		  }
		  return null;
		}
	public static String getHostNameIp() {
		  String remoteAddr = "";
		  HttpServletRequest request = getRequest();
		  if (request != null) {
		    remoteAddr = request.getHeader("X-FORWARDED-FOR");
		    //remoteAddr = request.getHeader("HOST");
		    if (remoteAddr == null || remoteAddr.trim().isEmpty()) {
		      remoteAddr = request.getRemoteHost();
		    }
		  }
		  return remoteAddr;
		}
	
	public static String hostname(){
	String hostName="";
	Enumeration<NetworkInterface> interfaces;
	try {
		interfaces = NetworkInterface.getNetworkInterfaces();
		  while (interfaces.hasMoreElements()) {
			    NetworkInterface nic = interfaces.nextElement();
			    Enumeration<InetAddress> addresses = nic.getInetAddresses();
			    while (hostName == null && addresses.hasMoreElements()) {
			      InetAddress address = addresses.nextElement();
			      if (!address.isLoopbackAddress()) {
			        hostName = address.getHostName();
			      }
			    }
			  }
	} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	{

	}
	return hostName;
	}
	public static byte[] getByteArray(String pathFile){
		
		InputStream stream = null;
		try {
		
		stream = new FileInputStream(pathFile);

		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] content = new byte[ 2048 ];
		int bytesRead = -1;
		try {
		while( ( bytesRead = stream.read( content ) ) != -1 ) {
		baos.write( content, 0, bytesRead );
		}
		} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		try {
		stream.close();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
		
		return baos.toByteArray();
	}
	
	public static String getRealPath(){
		
		ServletContext ctx = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		return ctx.getRealPath("/");
	}
	
	public static String obtenerRutaEntidad(String entidad){
		
		if (entidad.equals(Constantes.CONDICION_SGI)) {
			
			return Constantes.DIR_CONDICION_SGI;
		}else if (entidad.equals(Constantes.INMUEBLE_SGI)) {
			
			return Constantes.DIR_INMUEBLE_SGI;
		}else if (entidad.equals(Constantes.UPA_SGI)) {
			
			return Constantes.DIR_UPA_SGI;
		}else if (entidad.equals(Constantes.CONDICION_SGI)) {
			
			return Constantes.DIR_CONDICION_SGI;
		}else {
			
			return "";
		}
	}
}
