package br.com.thoughtworks.api.factory;

import br.com.thoughtworks.api.model.Hotel;
import br.com.thoughtworks.api.model.HotelRegular;
import br.com.thoughtworks.api.model.HotelReward;
import br.com.thoughtworks.api.util.ClientType;

public class HotelFactory {
	
	private static HotelFactory hotelFactory;
	
	private HotelFactory() {}
	
	public static HotelFactory getInstance() {
		if(hotelFactory == null) {
			hotelFactory = new HotelFactory();
		}		
		return hotelFactory;
	}

	public Hotel createHotel(String clientType) {
		Hotel hotel = null;
		
		if(ClientType.REGULAR.getType().equals(clientType)) {
			hotel = new HotelRegular();
		}else {
			hotel = new HotelReward();
		}
		
		return hotel;
	}
}
