package br.com.thoughtworks.api.model;

import java.util.Calendar;
import java.util.List;

/**
 * Attributes: 
 * clientType - String;
 * dates - List<Calendar>
 * @author gabrielibson
 *
 */
public class Reservation {

	private String clientType;
	private List<Calendar> dates;
	
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public List<Calendar> getDates() {
		return dates;
	}
	public void setDates(List<Calendar> dates) {
		this.dates = dates;
	}
		
}
