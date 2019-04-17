package com.code.cars.collection;

import java.util.Collection;
import java.util.HashSet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.code.cars.entity.Car;

@Primary
@Component
public class CarsHashSet implements CarsCollection {

	private HashSet<Car> theCars;

	public CarsHashSet() {
		theCars = new HashSet<>();
	}

	@Override
	public Collection<Car> getCars() {

		return theCars;
	}

	@Override
	public void addCars(Car tempCar) {

		if (theCars.contains(tempCar)) {
			for (Car objCar : theCars) {
				if (objCar.equals(tempCar)) {
					break;
				}
			}
		} else {
			theCars.add(tempCar);
		}

		if (theCars.isEmpty())
			theCars.add(tempCar);
	}

	@Override
	public int getQuantityCarModels() {
		// TODO Auto-generated method stub
		return theCars.size();
	}

	@Override
	public int getQuantityCars() {
		int quantityCars = 0;
		for (Car tmpCar : theCars) {
			quantityCars = quantityCars + tmpCar.getQuantityCarsOfModel();
		}
		return quantityCars;
	}

	@Override
	public void clearCarsList() {

		theCars.clear();

	}

}
