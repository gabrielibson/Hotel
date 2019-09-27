package br.com.thoughtworks.api.service;

import java.util.List;

import br.com.thoughtworks.api.model.Hotel;
import br.com.thoughtworks.api.model.Reservation;

public class ReservationService {

	/**
	 * It chooses the cheaper hotel according to reservation
	 * 
	 * @param reservation
	 * @return
	 */
	public Hotel chooseBestHotelByReservation(Reservation reservation, List<Hotel> hotels) {

		double currentPrice;
		double price;
		Hotel bestHotel;

		price = hotels.get(0).calculatePrice(reservation);
		bestHotel = hotels.get(0);

		for (int i = 1; i < hotels.size(); i++) {
			currentPrice = hotels.get(i).calculatePrice(reservation);
			if (price > currentPrice
					|| (price == currentPrice && hotels.get(i).getClassification() > bestHotel.getClassification())) {
				price = currentPrice;
				bestHotel = hotels.get(i);
			}
		}

		return bestHotel;
	}
}
