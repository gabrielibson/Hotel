package br.com.thoughtworks.api.model;

public class HotelRegular extends Hotel{

	@Override
	public double calculatePrice(Reservation reservation) {
		return reservation.calculateFinalPrice(this.getWeekdaysRegularPrice(), this.getWeekendsRegularPrice());
	}

}
