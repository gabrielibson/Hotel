package br.com.thoughtworks.api.model;

public abstract class Hotel{
	
	private String name;
	private int classification;
	private double weekdaysRegularPrice;
	private double weekendsRegularPrice;
	private double weekdaysRewardPrice;
	private double weekendsRewardPrice;
	
	public abstract double calculatePrice(Reservation reservation);
	
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

	public double getWeekdaysRegularPrice() {
		return weekdaysRegularPrice;
	}


	public void setWeekdaysRegularPrice(double weekdaysRegularPrice) {
		this.weekdaysRegularPrice = weekdaysRegularPrice;
	}


	public double getWeekendsRegularPrice() {
		return weekendsRegularPrice;
	}


	public void setWeekendsRegularPrice(double weekendsRegularPrice) {
		this.weekendsRegularPrice = weekendsRegularPrice;
	}


	public double getWeekdaysRewardPrice() {
		return weekdaysRewardPrice;
	}


	public void setWeekdaysRewardPrice(double weekdaysRewardPrice) {
		this.weekdaysRewardPrice = weekdaysRewardPrice;
	}


	public double getWeekendsRewardPrice() {
		return weekendsRewardPrice;
	}


	public void setWeekendsRewardPrice(double weekendsRewardPrice) {
		this.weekendsRewardPrice = weekendsRewardPrice;
	}
}
