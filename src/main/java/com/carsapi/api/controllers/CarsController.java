package com.carsapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.DTO.CarDTO;
import com.carsapi.api.models.Car;
import com.carsapi.api.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarsController {

  @Autowired
  private CarRepository repository;

  @PostMapping
  public void createCar(@RequestBody CarDTO car) {
    System.out.println(car);
    System.out.println(car.modelo());
    System.out.println(car.fabricante());
    System.out.println(car.anoModelo());
    repository.save(new Car(car));
  }

  @GetMapping
  public List<Car> listAll() {
    return repository.findAll();
  }
}
