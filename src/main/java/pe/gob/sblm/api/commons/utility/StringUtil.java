package pe.gob.sblm.api.commons.utility;

import java.io.Serializable;

/**
 * @objetivo: Implementar la clase StringUtil
 * @autor: cvallejos
 * @fecha: 22/07/2016
 **/
public class StringUtil implements Serializable{
	private static final long serialVersionUID = 1L;

	public static String completarCerosIzquierda(int longitud, int numero) {
		try {
			StringBuffer formato = new StringBuffer();
			formato.append("%0");
			formato.append(longitud);
			formato.append("d");
			return String.format(formato.toString(), numero);
		}catch(Exception ex){
			return null;
		}
	}

	public static String completarCerosIzquierda(int longitud, String numero) {
		try {
			StringBuffer formato = new StringBuffer();
			if( !ValidarUtil.isNullOrEmpty( numero ) ){
				int c = numero.trim().length();
				while( c < longitud){
					formato.append("0");
					c++;
				}
				formato.append(numero);
			}else{
				formato.append("");
			}

			return formato.toString();
		}catch(Exception ex){
			return null;
		}
	}

	public static String toUpper( String obj ){
		String resultado = null;
		if( obj != null && obj.trim().length()>0 ){
			resultado = obj.trim().toUpperCase();
		}
		return resultado;
	}



}