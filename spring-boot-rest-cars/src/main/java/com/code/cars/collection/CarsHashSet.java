package com.code.cars.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.code.cars.entity.Car;

@Primary
@Component
public class CarsHashSet implements CarsCollection {

	private HashSet<Car> theCars;
	private ArrayList<Car> errorCars = new ArrayList<>();

	public CarsHashSet() {
		theCars = new HashSet<>();
	}

	@Override
	public Collection<Car> getCars() {

		return theCars;
	}

	@Override
	public void addCars(Car tempCar) {


		try {

			if (theCars.equals(tempCar)) {
				System.out.println("equals");
			} else {
				theCars.add(tempCar);
			}
		} catch (Throwable e) {
			System.out.println("car is: " + tempCar.getCarModel() + "   rozmiar: " + theCars.size());
			errorCars.add(tempCar);
			e.printStackTrace();
		}
	}

	@Override
	public int getQuantityCarModels() {

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
		errorCars.clear();

	}
	
	public int getQuantityErrorCars() {
		
		return errorCars.size();
	}

}
