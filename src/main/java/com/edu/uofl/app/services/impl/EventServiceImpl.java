package com.edu.uofl.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.uofl.app.model.Event;
import com.edu.uofl.app.repositories.EventRepository;
import com.edu.uofl.app.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;

	public List<Event> getEvents() {
		return eventRepository.findAll();
	}

	public Event getEvent(Long eventId) {
		return eventRepository.findOne(eventId);
	}

	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}

	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}

	public void deleteEvent(Long eventId) {
		eventRepository.delete(eventId);;
	}

}
