package com.citybuzz.dtos;

public class EventRequest {
	public String lat;
	public String long_;
	public String eventName;
	public String eventDescription;
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLong_() {
		return long_;
	}
	public void setLong_(String long_) {
		this.long_ = long_;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
}
