package com.edu.uofl.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.uofl.app.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
