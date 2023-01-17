package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.DTO.CarDTO;

@RestController
@RequestMapping("/cars")
public class CarsController {

  @PostMapping
  public void createCar(@RequestBody CarDTO car) {
    System.out.println(car);
    System.out.println(car.modelo());
    System.out.println(car.fabricante());
    System.out.println(car.anoModelo());
  }
}
