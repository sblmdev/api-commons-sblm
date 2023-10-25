package pe.gob.sblm.sgi.bean;

import java.io.Serializable;

public class ParamConfigSftpBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String user;
	private String pass;
	private String host;
	private String port;
	
	public ParamConfigSftpBean() {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParamConfigSftpBean [user=" + user + ", pass=" + pass
				+ ", host=" + host + ", port=" + port + "]";
	}
	
}
