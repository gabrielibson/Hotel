package br.com.thoughtworks.api.model;

public class HotelReward extends Hotel{

	@Override
	public double calculatePrice(Reservation reservation) {
		return reservation.calculateFinalPrice(this.getWeekdaysRewardPrice(), this.getWeekendsRewardPrice());
	}

}
