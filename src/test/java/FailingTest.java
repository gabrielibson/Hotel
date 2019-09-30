import org.junit.Test;

import br.com.thoughtworks.api.factory.HotelFactory;
import br.com.thoughtworks.api.model.Hotel;
import br.com.thoughtworks.api.model.Reservation;
import br.com.thoughtworks.api.service.ReservationService;
import br.com.thoughtworks.api.util.ClientType;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;

public class FailingTest {
	private static List<Hotel> hotels;
	private static Reservation reservation;
	private ReservationService reservationService;

	@Before
	public void initialize() {
		this.reservationService = new ReservationService();
	}

	@Test
	public void checkLakewood() {
		reservation = new Reservation();
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 16);
		date2.set(2009, 2, 17);
		date3.set(2009, 2, 18);
		
		List<Calendar> dates = new ArrayList<>();
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);

		reservation.setClientType(ClientType.REGULAR.getType());
		reservation.setDates(dates);
		
		initializeHotels();
		
		assertEquals("Lakewood", reservationService.chooseBestHotelByReservation(reservation, hotels).getName());
	}
	
	@Test
	public void checkBridgewood() {
		reservation = new Reservation();
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 20);
		date2.set(2009, 2, 21);
		date3.set(2009, 2, 22);
		
		List<Calendar> dates = new ArrayList<>();
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);

		reservation.setClientType(ClientType.REGULAR.getType());
		reservation.setDates(dates);
		
		initializeHotels();
		
		assertEquals("Bridgewood", reservationService.chooseBestHotelByReservation(reservation, hotels).getName());
	}
	
	@Test
	public void checkRidgewood() {
		reservation = new Reservation();
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date3 = Calendar.getInstance();

		date1.set(2009, 2, 26);
		date2.set(2009, 2, 27);
		date3.set(2009, 2, 28);
		
		List<Calendar> dates = new ArrayList<>();
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);

		reservation.setClientType(ClientType.REWARD.getType());
		reservation.setDates(dates);
		
		initializeHotels();
		
		assertEquals("Ridgewood", reservationService.chooseBestHotelByReservation(reservation, hotels).getName());
	}
	
	/*@Test
	public void testThatFails() {
		assertTrue("This should fail", false);
	}*/

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
}
