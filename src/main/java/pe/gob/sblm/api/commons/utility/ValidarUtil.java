package pe.gob.sblm.api.commons.utility;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @objetivo: Implementar la clase ValidarUtil
 * @autor: cvallejos
 * @fecha: 22/07/2016
 **/
public class ValidarUtil implements Serializable{
	private static final long serialVersionUID = -6548616628020040266L;
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


	public static boolean isNull( String valor ){
		boolean estado = false;

		if( valor == null || valor.trim().length() <= 0 ){
			estado = true;
		}
		return estado;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(Object valor) {
		if (valor == null) {
			return true;
		}

		if(valor instanceof Collection<?>){
			return ((Collection) valor).isEmpty();
		}
		if (valor instanceof Set<?>) {
			return ((Set) valor).isEmpty();
		}
		if(valor instanceof Map<?, ?>){
			return ((Map) valor).isEmpty();
		}

		if (valor instanceof String) {
			if (((String) valor).trim().length() == 0) {
				return true;
			}
		}

		if (valor instanceof Integer) {
			if (((Integer) valor).intValue() <= 0) {
				return true;
			}
		}

		if (valor instanceof Long) {
			if (((Long) valor).intValue() <= 0) {
				return true;
			}
		}

		return false;
	}


	    public static boolean validateEmail(String email) {
	        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

		public static boolean validaFormatoNumerico(Object field) {

			String campo = field.toString();
			for (char letra : campo.toCharArray()) {
				if (!Character.isDigit(letra)) {
					return false;
				}

			}
			return true;
		}

		public static boolean validarFormatoEspecial(Object field, boolean flagNumerico, String caracteresEspeciales) {
			Boolean letraValido;
			Boolean digitoValido;

			Object value = field;
			String campo = value.toString();
			for (char letra : campo.toCharArray()) {

				Boolean esLetra = Character.isLetter(letra);
				Boolean esDigito = Character.isDigit(letra);
				Boolean esEspecial = (caracteresEspeciales.contains(String.valueOf(letra)));

				letraValido = esLetra.equals(true);

				if (flagNumerico) {
					digitoValido = esDigito.equals(flagNumerico);
				} else {
					digitoValido = false;
				}

				if (!(esEspecial || letraValido || digitoValido)) {
					return false;
				}

			}

			return true;
		}

	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}





}
