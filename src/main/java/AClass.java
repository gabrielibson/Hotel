import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.thoughtworks.api.factory.HotelFactory;
import br.com.thoughtworks.api.model.Hotel;
import br.com.thoughtworks.api.model.Reservation;
import br.com.thoughtworks.api.service.ReservationService;

public class AClass {
	
	private static List<Hotel> hotels;
	private static Reservation reservation;
	
	public static void main(String [] args) {
		initializeReservation();
		initializeHotels();
		
		ReservationService reservationService = new ReservationService();
		
		Hotel bestHotel = reservationService.chooseBestHotelByReservation(reservation, hotels);
		System.out.println(bestHotel.getName());		
	}
	
	private static void initializeHotels() {	
		
		String clientType = reservation.getClientType();
		
		HotelFactory hotelFactory = HotelFactory.getInstance();
		Hotel lakewood = hotelFactory.createHotel(clientType);
		Hotel bridgewood = hotelFactory.createHotel(clientType);
		Hotel ridgewood = hotelFactory.createHotel(clientType);
		
		lakewood.setName("Lakewood");
		lakewood.setClassification(3);
		lakewood.setWeekdaysRegularPrice(110.0);
		lakewood.setWeekendsRegularPrice(90.0);
		lakewood.setWeekdaysRewardPrice(80.0);
		lakewood.setWeekendsRewardPrice(80.0);
		
		bridgewood.setName("Bridgewood");
		bridgewood.setClassification(4);
		bridgewood.setWeekdaysRegularPrice(160.0);
		bridgewood.setWeekendsRegularPrice(60.0);
		bridgewood.setWeekdaysRewardPrice(110.0);
		bridgewood.setWeekendsRewardPrice(50.0);
		
		ridgewood.setName("Ridgewood");
		ridgewood.setClassification(5);
		ridgewood.setWeekdaysRegularPrice(220.0);
		ridgewood.setWeekendsRegularPrice(150.0);
		ridgewood.setWeekdaysRewardPrice(100.0);
		ridgewood.setWeekendsRewardPrice(40.0);
		
		hotels = new ArrayList<>();
		hotels.add(lakewood);
		hotels.add(bridgewood);
		hotels.add(ridgewood);
	}
	
	private static List<Calendar> initializeDates(){
		List<Calendar> dates = new ArrayList<>();
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();
				
		date1.set(2009, 2, 26);
		date2.set(2009, 2, 27);
		date3.set(2009, 2, 28);
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);
		
		return dates;
	}
	
	private static void initializeReservation() {
		reservation = new Reservation();
		List<Calendar> dates = initializeDates();
				
		reservation.setClientType("Reward");
		reservation.setDates(dates);
	}
}
