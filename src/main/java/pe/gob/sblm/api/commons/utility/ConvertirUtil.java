package pe.gob.sblm.api.commons.utility;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2015 Poder Judicial (Lima - Peru)
 * GERENCIA DE INFORMATICA
 * SUB GERENCIA DE  DESARROLLO DE SISTEMAS DE INFORMACION
 * PROYECTO SINOE - WJAV015 - WJAV016: SINOE

 * All rights reserved. Used by permission
 * This software is the confidential and proprietary information of PJ
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with PJ.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/
/**
 * @objetivo: Implementar la clase ConvertirUtil
 * @autor: jhenriquez
 * @fecha: 22/07/2015
 **/
public class ConvertirUtil implements Serializable {
	private static final long serialVersionUID = 4422524386200631631L;

	public static Integer toInteger(String campo){
		if( campo == null || campo.trim().length() < 1 ){
			return 0;
		}else{
			return Integer.parseInt( campo.trim()  );
		}
	}

	public static Integer toInteger(Long campo){
		if( campo == null ){
			return null;
		}else{
			return campo.intValue() ;
		}
	}

	public static short toShort(String campo){
		if( campo == null || campo.trim().length() < 1 ){
			return 0;
		}else{
			return Short.parseShort(campo.trim());
		}
	}

	 public static String toString(Object valor) {
	     String campo = null;
	     if( valor != null ){
	    	 campo = String.valueOf(valor);
	     }

	     return campo;
	 }

	 public static boolean toBoolean(Object valor) {
	     boolean estado = false;
	     if( valor != null ){
	    	 String campo = String.valueOf(valor);
	    	 if( campo != null  && campo.trim().length() > 0 && campo.equals("1")){
	    		 estado = true;
	    	 }
	     }

	     return estado;
	 }

	 public static String toStringOfBooelan(Boolean estado) {
		 String dato = null;
	     if( estado ){
	    	 dato = "1";
	     }else{
	    	 dato = "0";
	     }

	     return dato;
	 }

	public static Long toLong(Object objeto){
		try{
			if( objeto == null ){
				return 0L;
			}else{
				return Long.valueOf( objeto.toString().trim() );
			}
		}catch(Exception e){
			return 0L;
		}
	}

	public static Timestamp toTimestamp(Object objeto){
		try{
			if( objeto == null ){
				return null;
			}else{
				return (Timestamp) objeto;
			}
		}catch(Exception e){
			return null;
		}
	}

	public static Date toDate(Object objeto){
		try{
			if( objeto == null ){
				return null;
			}else{
				return (Date) objeto;
			}
		}catch(Exception e){
			return null;
		}
	}

	public static Timestamp toTimestampOfString(String objeto){
		try{
			if( objeto == null ){
				return null;
			}else{
				Date fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse( objeto );
	    		String fechaString = new SimpleDateFormat("dd/MM/yy").format(fecha);
	    		Date fechaResultado = new SimpleDateFormat("dd/MM/yy").parse(fechaString);

				return new java.sql.Timestamp(fechaResultado.getTime());
			}
		}catch(Exception e){
			return null;
		}
	}

	public static Timestamp toTimestampOfDate(Date fecha){
		try{
			if( fecha == null ){
				return null;
			}else{
				return new Timestamp( fecha.getTime() );
			}
		}catch(Exception e){
			return null;
		}
	}

	public static Long parseLong(String valor){
		try{
			return Long.parseLong(valor);
		}catch(Exception e){
			return 0L;
		}
	}
	
	public static Double parseNegativeNumber(Double number){
	
		return Math.abs(number) * -1;
	}
	
	
	public static Object attributeNotNull(Object object){

		if(null == object){
			throw new NullPointerException("Error: ConvertirUtil.attributeNotNull - El objeto es nulo");
		}

		Method[] metodos = object.getClass().getMethods();

		for(Method metodo : metodos){

			if ((metodo.getName().substring(0, 3).equalsIgnoreCase("get") ||
					metodo.getName().substring(0, 2).equalsIgnoreCase("is")) &&
					!metodo.getName().equals("getClass")) {

				String methodNameSet = "";

				if(metodo.getName().substring(0, 3).equalsIgnoreCase("get")){
					methodNameSet = metodo.getName().replaceFirst("get", "set");
				}else{
					methodNameSet = methodNameSet.replaceFirst("is", "set");
				}

				try {
					Method metodoSet = object.getClass().getMethod(methodNameSet, metodo.getReturnType());

					if (metodoSet != null) {
						//Datos numericos
						//Si es byte
						if (metodo.getReturnType().equals(java.lang.Byte.class)) {
							Byte valor = (Byte)metodo.invoke(object, new Object[0]);
							if(valor==null){
								metodoSet.invoke(object, 0);
							}
						}
						//Si es bigDecimal
						if (metodo.getReturnType().equals(java.math.BigDecimal.class)) {
							BigDecimal valor = (BigDecimal)metodo.invoke(object, new Object[0]);
							if(valor==null){
								metodoSet.invoke(object, new BigDecimal(0));
							}
						}
						// Si es Double
						if (metodo.getReturnType().equals(java.lang.Double.class)) {
							Double valor = (Double)metodo.invoke(object, new Object[0]);
							if(valor==null){
								metodoSet.invoke(object, new Double(0));
							}
						}
						//Si es un string
						if (metodo.getReturnType().equals(java.lang.String.class)) {
							String valor = (String)metodo.invoke(object, new Object[0]);
							if(valor==null){
								metodoSet.invoke(object, "");
							}
						}
						//Si es una lista
						if (metodo.getReturnType().equals(java.util.List.class)) {
							List objetosList = (List)metodo.invoke(object, new Object[0]);
							for(Object objetoFromList:objetosList){
								ConvertirUtil.attributeNotNull(objetoFromList);
							}
						}
						//Si es date
						if (metodo.getReturnType().equals(java.util.Date.class)) {
							Date valor = (Date)metodo.invoke(object, new Object[0]);
							if(valor==null){
								metodoSet.invoke(object, new Date());
							}
						}
						//Si es primitivo
						if (metodo.getReturnType().isPrimitive()) {
							//los primitivos no permiten null
						}
					}
				} catch (Exception e) {
				}
			}
		}

		return object;
	}
	
	

}
