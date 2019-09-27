package br.com.thoughtworks.api.util;

public enum ClientType {
	REGULAR("Regular"), REWARD("Reward");

	private String type;
	
	ClientType(String type){
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
