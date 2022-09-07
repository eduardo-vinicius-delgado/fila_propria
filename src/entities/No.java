package entities;

public class No {
	
	private No proximoNo = null;
	private String dado = "";
	
	public No getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	public String getDado() {
		return dado;
	}
	
	public void setDado(String dado) {
		this.dado = dado;
	}
	
}
