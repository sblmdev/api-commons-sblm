package pe.gob.sblm.api.commons.utility;


import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by pjudicial on 12/05/2015.
 */
public class FechaUtil implements Serializable {

    private static final long serialVersionUID = 3355114755241105106L;
    private static SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	private static SimpleDateFormat dfH = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    

    public static String getYear(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int anio = fecha.get(Calendar.YEAR);
        return String.valueOf(anio);
    }
    
    public static String getMonth(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int mes = fecha.get(Calendar.MONTH);
        mes = mes + 1;
        String mesFormato = StringUtil.completarCerosIzquierda(2, mes);
        return mesFormato;
    }
    public static String getDay(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String diaFormato = StringUtil.completarCerosIzquierda(2,dia);
        return diaFormato;
    }
    public static String currentHourOfDay(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);
        
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        String horaFormato = StringUtil.completarCerosIzquierda(2,hora);
        return horaFormato;
    }

    public static String currentMinute(){
        Calendar fecha = Calendar.getInstance();
        int minutos = fecha.get(Calendar.MINUTE);
        String minutoFormato = StringUtil.completarCerosIzquierda(2,minutos);
        return minutoFormato;
    }

    public static String currentSecond(){
        Calendar fecha = Calendar.getInstance();
        int segundos = fecha.get(Calendar.SECOND);
        String segundoFormato = StringUtil.completarCerosIzquierda(2,segundos);
        return segundoFormato;
    }

    public static Timestamp currentDate(){
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        return time;
    }

	public static String fechaToString(Date fecha){
		return df.format(fecha);
	}
	
	public static String fechaHORAtoString(Date fecha){
		
		return dfH.format(fecha);
	}
	
	public static Date fechaStringToDate(String fechaString){
		
		Calendar fecha= Calendar.getInstance();
		
		fecha.set(Calendar.DATE, Integer.parseInt(fechaString.substring(0,2)));
		fecha.set(Calendar.MONTH,Integer.parseInt(fechaString.substring(3,5))-1);
		fecha.set(Calendar.YEAR,Integer.parseInt(fechaString.substring(6,10)));
		
		return fecha.getTime();
	}
	
	public static String obtenerFechaFormatoLetras(Date fecha){
	
	   SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es_ES"));
	   String cadena = formateador.format(fecha);
	
			   
		return cadena;
	}
	
	public static int obtenerDiasEntreFecha(Date fechaMayor, Date fechaMenor) {
		long diferenciaEn_ms = fechaMayor.getTime() - fechaMenor.getTime();
		long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		return (int) dias;
		}
	
	public static String obtenerRepresentacionLetrasFormatoES(String fecha){
		
		
		if (fecha.contains("January")) {
			return fecha.replace("January", "Enero");
		}else if(fecha.contains("February")){
			return fecha.replace("February", "Febrero");
		}else if(fecha.contains("March")){
			return fecha.replace("March", "Marzo");
		}else if(fecha.contains("April")){
			return fecha.replace("April", "Abril");
		}else if(fecha.contains("May")){
			return fecha.replace("May", "Mayo");
		}else if(fecha.contains("June")){
			return fecha.replace("June", "Junio");
		}else if(fecha.contains("July")){
			return fecha.replace("July", "Julio");
		}else if(fecha.contains("August")){
			return fecha.replace("August", "Agosto");
		}else if(fecha.contains("September")){
			return fecha.replace("September", "Septiembre");
		}else if(fecha.contains("October")){
			return fecha.replace("October", "Octubre");
		}else if(fecha.contains("November")){
			return fecha.replace("November", "Noviembre");
		}else if(fecha.contains("December")){
			return fecha.replace("December", "Diciembre");
		}
		return "Error";  
		
	}
	

	/**
	 * Set the time of the given Date
	 *
	 * @param date
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 * @param ms
	 *
	 * @return new instance of java.util.Date with the time set
	 */
	public static Date setTime( final Date date, final int hourOfDay, final int minute, final int second, final int ms )
	{
	    final GregorianCalendar gc = new GregorianCalendar();
	    gc.setTime( date );
	    gc.set( Calendar.HOUR_OF_DAY, hourOfDay );
	    gc.set( Calendar.MINUTE, minute );
	    gc.set( Calendar.SECOND, second );
	    gc.set( Calendar.MILLISECOND, ms );
	    return gc.getTime();
	}
	
	
	/**
	 * Set the time of the given Date
	 *
	 * @param date
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 * @param ms
	 *
	 * @return new instance of java.util.Date with the time set
	 */
	public static Calendar setTime( final int year,final int month,final int date, final int hourOfDay, final int minute, final int second, final int ms )
	{
	    final GregorianCalendar gc = new GregorianCalendar();
	    gc.set( Calendar.YEAR, year );
	    gc.set( Calendar.MONTH, month );
	    gc.set( Calendar.DATE, date );
	    gc.set( Calendar.HOUR_OF_DAY, hourOfDay );
	    gc.set( Calendar.MINUTE, minute );
	    gc.set( Calendar.SECOND, second );
	    gc.set( Calendar.MILLISECOND, ms );
	    return gc;
	}
	
	
	public static int getDiasDiferencia(Date fechaMayor, Date fechaMenor) {
		long diferenciaEn_ms = fechaMayor.getTime() - fechaMenor.getTime();
		long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		return (int) dias;
	}
	
	public static Date obtenerFechaFinalAnio(Date fecha) {
		
		Calendar fec=Calendar.getInstance();
		fec.setTime(fecha);


		fec.set(Calendar.YEAR,fec.get(Calendar.YEAR));
		fec.set(Calendar.MONTH, 11);
		fec.set(Calendar.DATE, fec.getActualMaximum(Calendar.DAY_OF_MONTH));
		fec.set(Calendar.HOUR,0);
		fec.set(Calendar.MINUTE,0);
		fec.set(Calendar.SECOND,0);
		fec.set(Calendar.MILLISECOND,0);
		
		
		return fec.getTime();
	}
	public static Date sumarRestarDias(Date fecha,int dias){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(calendar.DAY_OF_YEAR, dias);
		return	calendar.getTime();	
	}
	public static Date sumarRestarMeses(Date fecha,int meses){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(calendar.MONTH, meses);
		return	calendar.getTime();	
	}
	public static Date sumarRestarAños(Date fecha,int años){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(calendar.YEAR, años);
		return	calendar.getTime();	
	}
	
}
