package com.code.cars.controller;

import java.util.Collection;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.cars.collection.CarsCollection;
import com.code.cars.entity.Car;

@CrossOrigin(maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


	@Autowired
	private CarsCollection theCarsCollection;

	@PostConstruct
	public void loadData() {

	}


	@GetMapping("/car")
	public Collection<Car> getCars() {


		System.out.println("ilosc modeli: " + theCarsCollection.getQuantityCarModels());
		System.out.println("ilość wszystich aut L: " + theCarsCollection.getQuantityCars());
		Collection<Car> tempCarsColl = theCarsCollection.getCars();

		return tempCarsColl;
	}

	@PostMapping("/car")
	public Car addStudent(@RequestBody Car theCar) {

		Car tempCar = new Car(theCar.getCarModel(), 1);
		theCarsCollection.addCars(tempCar);

		return theCar;
	}

}
