package com.edu.uofl.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.uofl.app.model.Event;
import com.edu.uofl.app.services.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping(value="/events", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Event>> getEvents() {
		return new ResponseEntity<List<Event>>(eventService.getEvents(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/events/{eventId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Event> getEvent(@PathVariable("eventId") final Long eventId) {
		return new ResponseEntity<Event>(eventService.getEvent(eventId), HttpStatus.OK);
	}
	
	@RequestMapping(value="/events", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Event> saveEvent(@RequestBody final Event event) {
		return new ResponseEntity<Event>(eventService.saveEvent(event), HttpStatus.OK);
	}
	
	@RequestMapping(value="/events", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Event> updateEvent(@RequestBody final Event event) {
		return new ResponseEntity<Event>(eventService.updateEvent(event), HttpStatus.OK);
	}
	
	@RequestMapping(value="/events/{eventId}", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteEvent(@PathVariable("eventId") final Long eventId) {
		eventService.deleteEvent(eventId);
		return new ResponseEntity<String>("Deleted Event with ID: " +eventId, HttpStatus.OK);
	}

 
}
