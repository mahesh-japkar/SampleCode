package com.citybuzz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citybuzz.domain.Event;
import com.citybuzz.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private EventRepository eventRepository;

	@Override
	public List<Event> getEvents() {
		return eventRepository.findByIsDeleted((byte) 0);
	}
}