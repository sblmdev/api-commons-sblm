package pe.gob.sblm.sgi.bean;

import java.io.Serializable;

public class ParamConfigAlfrescoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String user;
	private String pass;
	private String host;
	private String port;
	private String atompub;
	private String root;
	
	public ParamConfigAlfrescoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getAtompub() {
		return atompub;
	}

	public void setAtompub(String atompub) {
		this.atompub = atompub;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	
	
}
