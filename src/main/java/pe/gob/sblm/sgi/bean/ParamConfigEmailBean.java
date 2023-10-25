package pe.gob.sblm.sgi.bean;

import java.io.Serializable;

public class ParamConfigEmailBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String smtpCorreoEmisor;
	private String smtpLocalhost;
	private String smtpIp;
	private String smtpProtocolo;
	private String smtpPuerto;
	
	public ParamConfigEmailBean() {
		super();
	}

	public String getSmtpCorreoEmisor() {
		return smtpCorreoEmisor;
	}

	public void setSmtpCorreoEmisor(String smtpCorreoEmisor) {
		this.smtpCorreoEmisor = smtpCorreoEmisor;
	}

	public String getSmtpLocalhost() {
		return smtpLocalhost;
	}

	public void setSmtpLocalhost(String smtpLocalhost) {
		this.smtpLocalhost = smtpLocalhost;
	}

	public String getSmtpIp() {
		return smtpIp;
	}

	public void setSmtpIp(String smtpIp) {
		this.smtpIp = smtpIp;
	}

	public String getSmtpProtocolo() {
		return smtpProtocolo;
	}

	public void setSmtpProtocolo(String smtpProtocolo) {
		this.smtpProtocolo = smtpProtocolo;
	}

	public String getSmtpPuerto() {
		return smtpPuerto;
	}

	public void setSmtpPuerto(String smtpPuerto) {
		this.smtpPuerto = smtpPuerto;
	}

}
