package com.edu.uofl.app.services;

import java.util.List;

import com.edu.uofl.app.model.Event;

public interface EventService {
	
	List<Event> getEvents();

	Event getEvent(Long eventId);

	Event saveEvent(Event event);

	Event updateEvent(Event event);

	void deleteEvent(Long eventId);

}
