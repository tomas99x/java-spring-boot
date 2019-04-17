package com.code.cars.collection;

import java.util.Collection;


import com.code.cars.entity.Car;


public interface CarsCollection {

	public Collection<Car> getCars();

	public void addCars(Car tempCar);

	public int getQuantityCarModels();

	public int getQuantityCars();

	public void clearCarsList();

}
