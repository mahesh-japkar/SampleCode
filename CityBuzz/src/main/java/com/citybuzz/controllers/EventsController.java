package com.citybuzz.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citybuzz.domain.Event;
import com.citybuzz.dtos.EventRequest;
import com.citybuzz.dtos.EventResponse;
import com.citybuzz.services.EventService;

/**
 * Created by maheshj on 31/10/16.
 */
@RestController
@RequestMapping({"/api/v1/events", "/events"})
public class EventsController {
	@Autowired
	private EventService eventService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<EventResponse> createEvent(
			@RequestBody EventRequest adRequest) {
		ResponseEntity<EventResponse> response = null;
		EventResponse eventResponse = new EventResponse();
		response = new ResponseEntity<EventResponse>(eventResponse, HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<List<EventResponse>> getEvents(
			@RequestParam(value = "lat", required = true) String lat,
			@RequestParam(value = "long", required = true) String longi) {
		ResponseEntity<List<EventResponse>> response = null;
		List<EventResponse> eventResponses = new ArrayList<EventResponse>();
		List<Event> events = eventService.getEvents();
		for (Event event : events) {
			EventResponse eventResponse = new EventResponse();
			eventResponse.setLat(event.getLat().toPlainString());
			eventResponse.setLong_(event.getLong_().toPlainString());
			eventResponses.add(eventResponse);
		}
		response = new ResponseEntity<List<EventResponse>>(eventResponses,
				HttpStatus.OK);
		return response;
	}
}