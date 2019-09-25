package br.com.thoughtworks.api.model;

public class Hotel {
	
	private String name;
	private int classification;
	private double weekdaysPrice;
	private double weekendsPrice;

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
