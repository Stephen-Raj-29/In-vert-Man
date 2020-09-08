package in.steve.eMart.model;

import java.io.Serializable;

public class SellerId implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long sid;
	
	private String sname;

	public SellerId() {
		
	}
	public SellerId(Long sid,String sname) {
		
		this.setSid(sid);
		this.setSname(sname);
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
