package br.com.thoughtworks.api.model;

import java.util.Calendar;
import java.util.List;

import br.com.thoughtworks.api.util.IDateHelper;

/**
 * Attributes: 
 * clientType - String;
 * dates - List<Calendar>
 * @author gabrielibson
 *
 */
public class Reservation implements IDateHelper{

	private String clientType;
	private List<Calendar> dates;

	public double calculateFinalPrice(double priceWeekdays, double priceWeekends) {
		String day;
		double price = 0.0;
		
		for(Calendar date : this.getDates()) {
			//Method implemented by default method of IDateHelper
			day = getDayByDate(date);
			
			switch(day) {
				case "Saturday": 
				case "Sunday":
					price += priceWeekends;
					break;
				
				default: 
					price += priceWeekdays;
				}
		}
		return price;
	}
	
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
