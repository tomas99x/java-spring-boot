package com.code.cars.collection;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.code.cars.entity.Car;



@Component
public class CarsArrayList implements CarsCollection {

	private ArrayList<Car> theCars;


	public CarsArrayList() {
		theCars = new ArrayList<>();

	}

	@Override
	public Collection<Car> getCars() {

		return theCars;
	}

	@Override
	public void addCars(Car tempCar) {

		if (theCars.contains(tempCar)) {

			int index = theCars.indexOf(tempCar);
		//	theCars.get(index).setQuantityCarsOfModel(theCars.get(index).getQuantityCarsOfModel() + 1);
		} else {
			theCars.add(tempCar);
		}
	}

	@Override
	public int getQuantityCarModels() {

		return theCars.size();
	}

	@Override
	public int getQuantityCars() {
		int tempIosc = 0;

		for (int i = 0; i < theCars.size(); i++) {
			tempIosc = tempIosc + theCars.get(i).getQuantityCarsOfModel();
		}
		return tempIosc;
	}

	@Override
	public void clearCarsList() {

		theCars.clear();
	}

}
