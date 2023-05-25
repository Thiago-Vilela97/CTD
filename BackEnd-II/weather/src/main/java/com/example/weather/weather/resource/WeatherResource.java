package com.example.weather.weather.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherResource {

    @GetMapping("/message/{city}")
    public ResponseEntity<String> getMessage(@PathVariable String city) {
        return ResponseEntity.ok(city);
    }
}
