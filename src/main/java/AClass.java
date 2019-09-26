import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.thoughtworks.api.model.Hotel;
import br.com.thoughtworks.api.model.Reservation;
import br.com.thoughtworks.api.service.ReservationService;

public class AClass {
	
	private static List<Hotel> hotels;
	
	public static void main(String [] args) {
		
		Reservation reservation = new Reservation();
		List<Calendar> dates = new ArrayList<>();
		Calendar date = Calendar.getInstance();
		
		date.set(2019, 8, 21);
		dates.add(date);
		
		reservation.setClientType("Regular");
		reservation.setDates(dates);
		
		/*ReservationService reservationService = new ReservationService();
		
		String bestHotel = reservationService.chooseBestHotelByReservation(reservation, hotels);
		System.out.println(bestHotel);*/
		Hotel hotel = new Hotel();
		hotel.calculatePrice(reservation);
		System.out.println(date.getTime().toString());
		
	}
	
	static {
		
		Hotel lakewood = new Hotel();
		Hotel bridgewood = new Hotel();
		Hotel ridgewood = new Hotel();
		
		lakewood.setName("Lakewood");
		lakewood.setClassification(3);
		lakewood.setWeekdaysPrice(110.0);
		lakewood.setWeekendsPrice(90.0);
		
		bridgewood.setName("Bridigewood");
		bridgewood.setClassification(4);
		bridgewood.setWeekdaysPrice(160.0);
		bridgewood.setWeekendsPrice(60.0);
		
		ridgewood.setName("Ridgewood");
		ridgewood.setClassification(5);
		ridgewood.setWeekdaysPrice(220.0);
		ridgewood.setWeekendsPrice(150.0);
		
		hotels = new ArrayList<>();
		hotels.add(lakewood);
		hotels.add(bridgewood);
		hotels.add(ridgewood);
	}
}
