package com.example.event.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.event.model.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>
{

}
