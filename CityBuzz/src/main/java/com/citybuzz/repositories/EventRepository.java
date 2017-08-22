package com.citybuzz.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.citybuzz.domain.Event;

public interface EventRepository extends CrudRepository<Event, String> {

	List<Event> findByIsDeleted(Byte isDeleted);
}