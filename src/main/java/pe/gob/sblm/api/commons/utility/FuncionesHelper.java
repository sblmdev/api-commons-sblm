	package pe.gob.sblm.api.commons.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import pe.gob.sblm.api.commons.constants.sgi.Constantes;
import pe.gob.sblm.sgi.bean.CuotaBean;


public class FuncionesHelper {

	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat dfh = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private static SimpleDateFormat dfH = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static String IMAGENESUSUARIOSPATH= "\\resources\\imagenesusuarios\\";
	
	public static String nombrecompletoUsuario;
	public static int DIASTOLERANCIA=2;
	public final static HashMap<Integer, String> mapNumeroLetras = new HashMap<Integer, String>();
	
	
	static {
		mapNumeroLetras.put(0, "Cero");
		mapNumeroLetras.put(1, "Uno");
		mapNumeroLetras.put(2,"Dos");  
		mapNumeroLetras.put(3,"Tres");
		mapNumeroLetras.put(4,"Cuatro");
		mapNumeroLetras.put(5,"Cinco");
		mapNumeroLetras.put(6,"Seis");
		mapNumeroLetras.put(7,"Siete");
		mapNumeroLetras.put(8,"Ocho");
		mapNumeroLetras.put(9,"Nueve");
		
		mapNumeroLetras.put(10,"Diez");
		mapNumeroLetras.put(11,"Once");
		mapNumeroLetras.put(12,"Doce");
		mapNumeroLetras.put(13,"Trece");
		mapNumeroLetras.put(14,"Catorce");
		mapNumeroLetras.put(15,"Quince");
		mapNumeroLetras.put(16,"Dieciseis");
		mapNumeroLetras.put(17,"Diecisiete");
		mapNumeroLetras.put(18,"Dieciocho");
		mapNumeroLetras.put(19,"Diecinueve");
        
		mapNumeroLetras.put(20,"veinte");
		mapNumeroLetras.put(30,"treinta");
		mapNumeroLetras.put(40,"cuarenta");
		mapNumeroLetras.put(50,"cincuenta");
		mapNumeroLetras.put(60,"sesenta");
		mapNumeroLetras.put(70,"setenta");
		mapNumeroLetras.put(80,"ochenta");
		mapNumeroLetras.put(90,"noventa");
		
		mapNumeroLetras.put(100,"Ciento");
		mapNumeroLetras.put(200,"Doscientos");
		mapNumeroLetras.put(300,"Trescientos");
		mapNumeroLetras.put(400,"Cuatrocientos");
		mapNumeroLetras.put(500,"Quinientos");
		mapNumeroLetras.put(600,"Seicientos");
		mapNumeroLetras.put(700,"Setecientos");
		mapNumeroLetras.put(800,"Ochocientos");
		mapNumeroLetras.put(900,"Novecientos");
		
		mapNumeroLetras.put(1000,"Mil");
		mapNumeroLetras.put(2000,"Dos Mil");
		mapNumeroLetras.put(3000,"Tres Mil");
		mapNumeroLetras.put(4000,"Cuatro Mil");
		mapNumeroLetras.put(5000,"Cinco Mil");
		mapNumeroLetras.put(6000,"Seis Mil");
		mapNumeroLetras.put(7000,"Siete Mil");
		mapNumeroLetras.put(8000,"Ocho Mil");
		mapNumeroLetras.put(9000,"Nuevo Mil");
		mapNumeroLetras.put(10000,"Diez Mil");
		
		mapNumeroLetras.put(21,"ventiuno");
		mapNumeroLetras.put(22,"ventidos");
		mapNumeroLetras.put(23,"ventitres");
		mapNumeroLetras.put(24,"venticuatro"); 
		mapNumeroLetras.put(25,"venticinco");
		mapNumeroLetras.put(26,"ventiseis"); 
		mapNumeroLetras.put(27,"ventisiete");
		mapNumeroLetras.put(28,"ventiocho");
		mapNumeroLetras.put(29,"ventinueve"); 
	
	}
	
	
	public static String agregaCerosIzquierda(String numero,int tamanio) {
		tamanio=tamanio-numero.length();
		for (int i=0; i<tamanio ;i++){
			numero= "0"+numero;
		}
		
		return numero;
	}
	
	public static List<Integer> eliminarDuplicados(List<Integer> list){
	    List<Integer> listSinDuplicados = new ArrayList<Integer>();
	    Set<Integer> set = new LinkedHashSet<Integer>(list);
	    listSinDuplicados.addAll(set);
	    return listSinDuplicados;
	}
	
	
	public static String getFileMasterKey() {
		Calendar instantanea= Calendar.getInstance();
		String key=String.valueOf(instantanea.get(Calendar.YEAR))+instantanea.get(Calendar.MONTH)+instantanea.get(Calendar.DATE)+instantanea.get(Calendar.HOUR)+instantanea.get(Calendar.MINUTE)+instantanea.get(Calendar.SECOND)+instantanea.get(Calendar.MILLISECOND);
		return key;
	}
	
	
	public static String conversor(Double valor){

		String cadena = "";
		int val=valor.intValue();
		

		int contador=String.valueOf(val).length(); 
		while (contador!=0) {
			
			if (contador==1) {
				if (String.valueOf(val).length()==1) {
					cadena=cadena+mapNumeroLetras.get(val%10)+" ";
				} else {
					if (val%10!=0) {
						cadena=cadena+"y "+mapNumeroLetras.get(val%10)+" ";
					}
				}
				
			} else {
				if (contador==2) {
					cadena=cadena+mapNumeroLetras.get(((val%100)/10)*10)+" ";
				} else {
					if (contador==3) {
						cadena=cadena+mapNumeroLetras.get((val/100)*100)+" ";
					} else {
						if (contador==4) {
							if (val/1000==1) {
								cadena=cadena+" Mil ";
							} else {
								cadena=cadena+mapNumeroLetras.get((val/1000))+" Mil ";	
							}
							
							val=val%1000;
						} else {
							if (contador==5) {
								
							}

						}

					}
				}	
			}
			contador--;
		}
		return   cadena;
		
	}

	public static double redondear( Double numero, int decimales ) {
		
		String value=String.valueOf(numero);
		value=value.replaceAll("499999999", "5");
		numero=Double.valueOf(value);
	
		return new BigDecimal(numero.toString()).setScale(decimales,RoundingMode.HALF_UP).doubleValue();
		//return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
	}
	/* Redondear numero 04/03/2019*/
	public static double redondearNum(double numero,int digitos)
	{     
		 String valor = numero+"";
	     BigDecimal big = new BigDecimal(valor);
	     big = big.setScale(digitos, RoundingMode.HALF_UP);
	     return Double.parseDouble((big.toString()));
	}
	/* Convertir BigDecimal a double 05/03/2019*/
	public static double convertirDouble(BigDecimal numero){
		double num=0.0;
		num=Double.parseDouble(numero.toString());
		return num;
	}

	public static BigDecimal convertirBigDecimal(Double numero){
		BigDecimal num = new BigDecimal("0.0");
		num.setScale (2,RoundingMode.HALF_UP); // Lanza ArithmeticException
		num=BigDecimal.valueOf(numero);
		return num;
	}
	public static Double sumarDouble(Double numero1,Double numero2){
		BigDecimal sum = new BigDecimal("0.0");
		sum.setScale (2,RoundingMode.HALF_UP);
		sum=convertirBigDecimal(numero1);
		sum=sum.add(convertirBigDecimal(numero2));
		return convertirDouble(sum);
	}
	public static Double restarDouble(Double numero1,Double numero2){
		BigDecimal sum = new BigDecimal("0.0");
		sum.setScale (2,RoundingMode.HALF_UP);
		sum=sum.add(convertirBigDecimal(numero1));
		sum=sum.subtract(convertirBigDecimal(numero2));
		return convertirDouble(sum);
	}
	public int obtenerUltimoDiaMes (int anio, int mes) {
		 
		Calendar cal=Calendar.getInstance();
		cal.set(anio, mes-1, 1);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		}
	/*CINDY 29/08/2016*/
	public static BigDecimal Dividir( BigDecimal numero, int decimales ) {

		        // create 3 BigDecimal objects
		        BigDecimal bg2, mc;

		        
		        bg2 = new BigDecimal("1.18");

		        // divide numero with bg2 with 2 scale
			mc = numero.divide(bg2, 2, RoundingMode.CEILING);
			return mc;

		}


	public static Integer getValEntero(Boolean valor) {
        Integer activo=0;
        if (valor){
        	activo=1;
        }
    	return activo;
    }
	
	public static String notNullFechaHora(Date fecha){
		if (fecha == null){
			return "NULL";
		}else{
			return "'"+fechaHoraToString(fecha)+"'";
		}
	}
	
	public static int obtenerAnio(Date date){
	
			if (null == date){
	
				return 0;
	
			}
			else{
	
				String formato="yyyy";
				SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
			
				return Integer.parseInt(dateFormat.format(date));
	
			}

		}
	

	public static int obtenerMes(Date date){

			if (null == date){
	
			return 0;
	
			}
			else{
	
			String formato="MM";
			SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
			return Integer.parseInt(dateFormat.format(date));
	
			}

		}
		
	public static int obtenerDia(Date date){

			if (null == date){

			return 0;

			}
			else{

			String formato="dd";
			SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
			return Integer.parseInt(dateFormat.format(date));

			}

		}
	/**
	 * Devuelve los días entre 2 fechas
	 */
	public static long diasEntreDosFechas(Date fechaDesde, Date fechaHasta){
	     long startTime = fechaDesde.getTime() ;
	     long endTime = fechaHasta.getTime();
	     long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
	     long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
	     long dias = diasHasta - diasDesde;

	     return dias;
	}
	public static Date ponerDiasFechaFinMes(Date fecha){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); 
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }
	public static Date ponerDiasFechaInicioAnio(Date fecha){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.set(Calendar.DAY_OF_YEAR, 1); 
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

     }
	public  static Date ponerDiasFechaInicio(Date fecha,int dias){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
       // calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH)); 
        calendar.add(Calendar.DAY_OF_YEAR,dias);
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }
	public static Date sumarRestarAnios(Date fecha, int anios){
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.YEAR, anios);
		return calendar.getTime();
	}
	public static String fechaHORAtoString(Date fecha){
		
		return dfH.format(fecha);
	}
	
	public static String fechaHoraToString(Date fecha){
		return dfh.format(fecha);
	}
	
	public static String fechaToString(Date fecha){
		return df.format(fecha);
	}
	
	public static String getTerminal(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		return request.getRemoteAddr().toString();
	}
	
	public static Object getUsuario(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Object segUsu = (Object) request.getSession().getAttribute("usuario");
		return segUsu;
	}
	public static Object getPerfil(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Object segPerfil = (Object) request.getSession().getAttribute("perfil");
		return segPerfil;
	}
	public static Object getTipoCambio(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Object segTipoCambio = (Object) request.getSession().getAttribute("tipocambio");
		return segTipoCambio;
	}

	public static String getURL(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		StringBuffer 	requestURL=request.getRequestURL();
		String queryString = request.getQueryString();
		
		  if (queryString == null) {
		        return requestURL.toString();
		    } else {
		        return requestURL.append('?').append(queryString).toString();
		    }
		
		
	}
	
	public static String eliminarEspacios(String cadenaConEspacios) {
	    StringTokenizer tokenizer = new StringTokenizer(cadenaConEspacios);
	    StringBuilder cadenaSinEspacios = new StringBuilder();
	 
	    while(tokenizer.hasMoreTokens()){
	        cadenaSinEspacios.append(tokenizer.nextToken());
	    }
	 
	    return cadenaSinEspacios.toString();
	}
    public static Date convertirCadenaFecha(String fecha){
    	
    	Date dataFormateada= null;
		try {
			dataFormateada = df.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dataFormateada;
    }

	
	public static String numeroaLetra(double numero){
		 String ImpLetra;
		 int lnEntero;
		 String lcRetorno ;
		 int lnTerna;
		 String lcMiles ;
		 String lcCadena ;
		 int lnUnidades ;
		 int lnDecenas ;
		 int lnCentenas ;
		 int lnFraccion ;
		 lnEntero = (int)numero;
		 lnFraccion = (int)redondearNum((redondearNum((numero - lnEntero),2)*100),2);
		 lcRetorno = "";
		 lnTerna = 1;
		 while(lnEntero > 0){
			  lcCadena = "";
		      lnUnidades = lnEntero % 10;
			lnEntero = (int)(lnEntero/10);
			lnDecenas = (lnEntero % 10);
			lnEntero = (int)(lnEntero/10);
			lnCentenas = (lnEntero % 10);
			lnEntero = (int)(lnEntero/10 );
		            // Analizo las unidades
			/* UNIDADES */
			switch(lnUnidades){
			case  1 :lcCadena= "UN " + lcCadena;break;
			case  2 :lcCadena= "DOS " + lcCadena;break;
			case  3 :lcCadena= "TRES " + lcCadena;break;
			case  4 :lcCadena= "CUATRO " + lcCadena;break;
			case  5 :lcCadena= "CINCO " + lcCadena;break;
			case  6 :lcCadena= "SEIS " + lcCadena;break;
			case  7 :lcCadena= "SIETE " + lcCadena;break;
			case  8 :lcCadena= "OCHO " + lcCadena;break;
			case  9 :lcCadena= "NUEVE " + lcCadena;break;
			default : lcCadena=lcCadena;;break;
			}
			// -- Analizo las decenas
			/* DECENAS */
			switch(lnDecenas){
			case  1 :switch(lnUnidades){
						case  0 :lcCadena= "DIEZ " ;break;
						case  1 :lcCadena= "ONCE " ;break;
						case  2 :lcCadena= "DOCE " ;break;
						case  3 :lcCadena= "TRECE " ;break;
						case  4 :lcCadena= "CATORCE " ;break;
						case  5 :lcCadena= "QUINCE " ;break;
						case  6 :lcCadena= "DIEZ Y SEIS " ;break;
						case  7 :lcCadena= "DIEZ Y SIETE " ;break;
						case  8 :lcCadena= "DIEZ Y OCHO " ;break;
						case  9 :lcCadena= "DIEZ Y NUEVE " ;break;
		          	};break;
			case  2 :switch(lnUnidades){
						case  0 :lcCadena= "VEINTE " ;break;
						default :lcCadena= "VEINTI"+ lcCadena ;break;
					};break;
			case  3 :switch(lnUnidades){
						case  0 :lcCadena= "TREINTA " ;break;
						default :lcCadena= "TREINTA Y "+ lcCadena ;break;
						};break;
			case  4 :switch(lnUnidades){
						case  0 :lcCadena= "CUARENTA " ;break;
						default :lcCadena= "CUARENTA Y "+ lcCadena ;break;
						};break;
			case  5 :switch(lnUnidades){
						case  0 :lcCadena= "CINCUENTA " ;break;
						default :lcCadena= "CINCUENTA Y "+ lcCadena ;break;
						};break;
			case  6 :switch(lnUnidades){
						case  0 :lcCadena= "SESENTA " ;break;
						default :lcCadena= "SESENTA Y "+ lcCadena ;break;
						};break;
			case  7 :switch(lnUnidades){
						case  0 :lcCadena= "SETENTA " ;break;
						default :lcCadena= "SETENTA Y "+ lcCadena ;break;
						};break;
			case  8 :switch(lnUnidades){
						case  0 :lcCadena= "OCHENTA " ;break;
						default :lcCadena= "OCHENTA Y "+ lcCadena ;break;
						};break;
			case  9 :switch(lnUnidades){
						case  0 :lcCadena= "NOVENTA " ;break;
						default :lcCadena= "NOVENTA Y "+ lcCadena ;break;
						};break;
			default : lcCadena=lcCadena;;break;
			}
           // Analizo las unidades
			/* CENTENAS */
			switch(lnCentenas){
			case  1 :lcCadena= "CIENTO " + lcCadena;break;
			case  2 :lcCadena= "DOSCIENTOS " + lcCadena;break;
			case  3 :lcCadena= "TRESCIENTOS " + lcCadena;break;
			case  4 :lcCadena= "CUATROCIENTOS " + lcCadena;break;
			case  5 :lcCadena= "QUINIENTOS " + lcCadena;break;
			case  6 :lcCadena= "SEISCIENTOS " + lcCadena;break;
			case  7 :lcCadena= "SETECIENTOS " + lcCadena;break;
			case  8 :lcCadena= "OCHOCIENTOS " + lcCadena;break;
			case  9 :lcCadena= "NOVECIENTOS " + lcCadena;break;
			default : lcCadena=lcCadena;;break;
			}
			// Analizo las unidades
				/* TERNA */

			if(lnTerna==1){
				lcCadena=lcCadena;
				
			}else if(lnTerna==2 && (lnUnidades + lnDecenas + lnCentenas != 0) ){
				lcCadena=lcCadena+"MIL ";
				
			}else if(lnTerna==3 && (lnUnidades + lnDecenas + lnCentenas != 0)&&(lnUnidades == 1)&&(lnDecenas == 0)&&(lnCentenas == 0)){
				lcCadena=lcCadena+"MILLON ";
				
			}else if(lnTerna==3 && (lnUnidades + lnDecenas + lnCentenas != 0)&& !((lnUnidades == 1)&&(lnDecenas == 0)&&(lnCentenas == 0))){
				lcCadena=lcCadena+"MILLONES ";
				
			}else if(lnTerna==4 && (lnUnidades + lnDecenas + lnCentenas != 0)){
				lcCadena=lcCadena+"MIL MILLONES ";
				
			}else{
				lcCadena="";
			}
			lcRetorno = lcCadena  + lcRetorno;
			lnTerna = lnTerna + 1;
			
		 }
       if(lnTerna == 1){
       	lcRetorno = "CERO";
               
       }
       String sFraccion;
       sFraccion = "00" + String.valueOf(String.format("%02d",lnFraccion)).replaceAll("\\s+", "");
       ImpLetra = lcRetorno.trim() + " CON " +sFraccion.substring(2,sFraccion.length()) + "/100 ";	
		return ImpLetra;

		}
	 public static boolean validarEntero(Integer num){
		 boolean resp= Boolean.FALSE;
		 if(num==null){
			 resp=Boolean.TRUE;
		 }
		 return resp;
	 }
	 public static boolean validarNumeroReal(Double num){
		 boolean resp= Boolean.FALSE;
		 if(num==null){
			 resp=Boolean.TRUE;
		 }
		 return resp;
	 }
	 public static boolean validarCadena(String valor){
		 boolean resp= Boolean.FALSE;
		 if(valor==null || valor.trim().equals("")){
			 resp=Boolean.TRUE;
		 }
		 return resp;
	 }
	 public static boolean validarFecha(Date fecha){
		 boolean resp= Boolean.FALSE;
		 if(fecha==null){
			 resp=Boolean.TRUE;
		 }
		 return resp;
	 }
	public static String converterCadenaMm(String cadena,boolean opc){
		if(opc){//mayuscuka
			return cadena.toUpperCase();
		}else{// minuscula
			return cadena.toLowerCase();
		}
	}
	


}
