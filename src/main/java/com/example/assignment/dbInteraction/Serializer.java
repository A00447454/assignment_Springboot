package com.example.assignment.dbInteraction;

import com.example.assignment.entity.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface Serializer extends CrudRepository<Hotel, Integer> {

}
