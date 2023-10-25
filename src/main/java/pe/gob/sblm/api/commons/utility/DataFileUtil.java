package pe.gob.sblm.api.commons.utility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.gob.sblm.api.commons.constants.sgi.Constantes;

public class DataFileUtil {

	private static final Logger Logger = LoggerFactory.getLogger(DataFileUtil.class);
	
    public static ByteArrayOutputStream obtenerArregloBytes(String ruta) throws Exception{ 

        InputStream in = null;
		try {
			in =new FileInputStream(ruta);
		}  catch (IOException e) {
			Logger.info(e.getMessage());
			e.printStackTrace();
			 throw new IOException("Error de archivo ",e); 
			
		}
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] content = new byte[ 2048 ];
        int bytesRead = -1;
        try {
			while( ( bytesRead = in.read( content ) ) != -1 ) {
			    baos.write( content, 0, bytesRead );
			}
		} catch (IOException e) {
			Logger.info(e.getMessage());
			e.printStackTrace();
		}

        try {
			in.close();
		} catch (IOException e) {
			Logger.info(e.getMessage());
			e.printStackTrace();
		}

        return baos;

    }
    
    public static synchronized ByteArrayOutputStream getByteArrayOutputStream(InputStream inputStream) throws Exception{ 

        InputStream in = null;
			in =inputStream;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] content = new byte[ 2048 ];
        int bytesRead = -1;
        try {
			while( ( bytesRead = in.read( content ) ) != -1 ) {
			    baos.write( content, 0, bytesRead );
			}
		} catch (IOException e) {
			Logger.info(e.getMessage());
			e.printStackTrace();
		}

        try {
			in.close();
		} catch (IOException e) {
			Logger.info(e.getMessage());
			e.printStackTrace();
		}

        return baos;

    }
    
	public String uploadRepositorio(InputStream inputStream, String extension, String ruta){
		String filename=GeneradorUID.generateUniqueID();
		StringBuilder ra = new StringBuilder();
		ra.append(ruta);
		ra.append(File.separator);
		ra.append(filename);
		ra.append(".");
		ra.append(extension);
		File f = new File(ra.toString());
		OutputStream os = null;
		InputStream is = null;
		try {
			is = inputStream;
			byte[] b = new byte[is.available()];
			os = new FileOutputStream(f);
			while (is.read(b) > 0) {
				os.write(b);
			}
		} catch (IOException ex) {
		} finally {
			try {
				os.flush();
				os.close();
				is.close();
			} catch (IOException ex) {
			}
		}
		return filename;
		
	}
	
	public static String obtenerExtensionArchivo(String nombreArchivo){
		int tamanioCadena,posicionCaracter;
		String extension;
		
		
		tamanioCadena=nombreArchivo.length();
		posicionCaracter=nombreArchivo.lastIndexOf(".");
		extension=nombreArchivo.substring(posicionCaracter+1, tamanioCadena);
		
		return extension.toLowerCase();
	}
	
	public static String obtenerMimeTypeArchivo(String tipo){
		
		if (tipo.equals(Constantes.EXTENSION_FORMATO_AVI)) {
			return Constantes.APPLICATION_AVI;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_DBF)){
			return Constantes.APPLICATION_DBF;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_DOC)){
			return Constantes.APPLICATION_DOC;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_DOCX)){
			return Constantes.APPLICATION_DOCX;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_GIF)){
			return Constantes.APPLICATION_GIF;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_JPG)){
			return Constantes.APPLICATION_JPG;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_MP3)){
			return Constantes.APPLICATION_MP3;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_PDF)){
			return Constantes.APPLICATION_PDF;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_PNG)){
			return Constantes.APPLICATION_PNG;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_PPT)){
			return Constantes.APPLICATION_PPT;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_PPTX)){
			return Constantes.APPLICATION_PPTX;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_XLS)){
			return Constantes.APPLICATION_XLS;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_XLSX)){
			return Constantes.APPLICATION_XLSX;
		}else if(tipo.equals(Constantes.EXTENSION_FORMATO_ZIP)){
			return Constantes.APPLICATION_ZIP;
		}else {
			return "application/octet-stream";
		}
		
	}

}