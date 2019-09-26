package br.com.thoughtworks.api.model;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class Hotel {
	
	private String name;
	private int classification;
	private double weekdaysPrice;
	private double weekendsPrice;

	public double calculatePrice(Reservation reservation) {
		Calendar date = reservation.getDates().get(0);
		DateFormatSymbols dfs = DateFormatSymbols.getInstance(Locale.ENGLISH);
		String day = dfs.getWeekdays()[date.get(Calendar.DAY_OF_WEEK)];
		
		switch(day) {
		
		case "Saturday": 
		case "Sunday":
			System.out.println("Weekend");
			break;
		
		
		default: 
			System.out.println("Not a weekend");
		}
		return 0.0;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public double getWeekdaysPrice() {
		return weekdaysPrice;
	}

	public void setWeekdaysPrice(double weekdaysPrice) {
		this.weekdaysPrice = weekdaysPrice;
	}

	public double getWeekendsPrice() {
		return weekendsPrice;
	}

	public void setWeekendsPrice(double weekendsPrice) {
		this.weekendsPrice = weekendsPrice;
	}
}
