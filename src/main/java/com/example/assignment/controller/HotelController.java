package com.example.assignment.controller;

import com.example.assignment.dbInteraction.Serializer;
import com.example.assignment.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @Autowired
    private Serializer serializer;

    @GetMapping("/hotels")
    public Iterable<Hotel> hotels(){
        return serializer.findAll();
    }
    @PostMapping("/hotelInsert")
    public String hotelsInsert(@RequestBody Hotel hotel){
        serializer.save(hotel);
        return "Added Successfully";
    }
}
