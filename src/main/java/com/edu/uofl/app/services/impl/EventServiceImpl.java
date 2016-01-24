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

}
