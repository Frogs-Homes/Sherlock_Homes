package com.frogs.sherlockhomes.hotel.model;

import org.apache.ibatis.type.Alias;

@Alias("HotelVO")
public class HotelVO {
	private int i_hotel;
	private String nm;
	private String addr;
	private double lat;
	private double lng;
	private String hotel_img;
	
	
	public int getI_hotel() {
		return i_hotel;
	}
	public void setI_hotel(int i_hotel) {
		this.i_hotel = i_hotel;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getHotel_img() {
		return hotel_img;
	}
	public void setHotel_img(String hotel_img) {
		this.hotel_img = hotel_img;
	}
}
